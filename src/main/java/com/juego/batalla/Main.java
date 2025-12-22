package com.juego.batalla;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        Criatura jugador = new Guerrero("Aragorn");
        // Usamos Mago para la IA
        Mago gandalf = new Mago("Gandalf");

        System.out.println("--- BIENVENIDO A LA BATALLA ---");

        while (jugador.estaVivo() && gandalf.estaVivo()) {
            // --- TURNO DEL JUGADOR ---
            System.out.println("\n--- TURNO DE " + jugador.getNombre().toUpperCase() + " ---");
            System.out.println("Salud: " + jugador.salud + " | Energía: " + jugador.energia);
            System.out.println("1. Atacar con Espada");
            System.out.println("2. Esperar (Recuperar energía)");
            System.out.print("Elige una acción: ");

            String opcion = sc.nextLine();

            try {
                if (opcion.equals("1")) {
                    jugador.atacar(gandalf);
                } else {
                    jugador.energia += 15;
                    System.out.println(jugador.getNombre() + " descansa y recupera energía.");
                }
            } catch (EnergiaInsuficienteException | PersonajeDerrotadoException e) {
                System.out.println(" " + e.getMessage());
            }

            if (!gandalf.estaVivo()) break;

            // --- TURNO DE LA IA (GANDALF) ---
            System.out.println("\n--- TURNO DE GANDALF ---");
            try {
                // Gandalf decide: si tiene poca energía, medita. Si no, ataca.
                if (gandalf.energia < 30) {
                    gandalf.meditar();
                } else {
                    // Probabilidad: 20% de fallar el hechizo por "distracción"
                    if (rand.nextInt(100) < 20) {
                        System.out.println("¡Gandalf se trabó al pronunciar el hechizo!");
                    } else {
                        gandalf.atacar(jugador);
                    }
                }
            } catch (Exception e) {
                System.out.println("Gandalf falló: " + e.getMessage());
            }
        }

        // --- RESULTADO FINAL ---
        System.out.println("\n==========================");
        if (jugador.estaVivo()) {
            System.out.println("¡VICTORIA! Has derrotado al mago.");
        } else {
            System.out.println("HAS MUERTO... Gandalf reclama tu alma.");
        }
        System.out.println("==========================");
        sc.close();
    }
}