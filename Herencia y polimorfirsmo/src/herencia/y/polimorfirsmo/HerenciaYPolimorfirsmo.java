/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.y.polimorfirsmo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumnat
 */
public class HerenciaYPolimorfirsmo {

    
    public static ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    public static void pedirDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce:\n"
                + "1 para ver empleados \n"
                + "2 para ver repartidores \n"
                + "3 para ver comerciales \n"
                + "4 para salir");
        int menu =entrada.nextInt();
        switch (menu){
            case 1:{
                for (int i=0; i<empleados.size(); i++){
                    ((Empleado)empleados.get(i)).mostrarAtributos();
                }
                pedirDatos();
                break;
            }
            case 2:{
                for (int i=0; i<empleados.size(); i++){
                    Empleado p1 = empleados.get(i);
                    if (p1 instanceof Repartidor){
                        p1.mostrarAtributos();
                    }
                }
                pedirDatos();
                break;
            }
            case 3:{
                 for (int i=0; i<empleados.size(); i++){
                    Empleado p1 = empleados.get(i);
                    if (p1 instanceof Comercial){
                        p1.mostrarAtributos();
                    }
                }
                pedirDatos();
                break;
            }
            case 4:{
                
                break;
            }
            default :{
                 System.out.println("introduce un valor valido");
                 pedirDatos();
            }
        }
    }

    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("menu: \n"
                + "1 para añadir empleado \n"
                + "2 para añadir repartidor \n"
                + "3 para añadir comercial \n"
                + "4 ver datos \n"
                + "5 salir");
        int menu = entrada.nextInt();
        switch(menu){
            case 1:{
                Empleado e1 = new Empleado();
                e1.pedirAlta();
                empleados.add(e1);
                menu();
                break;
            }
            case 2:{
                Repartidor r1 = new Repartidor();
                r1.pedirAlta();
                empleados.add(r1);
                menu();
                break;
            }
            case 3:{
                Comercial c1 = new Comercial();
                c1.pedirAlta();
                empleados.add(c1);
                break;
            }
            case 4:{
                pedirDatos();
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
       menu();
        }
}
