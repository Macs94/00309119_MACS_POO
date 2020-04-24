using System;
using System.CodeDom;
using System.Collections;
using System.Runtime.InteropServices;
using System.Runtime.InteropServices.WindowsRuntime;
using System.Xml;

namespace Ejercicio_05
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            ArrayList vocales = new ArrayList();
            Console.WriteLine("Cuantas letras vas a ingresar?");
            int n = Int32.Parse(Console.ReadLine());
            int cont = 0;
            Console.WriteLine("Ingresa las letras y se imprimiran las vocales");
            while (n > cont)
            {
                char letra = Console.ReadLine()[0];
                cont++;
                if (letra == 'a' || letra == 'e' || letra == 'o' || letra == 'i' ||
                    letra == 'u'||letra == 'A' || letra == 'E' || letra == 'O' || letra == 'I' || letra == 'U')
                {
                    vocales.Add(letra);
                }
            }
            Console.WriteLine("Las vocales que ingresaste fueron "+ vocales.Count);
            foreach (var i in vocales)
            {
                Console.Write(i);
            }
            {
                
            }
        }
    }
}