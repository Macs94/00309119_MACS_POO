using System;

namespace ProgramaEvaluaciones
{
    public class LabWork : Evaluation
    {
        private String type;

        public LabWork(int percentage, string name, string type) : base(percentage, name)
        {
            this.type = type;
        }
    }
}