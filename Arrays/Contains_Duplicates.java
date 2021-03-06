import java.util.*;
public class Contains_Duplicates {

    // Put all values in hashset , return if it contains a duplicate
    // Time O(n) Space O(n)
    static boolean containsDuplicate(int[] nums){

    HashSet<Integer> hs = new HashSet<Integer>();

    for(int i=0; i<nums.length; i++){

        if(hs.contains(nums[i])){
            return true;
        }
        else {
            hs.add(nums[i]);
        }
    }

        return false;
    }


    public static void main (String args[]){

        int[] nums = {1,2,3,3,4,5,6,5,6,1};

        System.out.println(containsDuplicate(nums));
    }
}



