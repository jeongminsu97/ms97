package practice;

import java.lang.invoke.TypeDescriptor;
import java.util.Scanner;

public class Date_06_07 {

	public static void main(String[] args) {

		// trans_fahrenheit(); // 1번
		// sum();     // 2번
		// gugudan(); // 3번
		// star();    // 4번
		//cal_grade(); // 5번
		sum_avg();    // 6번
		//subject_sum_avg(); // 7번
		//change_case();  // 8번
		/* // 9번
		Cipherpassword test = new Cipherpassword(); // 객체생성
		test.encrypt("Hello world"); // 암호화
		test.decrypt("Khoor Zruog"); // 복호화
		*/
		/* // 10번
		System.out.print("첫번째 숫자를 입력하세요: ");
		int n1 = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int n2 = scanner.nextInt();
		ArithmeticOperation test = new ArithmeticOperation();
		test.add(n1, n2);
		test.subtract(n1, n2);
		test.multiply(n1, n2);
		test.divide(n1, n2);
		*/
	}
	static void trans_fahrenheit() {
		double Celsius = 31.5;
		double Fahreheit = (Celsius * (9/5) + 32);
		System.out.println("섭씨: " + Celsius);
		System.out.println("화씨: " + Fahreheit);
	}
	static int sum() { // <2번문제> 1부터 100까지의 합계
		
		int total=0;
		for (int i =1; i<100; i++)
		{
			total += i;
		}
		
		return total;
	}
	
	static void gugudan() { // <3번문제> 구구단 
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
	
	static void star() { // <4번문제> 별찍기
		                
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
	
	static void cal_grade() { // <5번문제> 학점 계산기?
		
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
	
	static void sum_avg() { // <6번문제> 평균, 합계 구하기
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수: ");
		String input = scanner.nextLine();
		
		String [] arr_score = input.split(",");
		int sum =0;

		for(String str : arr_score){
			str.replaceAll("[^\\d]", "");
			//System.out.print(str+ " ");

			sum += Integer.parseInt(str);
		}
		double avg = sum / arr_score.length;

		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}

	static void subject_sum_avg() { // <7번문제> 과목별 합계, 평균계산
		int student [][] = new int [][]{ // 점수데이터 선언
			{90, 80, 80},
			{85, 85, 95},
			{95, 70, 75},
			{80, 80, 90},
			{90, 75, 80}
		};
		
		for(int i =0; i<student.length;i++){ // 학생수만큼 반복
			int sum =0;
			double avg =0;
			for(int j =0; j<student[i].length;j++){ // 과목수만큼 반복
				sum+= student[i][j];
			}
			avg = sum / student[i].length; // 학생의 과목수만큼
			System.out.printf("학생%d : 합계: %d, 평균: %f \n", i,sum, avg);
		}

	}
	static void change_case() { // <8번문제> 대문자를 소문자로, 소문자를 대문자로

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

		System.out.print(res);
	}
}
class Cipherpassword { // <9번문제> 시저의 암호

	void encrypt(String password) {
		int word_len = password.length();
		char res_word []  = new char [word_len];
		for(int i =0; i<word_len;i++){
			
			int tmp_word = password.charAt(i);           // 아스키 코드 이용하여 대문자를 소문자로
			if(tmp_word>=65 && tmp_word<=90){
				char tmp = (char) (tmp_word +3); // +3은 시저의 암호 조건
				res_word[i] = tmp;
			}
			else if(tmp_word >=97 && tmp_word <=122){ // 아스키 코드 이용하여 소문자를 대문자로
				char tmp = (char) (tmp_word +3); // +3은 시저의 암호 조건
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
		System.out.printf("원문: %s \n", password);
		System.out.printf("암호화: %s \n",res);
	}

	void decrypt(String password) {
		int word_len = password.length();
		char res_word []  = new char [word_len];
		for(int i =0; i<word_len;i++){
			
			int tmp_word = password.charAt(i);           // 아스키 코드 이용하여 대문자를 소문자로
			if(tmp_word>=65 && tmp_word<=90){
				char tmp = (char) (tmp_word -3); // -3은 시저의 암호 복호화
				res_word[i] = tmp;
			}
			else if(tmp_word >=97 && tmp_word <=122){ // 아스키 코드 이용하여 소문자를 대문자로
				char tmp = (char) (tmp_word -3); // -3은 시저의 암호 복호화
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
		System.out.printf("암호화된 비밀번호: %s \n", password);
		System.out.printf("복호화된 비밀번호: %s \n",res);
	}
}

class ArithmeticOperation { //<10번문제> 사칙연산

	void add(int n1, int n2){

		int res = n1+n2;
		System.out.println("덧셈의 결과값: " + res);
	}

	void subtract(int n1, int n2){
		int res = n1-n2;
		System.out.println("뺄셈의 결과값: " + res);
	}

	void divide(int n1, int n2){
		try{
			double res = n1/ n2;
			System.out.println("나눗셈의 결과값: " + res);
		}catch(ArithmeticException exception){
			System.out.println("n2의 값이 0이네요!");
		}
	}
	
	void multiply(int n1, int n2){
		int res = n1 * n2;
		System.out.println("곱셈의 결과값: "+ res);
	}
}