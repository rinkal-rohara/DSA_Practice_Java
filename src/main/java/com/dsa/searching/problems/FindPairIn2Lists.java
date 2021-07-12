/**
 * Given 2 list X and Y.
 * Find a pair of elements (xi, yi) such that xi ∈ X and yi ∈ Y where xi + yi = value.
 */
package com.dsa.searching.problems;

import java.util.Arrays;

public class FindPairIn2Lists {
    
    /**
     * 
     * @param X
     * @param Y
     * @param target
     * @return For simplicity, we will return the element found in smaller list
     */
    public static int findPair(int listX[], int listY[], int target){
        int listBig[] = listX.length > listY.length ? listX : listY;
        int listSmall[] = listX.length > listY.length ? listY : listX;


        Arrays.sort(listSmall);

        for(int i = 0; i < listBig.length; i++){

            int leftPtr = 0;
            int rightPtr = listSmall.length - 1;
            int cmplTarget = target - listBig[i];
            int midPtr = (leftPtr + rightPtr) / 2;

            if(cmplTarget < listSmall[leftPtr] || cmplTarget > listSmall[rightPtr]){
                continue;
            }
            if(
                listSmall[leftPtr] == cmplTarget || 
                listSmall[rightPtr] == cmplTarget
                ){
                return cmplTarget;
            }

            while(leftPtr < rightPtr){
                if(listSmall[midPtr] == cmplTarget){
                    return cmplTarget;
                }
                
                if(listSmall[midPtr] > cmplTarget){
                    rightPtr = midPtr - 1;
                }else{
                    leftPtr = midPtr + 1;
                }
                midPtr = (leftPtr + rightPtr) / 2;
            }
            

        }

        return -1;
    }
}
