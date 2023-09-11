
	import java.util.HashMap;
	import java.util.Map;
	import javax.swing.JOptionPane;

	public class Procesos {
	    private Map<String, Persona> PersonasMap;

	    public Procesos() {
	        this.PersonasMap = new HashMap<>();
	        mostrarMenu();
	    }

	    private void mostrarMenu() {
	        int opcion = 0;
	        do {
	            String menuPpal = "Menú de Gestión del Sistema:\n";
	            menuPpal += "1. Registrar persona.\n";
	            menuPpal += "2. Total de personas registradas.\n";
	            menuPpal += "3. Cantidad de personas mayores de edad.\n";
	            menuPpal += "4. Cantidad de personas menores de edad.\n";
	            menuPpal += "5. Salir del programa.\n";
	            menuPpal += "Seleccione una opción: ";

	            opcion = Integer.parseInt(JOptionPane.showInputDialog(menuPpal));

	            switch (opcion) {
	                case 1:
	                    agregarPersona();
	                    break;
	                case 2:
	                    totalPersonasRegistradas();
	                    break;
	                case 3:
	                    cantidadMayores();
	                    break;
	                case 4:
	                    cantidadMenores();
	                    break;
	                case 5:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
	                    break;
	            }
	        } while (opcion != 5);
	    }

	    public void agregarPersona() {
	        String nombrePersona = JOptionPane.showInputDialog("Ingrese un nombre: ");
	        String documentoPersona = JOptionPane.showInputDialog("Ingrese el documento: ");
	        String edadPersona = JOptionPane.showInputDialog("Ingrese la edad: ");
	        String profesionPersona = JOptionPane.showInputDialog("Ingrese la profesión: ");

	        if (!PersonasMap.containsKey(documentoPersona)) {
	        
	            Persona persona = new Persona(nombrePersona, edadPersona, profesionPersona);
	            PersonasMap.put(documentoPersona, persona);

	            System.out.println("Persona registrada con éxito.");
	        } else {
	            System.out.println("La persona ya está registrada.");
	        }
	    }

	    public static void main(String[] args) {
	        new Procesos();
	    }
	    
	    private class Persona {
	        private String nombre;
	        private String edad;
	        private String profesion;

	        public Persona(String nombre, String edad, String profesion) {
	            this.nombre = nombre;
	            this.edad = edad;
	            this.profesion = profesion;
	        }
	    }

	   public void totalPersonasRegistradas() {
	    int total = PersonasMap.size();
	    System.out.println("Total de personas registradas: " + total);
	}
	   public void cantidadMayores() {
	    int edadLimite = 18; 
	    int contador = 0;

	    for (Persona persona : PersonasMap.values()) {
	        int edad = Integer.parseInt(persona.edad);
	        if (edad >= edadLimite) {
	            contador++;
	        }
	    }

	    System.out.println("Cantidad de personas mayores de " + edadLimite + " años: " + contador);
	}
	   public void cantidadMenores() {
	    int edadLimite = 18; 
	    int contador = 0;

	    for (Persona persona : PersonasMap.values()) {
	        int edad = Integer.parseInt(persona.edad);
	        if (edad < edadLimite) {
	            contador++;
	        }
	    }

	    System.out.println("Cantidad de personas menores de " + edadLimite + " años: " + contador);
	}
	}


