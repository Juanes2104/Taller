public class Empleado extends Persona {
    public Empleado(String nombre, String fecha_nacimiento, Integer edad) {
        super(nombre, fecha_nacimiento, edad);
    }
    @Override
    public void realizartarea(){
        System.out.println("Realizando tarea laboral");
    }
}
