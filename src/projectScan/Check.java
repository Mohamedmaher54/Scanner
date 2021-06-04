package projectScan;

public class Check {
    String string;

    public  Check(){
    }
    public static String check(String s) {
        for (char c : s.toCharArray()) {
            char state = 'A';
            switch (state) {
                case('A'):{
                    if(c=='@'){
                        state='B';

                    }
                }
                break;
                case('B'):{
                    if(c=='_'){
                             state ='C';

                    }else if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
                        state = 'C';

                    }
                    else {
                        state='D';
                    }

                }
                break;
                case ('C'):{
                    if(c>='0'&&c<='9')
                        state ='A';// final idintifier with 1
                    else
                    state='A';//finel identifier
                    System.out.println("identifier");
                }break;
                case('D'):
                    state = 'A';//failed
                    break;

            }//end switch
            switch (state) {
                case('A'):{
                    if(c=='@'){
                        state='B';

                    }
                }
                break;
                case('B'):{
                    if(c=='_'){
                        state ='C';

                    }else if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
                        state = 'C';

                    }
                    else {
                        state='D';
                    }

                }
                break;
                case ('C'):{
                    if(c>='0'&&c<='9')
                        state ='C';// final idintifier with 1
                    else
                        state='C';//finel identifier
                        System.out.println("identifier");
                }break;
                case('D'):
                    state = 'D';//failed
                    break;

            }//end switch

        }

        return null;
    }
}
