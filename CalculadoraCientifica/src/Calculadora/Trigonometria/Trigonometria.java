package Calculadora.Trigonometria;

import Calculadora.MetodosGlobales.MetodosGlobales;

import java.util.Scanner;

public class Trigonometria
{
    Scanner sc;
    double a;

    public Trigonometria(Scanner sc, double a)
    {
        this.sc = sc;
        this.a = a;
    }

    public void trigonometria()
    {
        menu();
        int opcion = sc.nextInt();

        while(opcion < 0 || opcion > 6)
        {
            System.out.print("Ingrese una opcion valida: ");
            opcion = sc.nextInt();
        }

        switch(opcion)
        {
            case 1:
                seno();
                break;
            case 2:
                coseno();
                break;
            case 3:
                tangente();
                break;
            case 4:
                cosecante();
                break;
            case 5:
                secante();
                break;
            case 6:
                cotangente();
                break;
            case 0:
                MetodosGlobales.encabezado("HAS RETROCEDIDO");
                break;
        }
    }

    public void menu()
    {
        MetodosGlobales.encabezado("TRIGONOMETRIA - OPCION");
        System.out.println("1. Seno");
        System.out.println("2. Coseno");
        System.out.println("3. Tangente");
        System.out.println("4. Cosecante");
        System.out.println("5. Secante");
        System.out.println("6. Cotangente");
        System.out.println("0. Retroceder");
        System.out.print("Opcion: ");
    }

    private void seno()
    {
        double resultado = Math.sin(Math.toRadians(a));
        MetodosGlobales.encabezado("EL RESULTADO DE SENO ES: " + (resultado));
    }

    private void coseno()
    {
        double resultado = Math.cos(Math.toRadians(a));
        MetodosGlobales.encabezado("EL RESULTADO DE COSENO ES: " + (resultado));
    }

    private void tangente()
    {
        double resultado = Math.tan(Math.toRadians(a));
        MetodosGlobales.encabezado("EL RESULTADO DE TANGENTE ES: " + (resultado));
    }

    private void cosecante()
    {
        double resultado = 1 / Math.sin(Math.toRadians(a));
        MetodosGlobales.encabezado("EL RESULTADO DE COSECANTE ES: " + (resultado));
    }

    private void secante()
    {
        double resultado = 1 / Math.cos(Math.toRadians(a));
        MetodosGlobales.encabezado("EL RESULTADO DE SECANTE ES: " + (resultado));
    }

    private void cotangente()
    {
        double resultado = 1 / Math.tan(Math.toRadians(a));
        MetodosGlobales.encabezado("EL RESULTADO DE COTANGENTE ES: " + (resultado));
    }
}
