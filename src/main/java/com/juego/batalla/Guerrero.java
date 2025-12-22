package com.juego.batalla;


    public class Guerrero extends Criatura {
        public Guerrero(String nombre) {
            super(nombre, 150, 60);
        }

        @Override
            public void atacar(Criatura objetivo, int tipoAtaque) throws EnergiaInsuficienteException, PersonajeDerrotadoException {
             if (!this.estaVivo()) throw new PersonajeDerrotadoException(nombre + " cant fight is dead!.");

            switch (tipoAtaque) {
            case 1:
                if (energia < 10) throw new EnergiaInsuficienteException("No energy to use the sword !");
                    System.out.println(nombre + " FAST! use your sword! ");
                     energia -= 10;
                     objetivo.recibirDaño(20);
                    break;

            case 2:
                   if (energia < 5) throw new EnergiaInsuficienteException("No energy to use the shield!");
                     System.out.println(nombre + " ATTACK with your shield ");
                     energia -= 5;
                     objetivo.recibirDaño(10);
                break;

            case 3:
                if (energia < 40) throw new EnergiaInsuficienteException("You dont have energy to use the Lethal punch!");
                  System.out.println(nombre + " execute the lethal punch! ");
                    energia -= 40;
                    objetivo.recibirDaño(60);
                break;
        }
    }
}