package practice;

import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		
		
		

		
		*/
		
		
		//4번 아래 코드를 switch 문으로 변경
		// *** switch 문은 범위를 지정할 수 없습니다.
		// 결과 값만 동일하게 나오도록 만들어보세요.
		// 단, 점수는 100점까지로 간주합니다.
		// 점수는 0~100 점 중에 score로 주어진다.

		/*
		if( score >= 90) {
		System.out.println("학점 A");
		} else if ( score >= 80) {
		System.out.println("학점 B");
		} else if (score >= 70) {
		System.out.println("학점 C");
		} else if (score < 70) {
		System.out.println("학점 F");
		}
		*/
		
		
		int score = 69;
		
		switch (score / 10) {
	    case 10: 
	    case 9:
	        System.out.println("학점 A");
	        break;
	    case 8:
	        System.out.println("학점 B");
	        break;
	    case 7:
	        System.out.println("학점 C");
	        break;
	    default:
	        System.out.println("학점 F");
	        break;
		
		}
	}


public static void prac1() {
	/*// 1~24 중 하나의 정수를 입력받습니다. 범위를 넘어선 값을 입력할 수도 있음.
	// 입력받은 숫자를 보고 아래 기준에 맞게 출력하세요.
	// 1) 범위를 벗어나면, "잘못입력했습니다." 라고 출력
	// 2) 시간<=12 오전입니다. 시간>12 오후입니다.
	// 3) 1~6시 이른 오전입니다. 7~12 늦은 오전입니다.
	// 4) 13~18시 이른 오후입니다. 19~24 늦은 오후입니다.

	//입력에 따른 출력 예시
	
			26
			"잘못입력했습니다."

			5
			오전입니다.
			이른 오전입니다.

			9
			오전입니다.
			늦은 오전입니다.

			21
			오후입니다.
			늦은오후입니다. */


	
			Scanner scanner = new Scanner(System.in);

			int number = scanner.nextInt();

			if(number >= 1 && number <= 6) {
				System.out.println("이른 오전입니다.");}

			else if(number >= 7 && number <= 12) {
					System.out.println("늦은 오전입니다.");
				}

			else if(number > 12 && number <= 18) {
				System.out.println("오후입니다.");
			}
			else if(number > 18 && number <= 24) {
				System.out.println("오후 입니다.");
				System.out.println("늦은 오후 입니다.");
			}
			else { 
				System.out.println("값을 잘못 입력했습니다..");
			}

	 
}


public static void prac2() {
	

	//2번 아래 코드를 if문으로 변경

			/*int diceNum = 3; //주사위 수 1~6

			// if문 변환
			switch(diceNum) {
			case 1: // diceNum == 1
			System.out.println("1");
			break;
			case 2:
			System.out.println("2");
			break;
			case 3:
			System.out.println("3");
			case 4:
			System.out.println("4");
			case 5:
			System.out.println("5");
			break;
			default:
			System.out.println("6");
			//case 6:
			}     */
			 
			
			
			
			
			int dice = 2;
			
			if(dice == 1 && dice <=6) {
				System.out.println("1");}
				
			else if(dice == 2 && dice <=6) {
					System.out.println("2");
				}
			
			else if(dice == 3 && dice <=6) {
				System.out.println("3");
							System.out.println("4");
										System.out.println("5");
			}
			else if(dice == 4 && dice <=6) {
				System.out.println("4.");
						System.out.println("5.");
			}
			else if (dice == 5 && dice <=6) { 
				System.out.println("5");
			}
			
			else  { 
				System.out.println("6");   
			}
}




public static void prac3() {
	//3번 아래 코드를 swtich 문으로 변경
/*
	String localNum = "031";
	// switch 문으로 변경
	if ( localNum.equals("031") ){
	System.out.println("경기도입니다");
	}
	if ( localNum.equals("02") ){
	System.out.println("서울입니다.");
	}
	if ( localNum.equals("041") ){
	System.out.println("충남입니다");
	}
	if ( localNum.equals("051") ){
	System.out.println("부산입니다");
	}
	
	*/
	
	
	
	string  localNum = 051;	
	
						//String 값 비교
						//localNum == "031" 비교X
						//localNum.equals("031") 비교 O true/false
	
	switch(localNum) {
	case 031:					
		    System.out.println("경기도 입니다.");
			break;
	case 02:					
		    System.out.println("서울 입니다.");
		    break;
	case 041:				
		    System.out.println("충남입니다");
		    break;
	case 051:				
	    System.out.println("부산입니다");
	    break;

	}
}




public static void prac4() {
	
}
}