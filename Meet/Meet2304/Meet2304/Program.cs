﻿using System;
using System.Collections.Generic;
using Meet2304.Properties;

namespace Meet2304
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            var p = new List<Persona>();
            
            p.Add(new Persona("Walter", "Rafael",20));
            p.Add(new Persona("Batar",edad: 19 ));
            p.Add(new Persona(edad: 22 ));
            p.Add(new Persona(apellido:"Morales" ));
            
            Console.Write("Agregar nombre a buscar ");
            String buscar = "Walter";
            buscar = Console.ReadLine();
            
            p.ForEach(it =>
            {
                if (buscar.Equals(it.Nombre))
                {
                    Console.WriteLine("Nuevo nombre: ");
                    it.Nombre=Console.ReadLine();
                    Console.WriteLine(it.ToString());
                }
            });

            int añadir = 12;
            int árbol = 14;


        }
    }
}