using System;

namespace Ejercicio_02
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("Ingrese la frase para verificar si es palindrome:  ");
            string Frase = Console.ReadLine();
            string CadenaInvertida = "";
            string FraseAux = Frase.Replace(".", "");
            FraseAux = FraseAux.Replace(",", "");
            FraseAux = FraseAux.Replace(" ", "");
            FraseAux = FraseAux.Trim();

            for(int x = (FraseAux.Length - 1); x >= 0; --x) {
                CadenaInvertida +=  FraseAux[x];
                
            }
            
            Cadenas(FraseAux, CadenaInvertida);
        }

         static void Cadenas(String FraseAux, String CadenaInvertida) {
            if (FraseAux.Equals(CadenaInvertida,StringComparison.InvariantCultureIgnoreCase)) {
                Console.WriteLine("La frase es palindrome ");
            }
            else
                Console.WriteLine("La frase no es palindrome");
        }
    }
}