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
public class Empleado extends Persona{
    private int no_empleado;
    private LocalDate fecha_ingreso;
    private String puesto;
    
     public Empleado(){}
    
     public Empleado(String p_nombre, String s_nombre, String p_Apellido, String s_apellido, LocalDate f_nacimiento, int edad, String gender,
        int no_empleado, LocalDate fecha_ingreso, String puesto) {
        super(p_nombre, s_nombre, p_Apellido, s_apellido, f_nacimiento, edad, gender);
    this.no_empleado = no_empleado;
    this.fecha_ingreso = fecha_ingreso;
    this.puesto = puesto;
    }

    public int getNo_empleado() {
        return no_empleado;
    }

    public void setNo_empleado(int no_empleado) {
        this.no_empleado = no_empleado;
    }

    public LocalDate getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(LocalDate fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

  @Override
    public String toString() {
        return "Empleado{" + "noEmpleado=" + no_empleado + ", " + getP_nombre() + ", " + getS_nombre() + ", " + getP_Apellido() + 
                ", " + getS_apellido() + ", " + getF_nacimiento() + ", " + ", " +
                getEdad() + ", " + getGender() + ", fechaIngreso=" + fecha_ingreso + ", puesto=" + puesto + '}';
    }  
}
