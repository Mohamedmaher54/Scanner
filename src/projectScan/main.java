package projectScan;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
	
		 System.out.println("  Run on DFA :");
		  Scanner scan = new Scanner(System.in);

	     String string = scan.nextLine();
//		String string = "End Divisio && + = /-";
	     Symbol s = new Symbol (string);
	     s.check_Sympol();
	     Scan sc = new Scan();
	     Check ch = new Check();
		String []word = string.split(" ");
		System.out.println(ch.check(string));
		for(int i=0;i<word.length;i++)
		{
//			System.out.println(ch.check(string));
			System.out.println(sc.ReturnToken(word[i]));
		}
	}
}  
