package Calculadora.MetodosGlobales;

public class MetodosGlobales
{
    public static void encabezado(String texto)
    {
        System.out.println("=========================================");
        System.out.println(texto);
        System.out.println("=========================================");
    }

    public static void limpiarConsola()
    {
        for(int i = 0; i < 60; i++)
        {
            System.out.print("\n");
        }
    }
}
