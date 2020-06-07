package GreedyAlgorithms;

import java.util.Arrays;

public class MinimumNumberOfPlatforms {

    public static void main(String[] args) {
        int arr[] = {900,940,950,1100,1500,1800};
        int dep[] = {910,1200,1120,1130,1900,2000};

        System.out.println("Before sorting arr = "+ Arrays.toString(arr));
        System.out.println("Before sorting sep = "+Arrays.toString(dep));
        Arrays.sort(arr);
        Arrays.sort(dep);
        System.out.println("Before sorting arr = "+ Arrays.toString(arr));
        System.out.println("Before sorting sep = "+Arrays.toString(dep));

        int platformInUse = 0;
        int maxNumberOfPlatform = 0;

        int i = 0;
        int j = 0;
        while(i < arr.length && j < dep.length){
            if(arr[i] < dep[j]){
                platformInUse++;
                if(platformInUse > maxNumberOfPlatform){
                    maxNumberOfPlatform = platformInUse;
                }
                i++;
            }else{
                platformInUse--;
                j++;
            }
        }
        System.out.println("Minimum number of platform required = "+maxNumberOfPlatform);
    }
}

