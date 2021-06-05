package projectScan;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
//
//		 System.out.println("  Run on DFA :");
//		  Scanner scan = new Scanner(System.in);
//
//	     String string = scan.nextLine();
////		String string = "End Divisio && + = /-";
//	   Symbol s = new Symbol (string);
//	     s.check_Sympol();
//	     Scan sc = new Scan();
//     Check ch = new Check();
//
//		//System.out.println()
//
//		//for identifier
//		String []word = string.split("@");
//		//for keywords + symbols
//		for(int i=0;i<word.length;i++)
//		{
////			System.out.println(ch.check(string));
//			System.out.println(sc.ReturnToken(word[i]));
//


		Scan sc = new Scan();
		Check ch = new Check();
		String string;
		try {
			File myFile = new File("filename.txt");
			Scanner myReader = new Scanner(myFile);

			while (myReader.hasNextLine()) {
				 string = myReader.nextLine();
				String []word = string.split("");
				//for keywords + symbols
				for(int i=0;i<word.length;i++)
				{
					System.out.println(sc.ReturnToken(word[i]));
					String w = word[i];
					System.out.println(ch.check(w));


				}
				Symbol s = new Symbol (string);
				s.check_Sympol();
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}




//		 System.out.println("  Run on DFA :");
//		  Scanner scan = new Scanner(System.in);
//	     	String string = scan.nextLine();
//			String string = "End Divisio && + = /-";
//	   		Symbol s = new Symbol (string);
//	     	s.check_Sympol();

		//for identifier
//		String []word = string.split("");
//		//for keywords + symbols
//		for(int i=0;i<word.length;i++)
//		{
//			System.out.println(sc.ReturnToken(word[i]));
//			String w = word[i];
//			System.out.println(ch.check(w));
//
//
//		}
//		System.out.println(ch.check(string));
	}
}
