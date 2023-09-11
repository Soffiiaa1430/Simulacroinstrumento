import java.util.HashMap;
	import java.util.Map;
	import javax.swing.JOptionPane;
public class Informacion {
	

	    private Map<String, Personas> mapPersonas;

	    public Informacion()  {
	        mapPersonas = new HashMap<>();
	    }

	    public void agregarPersona(String documento, String nombre, String edad, String profesion) {
	        if (!mapPersonas.containsKey(documento)) {
	            Personas persona = new Personas(nombre, documento, Integer.parseInt(edad), profesion);
	            mapPersonas.put(documento, persona);
	            JOptionPane.showMessageDialog(null, "La persona fue registrada exitosamente.");
	        } else {
	            JOptionPane.showMessageDialog(null, "La persona ya existe.", "Advertencia", JOptionPane.WARNING_MESSAGE);
	        }
	    }

	    private class Personas {
	        private String nombre;
	        private String documento;
	        private int edad;
	        private String profesion;

	        public Personas(String nombre, String documento, int edad, String profesion) {
	            this.nombre = nombre;
	            this.documento=documento;
	            this.edad=edad;
	            this.profesion=profesion;
	        }
	        public String getNombre() {
	            return nombre;
	        }

	        public String getDocumento() {
	            return documento;
	        }

	        public int getEdad() {
	            return edad;
	        }

	        public String getProfesion() {
	            return profesion;
	        }
	    }
	

}
