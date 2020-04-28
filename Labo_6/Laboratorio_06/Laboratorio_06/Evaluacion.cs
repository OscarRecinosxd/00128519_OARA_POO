using System;
using System.IO;

namespace Laboratorio_06
{
    public class Evaluacion
    {
        protected int porcentaje;
        protected String nombre;

        public Evaluacion(int porcentaje, string nombre)
        {
            this.porcentaje = porcentaje;
            this.nombre = nombre;
        }

        public int Porcentaje => porcentaje;
        public String Nombre => nombre;

        
    }
}