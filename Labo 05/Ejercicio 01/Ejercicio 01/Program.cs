using System;
namespace Ejercicio_01

{
  internal class Program
  {
    public static void Main(string[] args)
    {
      
      Console.WriteLine("Cuantos elementos?");
      int n = int.Parse(Console.ReadLine());
      int x = 0,y = 1;
      for (int i = 0; i < n; i++)
      {
        int suma = 0;
        Console.Write(x +";");
        suma = x + y;
        x = y;
        y = suma;
      }
    }
    
  }
}