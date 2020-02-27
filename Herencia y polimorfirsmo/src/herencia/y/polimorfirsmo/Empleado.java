/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.y.polimorfirsmo;

import java.util.Scanner;

/**
 *
 * @author Alumnat
 */
public class Empleado {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String NIF;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido1, String apellido2, String NIF, int edad, double salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.NIF = NIF;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String nombreMaj = Character.toUpperCase(nombre.charAt(0))
                +nombre.substring(1);
        this.nombre = nombreMaj;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        String apellido1Maj = Character.toUpperCase(apellido1.charAt(0))
                +apellido1.substring(1);
        this.apellido1 = apellido1Maj;
    }

    public String getApellido2() {
        String apellido2Maj = Character.toUpperCase(apellido2.charAt(0))
                +apellido2.substring(1);
        return apellido2Maj;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
      public void mostrarAtributos(){
        System.out.println("nombre:"+this.getNombre());
        System.out.println("apellido1:"+this.getApellido1());
        System.out.println("apellido2:"+this.getApellido2());
        System.out.println("edad:"+this.getEdad());
        System.out.println("NIF:"+this.getNIF());
        System.out.println("salario"+this.getSalario());
      }
      
      
      public void pedirAlta(){
          Scanner entrada = new Scanner(System.in);
          System.out.println("introduce el nombre:");
          String Nombre =entrada.nextLine();
          this.setNombre(Nombre);
          System.out.println("introduce el primer apellido:");
          String primerApellido = entrada.nextLine();
          this.setApellido1(primerApellido);
          System.out.println("introduce el segundo apellido:");
          String segundoApellido = entrada.nextLine();
          this.setApellido2(segundoApellido);
          System.out.println("introuce el NIF:");
          String nif = entrada.nextLine();
          this.setNIF(nif);
          System.out.println("introduce salario:");
          double sueldo = entrada.nextDouble();
          this.setSalario(sueldo);
          System.out.println("introduce la edad:");
          int años = entrada.nextInt();
          menor(años);
      }
      public void menor(int tope){
          Scanner entrada = new Scanner(System.in);
          if (tope>16){
              this.setEdad(tope);
          }else{
              System.out.println("introduce la edad mayor de 16 años:");
              tope = entrada.nextInt();
              menor(tope);
          }
      }
}
