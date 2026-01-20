package Calculadora;

import Calculadora.Logaritmos.Logaritmos;
import Calculadora.MetodosGlobales.MetodosGlobales;
import Calculadora.OperacionesAritmeticas.OperacionesAritmeticas;
import Calculadora.Trigonometria.Trigonometria;

import java.util.Scanner;

public class Calculadora
{
    Scanner sc;

    public Calculadora()
    {
        sc = new Scanner(System.in);
    }

    public void calculadora()
    {
        int opcion;

        do
        {
            menu();

            opcion = sc.nextInt();

            while(opcion < 0 || opcion > 3)
            {
                System.out.print("Ingrese una opcion valida: ");
                opcion = sc.nextInt();
            }

            switch(opcion)
            {
                case 1:
                    operacionesAritmeticas();
                    break;
                case 2:
                    trigonometria();
                    break;
                case 3:
                    logaritmos();
                    break;
                case 0:
                    MetodosGlobales.encabezado("HAS SALIDO");
                    break;
            }
        }
        while(opcion != 0);

        sc.close();
    }

    public void menu()
    {
        MetodosGlobales.encabezado("CALCULADORA CIENTIFICA");
        System.out.println("1. Operaciones aritmeticas");
        System.out.println("2. Trigonometria");
        System.out.println("3. Logaritmos");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
    }

    private void operacionesAritmeticas()
    {
        double n1, n2;

        MetodosGlobales.encabezado("OPERACIONES ARITMETICAS - ENTRADA");
        System.out.print("Ingrese el primer numero: ");
        n1 = sc.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        n2 = sc.nextDouble();

        OperacionesAritmeticas op = new OperacionesAritmeticas(sc, n1, n2);
        op.operacionesAritmeticas();
    }

    private void trigonometria()
    {
        double a;

        MetodosGlobales.encabezado("TRIGONOMETRIA - ENTRADA");
        System.out.print("Ingrese un angulo: ");
        a = sc.nextDouble();

        Trigonometria tri = new Trigonometria(sc, a);
        tri.trigonometria();
    }

    private void logaritmos()
    {
        double n;

        MetodosGlobales.encabezado("LOGARITMOS - ENTRADA");
        System.out.print("Ingrese un numero: ");
        n = sc.nextDouble();

        Logaritmos log = new Logaritmos(sc, n);
        log.logaritmos();
    }
}
