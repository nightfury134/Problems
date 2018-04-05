import java.util.*;
public class Rotate_Array {

    // Reverse all the elements
    // Reverse first k elements and reverse length - k elements.
    // Time O(n) Space O(1)
    public static void rotate_rev(int[] nums, int k){

    }

    // Put all elements in a hashtable / array.
    // Shift and put it back in original array.
    // Time O(n)  space O(n)
    public static void rotate(int[] nums, int k){

        Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
        int index = 0;

        for(int i=0; i<nums.length; i++){
            ht.put(i , nums[i]);
        }

        for(int i=0; i<nums.length; i++) {
           index =  i;

           if(index + k <nums.length){
               index += k;
           }

           else {
               index = (index + k)%nums.length;
           }

           nums[index] = ht.get(i);
        }

    }

    public static void main(String args[]){

        int[] arr = {1,2,3,4,5,6,7};
        int k = 9;

        rotate(arr, 10);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }

}
