
package lab8p2_mariapadilla_linsyposso;

import java.io.Serializable;

public class User implements Serializable {
    private String nombre,password;
    private boolean tipo;

    public User() {
    }

    public User(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }
    public User(String nombre) {
        this.nombre = nombre;
        
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
}
