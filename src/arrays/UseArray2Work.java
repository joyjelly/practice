package arrays;

public class UseArray2Work {
	public void scoreProcess() {
		String [] namesArr = { "루피", "샹디", "쵸파", "나미", "로빈" };
		int [][] scoreArr ={ { 89, 91, 86 }, { 91, 91, 90 }, { 98, 10, 99 }, { 74, 85, 83 }, { 88, 90, 95 } };
		System.out.printf("시험 응시 인원[%d명]\n ", namesArr.length);
		System.out.printf("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.println("-----------------------------------------------------");
	int sum=0;
		for(int i =0; i<scoreArr.length;i++) {
		System.out.printf("[%d]\t%s\t",i+1,namesArr[i]);
		for(int j = 0; j<scoreArr[0].length; j++) {
			System.out.printf("%d \t",scoreArr[i][j]);
		}//end for
		System.out.print(totalScore(scoreArr[i])+"\t");
		System.out.print(totalScore(scoreArr[i])/3);
		System.out.println();
	}//end for
		System.out.println("-------------------------------------------------");
		int num= 0;
		int highestScore = 0;
		for(int i=0 ;i<scoreArr.length;i++) {
			if(highestScore<totalScore(scoreArr[i])) {
				num =i;
				highestScore = totalScore(scoreArr[i]);
			}//end if
		}//end for
		System.out.printf("\t국어총점 : %d 점 \t 영어 총점 : %d점 \t 수학총점 : %d점 \n ", subjectTotalScore(scoreArr)[0],
				subjectTotalScore(scoreArr)[1], subjectTotalScore(scoreArr)[2]); // 각 과목의 총점
		System.out.printf("\t국어의 평균 :%d\n", subjectTotalScore(scoreArr)[0] / 5); // 국어만 평균
		System.out.printf("1등 학생의 번호[%d] ,이름 [%s]", num + 1, namesArr[num]);
//			
		
		
		
	}//scoreProcess
	public int[] subjectTotalScore(int[][] eachscore) {
		int [] total = new int[eachscore[0].length];
		
//		for(int j =0; )
		
		
		return null;
	}
	public int compareScore(int[] totalArr) {
		int highestScore =0;
		int num =0;
		for(int i =0; i<totalArr.length;i++) {
			if(highestScore<totalArr[i]) {
				num = i;
				highestScore =totalArr[i];
			}
		}
		return highestScore;
	}
	
	public int totalScore(int[] scoreArr) {
		int total = 0;
		
		for(int score : scoreArr) {
			total+=score;
		}
		
		
		return total;
	}
	

	public static void main(String[] args) {
		UseArray2Work ua = new UseArray2Work();
		ua.scoreProcess();
	}

}
