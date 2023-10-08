/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.cifpaviles.com.actividad2;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Propietario
 */
public class Principal {
     public static ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    
    public static void main(String args[]) {
     Formulario formulario = new Formulario();
     formulario.setVisible(true);
     Alumno alumnos = new Alumno();
    }
    
    public static void agregarlumno(Alumno alumnos){
        listaAlumnos.add(alumnos);
    }
}
