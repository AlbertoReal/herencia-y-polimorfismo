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
public class Repartidor extends Empleado {
    private int horasTrabajadas;
    private String zona;

    public Repartidor() {
    }

    public Repartidor(int horasTrabajadas, String zona) {
        this.horasTrabajadas = horasTrabajadas;
        this.zona = zona;
    }

    public Repartidor(int horasTrabajadas, String zona, String nombre, String apellido1, String apellido2, String NIF, int edad, double salario) {
        super(nombre, apellido1, apellido2, NIF, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.zona = zona;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
  
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("zona:"+this.getZona());
        System.out.println("horas trabajadas:"+this.getHorasTrabajadas());
    }
    
    @Override
    public void pedirAlta(){
        super.pedirAlta();
        Scanner entrada = new Scanner(System.in);       
        System.out.println("introduce la zona");
        String lugar = entrada.nextLine();
        this.setZona(lugar);
        System.out.println("intoduce las horas trabajadas");
        int horas = entrada.nextInt();
        this.setHorasTrabajadas(horas);
    }
}
