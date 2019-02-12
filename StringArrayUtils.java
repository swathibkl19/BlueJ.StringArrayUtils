 
 import java.util.*;


/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length- 1 ];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length- 2 ];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for ( String str : array){
            if(str == value){
             return true;   
            }
            
        }
        return false;
        
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
       // String[] result = {};
        int cnt = 0;
        for( int i = 0 ; i < array.length/2 ; i++){
              String tmp = array[i];
              array[i] = array[array.length-i-1];
              array[array.length-i-1] = tmp;
              
            
        }
         
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean bool = false;

        for (int i = 0; i < array.length / 2; i++){
            if (array[i] == array[array.length-i-1]){
                bool = true;
            } 

        }
        return bool;
    }
        
    

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        
        boolean bool = false;

        StringBuilder stringBuilder = new StringBuilder();

        for (String x : array){
            stringBuilder.append(x);
        }

        String s = "";
        s = stringBuilder.toString();
        for(char i = 'A'; i <= 'Z'; i++){
            if ((s.indexOf(i) < 0) && (s.indexOf((char)i+32)< 0)){
                bool = false;
            }else{
                bool = true;
            }
        }
        return bool;
    }

        

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i].equals(value)) {
                count++;
            }
        }

        return count;
    }

    

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int count = 0;
        int occurrences = getNumberOfOccurrences(array, valueToRemove);
        String[] arr = new String[array.length-occurrences]; 
        for (String s : array) {
            if (s != valueToRemove) {
                arr[count] = s;
                count++;
            }
        }
        return arr;
    
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String [] arr = new String[array.length];
        int newArrayIndex = 0;

        arr[newArrayIndex] = array[0];

        newArrayIndex++;
        for (int i = 1; i < array.length; i++){
            if(!(arr[newArrayIndex-1]).equals(array[i])){
                arr[newArrayIndex] = array[i];
                newArrayIndex++;
            }

        }
        String[] newArray = new String[newArrayIndex];
        System.arraycopy(arr, 0, newArray, 0, newArrayIndex);
        return newArray;
    }

    

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
         StringBuilder build = new StringBuilder(array[0]);

        String[] newArr = new String[array.length-count(array)]; 
        int counter = 0; 
        for(int i = 1; i<array.length; i++){
            if(array[i-1].equals(array[i])){
                build.append(array[i]);

            }
            else{
                newArr[counter] = build.toString();
                build.setLength(0);
                build.append(array[i]);
                counter++;
            }
        }
        
        newArr[counter] = build.toString();
        return newArr;
    }

    public static int count(String[] array){
        int count = 0;
        for(int i = 1; i<array.length; i++){
            if(array[i-1].equals(array[i])) {

                count++;
            }
        }

        return count;
    }


    }

