//Evans Tocker Sánchez Laboratorio#1 Progra4
package uisil.evanstocker_lab1_progra4;

public class Entrenador extends SeleccionFutbol {

    private int idFederacion;

    //constructores
    public Entrenador() {
    }

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    //getters and setters
    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    //Metodos 
    @Override
    public void concentrarse() {
        System.out.println("El entrenador llega a la concentracion (Clase Entrenador)");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador viaja (Clase Entrenador)");
    }

    @Override
    public void entrenar() {
        System.out.println("Dirige un entrenamiento (Clase Entrenador)");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Dirige un partido (Clase Entrenador)");
    }
     /////////
    public void planificarEntrenamiento() {
        System.out.println("Planifica el entrenamiento");
    }
}
