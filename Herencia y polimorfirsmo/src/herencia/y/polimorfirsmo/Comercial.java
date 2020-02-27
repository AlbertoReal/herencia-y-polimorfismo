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
public class Comercial extends Empleado{
    private int ventasRealizadas;
    private int comision;

    public Comercial() {
    }

    public Comercial(int ventasRealizadas, int comision) {
        this.ventasRealizadas = ventasRealizadas;
        this.comision = comision;
    }

    public Comercial(int ventasRealizadas, int comision, String nombre, String apellido1, String apellido2, String NIF, int edad, double salario) {
        super(nombre, apellido1, apellido2, NIF, edad, salario);
        this.ventasRealizadas = ventasRealizadas;
        this.comision = comision;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("ventas realizadas:"+this.getVentasRealizadas());
        System.out.println("comision:"+this.getComision());
    }
    @Override
    public void pedirAlta(){
        Scanner entrada = new Scanner(System.in); 
        super.pedirAlta();
        System.out.println("venatas realizadas");
        int ventas = entrada.nextInt();
        this.setVentasRealizadas(ventas);
        System.out.println("comision");
        int comisionActual = entrada.nextInt();
        this.setComision(comisionActual);
    }   
}
