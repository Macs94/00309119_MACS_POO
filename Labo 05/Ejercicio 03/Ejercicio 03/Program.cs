using System;

namespace Ejercicio_03
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Cuantos elementos?");
            int n = int.Parse(Console.ReadLine());
            int j = 1;
            Secuencia(n,j);
        }

        public static void Secuencia(int n, int j)
        {
            if (j < n)
            {
                Console.Write(j);
                Secuencia(n,j+1);
            }
            Console.Write(j);
        }
    }
}