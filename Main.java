import java.util.Scanner; 
class Main {
  public static void main(String[] args) 
	{
    Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("Hi, " + name + " What year did you start school?");
		int yearStartedSchool = scan.nextInt();
		System.out.println(name + ", what year is it?");
		int currentYear = scan.nextInt();

		int years = numYears(yearStartedSchool, currentYear);

		System.out.println(junior(years));
  }
	//numYears method gets how many years you have been in school for.

	static int numYears(int yearStartedSchool, int currentYear)
	{
		int yearsToGo = yearStartedSchool - currentYear;
		return yearsToGo;
	}
	// junior method determins if you are a junior or not.
	static boolean junior(int yearsToGo){
		if (yearsToGo == 2){
			return true;
		} else{
			return false;
		}
	}
	
}