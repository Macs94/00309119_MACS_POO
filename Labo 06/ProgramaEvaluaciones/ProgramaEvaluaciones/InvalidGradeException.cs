using System;

namespace ProgramaEvaluaciones
{
    public class InvalidGradeException : Exception
    {
        public InvalidGradeException(string message):base (message){}
    }
}