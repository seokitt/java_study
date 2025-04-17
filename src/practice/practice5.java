package practice;


import java.util.Scanner;


public class practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner scanner = new Scanner(System.in);
		
		System.out.print("출생년도를 입력하세요 :");
		int year = scanner.nextInt();
		
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요. :");
		int num = scanner.nextInt();
		
		int age = 2026 -year;
		
		if(num == 1 && year <2000) {  System.out.println(age + "살 남자 입니다.");
		}
		else if (num == 2 && year <2000) {System.out.println(age + "살 여자 입니다.");
		}
		else if (num == 3 && year >= 2000) {System.out.println(age + "살 남자 입니다.");
		}
		else if (num == 4 && year >= 2000) {System.out.println(age + "살 여자 입니다.");
		} 
		else { System.out.println("잘못 된 입력입니다."); }
		
		
		
		

		}

}
