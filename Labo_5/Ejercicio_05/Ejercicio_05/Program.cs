using System;
using System.Collections.Generic;

namespace Ejercicio_05
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            string cadena = "";
            string aux ;
            byte opcion = 0;
            List<string> Lista = new List<string>();
            
            do {
                MostrarMenu();
                opcion = Convert.ToByte(Console.ReadLine());
                
                switch (opcion) {

                    case(1):
                        Console.Write("Ingrese la cadena: ");
                        
                        cadena = Console.ReadLine();

                        for(int i=0 ; i < (cadena.Length) ; i++){
                            aux="";
                            if(cadena[i]=='a'||cadena[i]=='e'||cadena[i]=='i'||cadena[i]=='o'||cadena[i]=='u'||
                               cadena[i]=='A'||cadena[i]=='E'||cadena[i]=='I'||cadena[i]=='O'||cadena[i]=='U'){
                                aux+=cadena[i];
                                Lista.Add(aux);
                            }
                        }

                        break;
                    
                    case(2):
                        Lista.ForEach(s =>{Console.Write(s+","); });
                        Console.WriteLine();
                        break;
                }

            } while (opcion != 3);
        }
        static void MostrarMenu(){
            Console.WriteLine("Opcion 1: Ingresar caracteres. ");
            Console.WriteLine("Opcion 2: Mostrar lista. ");
            Console.WriteLine("Opcion 3: Salir. ");
            Console.WriteLine();
        }
    }
    
}