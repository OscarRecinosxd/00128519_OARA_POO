namespace Laboratorio_06
{
    public class Parcial : Evaluacion
    {
        private int cantPreguntas;

        public Parcial(int porcentaje, string nombre, int cantPreguntas) : base(porcentaje, nombre)
        {
            this.cantPreguntas = cantPreguntas;
        }

        public override string ToString()
        {
            return "Parcial: " + $"{nameof(nombre)}: {nombre}, " + $"{nameof(cantPreguntas)}: {cantPreguntas}, " + $"{nameof(porcentaje)}: {porcentaje}% ";
        }
    }
}