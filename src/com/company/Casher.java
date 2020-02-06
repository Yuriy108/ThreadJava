package com.company;

public class Casher  extends Thread {
    int id;
    Ticket [] t;

    public Casher(int id, Ticket[] t) {
        this.id = id;
        this.t = t;
    }

    public void   run(){
        for(int i=0;i<t.length;i++){
            t[i].buy(this);
        }





    }

}
