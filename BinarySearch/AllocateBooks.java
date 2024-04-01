package BinarySearch;

import java.util.*;
//import java.util.Collections;

// code studio :- https://www.naukri.com/code360/problems/allocate-books_1090540?utm_source=youtube&utm_medium=affiliate&utm_campaign=codestudio_Striver_BinarySeries&leftPanelTabValue=PROBLEM
public class AllocateBooks {
    public static int countStudent(ArrayList<Integer> nums, int pages){
        int n = nums.size();
        int stud = 1 ;
        long pagestude = 0;
        for(int i = 0; i < n ; i++){
            if(pagestude + nums.get(i) <= pages){
                pagestude += nums.get(i);
            }
            else{
                stud++;
                pagestude = nums.get(i);
            }
        }
        return stud;
    }
    public static int findpage(ArrayList<Integer> arr, int n, int m){
        if(m > n)
            return -1;
        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();
        while(low <= high){
            int mid = low + (high-low)/2;
            int students = countStudent(arr,mid);
            if(students > m)
                    low = mid +1;
            else
                high = mid -1;
        }

        return low;

    }
}
