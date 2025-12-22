package com.juego.batalla;

public class Mago extends Criatura{
    public Mago(String nombre){
        super(nombre,100,100);

    }

    @Override
    public void atacar(Criatura objetivo) throws EnergiaInsuficienteException, PersonajeDerrotadoException{
        if(!this.estaVivo()){
            throw new PersonajeDerrotadoException("!El mago" + nombre + " ha sido derrotado!");
        }

        if(this.energia <30){
            throw new EnergiaInsuficienteException(nombre + "no tiene suficiente energia para un hechizo");
        }

        System.out.println(nombre + " lanza un RAYO DE FUEGO! ");
        this.energia -= 30; // Consume más energía que el guerrero
        objetivo.recibirDaño(40); // Hace el doble de daño
    }

    // Metodo extra para el mago

    public void meditar() {
        System.out.println(nombre + " se concentra y recupera 20 de energía.");
        this.energia += 20;
    }
}

