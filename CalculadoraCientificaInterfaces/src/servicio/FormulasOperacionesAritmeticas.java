package servicio;

import dominio.OperacionesAritmeticas;

import java.util.Scanner;

public class FormulasOperacionesAritmeticas implements IFormulas
{
    private OperacionesAritmeticas operacionesAritmeticas;
    private boolean valido;

    public FormulasOperacionesAritmeticas()
    {
        this.operacionesAritmeticas = new OperacionesAritmeticas();
        this.valido = true;
    }

    @Override
    public void subMenuOpciones(Scanner consola)
    {
        System.out.print("Ingrese el numero 1: ");
        operacionesAritmeticas.setNumero1(Double.parseDouble(consola.nextLine()));
        System.out.print("Ingrese el numero 2: ");
        operacionesAritmeticas.setNumero2(Double.parseDouble(consola.nextLine()));

        System.out.print("""
                === OPERACIONES ARITMETICAS ===
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Regresar
                """);
    }

    @Override
    public void ejecutarFormula(Scanner consola)
    {
        System.out.print("Opcion: ");
        var opcion = Integer.parseInt(consola.nextLine());

        var numero1 = operacionesAritmeticas.getNumero1();
        var numero2 = operacionesAritmeticas.getNumero2();

        switch(opcion)
        {
            case 1->
            {
                operacionesAritmeticas.setResultado(numero1 + numero2);
            }
            case 2->
            {
                operacionesAritmeticas.setResultado(numero1 - numero2);
            }
            case 3->
            {
                operacionesAritmeticas.setResultado(numero1 * numero2);
            }
            case 4->
            {
                if(numero2 != 0)
                {
                    operacionesAritmeticas.setResultado(numero1 / numero2);
                }
                else
                {
                    System.out.println("No se puede dividir entre 0.");
                    valido = false;
                }
            }
            case 5->
            {
                System.out.println("Has regresado.");
                valido = false;
            }
            default ->
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
            System.out.println("El resultado de la operacion aritmetica es: " + (operacionesAritmeticas.getResultado()));
        }
    }
}
