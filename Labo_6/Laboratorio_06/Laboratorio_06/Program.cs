using System;
using System.Collections.Generic;
using System.Linq;

namespace Laboratorio_06
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            String Menu = " 1. Agregar evaluación \n 2. Mostrar evaluaciones almacenadas \n 3. Eliminar evaluación \n 4. Terminar programa \n ";
            byte Opcion = 0;
            byte OpcionCase1 = 0;
            String AuxNombre = "";
            String AuxTipo = "";
            int AuxPorcentaje=0;
            int AuxPreguntas=0;
            int mes = 0;
            int dia = 0;
            int contadorPorcentaje=0;
            
            
            List<Evaluacion> Evaluaciones = new List<Evaluacion>();
            
            do
            {
                
                Console.WriteLine(Menu);
                
                try{Opcion = Convert.ToByte(Console.ReadLine());}
                catch(FormatException ex){Console.WriteLine("Ingresa un formato válido");}
                contadorPorcentaje=0;
                foreach (var s in Evaluaciones)
                {
                    contadorPorcentaje += s.Porcentaje;
                }
                
                switch (Opcion)
                {
                    case 1:
                        try
                        {
                            if (contadorPorcentaje < 100)
                            {
                                Console.WriteLine(
                                    "¿Que tipo de evaluacion va a agregar? \n 1.Laboratorio 2.Parcial 3.Tarea");
                                OpcionCase1 = Convert.ToByte(Console.ReadLine());
                                Console.WriteLine("Ingresa un formato valido");

                                if (OpcionCase1 == 1)
                                {
                                    Console.WriteLine("Ingrese el tipo de laboratorio");
                                    AuxTipo = Console.ReadLine();
                                    Console.WriteLine("Ingrese el nombre ");
                                    AuxNombre = Console.ReadLine();
                                    Console.WriteLine("Ingrese el porcentaje");
                                    AuxPorcentaje = Convert.ToInt32(Console.ReadLine());
                                    Evaluaciones.Add(new Laboratorio(AuxPorcentaje, AuxNombre, AuxTipo));

                                }
                                else if (OpcionCase1 == 2)
                                {
                                    Console.WriteLine("Ingrese la cantidad de preguntas");
                                    AuxPreguntas = Convert.ToInt32(Console.ReadLine());
                                    Console.WriteLine("Ingrese el nombre ");
                                    AuxNombre = Console.ReadLine();
                                    Console.WriteLine("Ingrese el porcentaje");
                                    AuxPorcentaje = Convert.ToInt32(Console.ReadLine());
                                    Evaluaciones.Add(new Parcial(AuxPorcentaje, AuxNombre, AuxPreguntas));
                                }
                                else if (OpcionCase1 == 3)
                                {
                                    Console.WriteLine("Ingrese el mes a entregar");
                                    try {
                                    mes = Convert.ToInt32(Console.ReadLine());
                                    Console.WriteLine("Ingrese el dia a entregar");
                                    dia = Convert.ToInt32(Console.ReadLine()); 
                                    Console.WriteLine("Ingrese el nombre ");
                                    AuxNombre = Console.ReadLine();
                                    Console.WriteLine("Ingrese el porcentaje");
                                    AuxPorcentaje = Convert.ToInt32(Console.ReadLine());
                                    DateTime AuxFecha = new DateTime(2020, mes, dia);
                                    Evaluaciones.Add(new Tarea(AuxPorcentaje, AuxNombre, AuxFecha));
                                    }
                                    catch (ArgumentOutOfRangeException ex)
                                    {
                                        Console.WriteLine("Ingrese datos validos");
                                    }
                                }
                                else Console.WriteLine("Ingrese una opción válida");
                            }
                            else Console.WriteLine("El porcentaje ya superó el 100%");
                        }
                        catch (FormatException ex)
                        {
                            Console.WriteLine("Ingresa un formato válido");
                        }



                        break;
                        
                    case 2:
                        foreach (var s in Evaluaciones)
                        {
                            Console.WriteLine(s.ToString());
                        }
                        break;
                    case 3:
                        Console.WriteLine("Ingrese el nombre de la evaluación a eliminar ");
                        AuxNombre = Console.ReadLine();

                        Evaluaciones.RemoveAll(s =>
                        {
                            if (s.Nombre.Equals(AuxNombre))
                                return true;
                            else
                                return false;
                        });

                        break;
                    case 4:
                        Console.WriteLine("Promedio final: " + CalcularNota.Calcular(Evaluaciones));
                        break;
                }
                
            } while (Opcion != 4);


        }
    }
}