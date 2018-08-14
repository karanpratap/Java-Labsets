import java.io.*;

class Collide{
    String dir1,dir2;
    Collide(String dir1,String dir2){
        this.dir1=dir1;
        this.dir2=dir2;
    }
    void checkCollision(){
        try{
            if(dir1.equals(dir2)){
                System.out.println("The two vehicles are moving in the same direction:NO COLLISION IMMINENT!");
            }
            else{
                throw new Exception("The two vehicles are moving in opposite directions so collision is imminent!");
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
}

class Labset7{
    public static void main(String[] args){
        Collide phase1=new Collide("north","north");
        Collide phase2=new Collide("north","south");
        System.out.println();
        phase1.checkCollision();
        System.out.println();
        phase2.checkCollision();
        System.out.println("");
    }
}
