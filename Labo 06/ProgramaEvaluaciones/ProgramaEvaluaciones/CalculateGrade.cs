using System;
using System.Collections.Generic;

namespace ProgramaEvaluaciones
{
    public static class CalculateGrade
    {
        public static double Calculate(List<Evaluation> evs)
        {
            double TotalGrade=0.00;
            double grade1 = 0.00,grade2=0.00;
           
            evs.ForEach(obj =>
                {
                    try
                    {
                        Console.WriteLine("Ingrese la nota para la evaluación "+obj.Name+":");
                        grade1 = Double.Parse(Console.ReadLine());
                        grade2 = grade1 * (obj.Percentage) * 0.01;
                        TotalGrade += grade2;
                        if(grade1<0.00||grade1>10.00)
                            throw new InvalidGradeException("La nota ingresada no es valida");
                    }
                    catch(InvalidGradeException ex)
                    {
                        Console.WriteLine(ex);
                    }
                }

            );
            
            return TotalGrade;
        }
    }
}