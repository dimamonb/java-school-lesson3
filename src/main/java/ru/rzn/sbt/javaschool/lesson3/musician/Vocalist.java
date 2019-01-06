package ru.rzn.sbt.javaschool.lesson3.musician;

import java.util.ArrayList;
import java.util.List;

public class Vocalist extends Musician {

    private  String[] song = {"Take me to the magic of the moment", "on a glory night",
                             "Where the children of tomorrow dream away", "In the Wind of Change"};

    private List<String> singed = new ArrayList<>();
    private  int index;
    @Override
    protected String playGuitar() {
        return null;
    }

    @Override
    protected String sing() {
        String result="";
        /*

        for (int i = 0; i < song.length; i++) {

            if(singed.contains(song[i])) { continue;}

            singed.add(song[i]);
            result =  song[i];

            if(i==song.length-1) singed.clear();

            break;
        }*/
        if(index==song.length) {
            index = 0;
        }
       while (index <= song.length-1){

           result += song[index];
           index ++;
           break;
       }
       return result;
    }
}
