using System;
using System.Collections.Generic;

namespace Meet2304
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            //List<Persona> p = new List<Persona>();
            var p = new List<Persona>();
            p.Add(new Persona("Mario","Calix",25 ));
            p.Add(new Persona("Felipe",edad:40 ));
            p.Add(new Persona(edad: 26 ));
            p.Add(new Persona(apellido:"Rodriguez" ));

            String buscar = "Mario";
            buscar = Console.ReadLine();
            
            p.ForEach(it =>
            {
                if (buscar.Equals(it.Nombre))
                {
                    Console.WriteLine("Nuevo nombre ");
                    it.Nombre = Console.ReadLine();
                    Console.WriteLine(it.ToString());
                }
            });
            int añadir = 12;
            int árbol = 14;

        }
        

    }
}