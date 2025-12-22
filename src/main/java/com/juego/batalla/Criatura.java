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

    // Método que obliga a los hijos a implementar su propio ataque
    public abstract void atacar(Criatura objetivo) throws EnergiaInsuficienteException, PersonajeDerrotadoException;

    public void recibirDaño(int cantidad) {
        this.salud -= cantidad;
        if (this.salud < 0) this.salud = 0;
        System.out.println(this.nombre + " ha recibido " + cantidad + " de daño. Salud: " + this.salud);
    }
    public void descansar() {
        this.energia += 20;
        System.out.println( nombre + " descansa. Energía actual: " + energia);
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