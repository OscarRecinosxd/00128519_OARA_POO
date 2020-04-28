
using System;

namespace Laboratorio_06
{
    public class Laboratorio : Evaluacion
    {

        private String tipo;

        public Laboratorio(int porcentaje, string nombre, string tipo) : base(porcentaje, nombre)
        {
            this.tipo = tipo;
        }


        public override string ToString()
        {
            return "Laboratorio: " + $"{nameof(nombre)}: {nombre}, " + $"{nameof(tipo)}: {tipo}, " +$"{nameof(porcentaje)}: {porcentaje}% ";
        }
    }
}