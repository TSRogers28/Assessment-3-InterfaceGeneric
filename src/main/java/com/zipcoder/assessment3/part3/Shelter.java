package com.zipcoder.assessment3.part3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shelter<T extends Ageable> {
    int CURRENT_YEAR = LocalDate.now().getYear();

    int size = 0;
    List<T> arrayList = new ArrayList<>();


    public int size() {
        return arrayList.size();
    }

    public void add(T person) {
        arrayList.add(person);
    }

    public T removeFirst() {
        if(arrayList.isEmpty())
            return null;
        T t = arrayList.get(0);
        arrayList.remove(0);
        return t;
    }

    public T getOldest() {
        int age = 0;
        int tempAge = 0;
        T answer = null;
        for(T t : arrayList) {
            tempAge = CURRENT_YEAR - t.getYearOfBirth();
            if (tempAge > age){
                age =tempAge;
                answer = t;
            }
        }
        return answer;
    }
}
