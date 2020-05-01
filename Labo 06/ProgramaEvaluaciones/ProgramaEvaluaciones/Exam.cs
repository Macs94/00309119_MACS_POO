namespace ProgramaEvaluaciones
{
    public class Exam : Evaluation
    {
        private int numbQuestions;

        public Exam(int percentage, string name, int numbQuestions) : base(percentage, name)
        {
            this.numbQuestions = numbQuestions;
        }
    }
}