package com.company;

public class Main {
    public static void main(String[] args){
        new multithreadinG().run();
        new multithreadinG().run();
        new multithreadinG().run();
    }
}

class multithreadinG implements Runnable{

    @Override
    public void run() {
        System.out.println("first");
        System.out.println("second");
        System.out.println("third");
        System.out.println("fourth");
    }
}