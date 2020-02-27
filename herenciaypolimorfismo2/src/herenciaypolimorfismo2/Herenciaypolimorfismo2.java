/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaypolimorfismo2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumnat
 */
public class Herenciaypolimorfismo2 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Vehiculo> Vehiculos = new ArrayList<Vehiculo>();
    
    public static void buscarMatricula(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce la matricula");
        String matricula = entrada.nextLine();
        int i=0;
        /*
        while (Vehiculos.get(i).getMatricula()!=matricula || i==Vehiculos.size()){
            i++;
        }
       Vehiculos.get(i).mostrarAtributos();
        */
        for (i=0; i<Vehiculos.size(); i++){
            if (Vehiculos.get(i).getMatricula().equals(matricula)){
                System.out.println("vehiculo encontrado: \n");
                Vehiculos.get(i).mostrarAtributos();
            }else{
                System.out.println("no encontrado");
            }
        }
    }
    public static void buscarId(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce la id del vehiculo");
        int id = entrada.nextInt();
        int i=0;
        /*
        while (Vehiculos.get(i).getMatricula()!=matricula || i==Vehiculos.size()){
            i++;
        }
       Vehiculos.get(i).mostrarAtributos();
        */
        for (i=0; i<Vehiculos.size(); i++){
            if (Vehiculos.get(i).getID()==id){
                System.out.println("vehiculo encontrado: \n");
                Vehiculos.get(i).mostrarAtributos();
            }else{
                System.out.println("no encontrado");
            }
        }
    }
    public static void taxiLibre(){
        boolean tope = false;
        int i = 0;
        while(tope==false){
            if(i==Vehiculos.size()){
                System.out.println("taxis no disponibles");
                tope=true;
            }else{
            Vehiculo taxi = Vehiculos.get(i);
            if (taxi instanceof Taxi){
                if (((Taxi) taxi).isLibre()==true){
                    System.out.println("id del taxi:"+taxi.getID());
                    ((Taxi) taxi).setLibre(false);
                    tope =true;
                }
            }
            }i++;
        }
        
    }
    public static void taxiToLibre(){
       Scanner entrada = new Scanner(System.in);
        System.out.println("introduce la id del taxi");
        int idTaxi = entrada.nextInt();
        int i = 0;
        boolean tope = false;
        while (tope==false){
             if(i==Vehiculos.size()){
                System.out.println("id no encontrada");
                tope=true;
            }else{
         Vehiculo taxi = Vehiculos.get(i);
                if (taxi instanceof Taxi){
                    if(taxi.getID()==idTaxi){
                        ((Taxi) taxi).setLibre(true);
                        taxi.mostrarAtributos(); 
                    }
                }
            }i++;
        }
              
    }
    public static void mostrarParqueVehiculos(){
        for (int i = 0; i<Vehiculos.size(); i++){
            ((Vehiculo)Vehiculos.get(i)).mostrarAtributos();
        }
    }
    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("menu: \n"
                + "1 para añadir Vehiculo \n"
                + "2 para añadir Taxi \n"
                + "3 para añadir Autobus \n"
                + "4 para añadir VTC \n"
                + "5 buscar matricula \n"
                + "6 buscar id \n"
                + "7 taxi libre  \n"
                + "8 taxi id a libre \n"
                + "9 mostrar parque de vehiculos \n");
        int menu = entrada.nextInt();
        switch(menu){
            case 1:{
                Vehiculo v1 = new Vehiculo();
                v1.pedirAlta();
                Vehiculos.add(v1);
                menu();
                break;
            }
            case 2:{
                Taxi t1 = new Taxi();
                t1.pedirAlta();
                Vehiculos.add(t1);
                menu();
                break;
            }
            case 3:{
                Autobus a1 = new Autobus();
                a1.pedirAlta();
                Vehiculos.add(a1);
                menu();
                break;
            }
            case 4:{
               VTC vt1 = new VTC();
                vt1.pedirAlta();
                Vehiculos.add(vt1);
                menu();
            }
            case 5:{
                buscarMatricula();
                menu();
                break;
            }
            case 6:{
                buscarId();
                menu();
                break;
            }
             case 7:{
                taxiLibre();
                menu();
                break;
            }
             case 8:{
                 taxiToLibre();
                 menu();
                 break;
             }
             case 9:{
                 mostrarParqueVehiculos();
                 menu();
                 break;
             }
            default: {
                break;
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
       menu();
        }
    
}
