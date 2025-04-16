package practice;

import java.util.Scanner;


public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		/*
Scanner scanner = new Scanner(System.in);
		
		System.out.print("밑변을 입력하세요 :");
		int width = scanner.nextInt();
		System.out.println ("밑변=" + width);
		
		System.out.print("높이를 입력하세요 :");
		int height = scanner.nextInt();
		System.out.println ("높이=" + height);
		
		double area3 = (double)width * height / 2;
		
		System.out.printf("삼각형의 넓이는 %.2f2 입니다.\n"  , area3);  

		*/
		
		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
	/*
Scanner scanner = new Scanner(System.in);
		
		System.out.print("밑변을 입력하세요 :");
		int width2 = scanner.nextInt();
		System.out.println ("밑변=" + width2);
		
		System.out.print("윗변을 입력하세요 :");
		int length = scanner.nextInt();
		System.out.println ("윗변=" + length);
		
		System.out.print("높이를 입력하세요 :");
		int height2 = scanner.nextInt();
		System.out.println ("높이=" + height2);
		
		double area = (width2 + length)*height2 / 2.0;
		
		System.out.printf("사다리꼴의 넓이는 %.2f 입니다.\n" , area); */
		
	
	
	// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
	// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
	// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
	
	//System.out.println("한명당 받근 과자 수 : " + (100/24) );
	//System.out.println("남는 과자 수 : " + (100%24));
	

	// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
	// 158
	// 백의자리 : 1
	// 십의자리 : 5
	// 일의자리 : 8
	
	/*158/100
	158/10 = 15%10 
	158%10
	*/
	
	Scanner scanner = new Scanner(System.in);
	System.out.print ("세자리 정수를 입력하세요. :");
	int num = scanner.nextInt();
	
	System.out.println ("백의자리 : " +  (num/100) ) ;
	System.out.println ("십의자리 : " +  (num 10%10) ) ;
	System.out.println ("일의자리 : " +  (num%10) ) ;
	
	/* 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
	int x = 10;
	int y = 20;
	System.out.println("x="+x+ " y="+y);
	//x와 y를 바꾼 작업
	int z = x; // x값 임시보관 
	x = y;
	y = z;
	System.out.println("x="+x+ " y="+y); */
	
}
}
