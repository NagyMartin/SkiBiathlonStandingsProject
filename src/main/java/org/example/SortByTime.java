package org.example;


import java.util.Comparator;

public class SortByTime implements Comparator<Athlete> {

    /**
     *
     * @param a the first object to be compared.
     * @param b the second object to be compared.
     * @return
     */
    public int compare(Athlete a, Athlete b){
                return a.getSkiTimeResult().compareTo(b.getSkiTimeResult());
        }
}
