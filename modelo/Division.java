package modelo;

public class Division extends Operacion 
{
    // Constructor
    public Division(double x, double y)
    {
        super(x,y);
    }

    //Metodos
    public void Dividir()
    {
        resultados = x / y;
    }
}