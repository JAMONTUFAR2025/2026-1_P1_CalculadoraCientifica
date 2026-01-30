package servicio;

import dominio.Trigonometria;

import java.util.Scanner;

public class FormulasTrigonometria implements IFormulas
{
    private Trigonometria trigonometria;
    private boolean valido;

    public FormulasTrigonometria()
    {
        trigonometria = new Trigonometria();
    }

    @Override
    public void subMenuOpciones(Scanner consola)
    {
        System.out.print("Ingrese un angulo: ");
        trigonometria.setAngulo(Double.parseDouble(consola.nextLine()));

        System.out.print("""
                === TRIGONOMETRIA ===
                1. Seno
                2. Coseno
                3. Tangente
                4. Cosecante
                5. Secante
                6. Cotangente
                7. Regresar
                """);
    }

    @Override
    public void ejecutarFormula(Scanner consola)
    {
        System.out.print("Opcion: ");
        var opcion = Integer.parseInt(consola.nextLine());

        var angulo = trigonometria.getAngulo();

        switch(opcion)
        {
            case 1->
            {
                trigonometria.setResultado(Math.sin(Math.toRadians(angulo)));
            }
            case 2->
            {
                trigonometria.setResultado(Math.cos(Math.toRadians(angulo)));
            }
            case 3->
            {
                trigonometria.setResultado(Math.tan(Math.toRadians(angulo)));
            }
            case 4->
            {
                trigonometria.setResultado(1 / Math.sin(Math.toRadians(angulo)));
            }
            case 5->
            {
                trigonometria.setResultado(1 / Math.cos(Math.toRadians(angulo)));
            }
            case 6->
            {
                trigonometria.setResultado(1 / Math.tan(Math.toRadians(angulo)));
            }
            case 7->
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
            System.out.println("El resultado de la trigonometria es: " + (trigonometria.getResultado()));
        }
    }
}
