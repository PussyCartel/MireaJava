package ru.mirea.task12;


import java.util.*;

public class SortingStudentsByGPA implements Comparator{

    HashMap<Integer, Integer> results;

    public SortingStudentsByGPA() {
        results = new HashMap<>();
    }

    public void inputValue(int key, int value){
        results.put(key, value);
    }
    public void outputMap(){
        System.out.println(Arrays.asList(results));
    }
    @Override
    public void fastSort() {
        results.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .forEach(System.out::println); // или любой другой конечный метод
    }
}
