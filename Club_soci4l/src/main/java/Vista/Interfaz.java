/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Datos.Empleado;
import Datos.Miembro;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author belen
 */
public class Interfaz {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Empleado> empleados = new ArrayList<>();
    static ArrayList<Miembro> miembros = new ArrayList<>();
    
    public static void agregarEmpleado(){
        System.out.println("Primer nombre:");
        String p_nombre = scan.nextLine();
        System.out.println("Segundo nombre:");
        String s_nombre = scan.nextLine();
        System.out.println("Primer apellido:");
        String p_Apellido = scan.nextLine();
        System.out.println("Segundo apellido:");
        String s_apellido = scan.nextLine();
        
        System.out.println("Fecha de nacimiento (YYYY/MM/DD):");
        int anio = scan.nextInt();
        int mes = scan.nextInt();
        int dia = scan.nextInt();
        // se vuelve a resetear
        scan.nextLine();
        
        System.out.println("Genero (M/F):");
        String gender = scan.nextLine();
        System.out.println("Puesto del trabajador:");
        String puesto = scan.nextLine();
        
        // se comprueba que el mes actual sea menor que el mes que pertenece
        // a la fecha de nacimiento
        int edad = (LocalDate.now().getYear() - anio);
        if(LocalDate.now().getMonthValue() < mes)
            edad--;
        
        Empleado emp = new Empleado(p_nombre, s_nombre, p_Apellido, s_apellido,
        LocalDate.of(anio, mes, dia), edad, gender, (empleados.size()+1),
        LocalDate.now(), puesto);
        
        empleados.add(emp);
        
        menuEmpleados();
    }
    
    public static void mostrarEmpleados() {
        empleados.forEach( e -> {
            System.out.println(e.toString());
        });
        
        menuEmpleados();
    }
    
    public static void menuEmpleados() {
        System.out.println("1. Agregar empleado.\n2. Mostrar lista de empleados.\n3. Volver.");
        int opcion = scan.nextInt();
        scan.nextLine();
        switch (opcion) {
            case 1 :{
                agregarEmpleado();
            }
            break;
            case 2 :{
                mostrarEmpleados();
            }
            break;
            case 3 :{
                menuPrincipal();
            }
            break;
            default : {
                    System.out.println("Opcion invalida.");
                    menuEmpleados();
                    }
        }
    }
    
    public static void agregarMiembros(){
        System.out.println("Primer nombre:");
        String p_nombre = scan.nextLine();
        System.out.println("Segundo nombre:");
        String s_nombre = scan.nextLine();
        System.out.println("Primer apellido:");
        String p_Apellido = scan.nextLine();
        System.out.println("Segundo apellido:");
        String s_apellido = scan.nextLine();
        
        System.out.println("Fecha de nacimiento (YYYY/MM/DD):");
        int anio = scan.nextInt();
        int mes = scan.nextInt();
        int dia = scan.nextInt();
        // se vuelve a resetear
        scan.nextLine();
        
        System.out.println("Genero (M/F):");
        String gender = scan.nextLine();
        
        // se comprueba que el mes actual sea menor que el mes que pertenece
        // a la fecha de nacimiento
        int edad = (LocalDate.now().getYear() - anio);
        if(LocalDate.now().getMonthValue() < mes)
            edad--;
        
        Miembro miembro = new Miembro(p_nombre, s_nombre, p_Apellido, s_apellido,
        LocalDate.of(anio, mes, dia), edad, gender, (miembros.size()+1),
        LocalDate.now(), LocalDate.now().plus(2, ChronoUnit.YEARS));
        
        miembros.add(miembro);
        
        menuMiembros();
    }
    
    public static void mostrarMiembros() {
        miembros.forEach( e -> {
            System.out.println(e.toString());
        });
        
        menuMiembros();
    }
    
    public static void menuMiembros() {
        System.out.println("1. Agregar miembro.\n2. Mostrar lista de miembros.\n3. Volver.");
        int opcion = scan.nextInt();
        scan.nextLine();
        switch (opcion) {
            case 1 : {
                agregarMiembros();
            }
            break;
            case 2 : {
                mostrarMiembros();
            }
            break;
            case 3 : {
                menuPrincipal();
            }
            break;
            default : {
                    System.out.println("Opcion invalida.");
                    menuMiembros();
                    }
        }
         }
    
    public static void menuPrincipal(){
        System.out.println("Bienvenido al sistema.");
        System.out.println("1. Empleados.\n2. Miembros.\n3. Salir.");
        int opcion = scan.nextInt();
        scan.nextLine();
        switch (opcion) {
            case 1 : {
                menuEmpleados();
            }
            break;
            case 2 : {
                menuMiembros();
            }
            break;
            case 3 : {
                System.out.println("Hasta pronto.");
                System.exit(0);
            }
            break;
            default :{
                    System.out.println("Opcion invalida.");
                    menuPrincipal();
                    }
        }
    }
   
   
}
