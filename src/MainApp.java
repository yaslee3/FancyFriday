import java.util.Scanner;




 
/**this is a demo app on what to wear 
 * @author yas lee
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String inputFancyFriday,inputSunny, inputRaining;
		 boolean fancyFriday=false;
		 boolean sunny= false;
		 boolean raining = false;
		
		 String inputContinue;
		 boolean userContinue =true;
		// Get input from user
		Scanner input = new Scanner(System.in);
		
		while(userContinue){
		System.out.println("Is it fancyFriday?");
		inputFancyFriday = input.nextLine();
		
		System.out.println("Is it sunny?");
		inputSunny = input.nextLine();
		
		System.out.println("Is it raining?");
		inputRaining = input.nextLine();
		
		//test if the variable are working properly
		//System.out.println(inputFancyFriday + "" + inputSunny + "" + inputRaining);
		
		//Set condition variables base on input
		if (inputFancyFriday.equalsIgnoreCase("yes")){
			fancyFriday = true;
		}
		
		if (inputSunny.equalsIgnoreCase("yes")){
			sunny = true;
		}
		if (inputRaining.equalsIgnoreCase("yes")){
			raining = true;
		}
		//test if the variable are working properly
		//System.out.println(fancyFriday + "" + sunny + "" + raining);
				
		
		
		// use if statement to decide what to wear
		if(fancyFriday){
			if(sunny){
		   	 System.out.println("tea gown");
			}else if(raining){
				 System.out.println("power suit");
			}else{
				 System.out.println("long gown");
			}
		}else{
			System.out.println("tshirt and jeans");
		}
		//Ask if you want to continue
		System.out.println("Continue?");
		inputContinue = input.nextLine();
		
		if(inputContinue.equals("yes")){
			userContinue= true;
		}else{
			userContinue = false;
		}
		}//close while loop
	}

}
