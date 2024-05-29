package VO;

/**
 * 학생은 번호, 이름, 국어, 영어를 가진다.
 * 
 */
public class StudentVO {
	private int num,korScore,engScore;
	private String name ;
	public StudentVO() {
	}
	public StudentVO(int num, String name, int korScore, int engScore) {
		super();
		this.num = num;
		this.korScore = korScore;
		this.engScore = engScore;
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
