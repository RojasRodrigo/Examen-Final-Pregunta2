// Clase abstracta Persona
abstract class Persona {
    protected String nombre;
    protected int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método abstracto para obtener la información de la persona
    public abstract String obtenerInformacion();
}

// Clase Estudiante que hereda de Persona
class Estudiante extends Persona {
    private String carrera;
    private int matricula;

    public Estudiante(String nombre, int edad, String carrera, int matricula) {
        super(nombre, edad);
        this.carrera = carrera;
        this.matricula = matricula;
    }

    @Override
    public String obtenerInformacion() {
        return "Estudiante: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera + ", Matrícula: " + matricula;
    }
}

// Clase Administrativo que hereda de Persona
class Administrativo extends Persona {
    private String puesto;
    private String departamento;

    public Administrativo(String nombre, int edad, String puesto, String departamento) {
        super(nombre, edad);
        this.puesto = puesto;
        this.departamento = departamento;
    }

    @Override
    public String obtenerInformacion() {
        return "Administrativo: " + nombre + ", Edad: " + edad + ", Puesto: " + puesto + ", Departamento: " + departamento;
    }
}

// Clase Docente que hereda de Persona
class Docente extends Persona {
    private String especialidad;
    private int añosExperiencia;

    public Docente(String nombre, int edad, String especialidad, int añosExperiencia) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String obtenerInformacion() {
        return "Docente: " + nombre + ", Edad: " + edad + ", Especialidad: " + especialidad + ", Años de experiencia: " + añosExperiencia;
    }
}

// Clase principal para probar las subclases
public class Main {
    public static void main(String[] args) {
        // Creación de objetos de ejemplo
        Estudiante estudiante = new Estudiante("Ana García", 20, "Ingeniería", 12345);
        Administrativo administrativo = new Administrativo("Luis Gómez", 35, "Coordinador", "Recursos Humanos");
        Docente docente = new Docente("María Pérez", 45, "Matemáticas", 15);

        // Imprimir información
        System.out.println(estudiante.obtenerInformacion());
        System.out.println(administrativo.obtenerInformacion());
        System.out.println(docente.obtenerInformacion());
    }
}
