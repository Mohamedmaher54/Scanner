package projectScan;

public class Check {
    String string;
    char state = 'B';
    int flag;
    public  Check(){
    }
    public  String check(String s) {
        for (char c : s.toCharArray()) {
            switch (state) {
                case ('A'):
                {
                if(c=='@')
                    state='B';
                } break;
                case('B'):{
                     if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c=='_')) {
                        state = 'C';
                    }
                    else {
                        state='D';
                    }
                }
                // aa1
                break;
                case ('C'):{
                    if(c>='0'&&c<='9') {
                      // final idintifier with 1
                        state ='A';
//                        return "Identifier1";
                    flag=1;
                    }
                    else {

                 //finel identi
                        state ='A';
//                        return "Identifier2";
                    flag=1;
                    }

                }
                break;
                case('D'):{
                    //                        state ='A';
                    state = 'A';//failed
                    flag=0;
                }
                    break;

            }//end switch
            if (state=='A') {
            switch (state) {
                case ('A'):{
                    if (c=='@')
                        state = 'B';
                }
                break;
                case('B'):{
                     if((c>='a'&&c<='z')||(c>='A'&&c<='Z')|| (c=='_')) {
                        state = 'C';

                    }
                    else {
                        state='D';
                    }

                }
                break;
                case ('C'):{
                    if(c>='0'&&c<='9') {
                        state ='C';// final idintifier with 1
//                        return "Identifier3";
                    flag=1;
                    }
                    else {
                        state='C';//finel identifier
//                        return "Identifier4";
                        flag=1;
                    }

                }
                break;
                case('D'):{
                    state = 'D';//failed
                flag=0;
                }
                    break;

            }//end switch
            }//end if

        }
        if (flag==1) {
        	return "Identifier";
        }
        else {
        return "Not Identifier";
        }
//        return "no";
    }
}
