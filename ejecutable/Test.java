package ejecutable;

import javax.swing.JOptionPane;

import modelo.Division;
import modelo.Multiplicacion;
import modelo.Resta;
import modelo.Suma;

public class Test {

    public static void main(String[]args)
    {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x" ));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y" ));

        //Creacion de un objeto suma
        Suma miSuma = new Suma(x, y);
        miSuma.Sumar();
        JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " en " + miSuma.mostrarResultado());
        
        //Creacion de un objeto resta
        Resta miResta = new Resta(x, y);
        miResta.Restar();
        JOptionPane.showMessageDialog(null, "La resta de " + x + " y " + y + " en " + miResta.mostrarResultado());
        
        //Creacion de un objeto Division
        Division miDivision = new Division(x, y);
        miDivision.Dividir();
        JOptionPane.showMessageDialog(null, "La division de " + x + " y " + y + " en " + miDivision.mostrarResultado());
          
        //Creacion de un objeto Multiplicacion
        Multiplicacion miMultiplicacion = new Multiplicacion(x, y);
        miMultiplicacion.Multiplicar();
        JOptionPane.showMessageDialog(null, "La Multiplicacion de " + x + " y " + y + " en " + miMultiplicacion.mostrarResultado());
            
        System.exit(0);
    }
    
}
