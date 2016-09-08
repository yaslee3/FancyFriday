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
		 boolean fancyfriday=false;
		 boolean sunny= false;
		 boolean raining = false;
		
		// Get input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Is it fancy friday?");
		inputFancyFriday = input.nextLine();
		
		System.out.println("Is it sunny?");
		inputSunny = input.nextLine();
		
		System.out.println("Is it raining?");
		inputRaining = input.nextLine();
		
		//test if the variable are working properly
		//System.out.println(inputFancyFriday + "" + inputSunny + "" + inputRaining);
		
		//Set condition variables base on input
		if (inputFancyFriday.equalsIgnoreCase("yes")){
			fancyfriday = true;
		}
		
		if (inputSunny.equalsIgnoreCase("yes")){
			sunny = true;
		}
		if (inputRaining.equalsIgnoreCase("yes")){
			raining = true;
		}
		//test if the variable are working properly
		//System.out.println(fancyfriday + "" + sunny + "" + raining);
				
		
		
		// use if statement to decide what to wear
		
		

	}

}
