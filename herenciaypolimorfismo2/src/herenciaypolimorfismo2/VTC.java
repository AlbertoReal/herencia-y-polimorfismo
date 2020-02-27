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
public class VTC extends Vehiculo {
    
    private int maximoHoras;
    private int radioAccion;
    private String localizacion;

    public VTC() {
    }

    public VTC(int maximoHoras, int radioAccion, String localizacion) {
        this.maximoHoras = maximoHoras;
        this.radioAccion = radioAccion;
        this.localizacion = localizacion;
    }

    public int getMaximoHoras() {
        return maximoHoras;
    }

    public void setMaximoHoras(int maximoHoras) {
        this.maximoHoras = maximoHoras;
    }

    public int getRadioAccion() {
        return radioAccion;
    }

    public void setRadioAccion(int radioAccion) {
        this.radioAccion = radioAccion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("maximo de horas:"+this.getMaximoHoras());
        System.out.println("radio de accion:"+this.getRadioAccion());
        System.out.println("localizacion:"+this.getLocalizacion());
    }
    @Override
    public void pedirAlta(){
      super.pedirAlta();
      Scanner entrada = new Scanner(System.in);
      System.out.println("introduce la localizacion");
        String ubicacion = entrada.nextLine();
        this.setLocalizacion(ubicacion);
        System.out.println("introduce el maximo de hosras");
        int maxHoras= entrada.nextInt();
        topeHoras(maxHoras);
        System.out.println("introduce el radio de accion");
        int radio = entrada.nextInt();
        topeRadio(radio);
        
    }
    
    public void topeHoras(int horas){
        Scanner entrada = new Scanner(System.in);
        if (horas<25){
            this.setMaximoHoras(horas);
        }else{
            System.out.println("introduce el maximo de hosras max 24");
            horas = entrada.nextInt();
            topeHoras(horas);
        }
    }
    public void topeRadio(int radio){
        Scanner entrada = new Scanner(System.in);
        if (radio<51){
            this.setRadioAccion(radio);
        }else{
            System.out.println("introduce el radio de accion max 50 km");
            radio = entrada.nextInt();
            topeRadio(radio);
        }
    }
}
