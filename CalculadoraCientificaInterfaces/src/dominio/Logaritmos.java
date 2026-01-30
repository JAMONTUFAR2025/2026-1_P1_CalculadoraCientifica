package dominio;

/* Clase para poder calcular logaritmos con un numero */
public class Logaritmos
{
    private double numero;
    private double resultado;

    public Logaritmos()
    {

    }

    public Logaritmos(double numero)
    {
        this.numero = numero;
    }

    public double getNumero()
    {
        return numero;
    }

    public void setNumero(double numero)
    {
        this.numero = numero;
    }

    public double getResultado()
    {
        return resultado;
    }

    public void setResultado(double resultado)
    {
        this.resultado = resultado;
    }
}
