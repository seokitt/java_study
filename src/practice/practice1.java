package practice;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*

		1) 결과가 2가 나오도록 작성하세요
		2) 결과가 2.5가 나오도록 작성하세요
		*/
		int x = 10;
		int y = 4;
		int result = x/y;
		System.out.println(result);
		
		
		int x = 10;
		int y = 4;
		int result = (double)x/y;
		System.out.println(result);

		//2. 결과가 7.5가 나오도록 작성하세요
		double a = 3.5;
		double b = 4.7;
		double result = a + (int)b;
		System.out.println(result);

		// 3. 계산결과가 12가 나오도록 작성하세요
		String a = "3.4";
		String b = "4";
		int result = (int)Double.parseDouble(a) * Integer.parseInt(b);
		System.out.println(result);


		//4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
		String a = "10";
		int b = 3;
		double c = 4.5;
		string result = a + ( (int)(b * c) );
		System.out.println(result);


		//5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
		int a = 4;
		double b = 3.4;
		String c = "6.8";
		string result =  ( (int)Double.parseDouble(c)- a ) + String.valueOf(a) + (int)b;
		string result =  (a * (int)Double.parseDouble(c) + (int)b;)
		System.out.println("\"" + result + "\"");

		//6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
		int x = 111;
		int y = 13;
		int result =  x % y;
		int result = x / y; 
		System.out.println(result);

		/* 1) 출력결과 : 7
		2)   출력결과 : 8
		*/
	}

}
