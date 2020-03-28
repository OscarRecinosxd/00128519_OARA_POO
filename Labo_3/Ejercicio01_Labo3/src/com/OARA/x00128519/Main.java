package com.OARA.x00128519;

import javax.swing.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<Ticket> Tickets = new ArrayList<>();
        ArrayList<Ticket> TicketsGanancia = new ArrayList<>();
        String AuxPlaca;
        String Salida;
        byte opcion=0;
        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog(null,Menu()));
            switch(opcion) {
                //Ingresar automovil
                case 1:
                Tickets.add(new Ticket(IngresarAuto()));
                Tickets.toString();
                    break;
                //Salir del parqueo
                case 2:
                    //se piden los datos para buscar el ticket e eliminarlo
                    AuxPlaca = (JOptionPane.showInputDialog(null,"Ingrese el numero de placa"));
                    Salida =   (JOptionPane.showInputDialog(null,"Ingrese la hora de salida (formato HH:MM) ej. 07:30, formato 24Hs "));
                    //variables finales para la funcion lambda
                    String finalPlaca2 = AuxPlaca;
                    String finalSalida = Salida;
                    //Se elimina el ticket si esta yse muestra el rpecio
                    Tickets.removeIf(s -> {
                        if(s.getAuto().getPlaca().equalsIgnoreCase(finalPlaca2)){
                            //se agrega la salida para calcular los minutos que han pasado
                            s.setSalida(finalSalida);
                            //se llama la funcion para calcular los minutos y manda a llamar la funcion que muestra el precio
                            JOptionPane.showMessageDialog(null,"El monto total es de $" + Precioxd(s)+" USD");
                            //funcion para agregar monedas
                            if(Precioxd(s) == 0){

                            }
                            else {
                                s = AgregarMonedas(s, new Moneda());
                                s.getMonedas().consultarTotal();
                                s.setPrecio(Precioxd(s));
                                if (s.getMonedas().consultarTotal() > s.getPrecio()) {
                                    JOptionPane.showMessageDialog(null, "Su vuelto es $" + (s.getMonedas().consultarTotal() - s.getPrecio())+" USD");
                                    s.getMonedas().setTotal(s.getPrecio());
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Su vuelto es $0.00 USD");
                                }
                                TicketsGanancia.add(s);
                            }
                            return true;
                        } else return false ; });

                    break;


                //Consultar ticket
                case 3:
                    AuxPlaca = (JOptionPane.showInputDialog(null,"Ingrese el numero de placa"));
                    String finalPlaca = AuxPlaca;
                    //funcion lamba para buscar el ticket por el numero de placa
                    Tickets.forEach(s -> {
                        if(s.getAuto().getPlaca().equalsIgnoreCase(finalPlaca))
                            //se muestra el contenido del ticket
                            JOptionPane.showMessageDialog(null, s.toString());
                        else return;
                    });


                    break;
                //Salir
                case 4:
                    double finalGanancia = 0;
                    finalGanancia += TicketsGanancia.stream().mapToDouble(s -> s.getMonedas().getTotal()).sum();
                    JOptionPane.showMessageDialog(null,"La ganancia total es $ "+finalGanancia+" USD");
                    break;
                //opcion improvisada para ver los tickets en la lista

                case 5: break;

                default:
            }
        }while(opcion !=5);

}
    static String  Menu(){
        return "1. Ingresar automovil \n" + "2. Salir del parqueo\n" + "3. Consultar ticket\n" + "4. Consultar ganancia\n" + "5. Salir";
}

    static Automovil IngresarAuto(){
        String AuxPlaca;
        String AuxEntrada;
        AuxPlaca = (JOptionPane.showInputDialog(null,"Ingrese el numero de placa"));
        AuxEntrada = (JOptionPane.showInputDialog(null,"Ingrese la hora de entrada (formato HH:MM) ej. 05:30, formato 24Hs "));

        return new Automovil(AuxPlaca,AuxEntrada);
    }

    static double Precioxd (Ticket ticket){
        //se pasan los Strings del objeto ticket a enteros para poder calcular los minutos pasados

        int AuxHoras      =Integer.parseInt(ticket.getAuto().getEntrada().substring(0,2));
        int AuxMinutos    =Integer.parseInt(ticket.getAuto().getEntrada().substring(3));
        int AuxHoras2     =Integer.parseInt(ticket.getSalida().substring(0,2));
        int AuxMinutos2   =Integer.parseInt(ticket.getSalida().substring(3));
        int MinutosDiferencia=0;
        int MinutosdeHorasEntrada=0;
        int MinutosdeHoras=0;
        //se calculan los minutos
        MinutosdeHoras = ((AuxHoras2*60) + AuxMinutos2);
        MinutosdeHorasEntrada = ((AuxHoras*60) + AuxMinutos);
        //minutosDiferencia contiene los minutos pasados
        MinutosDiferencia = (MinutosdeHoras - MinutosdeHorasEntrada);
        double AuxPrecio =0;
        //se comparan para definir el precio final del ticket
        if ( MinutosDiferencia < 30 )
            AuxPrecio = 0;
        else if(MinutosDiferencia<60)
            AuxPrecio = 0.5;
        else if (MinutosDiferencia<120)
            AuxPrecio = 1;
        else if(MinutosDiferencia>=120)
            AuxPrecio = 5;
        //se retorna el precio
        return AuxPrecio;

    }
    static Ticket AgregarMonedas(Ticket ticket,Moneda monedas){
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        JTextField field4 = new JTextField();
        JTextField field5 = new JTextField();
        Object[] message = {
                "Ingresa el numero de monedas de centavo :", field1,
                "Ingresa el numero de monedas de cinco :", field2,
                "Ingresa el numero de monedas de diez :", field3,
                "Ingresa el numero de monedas de coras :", field4,
                "Ingresa el numero de monedas de dolar :", field5,
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Ingrese sus monedas, rellene con 0 si no ingresa ", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION)
        {
            monedas.agregarCentavos(Integer.parseInt(field1.getText()));
            monedas.agregarCincos(Integer.parseInt(field2.getText()));
            monedas.agregarDieces(Integer.parseInt(field3.getText()));
            monedas.agregarCoras(Integer.parseInt(field4.getText()));
            monedas.agregarDolares(Integer.parseInt(field5.getText()));
        }
        ticket.setMonedas(monedas);

        return ticket;
    }

}
