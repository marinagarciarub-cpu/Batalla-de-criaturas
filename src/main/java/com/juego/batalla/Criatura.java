package com.juego.batalla;

    public abstract class Criatura {
        protected String nombre;
        protected int salud;
        protected int energia;

        public Criatura(String nombre, int salud, int energia) {
            this.nombre = nombre;
            this.salud = salud;
            this.energia = energia;
        }

    public abstract void atacar(Criatura objetivo, int tipoAtaque)
            throws EnergiaInsuficienteException, PersonajeDerrotadoException;

    public void recibirDaño(int cantidad) {
        this.salud -= cantidad;
        if (this.salud < 0) this.salud = 0;
        System.out.println(this.nombre + " recieves " + cantidad + "harm. Health: " + this.salud);
    }
    public void descansar() {
        this.energia += 20;
        System.out.println( nombre + " rest. Actual energy: " + energia);
    }
    public boolean estaVivo() {

        return this.salud > 0;
    }

    public String getNombre() {
        return nombre;
    }
    public int getSalud() {
        return salud;
    }
    public int getEnergia() {
        return energia;
    }
}