package cond;

public class conditional3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//조건문 switch
		
		int dice = 1;
		
		if(dice >= 1 && dice <= 3) {
			
		}
		
		switch(dice) {
		case 1:					// dice ==1
			    System.out.println("Dice 값이!!");
				System.out.println("1이다");
				break;
		case 2:					//dice ==2
			    System.out.println("2이다");
			    break;
		case 99:				//dice== 99
			    System.out.println("99이다");
			    break;
		default:				//else
			System.out.println("default이다");
		}
		
		
		
		switch(dice) {
		case 1 -> System.out.println("1이다");   //break 포함 
		case 2 -> System.out.println("2이다");
		case 3 -> System.out.println("99이다");
		default ->System.out.println("default이다");
		}
		
		
		// switch 실수형(double) nono~
		char c = 'c';
		
		switch(c) {
		case'a' :
		case'b'	:	
		case'c'	:
		case'd' :
		default :  
		}
		String day = "FRI";
		
		switch(day) {
		case "MON":
		case "TUE":
		//...
		case "FRI":
			System.out.println("금요일입니다.");
			break;
		default:
				
		
		}
	}

}
