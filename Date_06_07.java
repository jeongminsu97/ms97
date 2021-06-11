package practice;

import java.util.Scanner;

public class Date_06_07 {

	public static void main(String[] args) {
		
		// sum();     // 2번
		// gugudan(); // 3번
		// star();    // 4번
		//cal_grade(); // 5번
		//sum_avg();    // 6번
		
		//change_case();  // 8번
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
		
		System.out.print("학점은 : " + grade);
		
	}
	
	static void sum_avg() { // 평균, 합계 구하기
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수: ");
		String input = scanner.nextLine();
		
		String [] arr_score = input.split(",");
		
		for(String str : arr_score){
			System.out.println(str);
		}

	}
	static void change_case() {

		String word = "Hello, World";
		int word_len = word.length();
		char res_word []  = new char [word_len];

		for(int i =0; i<word_len;i++){
			
			int tmp_word = word.charAt(i);           // 아스키 코드 이용하여 대문자를 소문자로
			if(tmp_word>=65 && tmp_word<=90){
				char tmp = (char) (tmp_word + 32);
				res_word[i] = tmp;
			}
			else if(tmp_word >=97 && tmp_word <=122){ // 아스키 코드 이용하여 소문자를 대문자로
				char tmp = (char) (tmp_word - 32);
				res_word[i] = tmp;
			}
			else{                                    // 대소문자가 아닌 글자는 그대로 출력
				char tmp = (char) tmp_word;
				res_word[i] = tmp;
			}
		}
		
		String res = "";
		for(int i =0; i<res_word.length; i++){
			res+=res_word[i];
		}

		System.out.println(res);
	}
}
