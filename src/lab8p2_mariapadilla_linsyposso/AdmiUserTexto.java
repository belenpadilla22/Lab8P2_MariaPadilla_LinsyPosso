/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_mariapadilla_linsyposso;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author belen
 */
public class AdmiUserTexto {
    private ArrayList<User> listaUsuarios= new ArrayList();
    private File archivo = null;
    private ArrayList<Torneo> listatorneos = new ArrayList();
   
     public AdmiUserTexto(String path) {
        archivo = new File(path);
    }

    public AdmiUserTexto() {
    }

    public ArrayList<User> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<User> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Torneo> getListatorneos() {
        return listatorneos;
    }

    public void setListatorneos(ArrayList<Torneo> listatorneos) {
        this.listatorneos = listatorneos;
    }

    @Override
    public String toString() {
        return "AdmiUserTexto{" + "listaUsuarios=" + listaUsuarios + ", archivo=" + archivo + ", listatorneos=" + listatorneos + '}';
    }
     public void escribirArchivoUser() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);// false que lo reescriba 
            bw = new BufferedWriter(fw);
            for (User t : listaUsuarios) {
                bw.write("El paricipante"+t.getNombre());
               
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivoUser() {
        Scanner sc = null;
        listaUsuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaUsuarios.add(new User(sc.next()) );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
    
     public void escribirArchivoTorneos() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);// false que lo reescriba 
            bw = new BufferedWriter(fw);
            for (Torneo t : listatorneos) {
                bw.write("ha ganado el torneo"+t.getGanador());
               
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivoTorneo() {
        Scanner sc = null;
        listatorneos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listatorneos.add(new Torneo(sc.next()) );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }


    
}
