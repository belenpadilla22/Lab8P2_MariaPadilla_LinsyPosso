
package lab8p2_mariapadilla_linsyposso;

public class User {
    private String nombre,password;

    public User() {
    }

    public User(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }
    public User(String nombre) {
        this.nombre = nombre;
        
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
        return "User{" + "nombre=" + nombre + ", password=" + password + '}';
    }
    
    
    
    
    
}
