using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;

namespace Labo_10
{
    internal class Program
    {
        private delegate void MyDelegate(List<CuentaBancaria> c);
        static MyDelegate ConsultaCuentas;
        public static void Main(string[] args)
      
        {
           
            var cuentas = new List<CuentaBancaria>();
            int op = 0;
            double balance = 0.00;
            string name;
            do
            {
                op = Menu();
                switch (op)
                {
                    case 1:
                        Console.Write("Digite el nombre del cliente: ");
                        name = Console.ReadLine();
                        Console.Write("Digite el saldo de la cuenta: ");
                        balance = Double.Parse(Console.ReadLine());
                        cuentas.Add(new CuentaBancaria(name, balance));
                        break;

                    case 2:
                        showCuentas(cuentas);
                        sumBalance(cuentas);
                        break;

                    case 3:
                        ConsultaCuentas = showCuentas;
                        ConsultaCuentas += sumBalance;
                        ConsultaCuentas.Invoke(cuentas);
                        break;

                    case 4:
                        Action<List<CuentaBancaria>> AccountAction = (account) =>
                        {
                            account.ForEach(element => Console.WriteLine($"Nombre:{element.Nombre} " +
                                                                         $"Saldo:{element.Balance}"));
                        };
                        AccountAction += (account) =>
                        {
                            double suma = 0.00;
                            account.ForEach(element=> suma += element.Balance);
                            Console.WriteLine("Suma de saldos: "+suma);
                        };
                        AccountAction += (account) =>
                        {
                            account.ForEach(element =>
                            {
                                if (element.Nombre[0] == 'A' || element.Nombre[0] == 'a' || element.Nombre[0] == 'E' ||
                                    element.Nombre[0] == 'e' || element.Nombre[0] == 'I' || element.Nombre[0] == 'i' ||
                                    element.Nombre[0] == 'O' || element.Nombre[0] == 'o' || element.Nombre[0] == 'U' ||
                                    element.Nombre[0] == 'u')
                                    Console.WriteLine(element.ToString());
                            });
                        };
                        AccountAction.Invoke(cuentas);

                        break;
                }
            } while (op != 0);
        }

        public static int Menu()
        {
            int x;
            Console.WriteLine("Escoja una opción: ");
            Console.WriteLine("1.Agregar cuenta: ");
            Console.WriteLine("2.Consultar cuentas: ");
            Console.WriteLine("3.Consultar cuentas y saldo total(Delegate): ");
            Console.WriteLine("4.Consultar cuentas,saldo total y cuentas pertenecientes a clientes cuyo nombre " +
                              "inicia con vocal(Action): ");
            Console.WriteLine("0.Salir");
            
            return x = Int32.Parse(Console.ReadLine());
        }

        public static void showCuentas(List<CuentaBancaria> cc)
        {
            if(cc.Count==0)
                Console.WriteLine("La lista está vacía");
            else
            {
                cc.ForEach(compte => Console.WriteLine(compte.ToString()));
            }
        }

        public static void sumBalance(List<CuentaBancaria> ccc)
        {
            double suma = 0.00;
            ccc.ForEach(compte=> suma += compte.Balance);
            Console.WriteLine($"Suma de todos los saldos: ${suma}");
        }
    }
}