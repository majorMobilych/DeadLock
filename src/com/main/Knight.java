package com.main;

public class Knight {
    int hp;
    int strike;
    String name;
    public Knight() {
    }

    public Knight(int hp, int strike, String name) {
        this.hp = hp;
        this.strike = strike;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public int getStrike() {
        return strike;
    }

    public void attack(Knight defenderKnight) {
        synchronized (this) {
            System.out.println(this.name + " - ATTACKER IS SYNCHRONIZED");
            defenderKnight.defend(this);
        }
    }

    public void defend(Knight defenderKnight) {
        synchronized (this) {
            defenderKnight.hp = defenderKnight.hp - this.getStrike();
            System.out.println(this.name + " - DEFENDER IS SYNCHRONIZED");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}