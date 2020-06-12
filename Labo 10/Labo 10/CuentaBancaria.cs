namespace Labo_10
{
    public class CuentaBancaria
    {
        private string nombre;
        private double balance;

        public CuentaBancaria(string nombre, double balance)
        {
            this.nombre = nombre;
            this.balance = balance;
        }

        public override string ToString()
        {
            return $"{nameof(nombre)}: {nombre}, {nameof(balance)}: {balance}";
        }

        public string Nombre
        {
            get => nombre;
            set => nombre = value;
        }

        public double Balance
        {
            get => balance;
            set => balance = value;
        }
    }
}