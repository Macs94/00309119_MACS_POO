using System;

namespace ProgramaEvaluaciones
{
    public class Evaluation
    {
        protected int percentage;
        protected String name;
        
        public int Percentage => percentage;

        public string Name => name;

        public Evaluation(int percentage, string name)
        {
            this.percentage = percentage;
            this.name = name;
        }

        public override string ToString()
        {
            return $" Nombre: {name}, Porcentaje:{percentage} ";
        }
    }
}