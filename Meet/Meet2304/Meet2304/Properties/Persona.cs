using System;

namespace Meet2304.Properties
{
    public class Persona
    {
        private String nombre, apellido;
        private int edad;

        public string Nombre
        {
            get => nombre;
            set => nombre = value;
        }
        
        

        public Persona(String nombre="nada", String apellido="nada", int edad=0)
        {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        public override string ToString()
        {
            return $"{nameof(nombre)}: {nombre}, {nameof(apellido)}: {apellido}, {nameof(edad)}: {edad}";
        }

        public String Saludar(String saludoP)
        {
            return nombre + " " + saludoP;
        }
    }
}