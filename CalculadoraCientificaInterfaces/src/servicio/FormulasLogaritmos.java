package servicio;

import dominio.Logaritmos;
import dominio.OperacionesAritmeticas;

import java.util.Scanner;

public class FormulasLogaritmos implements IFormulas
{
    private Logaritmos logaritmos;
    private boolean valido;

    public FormulasLogaritmos()
    {
        logaritmos = new Logaritmos();
    }

    @Override
    public void subMenuOpciones(Scanner consola)
    {
        System.out.print("Ingrese un numero: ");
        logaritmos.setNumero(Double.parseDouble(consola.nextLine()));

        System.out.print("""
                === LOGARITMOS ===
                1. Logaritmo natural
                2. Logaritmo base 10
                3. Regresar
                """);
    }

    @Override
    public void ejecutarFormula(Scanner consola)
    {
        System.out.print("Opcion: ");
        var opcion = Integer.parseInt(consola.nextLine());

        var numero = logaritmos.getNumero();

        switch(opcion)
        {
            case 1->
            {
                logaritmos.setResultado(Math.log(numero));
            }
            case 2->
            {
                logaritmos.setResultado(Math.log10(numero));
            }
            case 3->
            {
                System.out.println("Has regresado.");
                valido = false;
            }
            default->
            {
                System.out.println("Opcion no valida, regresando...");
                valido = false;
            }
        }
    }

    @Override
    public void calcularResultado()
    {
        if(valido)
        {
            System.out.println("El resultado del logaritmo es: " + (logaritmos.getResultado()));
        }
    }
}
