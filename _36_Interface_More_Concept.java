//package com.Concepts;

interface Abc{
    void show();
}
class Imple implements Abc{
    public void show(){
        System.out.println("in Abc show");
    }
}
public class _36_Interface_More_Concept {
    public static void main(String args[]){
        Abc obj=new Imple();
        obj.show();
    }
}

/*
output:
in Abc show
 */
