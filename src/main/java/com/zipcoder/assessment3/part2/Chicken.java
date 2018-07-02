package com.zipcoder.assessment3.part2;

public class Chicken extends Animal {
    public Chicken(int yearOfBirth) {
        super(yearOfBirth);
    }

    @Override
    public int getAge(){
        return ((CURRENT_YEAR - getYearOfBirth()) * 10);
    }

    @Override
    public String produce() {
        return "egg";
    }

    @Override
    public Boolean kickedMe(Boolean wasCareful) {
        return null;
    }
}
