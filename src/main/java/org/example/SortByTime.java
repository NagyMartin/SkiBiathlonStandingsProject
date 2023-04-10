package org.example;

import java.util.Comparator;

public class SortByTime implements Comparator<Athlete> {


    public int compare(Athlete a, Athlete b){
                return a.getSkiTimeResult().compareTo(b.getSkiTimeResult());
        }
}
