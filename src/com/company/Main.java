package com.company;

public class Main {

    public static void main(String[] args) {
	int[] numbers = {2,5,9,25,30};
        System.out.println(" the sum of elements 2 through 4 is "+
                           rangeSum(numbers,2,4));
    }
    public static int rangeSum(int[] array, int start, int end)
    {
        if(start>end)
            return 0;
        else
            return array[start]+ rangeSum(array,start+1,end);
    }
}
