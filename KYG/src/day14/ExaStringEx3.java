package day14;

public class ExaStringEx3 {

	public static void main(String[] args) {
		/* 확장자를 포함한 파일명을 5개 배열에 저장하고, 저장된 파일에 이미지 파일이 있는지
		 * 확인하는 코드를 작성하세요
		 * 이미지파일 확장자 : jpg, bmp, gif, png*/
		String str = "img.jpg, img.bmp, img.png, img.exe, img.java";
		String [] img = str.split(", ");
		int count = 0;
		for(String tmp : img) {
			if(tmp.endsWith("jpg") || tmp.endsWith("bmp") || tmp.endsWith("gif") || tmp.endsWith("png")) {
				count++;
			}
		}
		if(count != 0) {
			System.out.println("이미지파일이 " + count + "개 있습니다.");
		}
		else {
			System.out.println("이미지파일이 없습니다.");
		}
		
		
		String imgSuffixString = "jpg, bmp, gif, png";
		String [] imgSuffixArray = imgSuffixString.split(", ");
		for(String tmp : img) {
			boolean isImg = false;
			for (String imgsuffix : imgSuffixArray) {
				if(tmp.endsWith(imgsuffix)) {
					System.out.println(tmp + "은 이미지 입니다.");
					isImg = true;
					break;
				}
			}
			if(!isImg) {
				System.out.println(tmp + "은 이미지가 아닙니다.");
			}
			for(String filename : img) {
				if(checksuffix(imgSuffixArray, filename)) {
					System.out.println(filename + "은 이미지입니다.");
					
				}
				else {
					System.out.println(filename + "은 이미지가 아닙니다.");
				}
			}
		}
	}
	/* 확장자들과 파일명이 주어지면, 해당 파일이 확장자에 맞는지 알려주는 메소드
	 * 매개변수 : 확장자, 파일명 => String[]suffixarray, String filename
	 * 리턴타입 : boolean
	 * 메소드명 : checksuffix */
	public static boolean checksuffix(String [] suffixarray, String filename) {
		for(String suffix : suffixarray) {
			if(filename.endsWith(suffix)) {
				return true;
			}
		}
		return false;
	}
}
























