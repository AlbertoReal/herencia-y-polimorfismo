/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaypolimorfismo2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alumnat
 */
public class Taxi extends Vehiculo{
    private int numeroLicencia;
    private boolean libre;
    private int taxisPorLicencia;

    public Taxi() {
    }

    public Taxi(int numeroLicencia, boolean libre, int taxisPorLicencia) {
        this.numeroLicencia = numeroLicencia;
        this.libre = libre;
        this.taxisPorLicencia = taxisPorLicencia;
    }

    public Taxi(int numeroLicencia, boolean libre, int taxisPorLicencia, int ID, String matricula, int potencia, String modelo) {
        super(ID, matricula, potencia, modelo);
        this.numeroLicencia = numeroLicencia;
        this.libre = libre;
        this.taxisPorLicencia = taxisPorLicencia;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public int getTaxisPorLicencia() {
        return taxisPorLicencia;
    }

    public void setTaxisPorLicencia(int taxisPorLicencia) {
        this.taxisPorLicencia = taxisPorLicencia;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("licencia:"+this.getNumeroLicencia());
        System.out.println("taxis porestalicencia:"+this.getTaxisPorLicencia());
        System.out.println("disponible:"+this.isLibre());
    }
    
    @Override
    public void pedirAlta(){
        super.pedirAlta();
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce el numero de taxis para esta licencia");
        int total = entrada.nextInt();
        this.setTaxisPorLicencia(total);
        nuevaLicencia();
        this.setLibre(true);
    }
    public void nuevaLicencia(){
        Random random = new Random();
        int licencia =random.nextInt(900) + 100;
        this.setNumeroLicencia(licencia);
    }
}
