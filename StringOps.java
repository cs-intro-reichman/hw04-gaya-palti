public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        //System.out.println(capVowelsLowRest("intro")); 
        System.out.println(camelCase("    Intro to      coMPUter      sCIEncE")); 
    }

    public static String capVowelsLowRest (String string) {
        String str = "";
        for (int i=0; i < string.length(); i++){
            char ch = string.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                ch = toUpperCase(string.charAt(i));  
            }
            else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                //do nothing
            } else if (ch == ' ') {
                //do nothing
            }else {
                ch = toLowerCase(string.charAt(i));
            }
            str += ch;
        }
        return str;
    }

    public static String camelCase (String string) {
        String str = "";
        boolean firstLetter = true;
        boolean firstWord = true;
        for (int i=0; i < string.length(); i++){
            char ch = string.charAt(i);
            if (ch == ' ') {
                if (!firstLetter || !firstWord) {
                    firstWord = false;
                    firstLetter = true;
                }
            } else {
                if (firstWord){
                    ch = toLowerCase(ch);
                } else if (firstLetter && !firstWord){
                    ch = toUpperCase(ch);
                } else if (!firstLetter && !firstWord){
                    ch = toLowerCase(ch);
                }
                firstLetter = false;
                str += ch;
            }
        }
        return str;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }

    public static char toLowerCase (char chAt) {
        char ch = chAt;
        if (chAt >= 'A' && chAt <= 'Z' ){
            ch = (char) (chAt + 32);
        } else if (chAt >= 'a' && chAt <= 'z' ) {
            ch = chAt;
        }
        return ch;
    }

    public static char toUpperCase (char chAt) {
        char ch = chAt;
        if (chAt >= 'A' && chAt <= 'Z' ){
            ch = chAt;
        } else if (chAt >= 'a' && chAt <= 'z' ) {
            ch = (char) (chAt - 32);
        }
        return ch;
    }    
        
}
