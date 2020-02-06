package com.company;

public class Main {

    public static void main(String[] args) {
        Ticket [] t={new Ticket(true,1),
                new Ticket(true,2),
                new Ticket(true,3),
                new Ticket(true,4),
                new Ticket(true,5)};
        Casher a=new Casher(1,t);
        Casher b=new Casher(2,t);
        Casher c=new Casher(3,t);
        Casher d=new Casher(4,t);
        a.start();
        b.start();
        c.start();
        d.start();


    }
}