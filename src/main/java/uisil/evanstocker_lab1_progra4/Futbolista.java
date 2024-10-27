//Evans Tocker Sánchez Laboratorio#1 Progra4
package uisil.evanstocker_lab1_progra4;


public class Futbolista extends SeleccionFutbol {
    private int dorsal; 
    private String demarcacion;
    
    //constructores

    public Futbolista() {
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    //getters and setters

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    
    //Metodos de la clase SeleccionFutbol
    @Override
    public void concentrarse() {
        System.out.println("El futbolista va a la concentracion (Clase Futbolista)");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista viaja (Clase Futbolista)");
    }

    @Override
    public void entrenar() {
        System.out.println("Realiza un entrenamiento (Clase Futbolista)");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega un partido de futbol (Clase Futbolista)");
    }
    
    //Metodo solo del futbolista
    public void entrevista(){
        System.out.println("Da una entrevista despues del partido (Clase Futbolista)");
    }
    
}
