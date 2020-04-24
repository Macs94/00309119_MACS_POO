using System;

namespace Ejercicio_02
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            string fraseO, fraseI = "";
            Console.WriteLine("Escriba una frase para saber si es palindrome.");
            fraseO = Console.ReadLine();
            fraseO = fraseO.Replace(" ", "");
            Palindrome(fraseO, fraseI);

        }

        static Boolean Palindrome(string fraseO,string fraseI)
        {
            for (int i = fraseO.Length - 1; i >= 0; i--)
                fraseI = fraseI + fraseO[i];
            if (fraseO.Equals(fraseI))
            {
                Console.WriteLine("La frase es palindrome");
                return true;
            }
            else
            {
                Console.WriteLine("La frase no es palindrome");
                return false;
            }

        }
    }
}