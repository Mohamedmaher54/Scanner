package projectScan;

public class keywords {
	String string;
	  String state = "A";
	public keywords(String keystring) {
		
		string=keystring;
		
	}
	//Scan s=new Scan(string);
	public void check_keyword() {
		     
		       for (char c : string.toCharArray()) {
		           switch (state) {
		               case ("A"): {
		                   if (c == 'B' ) {
		                       state = "B";
		                       
		                   }else if (c == 'C') {
		                   	state ="C" ;
		                   }
		                   else if (c=='D') {
		                   	state ="D" ;
		                   }
		                   else if (c=='E') {
		                   	state ="E" ;
		                   }
		                   else if (c=='F') {
		                      	state ="F" ;
		                      }
		                   else if (c=='I') {
		                     	state ="G" ;
		                     }
		                   else if (c=='N') {
		                     	state ="H" ;
		                     }
		                   else if (c=='R') {
		                    	state ="I" ;
		                    }
		                   else if (c=='S') {
		                     	state ="J" ;
		                     }
		                   else if (c=='T') {
		                    	state ="K" ;
		                    }
		                   else if (c=='W') {
		                    	state ="L" ;
		                    }


		               }
		               break;
		               case ("B"): {
		                   if (c == 'a' ) {
		                       state = "M";
		                       //for backedvalue
		                   } 
		                   else if(c=='e') {
		                	   state = "N";
		                	   //for beginning
		               }
		                   }
		               break;
		               
		               case ("M"): {
		                   if (c == 'c' ) {
		                       state = "AD";
		                       
		                   } 
		               }
		               break;
		               case ("AD"): {
		                   if (c == 'k' ) {
		                       state = "AU";
		                       
		                   } 
		               }
		               break;
		               case ("AU"): {
		                   if (c == 'e' ) {
		                       state = "BG";
		                      
		                   } 
		               }
		               break;
		               case ("BG"): {
		                   if (c == 'd' ) {
		                       state = "BQ";
		                      
		                   } 
		               }
		               break;
		               case ("BQ"): {
		                   if (c == 'V' ) {
		                       state = "CA";
		                      
		                   } 
		               }
		               break;
		               case ("CA"): {
		                   if (c == 'a' ) {
		                       state = "CK";
		                       
		                   } 
		               }
		               break;
		               case ("CK"): {
		                   if (c == 'l' ) {
		                       state = "CT";
		                       
		                   } 
		               }
		               break;
		               case ("CT"): {
		                   if (c == 'u' ) {
		                       state = "DA";
		                      
		                   } 
		               }
		               break;
		               case ("DA"): {
		                   if (c == 'e' ) {
		                       state="DF";
		                      
		                   } 
		               }
		               break;
		               case ("DF"): {
		                   
		                       state="A";
		                       
		                   //end of backedvalue
		               }
		               break;
		           
		           case ("N"): {
	                   if (c == 'g' ) {
	                       state="AE";
	                      
	                   } 
	               }
	               break;
		           case ("AE"): {
	                   if (c == 'i' ) {
	                       state="AV";
	                      
	                   } 
	               }
	               break;
		           case ("AV"): {
	                   if (c == 'n' ) {
	                       state="BH";
	                      
	                   } 
	               }
	               break;
		           case ("BH"): {
	                   if (c == 'n' ) {
	                       state="BR";
	                      
	                   } 
	               }
	               break;
		           case ("BR"): {
	                   if (c == 'i' ) {
	                       state="CB";
	                      
	                   } 
	               }
	               break;
		           case ("CB"): {
	                   if (c == 'n' ) {
	                       state="CL";
	                      
	                   } 
	               }
	               break;
		           case ("CL"): {
	                   if (c == 'g' ) {
	                       state="CU";
	                      
	                   } 
	               }
	               break;
		           case ("CU"): {
	                   
	                       state="A";
	                      //end of beginning
	                   
	               }
	               break;
		           case ("C"): {
	                   if (c == 'h' ) {
	                       state="O";
	                      //beginning of check-caseof
	                   }
	                   else if (c=='l') {
	                	   state="P";
	                	   //beginning of Clo
		           }
	               }
	               break;
		           case ("O"): {
	                   if (c == 'e' ) {
	                       state="AF";
	                      
	                   } 
	               }
	               break;
		           case ("AF"): {
	                   if (c == 'c' ) {
	                       state="AW";
	                      
	                   } 
	               }
	               break;
		           case ("AW"): {
	                   if (c == 'k' ) {
	                       state="BI";
	                      
	                   } 
	               }
	               break;
		           case ("BI"): {
	                   if (c == '-' ) {
	                       state="BS";
	                      
	                   } 
	               }
	               break;
		           case ("BS"): {
	                   if (c == 'C' ) {
	                       state="CC";
	                      
	                   } 
	               }
	               break;
		           case ("CC"): {
	                   if (c == 'a' ) {
	                       state="CM";
	                      
	                   } 
	               }
	               break;
		           case ("CM"): {
	                   if (c == 's' ) {
	                       state="CV";
	                      
	                   } 
	               }
	               break;
		           case ("CV"): {
	                   if (c == 'e' ) {
	                       state="DB";
	                      
	                   } 
	               }
	               break;
		           case ("DB"): {
	                   if (c == 'O' ) {
	                       state="DG";
	                      
	                   } 
	               }
	               break;
		           case ("DG"): {
	                   if (c == 'f' ) {
	                       state="DK";
	                      
	                   } 
	               }
	               break;
		           case ("DK"): {
	                   
	               state="A";
	               //end of Check-CaseOf       
	                   
	               }
	               break;
		           case ("P"): {
	                   if (c == 'o' ) {
	                       state="AG";
	                      
	                   } 
	               }
	               break;
		           case ("AG"): {
	                   
	                       state="A";
	                      //end of Clo
	                  
		           }
	               break;
		           case ("D"): {
	                   if (c == 'i' ) {
	                       state="Q";
	                      //start of Divisio
	                   } 
	               }
	               break;
		           case ("Q"): {
	                   if (c == 'v' ) {
	                       state="AH";
	                      
	                   } 
	               }
	               break;
		           case ("AH"): {
	                   if (c == 'i' ) {
	                       state="AX";
	                      
	                   } 
	               }
	               break;
		           case ("AX"): {
	                   if (c == 's' ) {
	                       state="BJ";
	                      
	                   } 
	               }
	               break;
		           case ("BJ"): {
	                   if (c == 'i' ) {
	                       state="BT";
	                      
	                   } 
	               }
	               break;
		           case ("BT"): {
	                   if (c == 'o' ) {
	                       state="CD";
	                      
	                   } 
	               }
	               break;
		           case ("CD"): {
	                   
	                       state="A";
	                      //end of divisio
	                   
	               }
	               break;
		           case ("E"): {
	                   if (c == 'n' ) {
	                       state="R";
	                      //start of End
	                   } 
	               }
	               break;
		           case ("R"): {
	                   if (c == 'd' ) {
	                       state="AI";
	                      
	                   } 
	               }
	               break;
		           case ("AI"): {
	                   
	                       state="A";
	                      //end of End
	                    
	               }
	               break;
		           case ("F"): {
	                   if (c == 'B' ) {
	                       state="S";
	                      //start of FBU
	                   } 
	               }
	               break;  
		           case ("S"): {
	                   if (c == 'U' ) {
	                       state="AJ";
	                      
	                   } 
	               }
	               break;
		           case ("AJ"): {
	                   
	                       state="A";
	                    //end of FBU  
	                    
	               }
	               break;
		           case ("G"): {
	                   if (c == 'n' ) {
	                       state="T";
	                      //start of inferedfrom
	                   }
	                   else if (c=='r') {
	                	   state="U";
	                	   //start of Ire
	                   }
	               }
		           break;
		           case ("T"): {
	                   if (c == 'f' ) {
	                       state="AK";
	                      
	                   } 
	               }
	               break;
		           case ("AK"): {
	                   if (c == 'e' ) {
	                       state="AY";
	                      
	                   } 
	               }
	               break;
		           case ("AY"): {
	                   if (c == 'r' ) {
	                       state="BK";
	                      
	                   } 
	               }
	               break;
		           case ("BK"): {
	                   if (c == 'e' ) {
	                       state="BU";
	                      
	                   } 
	               }
	               break;
		           case ("BU"): {
	                   if (c == 'd' ) {
	                       state="CE";
	                      
	                   } 
	               }
	               break;
		           case ("CE"): {
	                   if (c == 'F' ) {
	                       state="CN";
	                      
	                   } 
	               }
	               break;
		           case ("CN"): {
	                   if (c == 'r' ) {
	                       state="CW";
	                      
	                   } 
	               }
	               break;
		           case ("CW"): {
	                   if (c == 'o' ) {
	                       state="DC";
	                      
	                   } 
	               }
	               break;
		           case ("DC"): {
	                   if (c == 'm' ) {
	                       state="DH";
	                      
	                   } 
	               }
	               break;
		           case ("DH"): {
	                   
	                       state="A";
	                      //end of inferedfrom
	                   
	               }
	               break;
		           case ("U"): {
	                   if (c == 'e' ) {
	                       state="AL";
	                      
	                   } 
	               }
	               break;  
		           case ("AL"): {
	                   state="A";	                       
	                      //end of IRE
		           }
	               
	               break;
		           case ("H"): {
	                   if (c == 'o' ) {
	                       state="V";
	                      //start of nonevalue
	                   } 
	               }
	               break;
		           case ("V"): {
	                   if (c == 'n' ) {
	                       state="AM";
	                      
	                   } 
	               }
	               break;
		           case ("AM"): {
	                   if (c == 'e' ) {
	                       state="AZ";
	                      
	                   } 
	               }
	               break;
		           case ("AZ"): {
	                   if (c == 'V' ) {
	                       state="BL";
	                      
	                   } 
	               }
	               break;
		           case ("BL"): {
	                   if (c == 'a' ) {
	                       state="BV";
	                      
	                   } 
	               }
	               break;
		           case ("BV"): {
	                   if (c == 'l' ) {
	                       state="CF";
	                      
	                   } 
	               }
	               break;
		           case ("CF"): {
	                   if (c == 'u' ) {
	                       state="CO";
	                      
	                   } 
	               }
	               break;
		           case ("CO"): {
	                   if (c == 'e' ) {
	                       state="CX";
	                      
	                   } 
	               }
	               break;
		           case ("CX"): {
	                    
	                       state="A";
	                   //end of NoneValue    
	                    
	               }
	               break;
		           case ("I"): {
	                   if (c == 'i' ) {
	                       state="W";
	                      
	                   } 
	               }
		           
	               break;
		           case ("W"): {
	                   if (c == 'n' ) {
	                       state="AN";
	                      
	                   } 
	               }
	               break;
		           case ("AN"): {
	                   if (c == 'g' ) {
	                       state="BA";
	                      
	                   } 
	               }
	               break;
		           case ("BA"): {
	                   if (c == 'W' ) {
	                       state="BM";
	                      
	                   } 
	               }
	               break;
		           case ("BM"): {
	                   if (c == 'h' ) {
	                       state="BW";
	                      
	                   } 
	               }
	               break;
		           case ("BW"): {
	                   if (c == 'e' ) {
	                       state="CG";
	                      
	                   } 
	               }
	               break;
		           case ("CG"): {
	                   if (c == 'n' ) {
	                       state="CP";
	                      
	                   } 
	               }
	               break;
		           case ("CP"): {
	                  
	                       state="A";
	                    //end of RingWhen  
	                   
	               }
	               break;
		           case ("J"): {
	                   if (c == 'F' ) {
	                       state="X";
	                      //start of SFBU
	                   } 
	                   else if (c=='T') {
	                	   state="Y";
	                	   //start of STT
	                   }
	                   else if (c=='e') {
	                	   state="Z";
	                	   //start of SetOfClo
	                   }
	                   else if(c=='i') {
	                	   state="AA";
	                	   //start of Sire
	                   }
	               }
	               break;
		           case ("X"): {
	                   if (c == 'B' ) {
	                       state="AO";
	                      
	                   } 
	               }
	               break;
		           case ("AO"): {
	                   if (c == 'U' ) {
	                       state="BB";
	                      
	                   } 
	               }
	               break;
		           case ("BB"): {
	                   
	                       state="A";
	                   //end of SFBU   
	                    
	               }
	               break;
		           case ("Y"): {
	                   if (c == 'T' ) {
	                       state="AP";
	                      
	                   } 
	               }
	               break;
		           case ("AP"): {
	                   
	                       state="A";
	                     //end of STT
	                    
	               }
	               break;
		           case ("Z"): {
	                   if (c == 't' ) {
	                       state="AQ";
	                      
	                   } 
	               }
	               break;
		           case ("AQ"): {
	                   if (c == 'O' ) {
	                       state="BC";
	                      
	                   } 
	               }
	               break;
		           case ("BC"): {
	                   if (c == 'f' ) {
	                       state="BN";
	                      
	                   } 
	               }
	               break;
		           case ("BN"): {
	                   if (c == 'C' ) {
	                       state="BX";
	                      
	                   } 
	               }
	               break;
		           case ("BX"): {
	                   if (c == 'l' ) {
	                       state="CH";
	                      
	                   } 
	               }
	               break;
		           case ("CH"): {
	                   if (c == 'o' ) {
	                       state="CQ";
	                      
	                   } 
	               }
	               break;
		           case ("CQ"): {
	                   
	                       state="A";
	                      //end of SetOfClo
	                    
	               }
	               break;
		           case ("AA"): {
	                   if (c == 'r' ) {
	                       state="AR";
	                      
	                   } 
	               }
	               break;
		           case ("AR"): {
	                   if (c == 'e' ) {
	                       state="BD";
	                      
	                   } 
	               }
	               break;
		           case ("BD"): {
	                   
	                       state="A";
	                   //end of Sire   
	                   
	               }
	               break;
		           case ("K"): {
	                   if (c == 'e' ) {
	                       state="AB";
	                      //start of TerminateThisNow
	                   } 
	               }
	               break;
		           case ("AB"): {
	                   if (c == 'r' ) {
	                       state="AS";
	                      
	                   } 
	               }
	               break;
		           case ("AS"): {
	                   if (c == 'm' ) {
	                       state="BE";
	                      
	                   } 
	               }
	               break;
		           case ("BE"): {
	                   if (c == 'i' ) {
	                       state="BO";
	                      
	                   } 
	               }
	               break;
		           case ("BO"): {
	                   if (c == 'n' ) {
	                       state="BY";
	                      
	                   } 
	               }
	               break;
		           case ("BY"): {
	                   if (c == 'a' ) {
	                       state="CI";
	                      
	                   } 
	               }
	               break;
		           case ("CI"): {
	                   if (c == 't' ) {
	                       state="CR";
	                      
	                   } 
	               }
	               break;
		           case ("CR"): {
	                   if (c == 'e' ) {
	                       state="CY";
	                      
	                   } 
	               }
	               break;
		           case ("CY"): {
	                   if (c == 'T' ) {
	                       state="DD";
	                      
	                   } 
	               }
	               break;
		           case ("DD"): {
	                   if (c == 'h' ) {
	                       state="DI";
	                      
	                   } 
	               }
	               break;
		           case ("DI"): {
	                   if (c == 'i' ) {
	                       state="DL";
	                      
	                   } 
	               }
	               break;
		           case ("DL"): {
	                   if (c == 's' ) {
	                       state="DN";
	                      
	                   } 
	               }
	               break;
		           case ("DN"): {
	                   if (c == 'N' ) {
	                       state="DP";
	                      
	                   } 
	               }
	               break;
		           case ("DP"): {
	                   if (c == 'o' ) {
	                       state="DR";
	                      
	                   } 
	               }
	               break;
		           case ("DR"): {
	                   if (c == 'w' ) {
	                       state="DS";
	                      
	                   } 
	               }
	               break;
		           case ("DS"): {
	                   
	                       state="A";
	                   //end of TerminateThisNow   
	                   
	               }
	               break;
		           case ("L"): {
	                   if (c == 'h' ) {
	                       state="AC";
	                      //start of whetherdo-else
	                   } 
	               }
	               break;
		           case ("AC"): {
	                   if (c == 'e' ) {
	                       state="AT";
	                      
	                   } 
	               }
	               break;
		           case ("AT"): {
	                   if (c == 't' ) {
	                       state="BF";
	                      
	                   } 
	               }
	               break;
		           case ("BF"): {
	                   if (c == 'h' ) {
	                       state="BP";
	                      
	                   } 
	               }
	               break;
		           case ("BP"): {
	                   if (c == 'e' ) {
	                       state="BZ";
	                      
	                   } 
	               }
	               break;
		           case ("BZ"): {
	                   if (c == 'r' ) {
	                       state="CJ";
	                      
	                   } 
	               }
	               break;
		           case ("CJ"): {
	                   if (c == 'D' ) {
	                       state="CS";
	                      
	                   } 
	               }
	               break;
		           case ("CS"): {
	                   if (c == 'o' ) {
	                       state="CZ";
	                      
	                   } 
	               }
	               break;
		           case ("CZ"): {
	                   if (c == '-' ) {
	                       state="DE";
	                      
	                   } 
	               }
	               break;
		           case ("DE"): {
	                   if (c == 'E' ) {
	                       state="DJ";
	                      
	                   } 
	               }
	               break;
		           case ("DJ"): {
	                   if (c == 'l' ) {
	                       state="DM";
	                      
	                   } 
	               }
	               break;
		           case ("DM"): {
	                   if (c == 's' ) {
	                       state="DO";
	                      
	                   } 
	               }
	               break;
		           case ("DO"): {
	                   if (c == 'e' ) {
	                       state="DQ";
	                      
	                   } 
	               }
	               break;
		           case ("DQ"): {
	                   
	                       state="A";
	                      //end of WhetherDo-Else
	                    
	               }
	               break;
           }// end Switch
          
          
	        
           //repeat switch
           if(state=="A") {
	        switch (state) {
            case ("A"): {
                if (c == 'B' ) {
                    state = "B";
                    
                }else if (c == 'C') {
                	state ="C" ;
                }
                else if (c=='D') {
                	state ="D" ;
                }
                else if (c=='E') {
                	state ="E" ;
                }
                else if (c=='F') {
                   	state ="F" ;
                   }
                else if (c=='I') {
                  	state ="G" ;
                  }
                else if (c=='N') {
                  	state ="H" ;
                  }
                else if (c=='R') {
                 	state ="I" ;
                 }
                else if (c=='S') {
                  	state ="J" ;
                  }
                else if (c=='T') {
                 	state ="K" ;
                 }
                else if (c=='W') {
                 	state ="L" ;
                 }


            }
            break;
            case ("B"): {
                if (c == 'a' ) {
                    state = "M";
                    //for backedvalue
                } 
                else if(c=='e') {
             	   state = "N";
             	   //for beginning
            }
                }
            break;
            
            case ("M"): {
                if (c == 'c' ) {
                    state = "AD";
                    
                } 
            }
            break;
            case ("AD"): {
                if (c == 'k' ) {
                    state = "AU";
                    
                } 
            }
            break;
            case ("AU"): {
                if (c == 'e' ) {
                    state = "BG";
                   
                } 
            }
            break;
            case ("BG"): {
                if (c == 'd' ) {
                    state = "BQ";
                   
                } 
            }
            break;
            case ("BQ"): {
                if (c == 'V' ) {
                    state = "CA";
                   
                } 
            }
            break;
            case ("CA"): {
                if (c == 'a' ) {
                    state = "CK";
                    
                } 
            }
            break;
            case ("CK"): {
                if (c == 'l' ) {
                    state = "CT";
                    
                } 
            }
            break;
            case ("CT"): {
                if (c == 'u' ) {
                    state = "DA";
                   
                } 
            }
            break;
            case ("DA"): {
                if (c == 'e' ) {
                    state="DF";
                   
                } 
            }
            break;
            case ("DF"): {
                
                    state="DF";
                    
                //end of backedvalue
            }
            break;
        
        case ("N"): {
            if (c == 'g' ) {
                state="AE";
               
            } 
        }
        break;
        case ("AE"): {
            if (c == 'i' ) {
                state="AV";
               
            } 
        }
        break;
        case ("AV"): {
            if (c == 'n' ) {
                state="BH";
               
            } 
        }
        break;
        case ("BH"): {
            if (c == 'n' ) {
                state="BR";
               
            } 
        }
        break;
        case ("BR"): {
            if (c == 'i' ) {
                state="CB";
               
            } 
        }
        break;
        case ("CB"): {
            if (c == 'n' ) {
                state="CL";
               
            } 
        }
        break;
        case ("CL"): {
            if (c == 'g' ) {
                state="CU";
               
            } 
        }
        break;
        case ("CU"): {
            
                state="CU";
               //end of beginning
            
        }
        break;
        case ("C"): {
            if (c == 'h' ) {
                state="O";
               //beginning of check-caseof
            }
            else if (c=='l') {
         	   state="P";
         	   //beginning of Clo
        }
        }
        break;
        case ("O"): {
            if (c == 'e' ) {
                state="AF";
               
            } 
        }
        break;
        case ("AF"): {
            if (c == 'c' ) {
                state="AW";
               
            } 
        }
        break;
        case ("AW"): {
            if (c == 'k' ) {
                state="BI";
               
            } 
        }
        break;
        case ("BI"): {
            if (c == '-' ) {
                state="BS";
               
            } 
        }
        break;
        case ("BS"): {
            if (c == 'C' ) {
                state="CC";
               
            } 
        }
        break;
        case ("CC"): {
            if (c == 'a' ) {
                state="CM";
               
            } 
        }
        break;
        case ("CM"): {
            if (c == 's' ) {
                state="CV";
               
            } 
        }
        break;
        case ("CV"): {
            if (c == 'e' ) {
                state="DB";
               
            } 
        }
        break;
        case ("DB"): {
            if (c == 'O' ) {
                state="DG";
               
            } 
        }
        break;
        case ("DG"): {
            if (c == 'f' ) {
                state="DK";
               
            } 
        }
        break;
        case ("DK"): {
            
        state="DK";
        //end of Check-CaseOf       
            
        }
        break;
        case ("P"): {
            if (c == 'o' ) {
                state="AG";
               
            } 
        }
        break;
        case ("AG"): {
            
                state="AG";
               //end of Clo
           
        }
        break;
        case ("D"): {
            if (c == 'i' ) {
                state="Q";
               
            } 
        }
        break;
        case ("Q"): {
            if (c == 'v' ) {
                state="AH";
               
            } 
        }
        break;
        case ("AH"): {
            if (c == 'i' ) {
                state="AX";
               
            } 
        }
        break;
        case ("AX"): {
            if (c == 's' ) {
                state="BJ";
               
            } 
        }
        break;
        case ("BJ"): {
            if (c == 'i' ) {
                state="BT";
               
            } 
        }
        break;
        case ("BT"): {
            if (c == 'o' ) {
                state="CD";
               
            } 
        }
        break;
        case ("CD"): {
            
                state="CD";
               //end of divisio
            
        }
        break;
        case ("E"): {
            if (c == 'n' ) {
                state="R";
               //start of End
            } 
        }
        break;
        case ("R"): {
            if (c == 'd' ) {
                state="AI";
               
            } 
        }
        break;
        case ("AI"): {
            
                state="AI";
               //end of End
             
        }
        break;
        case ("F"): {
            if (c == 'B' ) {
                state="S";
               //start of FBU
            } 
        }
        break;  
        case ("S"): {
            if (c == 'U' ) {
                state="AJ";
               
            } 
        }
        break;
        case ("AJ"): {
            
                state="AJ";
             //end of FBU  
             
        }
        break;
        case ("G"): {
            if (c == 'n' ) {
                state="T";
               //start of inferedfrom
            }
            else if (c=='r') {
         	   state="U";
         	   //start of Ire
            }
        }
        break;
        case ("T"): {
            if (c == 'f' ) {
                state="AK";
               
            } 
        }
        break;
        case ("AK"): {
            if (c == 'e' ) {
                state="AY";
               
            } 
        }
        break;
        case ("AY"): {
            if (c == 'r' ) {
                state="BK";
               
            } 
        }
        break;
        case ("BK"): {
            if (c == 'e' ) {
                state="BU";
               
            } 
        }
        break;
        case ("BU"): {
            if (c == 'd' ) {
                state="CE";
               
            } 
        }
        break;
        case ("CE"): {
            if (c == 'F' ) {
                state="CN";
               
            } 
        }
        break;
        case ("CN"): {
            if (c == 'r' ) {
                state="CW";
               
            } 
        }
        break;
        case ("CW"): {
            if (c == 'o' ) {
                state="DC";
               
            } 
        }
        break;
        case ("DC"): {
            if (c == 'm' ) {
                state="DH";
               
            } 
        }
        break;
        case ("DH"): {
            
                state="DH";
               //end of inferedfrom
            
        }
        break;
        case ("U"): {
            if (c == 'e' ) {
                state="AL";
               
            } 
        }
        break;  
        case ("AL"): {
            state="AL";	                       
               //end of IRE
        }
        
        break;
        case ("H"): {
            if (c == 'o' ) {
                state="V";
               //start of nonevalue
            } 
        }
        break;
        case ("V"): {
            if (c == 'n' ) {
                state="AM";
               
            } 
        }
        break;
        case ("AM"): {
            if (c == 'e' ) {
                state="AZ";
               
            } 
        }
        break;
        case ("AZ"): {
            if (c == 'V' ) {
                state="BL";
               
            } 
        }
        break;
        case ("BL"): {
            if (c == 'a' ) {
                state="BV";
               
            } 
        }
        break;
        case ("BV"): {
            if (c == 'l' ) {
                state="CF";
               
            } 
        }
        break;
        case ("CF"): {
            if (c == 'u' ) {
                state="CO";
               
            } 
        }
        break;
        case ("CO"): {
            if (c == 'e' ) {
                state="CX";
               
            } 
        }
        break;
        case ("CX"): {
             
                state="CX";
            //end of NoneValue    
             
        }
        break;
        case ("I"): {
            if (c == 'i' ) {
                state="W";
               
            } 
        }
        
        break;
        case ("W"): {
            if (c == 'n' ) {
                state="AN";
               
            } 
        }
        break;
        case ("AN"): {
            if (c == 'g' ) {
                state="BA";
               
            } 
        }
        break;
        case ("BA"): {
            if (c == 'W' ) {
                state="BM";
               
            } 
        }
        break;
        case ("BM"): {
            if (c == 'h' ) {
                state="BW";
               
            } 
        }
        break;
        case ("BW"): {
            if (c == 'e' ) {
                state="CG";
               
            } 
        }
        break;
        case ("CG"): {
            if (c == 'n' ) {
                state="CP";
               
            } 
        }
        break;
        case ("CP"): {
           
                state="CP";
             //end of RingWhen  
            
        }
        break;
        case ("J"): {
            if (c == 'F' ) {
                state="X";
               //start of SFBU
            } 
            else if (c=='T') {
         	   state="Y";
         	   //start of STT
            }
            else if (c=='e') {
         	   state="Z";
         	   //start of SetOfClo
            }
            else if(c=='i') {
         	   state="AA";
         	   //start of Sire
            }
        }
        break;
        case ("X"): {
            if (c == 'B' ) {
                state="AO";
               
            } 
        }
        break;
        case ("AO"): {
            if (c == 'U' ) {
                state="BB";
               
            } 
        }
        break;
        case ("BB"): {
            
                state="BB";
            //end of SFBU   
             
        }
        break;
        case ("Y"): {
            if (c == 'T' ) {
                state="AP";
               
            } 
        }
        break;
        case ("AP"): {
            
                state="AP";
              //end of STT
             
        }
        break;
        case ("Z"): {
            if (c == 't' ) {
                state="AQ";
               
            } 
        }
        break;
        case ("AQ"): {
            if (c == 'O' ) {
                state="BC";
               
            } 
        }
        break;
        case ("BC"): {
            if (c == 'f' ) {
                state="BN";
               
            } 
        }
        break;
        case ("BN"): {
            if (c == 'C' ) {
                state="BX";
               
            } 
        }
        break;
        case ("BX"): {
            if (c == 'l' ) {
                state="CH";
               
            } 
        }
        break;
        case ("CH"): {
            if (c == 'o' ) {
                state="CQ";
               
            } 
        }
        break;
        case ("CQ"): {
            
                state="CQ";
               //end of SetOfClo
             
        }
        break;
        case ("AA"): {
            if (c == 'r' ) {
                state="AR";
               
            } 
        }
        break;
        case ("AR"): {
            if (c == 'e' ) {
                state="BD";
               
            } 
        }
        break;
        case ("BD"): {
            
                state="BD";
            //end of Sire   
            
        }
        break;
        case ("K"): {
            if (c == 'e' ) {
                state="AB";
               //start of TerminateThisNow
            } 
        }
        break;
        case ("AB"): {
            if (c == 'r' ) {
                state="AS";
               
            } 
        }
        break;
        case ("AS"): {
            if (c == 'm' ) {
                state="BE";
               
            } 
        }
        break;
        case ("BE"): {
            if (c == 'i' ) {
                state="BO";
               
            } 
        }
        break;
        case ("BO"): {
            if (c == 'n' ) {
                state="BY";
               
            } 
        }
        break;
        case ("BY"): {
            if (c == 'a' ) {
                state="CI";
               
            } 
        }
        break;
        case ("CI"): {
            if (c == 't' ) {
                state="CR";
               
            } 
        }
        break;
        case ("CR"): {
            if (c == 'e' ) {
                state="CY";
               
            } 
        }
        break;
        case ("CY"): {
            if (c == 'T' ) {
                state="DD";
               
            } 
        }
        break;
        case ("DD"): {
            if (c == 'h' ) {
                state="DI";
               
            } 
        }
        break;
        case ("DI"): {
            if (c == 'i' ) {
                state="DL";
               
            } 
        }
        break;
        case ("DL"): {
            if (c == 's' ) {
                state="DN";
               
            } 
        }
        break;
        case ("DN"): {
            if (c == 'N' ) {
                state="DP";
               
            } 
        }
        break;
        case ("DP"): {
            if (c == 'o' ) {
                state="DR";
               
            } 
        }
        break;
        case ("DR"): {
            if (c == 'w' ) {
                state="DS";
               
            } 
        }
        break;
        case ("DS"): {
            
                state="DS";
            //end of TerminateThisNow   
            
        }
        break;
        case ("L"): {
            if (c == 'h' ) {
                state="AC";
               //start of whetherdo-else
            } 
        }
        break;
        case ("AC"): {
            if (c == 'e' ) {
                state="AT";
               
            } 
        }
        break;
        case ("AT"): {
            if (c == 't' ) {
                state="BF";
               
            } 
        }
        break;
        case ("BF"): {
            if (c == 'h' ) {
                state="BP";
               
            } 
        }
        break;
        case ("BP"): {
            if (c == 'e' ) {
                state="BZ";
               
            } 
        }
        break;
        case ("BZ"): {
            if (c == 'r' ) {
                state="CJ";
               
            } 
        }
        break;
        case ("CJ"): {
            if (c == 'D' ) {
                state="CS";
               
            } 
        }
        break;
        case ("CS"): {
            if (c == 'o' ) {
                state="CZ";
               
            } 
        }
        break;
        case ("CZ"): {
            if (c == '-' ) {
                state="DE";
               
            } 
        }
        break;
        case ("DE"): {
            if (c == 'E' ) {
                state="DJ";
               
            } 
        }
        break;
        case ("DJ"): {
            if (c == 'l' ) {
                state="DM";
               
            } 
        }
        break;
        case ("DM"): {
            if (c == 's' ) {
                state="DO";
               
            } 
        }
        break;
        case ("DO"): {
            if (c == 'e' ) {
                state="DQ";
               
            } 
        }
        break;
        case ("DQ"): {
            
                state="DQ";
               //end of WhetherDo-Else
             
        }
        break;}//end Switch
      	  
      	  }// end if
      }//end for
	}
}





 
           	 
       

       

  
  


