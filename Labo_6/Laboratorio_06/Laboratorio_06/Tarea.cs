using System;

namespace Laboratorio_06
{
    public class Tarea : Evaluacion
    {
        private DateTime FechaEntrega;

        public DateTime entrega1 => FechaEntrega;

        public Tarea(int porcentaje, string nombre, DateTime fechaEntrega) : base(porcentaje, nombre)
        {
            FechaEntrega = fechaEntrega;
        }

        public override string ToString()
        {
            return "Tarea: " + $"{nameof(nombre)}: {nombre}, " + $"{nameof(FechaEntrega)}: {FechaEntrega}, " + $"{nameof(porcentaje)}: {porcentaje}% ";
        }
    }
}