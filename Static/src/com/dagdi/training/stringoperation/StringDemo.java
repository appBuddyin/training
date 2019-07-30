package com.dagdi.training.stringoperation;

public class StringDemo {
    public static void main(String[] args){
    String str1="First string";
    String str2="Second string";
    String str3=str1+" + "+str2;
    String str4=str2;
    System.out.println("String 4 lenght="+str4.length());
    System.out.println("String 3 lenght="+str3.length());
    if(str2.length()==str1.length()){
        System.out.println("String 1 == String 2");
    }
    else
        System.out.println("String 1 != String 2");
    }
}
