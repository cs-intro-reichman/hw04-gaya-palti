public class ArrayOps {
    public static void main(String[] args) {
        //System.out.println(findMissingInt(new int[] {0,1,2,3,4,6}));
        //System.out.println(secondMaxValue(new int[] {1,-2,3,-4,5}));
        //System.out.println(containsTheSameElements(new int[] {1, 2, 3}, new int[] {1, 2, 3}));  
        System.out.println(isSorted(new int[] {1, 3, 2}));   
    }
    
    // Checks which integer is missing in the array
    public static int findMissingInt (int [] nArray) {
        int missingInt = 0;
        int counter;
        // check for i between 0 to n (lenth) if in the array
        for (int i = 0; i  <= nArray.length; i++){
            counter = 0;
            // check for every integer in the array if i = integer (j)
            for (int j = 0; j < nArray.length; j++){
                if (nArray[j] == i) {
                    counter ++;
                 }                    
            }
            // if the counter is bigger than 1 this is the missing integer.
            if (counter == 0){
                missingInt = i;
            }
        }
        return missingInt;
    }

    // Check what is the second max value in given array
    public static int secondMaxValue(int [] array) {
        // initialized highValue and secHighValue for the lowest integer to support negative numbers.
        int highValue = Integer.MIN_VALUE;
        int secHighValue = Integer.MIN_VALUE;
        /* 
        The algoritem keeps track on the highest value and the second high value.
        Eeach iteration we have 3 diffent options:
        1. new value higher than highest value - highest becomes second value and new value becomes highest.
        2. new value smaller than highest value and higher than second - new becomes second value.
        3. new value lower than second - do nothing.
        */
        for (int i = 0; i  < array.length; i++){
            if (highValue < array[i]) {
                secHighValue = highValue;
                highValue = array[i];
            } else if (secHighValue < array[i]){
                secHighValue = array[i];
            }
        }
        return secHighValue;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean sameElement = true;
        // iterating over array1 and checking that each element exist in array2
        for (int i = 0; i < array1.length; i++){
            boolean isFound = false;
            for (int j = 0; j < array2.length; j++) {
                if  (array1[i] == array2[j]){
                    isFound = true;
                }
            }
            if (!isFound) {
                sameElement = false;
            }
        }

        // to make sure that there aren't any element in array2 that doesn't exist in array1, 
        // we must do the other way around
        for (int i = 0; i < array2.length; i++){
            boolean isFound = false;
            for (int j = 0; j < array1.length; j++) {
                if  (array2[i] == array1[j]){
                    isFound = true;
                }
            }
            if (!isFound) {
                sameElement = false;
            }
        }
        
        return sameElement;
    } 

    public static boolean isSorted(int [] array) {
        boolean isSorted = true;
        int lastValue = array[0];
        // check if the array ascending
        for(int i = 0; i < array.length; i++){
            if(array[i] < lastValue){
                isSorted = false;
            }
            lastValue = array[i];
        }
        if (!isSorted) {
             // check if the array descending
            isSorted = true;
            lastValue = array[0];
            for(int i = 0; i < array.length; i++){
                if(array[i] > lastValue){
                    isSorted = false;
                }
                lastValue = array[i];
            }  
        }

        return isSorted;
    }

}
