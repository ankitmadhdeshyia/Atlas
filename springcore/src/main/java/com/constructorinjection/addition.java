package com.constructorinjection;

public class addition {
    private int a;
    private int b;
    public addition(){

    }
    public  addition(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Constructor int a , int b");
    }
     public  addition(double a,double b){
        this.a=(int)a;
        this.b=(int)b;
        System.out.println("Constructor double a , double b");
    }
    public  addition(String a,String b){
        this.a=Integer.parseInt(a);
        this.b=Integer.parseInt(b);
        System.out.println("Constructor String a , String b");
    }
    
    //here name of variable is same but their type is diffrent so this is know as ambiguity
    public void doSum(){
        System.out.println("Sum is"+" "+(this.a+this.b));
    }
}
