package com.dagdi.training.returning.object;

public class Test {
    int a;

     Test(int i){
        a=i;
    }
    Test inByTen(){
        Test temp=new Test(a+10);
        return temp;
    }

}
