using System;

namespace Ejercicio_04
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("Ingrese la cadena de texto: ");
            string Cadena = Console.ReadLine();
            Console.Write("Ingrese el caracter 'a' que quiere reemplazar: ");
            char a = Convert.ToChar(Console.ReadLine());
            Console.Write("Ingrese el caracter 'b' por el cual va a reemplazar el caracter 'a' :");
            char b = Convert.ToChar(Console.ReadLine());
            Console.Write(Cadena.Replace(a,b));
        }
    }
}