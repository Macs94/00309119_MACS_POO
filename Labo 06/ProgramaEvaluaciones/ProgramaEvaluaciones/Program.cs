using System;
using System.Collections.Generic;
using System.Data.Common;
using System.Linq;
using System.Xml.Schema;
using ProgramaEvaluaciones.Properties;

namespace ProgramaEvaluaciones
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            var evs = new List<Evaluation>();
            int percentage, numbQuestions;
            DateTime dueDate;
            String name, type;
            int op = 0;
            do
            {
                try
                {
                    op = MainMenu();
                    if (op < 1 || op > 5)
                        throw new OutOfRangeException("Esa opcion no existe.");
                }
                catch (OutOfRangeException ex)
                {
                    Console.WriteLine(ex);
                }
                switch (op)
                {
                    case 1:
                        int op1 = 0;
                        do
                        {
                            try
                            {
                                double total = evs.Sum(obj => obj.Percentage);
                                op1 = SubMenu();
                                if (op1 < 1 || op1 > 4)
                                    throw new OutOfRangeException("Esa opcion no existe.");
                                if (total == 100)
                                    throw new MaxPercentageException("Ya no puede ingresar evaluaciones, " +
                                                                     "porcentaje maximo alcanzado");
                                
                            }
                            catch (OutOfRangeException ex)
                            {
                                Console.WriteLine(ex);
                            }
                            catch (MaxPercentageException ex)
                            {
                                Console.WriteLine(ex);
                                break;
                            }
                            switch (op1)
                                { 
                                    case 1:
                                        try
                                        {
                                            double total = evs.Sum(obj => obj.Percentage);
                                            Console.WriteLine("Ingrese el porcentaje");
                                            percentage = Int32.Parse(Console.ReadLine());
                                            if(total+percentage>100)
                                                throw new MaxPercentageException("Se sobrepasa el porcentaje máximo");
                                            Console.WriteLine("Ingrese el nombre");
                                            name = Console.ReadLine();
                                            Console.WriteLine("Ingrese el tipo");
                                            type = Console.ReadLine();
                                            evs.Add(new LabWork(percentage, name, type));
                                            
                                        }
                                        catch(MaxPercentageException ex)
                                        {
                                            Console.WriteLine(ex);
                                        }

                                        break;
                                    case 2:
                                        try
                                        {
                                            double total = evs.Sum(obj => obj.Percentage);
                                            Console.WriteLine("Ingrese el porcentaje");
                                            percentage = Int32.Parse(Console.ReadLine());
                                            if(total+percentage>100)
                                                throw new MaxPercentageException("Se sobrepasa el porcentaje máximo");
                                            Console.WriteLine("Ingrese el nombre");
                                            name = Console.ReadLine();
                                            Console.WriteLine("Ingrese la fecha de Entrega(dd/mm/yyyy):");
                                            string pattern = "dd/mm/yyyy";
                                            dueDate = DateTime.ParseExact(Console.ReadLine(), pattern, null);
                                            evs.Add(new Homework(percentage, name, dueDate));
                                        }
                                        catch(MaxPercentageException ex)
                                        {
                                            Console.WriteLine(ex);
                                        }

                                        break;
                                        
                                    case 3:
                                        try
                                        {
                                            double total = evs.Sum(obj => obj.Percentage);
                                            Console.WriteLine("Ingrese el porcentaje");
                                            percentage = Int32.Parse(Console.ReadLine());
                                            if(total+percentage>100)
                                                throw new MaxPercentageException("Se sobrepasa el porcentaje máximo");
                                            Console.WriteLine("Ingrese el nombre");
                                            name = Console.ReadLine();
                                            Console.WriteLine("Ingrese la cantidad de preguntas:");
                                            numbQuestions = Int32.Parse(Console.ReadLine());
                                            evs.Add(new Exam(percentage, name, numbQuestions));
                                        }
                                        catch (MaxPercentageException ex)
                                        {
                                            Console.WriteLine(ex);
                                        }

                                        break;
                                }
                        } while (op1 != 4);
                        break;
                    case 2:    
                        showEvaluations(evs);
                        break;
                    case 3:
                        deleteEvaluation(evs);
                        break;
                    case 4:
                        if (evs.Count == 0)
                        {
                            Console.WriteLine("La lista esta vacía");
                        }
                        else if(evs.Sum(obj=>obj.Percentage)==100)
                        {
                            Console.WriteLine("La nota final es de " +CalculateGrade.Calculate(evs));
                        }
                        else
                        {
                            Console.WriteLine("Debe agregar más evaluaciones antes de calcular la nota final");
                        }

                        break;

                }
            } while (op != 5);
        }



        public static int MainMenu()
        {
            int x = 0;
            Console.WriteLine("Escoja una opción");
            Console.WriteLine("1.Agregar Evaluación");
            Console.WriteLine("2.Mostrar Evaluaciones");
            Console.WriteLine("3.Eliminar Evaluación");
            Console.WriteLine("4.Terminar Programa");
            Console.WriteLine("5.Salir");
            x = Int32.Parse(Console.ReadLine());
            return x;
        }
        public static int SubMenu()
        {
            int x = 0;
            Console.WriteLine("Escoja un tipo");
            Console.WriteLine("1.Laboratorio");
            Console.WriteLine("2.Tarea");
            Console.WriteLine("3.Parcial");
            Console.WriteLine("4.Salir");
            x = Int32.Parse(Console.ReadLine());
            return x;
        }

        public static void showEvaluations(List<Evaluation> evs)
        {
            if (evs.Count == 0)
            {
                Console.WriteLine("La lista esta vacía");
            }
            else
            {
                evs.ForEach(e => Console.WriteLine(e.ToString()));
            }
        }

        public static void deleteEvaluation(List<Evaluation> evs)
        {
            
            bool findEvaluation = false;
            if (evs.Count == 0)
            {
                Console.WriteLine("No hay evaluaciones para eliminar");
            }
            else
            {
                Console.WriteLine("Digite el nombre de la evaluación a borrar");
                String nombre = Console.ReadLine(); 
                for (int i = 0; i < evs.Count; i++)
                {
                    if (evs[i].Name.Equals(nombre))
                    {
                        Console.WriteLine("Evaluacion "+evs[i].Name+" eliminada con exito");
                        evs.RemoveAt(i);
                        findEvaluation = true;
                        break;
                    }
                }

                if (!findEvaluation)
                {
                    Console.WriteLine("No se encontró una evaluación con ese nombre");
                }
            }
        }
    }
}


