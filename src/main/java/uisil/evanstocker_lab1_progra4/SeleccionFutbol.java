//Evans Tocker Sánchez Laboratorio#1 Progra4
package uisil.evanstocker_lab1_progra4;


public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {
    //atributos
    protected int id; 
    protected String nombre;
    protected String apellidos; 
    protected int edad; 
    
    //constructor vacio y con parametros

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Metodos de la Interface (tengo que escribirlos manualmente para traerlos)
    @Override
    public abstract void concentrarse();
    
    @Override
    public abstract void viajar();
    
    @Override
    public abstract void entrenar();
    
    @Override
    public abstract void jugarPartido();
    
    
}
