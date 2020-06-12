using System;
using System.Collections.Generic;

namespace Laboratorio10
{
    class Program
    {
        private delegate void MyDelegate(List<CuentaBancaria> p);

        static MyDelegate u;
        
        
        static void Main(string[] args)
        {
            
            byte op = 0;
            string menu = " 1. Agregar una cuenta \n 2. Ver cuentas almacenadas " +
                          "\n 3. Ver cuentas almacenadas y el total de las cuentas \n " +
                          "4. Ver cuentas almacenadas el total de las cuentas, " +
                          "y las cuentas de las personas que su nombre inicie con una vocal" +
                          "\n 5. Salir";
            String name;
            double balance;
            var Accounts = new List<CuentaBancaria>();

            do
            {
                op = 0;
                try
                {
                    Console.WriteLine(menu);
                    op = Convert.ToByte(Console.ReadLine());
                    
                u = new MyDelegate(ShowAccounts);
                
                
                switch (op)
                {
                    case 1:
                        Console.WriteLine("Ingrese el nombre del propietario");
                        name = Console.ReadLine();
                        Console.WriteLine("Ingrese el saldo");
                        balance = Convert.ToDouble(Console.ReadLine());
                        Accounts.Add(new CuentaBancaria(name,balance));
                        break;
                    
                    case 2:
                        u(Accounts);
                        break;
                    
                    case 3:
                        u += new MyDelegate(ShowAccountsLenght);
                        u(Accounts);
                        break;
                    
                    case 4:
                        
                        Action<List<CuentaBancaria>> AccountsAction = (u) =>
                        {
                            foreach (var a in u)
                            {
                                Console.WriteLine(a.ToString());
                            }
                        };
                
                        AccountsAction += (u) =>
                        {
                            {
                                Console.WriteLine("Cuentas almacenadas :" + u.Count);
                                Console.WriteLine();
                            }
                        };
                
                        AccountsAction += (u) =>
                        {
                            Console.WriteLine("Cuentas que su nombre inician con una vocal : ");
                            foreach (var a in u)
                            {
                                string b = a.Nombre1;
                                if(b.StartsWith("a") ||b.StartsWith("e") ||b.StartsWith("i") ||b.StartsWith("o") ||b.StartsWith("u")||
                                   b.StartsWith("A") ||b.StartsWith("E") ||b.StartsWith("I") ||b.StartsWith("O") ||b.StartsWith("U"))
                                    Console.WriteLine(a);
                            }
                        };
                        
                        AccountsAction.Invoke(Accounts);
                        break;
                    
                    case 5:
                        break;
                    
                }

                Console.WriteLine();
                Console.WriteLine();
                }
                catch (Exception )
                {
                    Console.WriteLine("opcion invalida");
                    
                }    
            }while(op != 5);
            
        }

        public static void ShowAccounts(List<CuentaBancaria> u)
        {
            foreach (var a in u)
            {
                Console.WriteLine(a.ToString());
            }
        }
        
        public static void ShowAccountsLenght(List<CuentaBancaria> u)
        {
            Console.WriteLine("Cuentas almacenadas :" + u.Count);
        }
    }
}