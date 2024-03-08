/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_mariapadilla_linsyposso;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author 29164
 */
public class AdminBinaroTorneo {
    private ArrayList<Torneo> listaTorneo= new ArrayList();
      private File archivo = null;
      
       
     public AdminBinaroTorneo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Torneo> getListaTorneo() {
        return listaTorneo;
    }

    public void setListaTorneo(ArrayList<Torneo> listaTorneo) {
        this.listaTorneo = listaTorneo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public AdminBinaroTorneo (){
    }

    @Override
    public String toString() {
        return "AdmiBinarioTorneos{" + "listaTorneo=" + listaTorneo + ", archivo=" + archivo + '}';
    }

    public void CargarArchivoUser (){
         try {
             listaTorneo=new ArrayList();
             Torneo temp;// limpiar memoria RAM
             if (archivo.exists()){// si existe 
                 FileInputStream entrada=new FileInputStream(archivo);
                 ObjectInputStream objeto=new ObjectInputStream(entrada);
                 try {
                     while ((temp=(Torneo)objeto.readObject())!=null){// leer de objeto a objeto
                          listaTorneo.add(temp);
                     }
                 } catch (EOFException e) {
                     
                 }
                 objeto.close();
                 entrada.close();
             
             }
         } catch (Exception ex) {
             ex.printStackTrace();
         }
     
     
     }
     public void EscribirArchivoUser (){
         FileOutputStream fw=null;
         ObjectOutputStream bw=null;
         try {
             fw=new FileOutputStream(archivo);
             bw=new ObjectOutputStream(fw);
             for ( Torneo t :listaTorneo) {
                 bw.writeObject(t);
             }
             bw.flush();
             
         } catch (Exception e) {
         }finally {
             try {
                 bw.close();
                 fw.close();
             } catch (Exception e) {
             }
         
         }
         
     
     
     }
}
