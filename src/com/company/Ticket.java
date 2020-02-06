package com.company;

public class Ticket {
    public Ticket() {
    }

    boolean isAvel;
    int place;

    public Ticket(int place) {
        this.place = place;
    }

    public Ticket(boolean isAvel, int place) {
        this.isAvel = isAvel;
        this.place = place;
    }
    synchronized  void buy(Casher c) {

            if (isAvel == true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                isAvel = false;
                System.out.println("Casher " +
                        c.id + "buy " + this.place);
            }
        }
    }

