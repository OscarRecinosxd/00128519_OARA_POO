using System;

namespace Ejercicio_01
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("¿Cuantos terminos de fibonacci quiere imprimir? ");
            short n = Convert.ToInt16(Console.ReadLine());
            
            long Valor1 =1L;
            long Valor2 =0L;
            long Aux = 0L;
            for(int i=0; i<n ; i++){
                if(i==0)
                    Console.WriteLine("Termino numero 1 es 0"  );
                else {
                    Console.WriteLine("Termino numero " + (i + 1) + " es " + ((Valor1 + Valor2)));

                    Aux = Valor1;
                    Valor1 = Valor2;
                    Valor2 += Aux;
                }
            }
        }
    }
}