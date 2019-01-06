package ru.rzn.sbt.javaschool.lesson3.musician;

import java.util.ArrayList;
import java.util.List;

public class GuitarPlayer extends Musician {

    private String[] accordes = {"C G Dm G", "C G",
            "Dm G Am", "Am/F G"};

    private List<String> played = new ArrayList<>();
    private int index;
    @Override
    protected String playGuitar() {
        String result="";
        /*for (int i = 0; i < accordes.length; i++) {

            if(played.contains(accordes[i])) continue;

            played.add(accordes[i]);
            result =  accordes[i];

            if(i==accordes.length-1) played.clear();

            break;
        }*/
        if(index==accordes.length) {
            index = 0;
        }
        while (index <= accordes.length-1){

            result += accordes[index];
            index ++;
            break;
        }
        return result;
    }

    @Override
    protected String sing() {
        return null;
    }
}
