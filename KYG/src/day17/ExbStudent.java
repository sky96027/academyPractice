package day17;

import java.util.ArrayList;

public class ExbStudent {
	private int grade, classNum, num;
	private String name;
	private ArrayList<ExbScore> score;
	public ExbStudent(int grade, int classNum, int num, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
	}
	@Override
	public String toString() {
		return "ExbStudent [grade=" + grade + ", classNum=" + classNum + ", num=" + num + ", name=" + name + ", score="
				+ score + "]";
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<ExbScore> getScore() {
		return score;
	}
	public void setScore(ArrayList<ExbScore> score) {
		this.score = score;
	}
	
	
}
