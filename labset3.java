import java.io.*;

class Player{
    String name;
    int age,matches,ranking;
    Player(String name,int age,int matches,int ranking){
        this.name=name;
        this.age=age;
        this.matches=matches;
        this.ranking=ranking;
    }
}

class CricketPlayer extends Player{
    private int highScore,batAverage,bowlAverage;
    CricketPlayer(String a, int b, int c, int d, int e, int f, int g){
        super(a,b,c,d);
        highScore=e;
        batAverage=f;
        bowlAverage=g;
    }

    @Override
    public String toString(){
        return "[Name:"+name+" Age:"+age+" Matches:"+matches+" Ranking:"+ranking+" Highscore:"+highScore+" Batting Average:"+batAverage+" Bowling Average:"+bowlAverage+"]";
    }

}

class FootballPlayer extends Player{
    private int goals,goalAverage,passes;
    FootballPlayer(String a, int b, int c, int d, int e, int f, int g){
        super(a,b,c,d);
        goals=e;
        goalAverage=f;
        passes=g;
    }

    @Override
    public String toString(){
        return "[Name:"+name+" Age:"+age+" Matches:"+matches+" Ranking:"+ranking+" Goals:"+goals+" Goals Average:"+goalAverage+" Passes:"+passes+"]";
    }

}

class BasketballPlayer extends Player{
    private int baskets,basketAverage,passes;
    BasketballPlayer(String a, int b, int c, int d, int e, int f, int g){
        super(a,b,c,d);
        baskets=e;
        basketAverage=f;
        passes=g;
    }

    @Override
    public String toString(){
        return "[Name:"+name+" Age:"+age+" Matches:"+matches+" Ranking:"+ranking+" Baskets:"+baskets+" Baskets Average:"+basketAverage+" Passes:"+passes+"]";
    }
   
}

class Labset3{
    public static void main(String[] args){
        CricketPlayer cp=new CricketPlayer("KPS",120,23,423,901,123,23);
        BasketballPlayer bp=new BasketballPlayer("KPS",120,23,423,901,123,23);
        FootballPlayer fp=new FootballPlayer("KPS",120,23,423,901,123,23);
        System.out.println(cp);
        System.out.println(bp);
        System.out.println(fp);
   }
}
