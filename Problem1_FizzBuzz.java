
public class Problem1_FizzBuzz {
	public void print() {
		//Requirements: Output the numbers 1-100, with one number on every row.
		//	If the number is a multiple of 3 output an F instead of the number.
		//	If the number is a multiple of 5 output an B instead of the number.
		//	If the number is a multiple of 15 output output an FB instead of the number.
		for(int i=0; i<100;i++){
			System.out.println(i);
			//	If the number is a multiple of 3 output an F instead of the number.
			if(i%3 ==0){
				System.out.println("F");	
			}
			if(i%5 ==0){
				System.out.println("B");	
			}
			if(i%15 ==0){
				System.out.println("FB");	
			}
			
		}
		
		
	}
}
