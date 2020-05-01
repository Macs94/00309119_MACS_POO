using System;

namespace ProgramaEvaluaciones
{
    public class Homework : Evaluation
    {
        private DateTime dueDate;

        public Homework(int percentage, string name, DateTime dueDate) : base(percentage, name)
        {
            this.dueDate = dueDate;
        }
    }
}