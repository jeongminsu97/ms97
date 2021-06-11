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
	
	static int sum() { // 1���� 100���� ���ϱ�, ���� 2
		
		int total=0;
		for (int i =1; i<100; i++)
		{
			total += i;
		}
		
		return total;
	}
	
	static void gugudan() { // ������ 2�ܺ��� ����ϱ�, ���� 3
		
		for(int i =1; i<10;i++)
		{	
			if (i ==1)
			{
				continue;
			}
			System.out.println("** " + i + "��"+ " **");
			for(int j =1; j<10;j++)
			{
				System.out.println(i + " * " + j +" = " + i*j );
				
			}
			System.out.println();
			
		}
	}
	
	static void star() { // ���ι޾Ƽ� ����� , ���� 4
		                
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ ����Ʈ�� ���� ũ�⸦ �Է��ϼ���: ");
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
	
	static void cal_grade() { // ���� �Է¹ް� ���� ���, ���� 5
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է�: ");
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
	
	static void sum_avg() { // ���б� 10�� �л��� ���� ���, ���
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է�: ");
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
