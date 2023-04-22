package com.example.m;

import com.example.common.MainActivity;
import com.example.common.QuestionList;

import java.util.ArrayList;

public class Activity_Stats extends MainActivity {

    private    ArrayList <QuestionList> arr= new ArrayList<>();

    @Override
    protected ArrayList<QuestionList> getData() {

        arr.add(new QuestionList("What French artist/band is known for playing on the MIDI instrument 'Launchpad'?","Daft Punk", "Madeon","Disclosure","David Guetta", "Madeon",""));


        arr.add(new QuestionList("Who had hits in the 70s with the songs 'Lonely Boy' and 'Never Let Her Slip Away'?","Andrew Gold","Elton John","Leo Sayer","Barry White ","Andrew Gold",""));

        arr.add(new QuestionList("Which band had hits in 1975 with the songs, 'One Of These Nights' & 'Lyin' Eyes'?","Fleetwood Mac","Fools Gold","The Eagles","The Doobie Brothers","The Eagles",""));

        arr.add(new QuestionList("Who had a US and UK number 1 hit in 1962 with the instrumental, 'Telstar'?","The Tornados","The Ventures","The Spotnicks ","The Tremeloes","The Tornados",""));

        arr.add(new QuestionList(" Saul Hudson (Slash) of the band Guns N' Roses is known for playing what type of guitar?","Fender Stratocaster ","LsL Mongrel ","Gretsch Falcon","Les Paul Standard","Les Paul Standard",""));

        return arr;
    }
}
