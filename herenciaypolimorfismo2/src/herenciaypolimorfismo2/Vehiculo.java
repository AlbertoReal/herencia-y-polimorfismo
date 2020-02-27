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
public class Vehiculo {
    private int ID;
    private String matricula;
    private int potencia;
    private String modelo;
    static int instanciados;

    public Vehiculo() {
    }

    public Vehiculo(int ID, String matricula, int potencia, String modelo) {
        this.ID = ID;
        this.matricula = matricula;
        this.potencia = potencia;
        this.modelo = modelo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula.toUpperCase();
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
         String modeloMaj = Character.toUpperCase(modelo.charAt(0))
                +modelo.substring(1);
        this.modelo = modeloMaj;
    }
    
    public void mostrarAtributos(){
        System.out.println("matricula:"+ this.getMatricula());
        System.out.println("potencia:"+ this.getPotencia());
        System.out.println("id:" +this.getID());
        System.out.println("modelo:" +this.getModelo());
    }
    public void pedirAlta(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce la matricula");
        String matriculas = entrada.nextLine();
        this.setMatricula(matriculas);
        System.out.println("introduce elmodelo");
        String modelos = entrada.nextLine();
        this.setModelo(modelos);
        System.out.println("introduce la potencia en CV");
        int CV = entrada.nextInt();
        cv(CV);
        this.setID(instanciados);
        instanciados +=1;
    }
    public void cv(int caballos){
        Scanner entrada = new Scanner(System.in);
        if(caballos>0){
            this.setPotencia(caballos);
        }else{
           System.out.println("introduce la potencia en CV");
           caballos = entrada.nextInt();
           cv(caballos);
        }
    }
}
