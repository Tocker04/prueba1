
//Evans Tocker Sánchez Laboratorio#1 Progra4
//Tema: Simulación de un Equipo de Fútbol con Herencia y Polimorfismo en Java 
package uisil.evanstocker_lab1_progra4;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab1_Polimorfiso_Interface {

    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {

        //Intanciamos los objetos de las clase Entrenador, Futbolista y Masajista y asiganamos variables
        SeleccionFutbol Ent1 = new Entrenador(4040, 01, "Ricardo", "Saprissa", 60);
        SeleccionFutbol Fut1 = new Futbolista(10, "Delantero", 02, "Lionel Andres", "Messi", 37);
        SeleccionFutbol Masj1 = new Masajista("Licenciado", 15, 03, "Juan", "Rodriguez", 30);

        //Agregar los objetos a lista
        integrantes.add(Ent1);
        integrantes.add(Fut1);
        integrantes.add(Masj1);

        Scanner sc = new Scanner(System.in);

        //Menu
        boolean salir = false;
        while (!salir) {
            realizarActividad(sc);
        }
        sc.close();
    }

    public static void realizarActividad(Scanner sc) {
        System.out.println("Bienvenido al Menu de actividades" + "\n"
                + "\nSeleccione un numero para mostrar una actividad: "
                + "\n1-Concentrarse"
                + "\n2-Viajar"
                + "\n3-Entrenar"
                + "\n4-Jugar Partido"
                + "\n5-Entrevista a Futbolista"
                + "\n0-Salir");
        System.out.println("");
        System.out.println("\nIngrese el numero: ");
        int op = sc.nextInt();
        System.out.println("");

        switch (op) {
            case 1:
                System.out.println("----------Actividad Concentrarse----------" + "\n");
                for (SeleccionFutbol integrante : integrantes) {
                    integrante.concentrarse();
                }
                break;
            case 2:
                System.out.println("----------Actividad Viajar----------" + "\n");
                for (SeleccionFutbol integrante : integrantes) {
                    integrante.viajar();
                }
                break;
            case 3:
                System.out.println("----------Actividad Entrenar----------" + "\n");
                for (SeleccionFutbol integrante : integrantes) {
                    integrante.entrenar();
                }
                break;
            case 4:
                System.out.println("----------Actividad Jugar Partido----------" + "\n");
                for (SeleccionFutbol integrante : integrantes) {
                    integrante.jugarPartido();
                }
                break;
            case 5:
                System.out.println("----------Actividad Entrevista----------" + "\n");
                for (SeleccionFutbol integrante : integrantes) {
                    if (integrante instanceof Futbolista) { //verificar que hay un futbolista
                        ((Futbolista) integrante).entrevista();
                    }
                }
                break;
            case 0: // salir del metodo
                System.out.println("----------Saliendo del menu...----------");
                System.exit(0);
                break;
            default:
                System.out.println("----------La opcion no es valida, por favor seleccione otra.----------");
                break;

        }
        System.out.println();
    }
}
/////////NUEVO CAMBIO