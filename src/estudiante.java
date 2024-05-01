public class estudiante extends Persona {
    private String grado;

    public estudiante(String nombre, String fecha_nacimiento, Integer edad, String grado) {
        super(nombre, fecha_nacimiento, edad);
        this.grado=grado;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    @Override
    public void realizartarea(){
        System.out.println("Realizando tarea escolar");
    }
}

