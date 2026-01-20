package Calculadora.OperacionesAritmeticas;

import Calculadora.MetodosGlobales.MetodosGlobales;

import java.util.Scanner;

public class OperacionesAritmeticas
{
    Scanner sc;
    double n1, n2;

    public OperacionesAritmeticas(Scanner sc, double n1, double n2)
    {
        this.sc = sc;
        this.n1 = n1;
        this.n2 = n2;
    }

    public void operacionesAritmeticas()
    {
        menu();
        int opcion = sc.nextInt();

        while(opcion < 0 || opcion > 4)
        {
            System.out.print("Ingrese una opcion valida: ");
            opcion = sc.nextInt();
        }

        switch(opcion)
        {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            case 4:
                division();
                break;
            case 0:
                MetodosGlobales.encabezado("HAS RETROCEDIDO");
                break;
        }
    }

    public void menu()
    {
        MetodosGlobales.encabezado("OPERACIONES ARITMETICAS - OPCION");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multplicacion");
        System.out.println("4. Division");
        System.out.println("0. Retroceder");
        System.out.print("Opcion: ");
    }

    private void suma()
    {
        double resultado = n1 + n2;
        MetodosGlobales.encabezado("LA SUMA ES: " + (resultado));
    }

    private void resta()
    {
        double resultado = n1 - n2;
        MetodosGlobales.encabezado("LA RESTA ES: " + (resultado));
    }

    private void multiplicacion()
    {
        double resultado = n1 * n2;
        MetodosGlobales.encabezado("LA MULTIPLICACION ES: " + (resultado));
    }

    private void division()
    {
        if(n2 != 0)
        {
            double resultado = n1 / n2;
            MetodosGlobales.encabezado("LA DIVISION ES: " + (resultado));
        }
        else
        {
            MetodosGlobales.encabezado("NO SE PUEDE DIVIDIR ENTRE 0");
        }
    }
}
