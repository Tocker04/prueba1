//Evans Tocker Sánchez Laboratorio#1 Progra4
package uisil.evanstocker_lab1_progra4;


public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int aniosExperiencia;
    
    //constructores
    public Masajista() {
    }

    public Masajista(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    
    //getters and setters

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
    //Metodos

    @Override
    public void concentrarse() {
        System.out.println("El masajista esta en la concentracion (Clase Masajista)");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista viaja (Clase Masajista)");
    }

    @Override
    public void entrenar() {
        System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Esta presente durante el partido (Clase Masajista)");
    }
    
    /////////
    public void darMasaje(){
        System.out.println("Da un masaje de recuperacion (Clase Masajista)");
    }
}
