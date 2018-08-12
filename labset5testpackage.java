import java.io.*;
import balance.*;

class Labset5TestPackage{

    public static void main(String[] args){  
        Labset5Account acc=new Labset5Account(200,10,5);
        acc.calcBalance();
        System.out.println(acc); 
    }

}
