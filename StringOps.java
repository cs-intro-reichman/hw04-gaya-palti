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
        //System.out.println(camelCase("    Intro to      coMPUter      sCIEncE"));  
        //int[] a = allIndexOf("Hello world",'d');
        // for (int i = 0; i < a.length; i++){
        //     System.out.print(a[i]);
        // }            
    }

    //recive a string and check for every char if vowle and change to upper or lower case.
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

    // 
    public static String camelCase (String string) {
        String str = "";
        boolean firstLetter = true;
        boolean firstWord = true;
        for (int i=0; i < string.length(); i++){
            char ch = string.charAt(i);
            if (ch == ' ') {
                // increae the counters if a word ended.
                if (!firstLetter || !firstWord) {
                    firstWord = false;
                    firstLetter = true;
                }
            } else {
                // change to lower or upper as expected.
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

    // recive a string and char and returns an array containing all the indexes in which the character appears in the string.
    public static int[] allIndexOf (String string, char chr) {
        int counter = 0;
        // check what should be the lenth of he new array.
        for (int i=0; i < string.length(); i++){
            if (string.charAt(i) == chr){
                counter ++;
            }
        }
        int[] indexArray = new int[counter];
        int index = 0;
        // put all the indexes of the char in a new array.
        for (int i=0; i < string.length(); i++){
            if (string.charAt(i) == chr){
                indexArray [index] = i;
                index++;
            }
        }
        return indexArray;
    }

    // this function get a char and verify if it's lower case and if not change it to lower.
    public static char toLowerCase (char chAt) {
        char ch = chAt;
        if (chAt >= 'A' && chAt <= 'Z' ){
            ch = (char) (chAt + 32);
        } else if (chAt >= 'a' && chAt <= 'z' ) {
            ch = chAt;
        }
        return ch;
    }

    // this function get a char and verify if it's upper case and if not change it to upper.
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

