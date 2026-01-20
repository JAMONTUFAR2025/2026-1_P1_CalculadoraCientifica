package Calculadora.Logaritmos;

import Calculadora.MetodosGlobales.MetodosGlobales;

import java.util.Scanner;

public class Logaritmos
{
    Scanner sc;
    double n;

    public Logaritmos(Scanner sc, double n)
    {
        this.sc = sc;
        this.n = n;
    }

    public void logaritmos()
    {
        menu();
        int opcion = sc.nextInt();

        while(opcion < 0 || opcion > 2)
        {
            System.out.print("Ingrese una opcion valida: ");
            opcion = sc.nextInt();
        }

        switch(opcion)
        {
            case 1:
                logaritmoNatural();
                break;
            case 2:
                logaritmoBase10();
                break;
            case 0:
                MetodosGlobales.encabezado("HAS RETROCEDIDO");
                break;
        }
    }

    public void menu()
    {
        MetodosGlobales.encabezado("LOGARITMOS - OPCION");
        System.out.println("1. Logaritmo natural");
        System.out.println("2. Logaritmo de base 10");
        System.out.println("0. Retroceder");
        System.out.print("Opcion: ");
    }

    private void logaritmoNatural()
    {
        double resultado = Math.log(n);
        MetodosGlobales.encabezado("EL LOGARITMO NATURAL ES: " + (resultado));
    }

    private void logaritmoBase10()
    {
        double resultado = Math.log10(n);
        MetodosGlobales.encabezado("EL LOGARITMO DE BASE 10 ES: " + (resultado));
    }
}
