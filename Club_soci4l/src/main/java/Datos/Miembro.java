/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.time.LocalDate;

/**
 *
 * @author belen
 */
public class Miembro extends Persona {
    private int no_membresia;
    private LocalDate fecha_emision;
    private LocalDate fecha_expiracion;
    
    public Miembro () {
    }
    
    public Miembro(String p_nombre, String s_nombre, String p_Apellido, String s_apellido, LocalDate f_nacimiento, 
            int edad, String gender, int no_membresia, LocalDate fecha_emision, LocalDate fecha_expiracion) {
        super(p_nombre, s_nombre, p_Apellido, s_apellido, fecha_emision, edad, gender);
        this.no_membresia = no_membresia;
        this.fecha_emision = fecha_emision;
        this.fecha_expiracion = fecha_expiracion;
    }

    public int getNo_membresia() {
        return no_membresia;
    }

    public void setNo_membresia(int no_membresia) {
        this.no_membresia = no_membresia;
    }

    public LocalDate getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(LocalDate fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public LocalDate getFecha_expiracion() {
        return fecha_expiracion;
    }

    public void setFecha_expiracion(LocalDate fecha_expiracion) {
        this.fecha_expiracion = fecha_expiracion;
    }

   @Override
    public String toString() {
        return "Miembro{" + "noMembresia=" + no_membresia + ", " + getP_nombre() + ", " + getS_nombre() + ", " + getP_Apellido() + 
                ", " + getS_apellido() + ", " + getF_nacimiento() + ", " + ", " +
                getEdad() + ", " + getGender() + ", fechaemision=" + fecha_emision + ", fechaexpiracion=" + fecha_expiracion + '}';
    }

   
}
