package com.juego.batalla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Criatura guerrero = new Guerrero("Aragon");
        Criatura mago = new Mago ("Gandalf");

        System.out.println("COMIENZA LA BATALLA ");
        while(guerrero.estaVivo() && mago.estaVivo()){
            System.out.println("\n Es el turno de " + guerrero.getNombre());
            System.out.println("Presiona Enter para atacar");
            scanner.nextLine();

            try{
                guerrero.atacar(mago);

            } catch (EnergiaInsuficienteException e) {
                System.out.println("Error: "+ e.getMessage());
                System.out.println("El guerrero descansa este turno.");
            } catch(PersonajeDerrotadoException e){
                System.out.println("Fin: "+ e.getMessage());
                break;
            }

            if(mago.estaVivo()) {
                try {
                    mago.atacar(guerrero);
                } catch (Exception e) {
                    System.out.println("El mago falló: " + e.getMessage());
                }
            }
            }
            System.out.println("\n La batalla ha finalizado");
            scanner.close();
           }
   }


