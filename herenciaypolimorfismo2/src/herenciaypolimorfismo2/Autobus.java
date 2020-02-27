/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaypolimorfismo2;

import java.util.Scanner;

/**
 *
 * @author Alumnat
 */
public class Autobus extends Vehiculo {
    private int plazas;
    private int paradas;

    public Autobus() {
    }

    public Autobus(int plazas, int paradas) {
        this.plazas = plazas;
        this.paradas = paradas;
    }

    public Autobus(int plazas, int paradas, int ID, String matricula, int potencia, String modelo) {
        super(ID, matricula, potencia, modelo);
        this.plazas = plazas;
        this.paradas = paradas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public int getParadas() {
        return paradas;
    }

    public void setParadas(int paradas) {
        this.paradas = paradas;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("plazas totales:"+this.getPlazas());
        System.out.println("paradas totales:"+this.getParadas());
    }
    @Override
    public void pedirAlta(){
      super.pedirAlta();
      Scanner entrada = new Scanner(System.in);
        System.out.println("introduce el numero de plazas");
        int plazasTotales = entrada.nextInt();
        this.setPlazas(plazasTotales);
        System.out.println("introduce el numero de paradas");
        int paradasTotales = entrada.nextInt();
        paradasValidador(paradasTotales);
    }
    public void paradasValidador(int paradas){
        Scanner entrada = new Scanner(System.in);
        if (paradas>3 && paradas<21){
           this.setParadas(paradas);
        }else{
            System.out.println("introduce el numero de paradas >3 <20");
            paradas = entrada.nextInt();
            paradasValidador(paradas);
        }
    }
}
