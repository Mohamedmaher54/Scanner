package projectScan;

import java.util.Scanner;

public class Scan {
	 Check ch = new Check();
	public String ReturnToken(String s) {

		switch (s) {

			case ("+"):
			case ("/"):
			case ("*"):
			case ("-"):
				return "Arthimatic Operation";

			case ("&&"):
			case ("||"):
			case ("~"):
				return "relational operators";


			case ("="):
				return "Assignment operator";

			case ("["):
			case ("]"):
			case ("{"):
			case ("}"):
				return "Braces";


			case ("."):
				return "Access Operator";

			case (">"):
			case ("<"):
			case ("!="):
			case ("=="):
			case (">="):
			case ("<="):
				return "relational operators";


			case ("\'"):
			case ("\""):
				return "Quotation Mark";

			case ("/#"):
				return "start comment";

			case ("#/"):
				return "end comment";

			case ("/-"):
				return "comment";

			case (";"):
			case ("@"):return "Delimiter";
			case ("BackedValue"):
				return "Return";
			case ("Beginning"):
				return "Start Statement";
			case ("Check-CaseOf"):
				return "Switch";
			case ("Clo"):
				return "Character";
			case ("Divisio"):
				return "Class";
			case ("End"):
				return "End Statement";
			case ("FBU"):
				return "Float";
			case ("InferedFrom"):
				return "Inheritance";
			case ("Ire"):
				return "Ire";
			case ("NoneValue"):
				return "Void";
			case ("RingWhen"):
				return "Loop";
			case ("SFBU"):
				return "SFloat";
			case ("STT"):
				return "Struct";
			case ("SetOfClo"):
				return "String";
			case ("Sire"):
				return "SInteger";
			case ("TerminateThisNow"):
				return "Break";
			case ("WhetherDo-Else"):
				return "Condition";
		 default:
		 return "Not Matched";
		}



		
	}

}
