package balance;

public class Labset5{
    
    double balance,rate,principal;
    int time;
    
    public Labset5(double principal,double rate,int time){
        this.principal=principal;
        this.rate=rate;
        this.time=time;
    }

    public void calcBalance(){
        balance=principal*rate*time;
    }

    public String toString(){
       return "[ Balance:"+balance+" Principal:"+principal+" Rate:"+rate+" Time:"+time+"]";
    }

}
