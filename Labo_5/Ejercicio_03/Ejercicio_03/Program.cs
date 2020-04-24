using System;

namespace Ejercicio_03
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("¿Hasta que numero quiere imprimir?  ");
            int n = Convert.ToInt32(Console.ReadLine());
            int a=1;
            Ascendente(n,a); a=n-1;
            Descendente(n,a);
        }
        static void Ascendente(int n,int a) {
            if (a == n + 1)
                return;
            else {
                Console.Write(a + ",");
                Ascendente(n, a + 1);
            }
        }
        
        static void Descendente(int n,int a) {
            if (a == 0)
                return;
            else {
                Console.Write(a + ",");
                Descendente(n, a - 1);
            }
        }
    }
}