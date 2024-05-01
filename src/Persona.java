public class Persona {
    private String nombre;
    private String fecha_nacimiento;
    private Integer edad;
    private Integer año_actual;

    public Persona(String nombre, String fecha_nacimiento, Integer edad) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
        this.año_actual= año_actual;
    }
    public void realizartarea(){
        System.out.println("Elige el cargo que tienes");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Integer getEdad() {
        if (edad<0){
            return 0;
        } else {
            return edad;
        }
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getAño_actual() {
        return año_actual;
    }

    public void setAño_actual(Integer año_actual) {
        this.año_actual = año_actual;
    }

    public Integer calcular_fecha_nacimiento(){
        return año_actual-edad;
    }
}
