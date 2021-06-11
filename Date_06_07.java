package practice;

import java.util.Scanner;

public class Date_06_07 {

	public static void main(String[] args) {
		
		// sum();
		// gugudan();
		// star();
		//cal_grade();
		sum_avg();
		System.out.println("ddd");
	}
	
	static int sum() { //1부터 100까지의 합계
		
		int total=0;
		for (int i =1; i<100; i++)
		{
			total += i;
		}
		
		return total;
	}
	
	static void gugudan() { // 구구단
		for(int i =1; i<10;i++)
		{	
			if (i ==1)
			{
				continue;
			}
			System.out.println("** " + i + "단"+ " **");
			for(int j =1; j<10;j++)
			{
				System.out.println(i + " * " + j +" = " + i*j );
				
			}
			System.out.println();
			
		}
	}
	
	static void star() { // 별찍기
		                
		Scanner scanner = new Scanner(System.in);
		System.out.print("원하는 라인의 수를 입력: ");
		int line = scanner.nextInt();
		
		for(int i=0; i<line;i++)
		{
			for(int j =0; j<line; j++)
			{
				if(i >= j)
				{
					System.out.print('*');
				}
				else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
	
	static void cal_grade() { // 학점 계산기?
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력: ");
		int score = scanner.nextInt();
		char grade;
		
		if(score >= 90)
			grade='A';
		else if(score >= 80)
			grade='B';
		else if(score >=70)
			grade='C';
		else if(score >=60)
			grade='D';
		else
			grade='F';
		
		System.out.print("����: " + grade);
		
	}
	
	static void sum_avg() { // 평균, 합계 구하기
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수: ");
		String input = scanner.nextLine();
		
		String [] arr_score = input.split(",");
		
		for(String str : arr_score){
			System.out.println(str);
		}

	
		
		
//		int score=0;
//		double avg;
//
//		for(int i =0; i<arr.length;i++)
//		{
//		  score += arr[i];
//		}
//		
//		avg = score / arr.length;
//		
//		System.out.printf("�հ�: %d \n", score);
//		System.out.printf("���: %f", avg);
//		
	}
	
}
