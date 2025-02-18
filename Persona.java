public class Persona {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Método para establecer la edad
    public void setEdad(int edad) {
        if (edad >= 0) { // Validación simple
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // Método para mostrar información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Persona persona1 = new Persona("Maria", 30);
        persona1.mostrarInformacion();

        persona1.setEdad(35);
        persona1.setNombre("Ana");
        persona1.mostrarInformacion();
    }
}