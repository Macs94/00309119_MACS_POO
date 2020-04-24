using System;
using System.ComponentModel;

namespace Ejercicio_04
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            String texto;
            Console.Write("Escriba una cadena de texto: ");
            texto = Console.ReadLine();
            Console.WriteLine("Cambiando las lertras 'a' por 'b'");
            texto = texto.Replace("a", "b");
            Console.Write("La cadena de texto modificada es: "+ texto);
        }
    }
}