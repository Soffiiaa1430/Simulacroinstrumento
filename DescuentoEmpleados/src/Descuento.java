import javax.swing.JOptionPane;

public class Descuento {
	String estrato, nombreEmpleado;
	Double sueldo;
	
	public void main (String arg[]) {
		datos();
	}

	public void datos () {
		
		 nombreEmpleado = JOptionPane.showInputDialog("Ingrese un nombre: ");
		 estrato = JOptionPane.showInputDialog("Ingrese su estrato: ");
		 sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo: "));
		
		mostrarMenu(estrato);
	}
	
	
	public void mostrarMenu(String estrato) {
		Double DescuentoFinal= null;
		
            switch (estrato) {
                case "1":
                case "2": DescuentoFinal= 0.2; break;
                case "3": 
                case "4": DescuentoFinal= 0.4; break;
                case "5":DescuentoFinal= 0.8; break;
                case "6":DescuentoFinal= 0.10; break;
            }
            
            Double totalDescuento= sueldo * DescuentoFinal;
            Double TotalFinal= sueldo - totalDescuento;
            System.out.println("El descuento es de: "+totalDescuento);
            System.out.println("Este es el total final"+TotalFinal);
       
    }
	}
	


