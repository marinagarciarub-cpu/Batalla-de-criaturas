package com.juego.batalla;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Criatura jugador = new Guerrero("Aragon");
        Criatura rival = new Mago("Gandalf");

        while (jugador.estaVivo() && rival.estaVivo()) {
            System.out.println("\n PLAYER ARAGON: " + jugador.getSalud() + " LIFE | " + jugador.getEnergia() + " ENERGY ");
            System.out.println("1. Sword (10 EN)\n2. Shield (5 EN)\n3. Lethal punch (40 EN)\n4. Rest");
            System.out.print("Choose: ");

            try {
                int op = Integer.parseInt(sc.nextLine());
                if (op >= 1 && op <= 3) {
                    jugador.atacar(rival, op);
                } else if (op == 4) {
                    jugador.descansar();
                } else {
                    System.out.println("Invalid oposition, you loose your turn.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            if (!rival.estaVivo()) break;

            // IA del Rival
            System.out.println("\n GANDALF TURN ");
            try {
                int decisionIA = rand.nextInt(3) + 1; // Elige ataque 1, 2 o 3
                rival.atacar(jugador, decisionIA);
            } catch (Exception e) {
                System.out.println("Gandalf tries to attack but: " + e.getMessage());
                rival.descansar(); // Si no tiene energía para el ataque que eligió, descansa
            }
        }
        System.out.println(jugador.estaVivo() ? "YOU WON " : "YOU LOST...");
    }
}