/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_mariapadilla_linsyposso;

import java.util.ArrayList;

/**
 *
 * @author belen
 */
public class Participante extends User {
    public ArrayList<Torneo>torneos=new ArrayList();
    private String torneosGados;

    public Participante() {
    }

    public Participante(String torneosGados) {
        this.torneosGados = torneosGados;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    public String getTorneosGados() {
        return torneosGados;
    }

    public void setTorneosGados(String torneosGados) {
        this.torneosGados = torneosGados;
    }

    

    @Override
    public String toString() {
        return "Participante{" + "torneos=" + torneos + ", torneosGados=" + torneosGados + '}';
    }
    
    
    
}
