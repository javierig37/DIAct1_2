/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.cifpaviles.com.actividad2;

/**
 *
 * @author Propietario
 */
public class Alumno {
    
     public String nombre;
    public String apellidos;
    public String email;
    public int edad;
    public String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Alumno(String nombre, String apellidos, String email, int edad, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.edad = edad;
        this.telefono = telefono;
    }
    
    
    public void mayor_edad() {
        if (edad>=18) {
            System.out.println("El alumno es mayor de edad");
        }
        else
            System.out.println("El alumno no es mayor de edad");
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", edad=" + edad + ", telefono=" + telefono + '}';
    }
    
}
