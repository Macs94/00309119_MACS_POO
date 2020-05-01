using System;

namespace ProgramaEvaluaciones
{
    public class OutOfRangeException : Exception
    {
        public OutOfRangeException (string message) : base(message) {}
    }
}