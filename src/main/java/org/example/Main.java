package org.example;

import static org.example.FindPairs.findPairs;

public class Main {



    public static void main(String[] args) {




        int[] A = {4,5,10,11,6};
        int M = -1;

        findPairs(A, M);
    }



}

class FindPairs {

    public static void findPairs(int[] A, int M) {
        int i, j;
        for (i = 0; i < A.length-1; i++) {
            for (j = i+1; j < A.length; j++) {
                if (A[i]-A[j] == M) {
                    // prints where the values give the conditions
                    System.out.println(i + "-" + j);
                }
            }
        }
    }




}


//    The time performance of this program is O(n^2) because the two for loops need to
//        iterate through the entire array in order to check each number with every other
//        number for the given sum. The space performance is O(1) because the program does
//        not create any additional data structures.The trade-off is that the time performance
//        is lower than it could be because the program has to iterate through the entire array.