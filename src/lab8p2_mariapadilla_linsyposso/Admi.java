/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_mariapadilla_linsyposso;

/**
 *
 * @author belen
 */
public class Admi extends User {
    private int numeroTorneos;

    public Admi() {
    }

    public Admi(int numeroTorneos) {
        this.numeroTorneos = numeroTorneos;
    }

    public Admi(int numeroTorneos, String nombre, String password) {
        super(nombre, password);
        this.numeroTorneos = numeroTorneos;
    }

    public int getNumeroTorneos() {
        return numeroTorneos;
    }

    public void setNumeroTorneos(int numeroTorneos) {
        this.numeroTorneos = numeroTorneos;
    }

    @Override
    public String toString() {
        return "Admi{" + "numeroTorneos=" + numeroTorneos + '}';
    }
    
    
    
}
