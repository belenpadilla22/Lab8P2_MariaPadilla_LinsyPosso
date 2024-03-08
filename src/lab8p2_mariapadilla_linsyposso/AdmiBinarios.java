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
 * @author belen
 */
public class AdmiBinarios {
    public ArrayList<User> listaUsuarios= new ArrayList();
    public File archivo = null;
   
    
     public AdmiBinarios(String path) {
        archivo = new File(path);
    }

    public AdmiBinarios() {
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

    
        
     public void CargarArchivoUser (){
         try {
            listaUsuarios=new ArrayList();
             User temp;// limpiar memoria RAM
             if (archivo.exists()){// si existe 
                 FileInputStream entrada=new FileInputStream(archivo);
                 ObjectInputStream objeto=new ObjectInputStream(entrada);
                 try {
                     while ((temp=(User)objeto.readObject())!=null){// leer de objeto a objeto
                          listaUsuarios.add(temp);
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
             for (User t : listaUsuarios) {
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
