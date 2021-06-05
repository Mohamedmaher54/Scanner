package projectScan;

import java.util.Scanner;

public class Symbol {
String string;
char state;
	public Symbol(String st) {
		// TODO Auto-generated constructor stub
		string = st;
	}
	// Scan s=new Scan();
	 public void check_Sympol() {
 
		 
	          state = 'A';
	        for (char c : string.toCharArray()) {
	            switch (state) {
	            case ('A'): {
                 if (c == '!' ) {
                     state = 'B';
                 } else if (c=='\"') {
                 	 state = 'C';
                 }else if (c=='#') {
                 	 state = 'D';
                 }else if (c=='&') {
                 	 state = 'E';
                 }else if (c=='\'') {
                 	 state = 'F';
                 }else if (c=='-') {
                 	 state = 'G';
                 }else if (c=='.') {
                 	 state = 'H';
                 }else if (c=='/') {
                 	 state = 'I';
                 }else if (c==';') {
                 	 state = 'J';
                 }else if (c=='<') {
                 	 state = 'K';
                 }else if (c=='=') {
                 	 state = 'L';
                 }else if (c=='>') {
                 	 state = 'M';
                 }else if (c=='@') {//check
                 	 state = 'N';
                 }else if (c=='*') {
                 	 state = 'O';
                 }else if (c=='|') {
                 	 state = 'P';
                 }else if (c=='+') {
                 	 state = 'Q';
                 }else if (c=='[') {
                 	 state = 'R';
                 }else if (c==']') {
                 	 state = 'S';
                 } else if (c=='{') {
                 	 state = 'T';
                 }else if (c=='}') {
                 	 state = 'U';
                 }else if (c=='~') {
                 	 state = 'V';
                 }
                 
                 

             }
             break;
             case ('B'): {
                 if (c == '=' ) {
                     state = 'W';
                 } else {
                 	state = 'A'; //Assignment operator
                 }
             }
             break;
             
             case ('C'): {
                     state = 'A';   // Quotation Mark  double
             }
             break;
             case ('D'): {
                 if (c == '/' ) {
                     state = 'X';
                 }  
             }
             break;
             case ('E'): {
                 if (c == '&' ) {
                     state = 'Y';
                 }  
             }
             break;
             case ('F'): {
                     state = 'A'; // Quotation Mark single
             }
             break;
             case ('G'): {
                 state = 'A'; //  - minus
         }
         break;
             case ('H'): {
                 state = 'A'; //  . dots 
         }
         break;
             case ('I'): {
                 if(c=='#') {
                 	state = 'X';  //end comment to Z replaced with x
                 }else if(c=='-') {
                 	state = 'X';  //single comment  to I replaced with x
                 }
         }
         break;
             case ('J'): {
                 state = 'A'; // ; semi  
         }
         break;
             case ('K'): {
               if (c=='=')   {
             	  state ='b';
               }else {
             	  state = 'A'; // the state is less than
               }
         }
         break;
             case ('L'): {
                   if (c=='=')   {
                 	  state ='c'; 
                   } 
                }
             break;
             case ('M'): {
                 if(c=='=') {
                 	state = 'd';  
                 }else   {
                 	state = 'A';  //greater than >
                 }
         }
         break;
             case ('N'): {
//				if (c=='_'||((c>='a'&&c<='z')&&(c>='A'&&c<='Z'))){
//					 state = 'A';//identifier
//				 }else{
                 state = 'A';
//             }//this delmitr @
         }
         break;
             case ('O'): {
                 state = 'A'; //this multi  *
         }
         break;
             case ('P'): {
             	if(c=='|')
                 state = 'A';
         }
         break;
             case ('Q'): {
             	 
                 state = 'A'; // plus  
         }
         break;
             case ('R'): {
             	 
                 state = 'A'; // [ array begin br  
         }
         break;
         case ('S'): {
         	 
             state = 'A'; // } array end br 
     }
     break;
         case ('T'): {
         	 
             state = 'A'; // { IF begin br  
     }
     break;
         case ('U'): {
         	 
             state = 'A'; // } If end br 
     }
     break;
         case ('V'): {
         	 
             state = 'A'; // ~~~~~~~~~
     }
     break;
         
             case ('b'): {
                 state = 'A'; // <= less or equal  
         }
             case ('c'): {
                 state = 'A'; // == equal  
         }
         break;
             case ('d'): {
                 state = 'A'; // >= greater than or equal  
         }
         break;
             case ('e'): {
                 state = 'A'; // || OR  
         }
         break;
             case ('W'): {
                 state = 'A'; // != 
         }
         break;
          case ('X'): {
                     state = 'A'; // comment
             }
             break;
             case ('Y'): {
                 state = 'A'; // && 
         }
         break;
             
	                
	            }// end Switch
	            if (state == 'A') {
//	            	System.out.println("lexeme is = "+s.ReturnToken(string));
		          
		        } 
//		        else if (state == 'D') {
//		            System.out.println("lexeme is >= ");
//		             
//		        } else {
//		           // System.out.println("DFA does not accepts this string");
//		        }
	            //repeat switch
	            if(state=='A') {
	            	  switch (state) {
	            	  
	            	  
	            	  
		                case ('A'): {
		                    if (c == '!' ) {
		                        state = 'B';
		                    } else if (c=='\"') {
		                    	 state = 'C';
		                    }else if (c=='#') {
		                    	 state = 'D';
		                    }else if (c=='&') {
		                    	 state = 'E';
		                    }else if (c=='\'') {
		                    	 state = 'F';
		                    }else if (c=='-') {
		                    	 state = 'G';
		                    }else if (c=='.') {
		                    	 state = 'H';
		                    }else if (c=='/') {
		                    	 state = 'I';
		                    }else if (c==';') {
		                    	 state = 'J';
		                    }else if (c=='<') {
		                    	 state = 'K';
		                    }else if (c=='=') {
		                    	 state = 'L';
		                    }else if (c=='>') {
		                    	 state = 'M';
		                    }else if (c=='@') {
		                    	 state = 'N';
		                    }else if (c=='*') {
		                    	 state = 'O';
		                    }else if (c=='|') {
		                    	 state = 'P';
		                    }else if (c=='+') {
		                    	 state = 'Q';
		                    }else if (c=='[') {
		                    	 state = 'R';
		                    }else if (c==']') {
		                    	 state = 'S';
		                    } else if (c=='{') {
		                    	 state = 'T';
		                    }else if (c=='}') {
		                    	 state = 'U';
		                    }else if (c=='~') {
		                    	 state = 'V';
		                    }
//		                    else if (c=='_'||((c>='a'&&c<='z')||(c>='A'&&c<='Z'))){
//								state = 'N';
//							}




						}
		                break;
		                case ('B'): {
		                    if (c == '=' ) {
		                        state = 'W';
		                    } else {
		                    	state = 'B'; //Assignment operator
		                    }
		                }
		                break;
		                
		                case ('C'): {
		                        state = 'C';   // Quotation Mark  double
		                }
		                break;
		                case ('D'): {
		                    if (c == '/' ) {
		                        state = 'X';
		                    }  
		                }
		                break;
		                case ('E'): {
		                    if (c == '&' ) {
		                        state = 'Y';
		                    }  
		                }
		                break;
		                case ('F'): {
		                        state = 'F'; // Quotation Mark single
		                }
		                break;
		                case ('G'): {
	                        state = 'G'; //  - minus
	                }
	                break;
		                case ('H'): {
	                        state = 'H'; //  . dots 
	                }
	                break;
		                case ('I'): {
	                        if(c=='#') {
	                        	state = 'X';  //end comment to Z replaced with x
	                        }else if(c=='-') {
	                        	state = 'X';  //single comment  to I replaced with x
	                        }
	                }
	                break;
		                case ('J'): {
	                        state = 'J'; // ; sami  
	                }
	                break;
		                case ('K'): {
	                      if (c=='=')   {
	                    	  state ='b';
	                      }else {
	                    	  state = 'K'; // the state is less than
	                      }
	                }
	                break;
		                case ('L'): {
		                      if (c=='=')   {
		                    	  state ='c'; 
		                      } 
		                   }
		                break;
		                case ('M'): {
	                        if(c=='=') {
	                        	state = 'd';  
	                        }else   {
	                        	state = 'M';  //greater than >
	                        }
	                }
	                break;
						  case ('N'): {
//							  if (c=='_'||((c>='a'&&c<='z')||(c>='A'&&c<='Z'))){
//								  state = 'z';//identifier
//							  }else{
								  state = 'N';
//						  }//this delmitr @
						  }
						  break;
		                case ('O'): {
	                        state = 'O'; //this multi  *
	                }
	                break;
		                case ('P'): {
		                	if(c=='|')
	                        state = 'P';
	                }
	                break;
		                case ('Q'): {
		                	 
	                        state = 'Q'; // plus  
	                }
	                break;
		                case ('R'): {
		                	 
	                        state = 'R'; // [ array begin br  
	                }
	                break;
	                case ('S'): {
	                	 
                     state = 'S'; // } array end br 
             }
             break;
	                case ('T'): {
	                	 
                     state = 'T'; // { IF begin br  
             }
             break;
	                case ('U'): {
	                	 
	                    state = 'U'; // } If end br 
	            }
	            break;
	                case ('V'): {
	                	 
	                    state = 'V'; // ~~~~~~~~~
	            }
	            break;
	                
		                case ('b'): {
	                        state = 'b'; // <= less or equal  
	                }
		                case ('c'): {
	                        state = 'c'; // == equal  
	                }
	                break;
		                case ('d'): {
	                        state = 'd'; // >= greater than or equal  
	                }
	                break;
		                case ('e'): {
	                        state = 'e'; // || OR  
	                }
	                break;
		                case ('W'): {
	                        state = 'W'; // != 
	                }
	                break;
		             case ('X'): {
		                        state = 'X'; // comment
		                }
		                break;
		                case ('Y'): {
	                        state = 'Y'; // && 
	                }
	                break;

		            }// end Switch
/*	            	  if (state == 'A') {
	  	            	System.out.println("lexeme is  "+s.ReturnToken(string));

	  		        } 
	  		        else if (state == 'A') {
	  		            System.out.println("lexeme is >= ");
	  		             
	  		        } else {
	  		            System.out.println("DFA does not accepts this string");
	  		        }*/
//					System.out.println("lexeme is  "+s.ReturnToken(string));
	            }// end if
	        }//end for
	 }
		 
		 
	     



	

}  
