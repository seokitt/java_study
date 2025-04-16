package cond;

public class Conditional01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//조건문 	if
		 int num = 5;
		 
		 if (num > 10) {
		
		System.out.println("Hello");
		System.out.println("num이 10보다 크더라~");
	}
		 if (num <= 20) {
			 System.out.println("20보다 작거나 같더라~");
		 }
		 
		 if (num != 5) {  //중괄호가 없으면 조건문 다음1줄만 if문 범위에 종속됨
			 System.out.println("살펴봤더니");
			 System.out.println("5는 아니더라~"); 
		 }
		 
		 boolean b1 = ( num == 5);
		 
		 //상황연산자 (조건식) ? 참:거짓
		 if(b1 == true) { //조건문 if (조건식)
			 System.out.println("num이 5다.");
		 }
		 
		 	// 변수의 범위 (지역변수)  IF 괄호 내에서만 적용됨
		 if(b1)   {//true
		 		System.out.println ("b1 조건문 내부" + num);
		 		
		 		int x = 100;
		 		System.out.println("x =" + x);
		 }
		 
		 	
		 System.out.println("프로그램 끝");
	}
}
