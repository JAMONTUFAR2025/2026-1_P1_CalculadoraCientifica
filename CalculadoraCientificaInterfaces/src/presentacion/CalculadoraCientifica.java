package presentacion;

import servicio.FormulasLogaritmos;
import servicio.FormulasOperacionesAritmeticas;
import servicio.FormulasTrigonometria;
import servicio.IFormulas;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraCientifica
{
    public static void main(String[] args)
    {
        // Variables
        var salir = false;
        var consola = new Scanner(System.in);

        // Implementacion de formulas
        ArrayList<IFormulas> formulas = new ArrayList<IFormulas>();

        formulas.add(new FormulasOperacionesAritmeticas());
        formulas.add(new FormulasLogaritmos());
        formulas.add(new FormulasTrigonometria());

        // Bucle
        while(!salir)
        {
            try
            {
                mostrarMenu();
                salir = ejecutarFormula(consola, formulas);
                System.out.println("...");
            }
            catch(Exception e)
            {
                System.out.println("Ocurrio un error: " + (e.getMessage()));
            }
        }
    } // Fin main

    private static void mostrarMenu()
    {
        System.out.print("""
                === CALCULADORA CIENTIFICA ===
                1. Operaciones Aritmeticas
                2. Logaritmos
                3. Trigonometria
                4. Salir
                """);
    } // Mostrar menu

    private static boolean ejecutarFormula(Scanner consola, ArrayList<IFormulas> formulas)
    {
        System.out.print("Opcion: ");
        var opciones = Integer.parseInt(consola.nextLine());
        var indice = opciones - 1;
        var salir = false;

        switch(opciones)
        {
            case 1:
            case 2:
            case 3:
            {
                formulas.get(indice).subMenuOpciones(consola);
                formulas.get(indice).ejecutarFormula(consola);
                formulas.get(indice).calcularResultado();
                break;
            } // 1, 2 y 3
            case 4:
            {
                System.out.println("Has salido.");
                salir = true;
                break;
            } // 4
            default:
            {
                System.out.println("Opcion no valida...");
            } // default
        }

        return salir;
    } // Ejecutar formula
}
