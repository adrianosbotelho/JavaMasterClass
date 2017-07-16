package com.adrianosbotelho;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Adriano";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Adriano",200,"Sword");
        System.out.println("Initial health is "+player.getHitPoints());

    }
}
