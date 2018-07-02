package com.zipcoder.assessment3.part2;

public class Horse extends Animal {

    public Horse(int yearOfBirth) {
        super(yearOfBirth);
    }

    @Override
    public int getAge(){
        return (int) ((CURRENT_YEAR - getYearOfBirth()) * 6.5);
    }

    @Override
    public String produce() {
        return null;
    }


    @Override
    public Boolean kickedMe(Boolean wasCareful) {
        return !wasCareful;
    }
}
