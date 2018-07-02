package com.zipcoder.assessment3.part1;



/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */

    public int getOccurances(Integer[] ints, int factor){
        int count = 0;
        for(int i : ints){
            if(i%factor== 0)
                count++;
        }
        return count;
    }
    public Integer[] deleteEvens(Integer[] ints) {
        Integer[] newArray = new Integer[getOccurances(ints, 2)];
        int x = 0;
        for(int i : ints){
            if(i%2 !=0) {
                newArray[x] = i;
                x++;
            }
        }
        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer[] newArray = new Integer[getOccurances(ints, 2)];
        int x = 0;
        for(int i : ints){
            if(i%2 ==0) {
                newArray[x] = i;
                x++;
            }
        }
        return newArray;
    }


    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints){
    Integer[] newArray = new Integer[ints.length- getOccurances(ints, 3)];
    int x = 0;
        for(int i : ints){
        if(i%3 !=0) {
            newArray[x] = i;
            x++;
        }
    }
        return newArray;
}


    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        Integer[] newArray = new Integer[ints.length- getOccurances(ints, multiple)];
        int x = 0;
        for(int i : ints){
            if(i%multiple !=0) {
                newArray[x] = i;
                x++;
            }
        }
        return newArray;
    }
}
