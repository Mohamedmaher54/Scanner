package projectScan;

import java.util.Scanner;

public class Scan {
public String ReturnToken (String s) {
	String string = s,st;
	Scanner input = new Scanner(string); 
	
	  while (input.hasNext()) {
		  st = input.next();
	switch(st) {
	
	    case("+"):
	 	case("/"):
	 	case("*"):
	 	case("-"):return "Arthimatic Operation";
	 
	 	case("&&"):
	 	case("||"):
	 	case("~"):return "relational operators";
		 
	 
	 	case("="):return "Assignment operator";
	 	
	 	case("["):
	 	case("]"):
	 	case("{"):
	 	case("}"):return "Braces";
	 	
	 	 
	  
	 	case("."):return "Access Operator";
	 	
	 	case(">"):
	 	case("<"):
	 	case("!="):
	 	case("=="):
	 	case(">="):
	 	case("<="):return "relational operators";
	 	
	 	 
	 	case("\'"):
	 	case("\""):return "Quotation Mark";
	 	
	 	case("/#"):return "start comment";
	 	
	 	case("#/"):return "end comment";
	 	
	 	case("/-"):return "comment";
	 	
	 	case(";"):
	 	case("@"):return "Delimiter";
	 	

	 
	}
	 

	  }
		return null; 
}
}
