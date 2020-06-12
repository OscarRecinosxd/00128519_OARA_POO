namespace Laboratorio10
{
    public class CuentaBancaria
    {
        private string Nombre ;
        private double SaldoActual;

        public string Nombre1 => Nombre;
        public CuentaBancaria(string nombre, double saldoActual)
        {
            Nombre = nombre;
            SaldoActual = saldoActual;
        }

        public override string ToString()
        {
            return $"{nameof(Nombre)}: {Nombre}, {nameof(SaldoActual)}: {SaldoActual}";
        }
    }

}