package com.example.c;

import android.view.WindowManager;

import com.example.common.MainActivity;
import com.example.common.QuestionList;

import java.util.ArrayList;


public class Activity_Stats extends MainActivity  {

 private    ArrayList <QuestionList> arr= new ArrayList<>();

    @Override
    protected ArrayList<QuestionList> getData() {



        arr.add(new QuestionList("Which sportswear company based in Germany uses the 'Formstripe' as its logo","Adidas","Nike","Puma","Reebok","Puma",""));
        arr.add(new QuestionList("Which of these teams isn't a member of the NHL's 'Original Six' era?"," Boston Bruins"," New York Rangers","Philadelphia Flyers","Toronto Maple Leafs","Philadelphia Flyers",""));
        arr.add(new QuestionList("Which Formula One driver was nicknamed 'The Professor'?","Alain Prost","Ayrton Senna","Emerson Fittipaldi","Niki Lauda","Alain Prost",""));
        arr.add(new QuestionList("In a game of snooker, what colour ball is worth 3 points?","Blue","Brown","Green","Yellow","Green",""));
        arr.add(new QuestionList("Which country is hosting the 2022 FIFA World Cup?","Bolivia","Qatar","Uganda","Vietnam","Qatar",""));
        arr.add(new QuestionList("Which team was the 2015-2016 NBA Champions?","Cleveland Cavaliers"," Golden State Warriors","Oklahoma City Thunders","Toronto Raptors","Cleveland Cavaliers",""));
        arr.add(new QuestionList("Josh Mansour is part of what NRL team?","Melbourne Storm","North Queensland Cowboys","Penrith Panthers","Sydney Roosters","Penrith Panthers" ,""));
        arr.add(new QuestionList("Which soccer team won the Copa América 2015 Championship?","Argentina","Brazil","Chile","Paraguay","Chile", ""));
        arr.add(new QuestionList("In 2016, who won the Formula 1 World Constructor's Championship for the third time in a row?","McLaren Honda","Mercedes-AMG Petronas","Red Bull Racing Renault","Scuderia Ferrari","Mercedes-AMG Petronas" ,""));
        arr.add(new QuestionList("What is the oldest team in Major League Baseball?","Atlanta Braves","Chicago Cubs","Cincinnati Reds","St. Louis Cardinals","Atlanta Braves",""));
        arr.add(new QuestionList("Which of the following Grand Slam tennis tournaments occurs LAST?","Australian Open","French Open","US Open","Wimbledon","US Open",""));
        arr.add(new QuestionList("Who won the Champions League in 1999?","Barcelona","Bayern Munich","Liverpool","Manchester United","Manchester United" ,""));
        arr.add(new QuestionList("Who won the 2015 College Football Playoff (CFP) National Championship?","Alabama Crimson Tide","Clemson Tigers","Ohio State Buckeyes","Wisconsin Badgers","Ohio State Buckeyes" ,""));
        arr.add(new QuestionList("What year was hockey legend Wayne Gretzky born?","1959","1961","1963","1965","1961",""));
        arr.add(new QuestionList( "Why was The Green Monster at Fenway Park originally built?","To display advertisements.","To make getting home runs harder.","To prevent viewing games from outside the park.","To provide extra seating.","To prevent viewing games from outside the park.",""));
        arr.add(new QuestionList("Which sport is NOT traditionally played during the Mongolian Naadam festival?","American Football","Archery","Horse-Racing","Wrestling","American Football",""));
        arr.add(new QuestionList("How many Premier League trophies did Sir Alex Ferguson win during his time at Manchester United?","11","13","20","22","13" ,""));
        arr.add(new QuestionList("Who is Manchester United's top Premier League goal scorer?","David Beckham","Ryan Giggs","Sir Bobby Charlton","Wayne Rooney","Wayne Rooney" ,""));
        arr.add(new QuestionList("Which professional wrestler fell from the rafters to his death during a live Pay-Per-View event in 1999?","Al Snow","Chris Benoit","Lex Luger","Owen Hart","Owen Hart",""));
        arr.add(new QuestionList("Who was the top scorer for England national football team?","David Beckham","Michael Owen","Steven Gerrard","Wayne Rooney","Wayne Rooney" ,""));
        arr.add(new QuestionList("Which Formula 1 driver switched teams in the middle of the 2017 season?","Carlos Sainz Jr.","Daniil Kvyat","Jolyon Palmer","Rio Haryanto","Carlos Sainz Jr." ,""));
        arr.add(new QuestionList("What country hosted the 2014 Winter Olympics?","Canada","Germany","Russia","United States","Russia" ,""));
        arr.add(new QuestionList("Which country did Kabaddi, a contact sport involving tackling, originate from?","Australia","Cambodia","India","Turkey","India" ,""));
        arr.add(new QuestionList("Which of these countries' national teams qualified for the 2018 FIFA World Cup in Russia?","Italy","Netherlands","Tunisia","United States of America","Tunisia" ,""));
        arr.add(new QuestionList("Who won the 2018 Monaco Grand Prix?","Daniel Ricciardo","Kimi Raikkonen","Lewis Hamilton","Sebastian Vettel","Daniel Ricciardo",""));



        return arr;
    }



}






