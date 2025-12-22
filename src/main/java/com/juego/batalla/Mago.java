package com.juego.batalla;

public class Mago extends Criatura {
    public Mago(String nombre) {
        super(nombre, 100, 100);
    }

        @Override
        public void atacar(Criatura objetivo, int tipoAtaque) throws EnergiaInsuficienteException, PersonajeDerrotadoException {
            if (!this.estaVivo()) throw new PersonajeDerrotadoException(nombre + " has fallen.");

        if(tipoAtaque == 1) {
                System.out.println(nombre + " throws fire ball");
                 energia -= 10; objetivo.recibirDaño(15);
        }
        else if (tipoAtaque == 2) {
            if(energia < 30) throw new EnergiaInsuficienteException("Failed throwing the electric storm.");
                 System.out.println(nombre + " throws electric storm ");
                 energia -= 30; objetivo.recibirDaño(35);
        } else {
             if(energia < 60) throw new EnergiaInsuficienteException("Failed to make the dark explosion!");
                System.out.println(nombre + " DARK EXPLOSION !");

                 energia -= 60; objetivo.recibirDaño(70);
        }
    }
}