package com.dagdi.training.returning.object;

public class RetOb {
    public static void main(String[] args){
    Test ob1=new Test(4);
    Test ob2;
    ob2=ob1.inByTen();
    System.out.println("a="+ob1.a);
    System.out.println("a="+ob2.a);
    ob2=ob2.inByTen();
    System.out.println("a="+ob2.a);
    }
}
