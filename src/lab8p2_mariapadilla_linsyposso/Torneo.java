/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_mariapadilla_linsyposso;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author belen
 */
public class Torneo implements Serializable{
    private String nombre;
    private ArrayList<Participante>listaParticipantes=new ArrayList();
    private boolean terminado;
    private Participante ganador;

    public Torneo() {
    }
    public Torneo( Participante ganador) {
        this.ganador = ganador;
    }

    public Torneo( String nombre) {
        this.nombre=nombre;
    }

    public Torneo(String nombre, boolean terminado, Participante ganador) {
        this.nombre = nombre;
        this.terminado = terminado;
        this.ganador = ganador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(ArrayList<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public Participante getGanador() {
        return ganador;
    }

    public void setGanador(Participante ganador) {
        this.ganador = ganador;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
}
