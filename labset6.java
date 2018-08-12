import java.io.*;

interface iStack{
    void push(int a);
    int pop();
}

class DynamicStack{
    int[] stack;
    int top,size;

    DynamicStack(int size){
        stack=new int[size];
        top=-1;
        this.size=size;
    }

    void push(int a){
        if(top==stack.length-1){
            System.out.println("Stack overflow!");
        }
        else{
            stack[++top]=a;
            System.out.println(a+" successfully inserted onto top of stack!");
        }
    }

    int pop(){
        if(top!=-1){
            System.out.println(stack[top]+" successfully popped!"); 
            return stack[top--]; 
        }
        else{
            System.out.println("Stack empty/Underflow!");
            return -1;
        }
    }

    @Override
    public String toString(){
        String temp="";
        for(int i=0;i<=top;i++){
            temp+=stack[i]+" ";
        }
        return "Stack Contents: "+temp;
    }
}

class Labset6{
    public static void main(String[] args){  
        DynamicStack ds=new DynamicStack(5);
        for(int i=0;i<5;i++){
            ds.push(i);
        }
        System.out.println(ds);
        for(int i=0;i<ds.size;i++){
           ds.pop();
        }

    }
}
