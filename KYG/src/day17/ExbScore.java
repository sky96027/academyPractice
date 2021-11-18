package day17;

public class ExbScore {
	private String subjectTiltle;
	private int point;
	private int grade;
	private int term;
	
	public ExbScore(String subjectTiltle, int grade, int term, int point) {
		super();
		this.subjectTiltle = subjectTiltle;
		this.point = point;
		this.grade = grade;
		this.term = term;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + grade;
		result = prime * result + ((subjectTiltle == null) ? 0 : subjectTiltle.hashCode());
		result = prime * result + term;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExbScore other = (ExbScore) obj;
		if (grade != other.grade)
			return false;
		if (subjectTiltle == null) {
			if (other.subjectTiltle != null)
				return false;
		} else if (!subjectTiltle.equals(other.subjectTiltle))
			return false;
		if (term != other.term)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ExbScore [subjectTiltle=" + subjectTiltle + ", point=" + point + ", grade=" + grade + ", term=" + term
				+ "]";
	}
	
	
}
