package com.juego.batalla;

public class Guerrero extends Criatura{
    public Guerrero(String nombre){
        super(nombre,150,50);
    }

    @Override
    public void atacar(Criatura objetivo) throws EnergiaInsuficienteException, PersonajeDerrotadoException{
        if(!this.estaVivo()) throw new PersonajeDerrotadoException(nombre + "esta muerto y no puede atacar");
        if(this.energia <10) throw new EnergiaInsuficienteException(nombre + " no tiene fuera suficiente para levantar su espada");
        System.out.println(nombre + "ataca con tu espada!");
        this.energia -= 10;
        objetivo.recibirDaño(20);


    }

}
