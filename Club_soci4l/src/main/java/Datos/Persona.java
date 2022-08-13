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
public class Persona {
    private String p_nombre;
    private String s_nombre;
    private String p_Apellido;
    private String s_apellido;
    private LocalDate  f_nacimiento;
    private int edad;
    private String gender;

    public Persona(){}
    
    public Persona(String p_nombre, String s_nombre, String p_Apellido, String s_apellido, LocalDate f_nacimiento, int edad, String gender) {
        this.p_nombre = p_nombre;
        this.s_nombre = s_nombre;
        this.p_Apellido = p_Apellido;
        this.s_apellido = s_apellido;
        this.f_nacimiento = f_nacimiento;
        this.edad = edad;
        this.gender = gender;
    }

    public String getP_nombre() {
        return p_nombre;
    }

    public void setP_nombre(String p_nombre) {
        this.p_nombre = p_nombre;
    }

    public String getS_nombre() {
        return s_nombre;
    }

    public void setS_nombre(String s_nombre) {
        this.s_nombre = s_nombre;
    }

    public String getP_Apellido() {
        return p_Apellido;
    }

    public void setP_Apellido(String p_Apellido) {
        this.p_Apellido = p_Apellido;
    }

    public String getS_apellido() {
        return s_apellido;
    }

    public void setS_apellido(String s_apellido) {
        this.s_apellido = s_apellido;
    }

    public LocalDate getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(LocalDate f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Persona{" + "p_nombre=" + p_nombre + ", s_nombre=" + s_nombre + ", p_Apellido=" + p_Apellido + ", s_apellido=" + s_apellido + ", f_nacimiento=" + f_nacimiento + ", edad=" + edad + ", gender=" + gender + '}';
    }
}
    
    

