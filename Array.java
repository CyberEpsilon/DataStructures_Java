import java.util.HashMap;
import java.util.Map; 


public class Array{
    //method to print the array
    public void printArray(int[] arr){
        for(int i: arr){
            System.out.print(arr[i] + " ");
        }
    }
    public int[] resize(int[] arr, int capacity){
        int[] newSize = new int[capacity];
        for(int i: arr){
            newSize[i] = arr[i];
        }
        return newSize; 
    }

    public int findMinimum(int[] arr){
        int min = arr[0];
        for (int i:arr){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }

    public int[] reverseArray(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start]; //take element at start index and store as int temp
            arr[start] = arr[end]; //take the element at the end index and place it in start
            arr[end] = temp;// take temp value (formerly as start value) and put this at the end 
            start++; //move to the next element 
            end--; 
        }
        return arr; 
    }
  /*Palindrome:If you read a string in a forward direction or 
  backward direction ; the string should be equal 
  */
   public boolean isPalindrome(String str){
       char[] charArray = str.toCharArray();
       int start = 0;
       int end = str.length() - 1; 
       while(start < end){
           if(charArray[start] != charArray[end]){ //if at any point, the chars at opposite cas
               return false; 
           }
           start++;
           end--; //bring indices at opposite ends closer to each other
       }
       return true; 
   }

   public static int[] twoSum(int[] arr, int target){
       int[] result = new int[2];
       Map<Integer, Integer> map = new HashMap<>();

       for(int i = 0; i < arr.length; i++){
           if(!map.containsKey(target - arr[i])){
               map.put(arr[i], i);
           } else {
               result[1] = i;
               result[0] = map.get(target - arr[i]);
               return result;
           }
       }
       throw new IllegalArgumentException("Two numbers not found");
   }

}