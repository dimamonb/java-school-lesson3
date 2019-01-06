package ru.rzn.sbt.javaschool.lesson3.musician;

public class FrontMan extends Musician{

    private String[] song = {"Take advantage while", "You hang me out to dry",
                                "But I can't see you every night", "Free I do"};
    private int songIndex;

    private String[] accordes = {"C# G# F#", "C# G# F#", "Em E A5 C", "Em G Em G"};
    private int guitarIndex;

    @Override
    protected String playGuitar() {
        String result="";
        if(guitarIndex==accordes.length) {
            guitarIndex = 0;
        }
        while (guitarIndex <= accordes.length-1){

            result += accordes[guitarIndex];
            guitarIndex ++;
            break;
        }
        return result;
    }

    @Override
    protected String sing() {
        String result="";
        if(songIndex==song.length) {
            songIndex = 0;
        }
        while (songIndex <= song.length-1){

            result += song[songIndex];
            songIndex ++;
            break;
        }
        return result;
    }

}
