package com.OARA.x00128519;

import javax.swing.*;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        ArrayList<Item> PersonalItems = new ArrayList<>();
        ArrayList<Item> CommonItems = new ArrayList<>();
        byte opcion;

        String Auxlevel ="", Auxtype ="", Auxdescription ="" , Auxname="",AuxwielType="" ;

        int Auxweight = 0, AuxreuseTime = 0,Auxamount = 0, Auxtime = 0, AuxRemainingUses = 0,AuxLevelWeapon = 0,idAux=0  ;
        double Auxspeed = 0, Auxdamage = 0;
        boolean Auxequipped = false;




        do {

            opcion = Byte.parseByte(JOptionPane.showInputDialog(null, MenuPrincipal()));
            switch (opcion) {
                case 1:
                    //Agregar items
                    Auxtype = JOptionPane.showInputDialog(null, "¿Que tipo de item desea agregar? (Potion,Elixir,Ammo,Weapon)");
                    if (Auxtype.equalsIgnoreCase("Potion")) {
                        PersonalItems.add(AgregarPotion(Auxlevel, Auxtype, Auxdescription, Auxname, Auxweight, AuxreuseTime, Auxamount));
                        idAux++;
                        JOptionPane.showMessageDialog(null, "El id de la pocion es: " + idAux);
                    } else if (Auxtype.equalsIgnoreCase("Elixir")) {
                        PersonalItems.add(AgregarElixir(Auxname, Auxdescription, Auxlevel, Auxtype, AuxreuseTime, Auxweight, Auxamount, Auxtime));
                        idAux++;
                        JOptionPane.showMessageDialog(null, "El id del elixir es: " + idAux);
                    } else if (Auxtype.equalsIgnoreCase("Ammo")) {
                        PersonalItems.add(AgregarAmmo(Auxname, Auxweight, Auxdescription, AuxRemainingUses, Auxequipped));
                        idAux++;
                        JOptionPane.showMessageDialog(null, "El id de la municion es: " + idAux);
                    } else if (Auxtype.equalsIgnoreCase("Weapon")) {
                        PersonalItems.add(AgregarWeapon(Auxname, Auxweight, Auxdescription, AuxRemainingUses, Auxtype, AuxwielType, Auxspeed, Auxdamage, AuxLevelWeapon));
                        idAux++;
                        JOptionPane.showMessageDialog(null, "El id del arma es: " + idAux);
                    }
                    break;

                case 2:

                    int finalidAux = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID para compartir"));
                    PersonalItems.forEach(s -> {
                        if (s.id == finalidAux)
                            CommonItems.add(s);
                    });
                    break;

                case 3:
                    byte opcion2 = Byte.parseByte(JOptionPane.showInputDialog(null, " 1. Buscar en PersonalItems \n 2. Buscar en CommonItems"));

                    if (opcion2 == 1) {
                        finalidAux = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID para buscar"));
                        PersonalItems.forEach(s -> {
                            if (s.id == finalidAux)
                                JOptionPane.showMessageDialog(null, s.toString());
                        });
                    } else if (opcion2 == 2) {
                        finalidAux = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID para buscar"));
                        CommonItems.forEach(s -> {
                            if (s.id == finalidAux)
                                JOptionPane.showMessageDialog(null, s.toString());
                        });
                    }
                    break;

                case 4:
                    byte opcion3 = Byte.parseByte(JOptionPane.showInputDialog(null, " 1. Buscar en PersonalItems \n 2. Buscar en CommonItems"));

                    if (opcion3 == 1) {
                        String finalTipo = (JOptionPane.showInputDialog(null, "Ingrese el tipo de item a buscar"));
                        if (finalTipo.equalsIgnoreCase("Potion")) {
                            PersonalItems.forEach(s -> {
                                if (s instanceof Potion)
                                    JOptionPane.showMessageDialog(null, s.toString());
                            });
                        } else if (finalTipo.equalsIgnoreCase("Elixir")) {
                            PersonalItems.forEach(s -> {
                                if (s instanceof Elixir)
                                    JOptionPane.showMessageDialog(null, s.toString());
                            });
                        } else if (finalTipo.equalsIgnoreCase("Ammo")) {
                            PersonalItems.forEach(s -> {
                                if (s instanceof Ammo)
                                    JOptionPane.showMessageDialog(null, s.toString());
                            });
                        } else if (finalTipo.equalsIgnoreCase("Weapon")) {
                            PersonalItems.forEach(s -> {
                                if (s instanceof Weapon)
                                    JOptionPane.showMessageDialog(null, s.toString());
                            });
                        }

                    } else if (opcion3 == 2) {
                        String finalTipo2 = (JOptionPane.showInputDialog(null, "Ingrese el tipo de item a buscar"));
                        if (finalTipo2.equalsIgnoreCase("Potion")) {
                            CommonItems.forEach(s -> {
                                if (s instanceof Potion)
                                    JOptionPane.showMessageDialog(null, s.toString());
                            });
                        } else if (finalTipo2.equalsIgnoreCase("Elixir")) {
                            CommonItems.forEach(s -> {
                                if (s instanceof Elixir)
                                    JOptionPane.showMessageDialog(null, s.toString());
                            });
                        } else if (finalTipo2.equalsIgnoreCase("Ammo")) {
                            CommonItems.forEach(s -> {
                                if (s instanceof Ammo)
                                    JOptionPane.showMessageDialog(null, s.toString());
                            });
                        } else if (finalTipo2.equalsIgnoreCase("Weapon")) {
                            CommonItems.forEach(s -> {
                                if (s instanceof Weapon)
                                    JOptionPane.showMessageDialog(null, s.toString());
                            });
                        }
                    }
                    break;

                case 5:

                    byte opcion4 = Byte.parseByte(JOptionPane.showInputDialog(null, " 1. Buscar en PersonalItems \n 2. Buscar en CommonItems"));

                    if (opcion4 == 1) {
                        int finalopcionRemove = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingrese el ID para buscar"));
                        PersonalItems.removeIf(s -> {
                            if (s.id == finalopcionRemove)
                                return true;
                            else return false;
                        });

                    } else if (opcion4 == 2) {
                        int finalopcionRemove = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingrese el ID para buscar"));
                        CommonItems.removeIf(s -> {
                            if (s.id == finalopcionRemove)
                                return true;
                            else return false;
                        });
                    }break;
                case 6:
                    byte opcion5 = Byte.parseByte(JOptionPane.showInputDialog(null, " 1. Buscar en PersonalItems \n 2. Buscar en CommonItems"));

                    if (opcion5 == 1) {
                        String finalLista = (JOptionPane.showInputDialog(null, "Ingrese el tipo para borrar"));
                        if(finalLista.equalsIgnoreCase("Potion"))
                        PersonalItems.removeIf(s -> {
                            if (s instanceof Potion)
                                return true;
                            else return false;
                        });
                        else if (finalLista.equalsIgnoreCase("Elixir"))
                            PersonalItems.removeIf(s -> {
                                if (s instanceof Elixir)
                                    return true;
                                else return false;
                            });
                        else if (finalLista.equalsIgnoreCase("Ammo"))
                            PersonalItems.removeIf(s -> {
                                if (s instanceof Ammo)
                                    return true;
                                else return false;
                            });
                        else if (finalLista.equalsIgnoreCase("Weapon"))
                            PersonalItems.removeIf(s -> {
                                if (s instanceof Weapon)
                                    return true;
                                else return false;
                            });

                    } else if (opcion5 == 2) {
                        String finalLista = (JOptionPane.showInputDialog(null, "Ingrese el tipo para borrar"));
                        if(finalLista.equalsIgnoreCase("Potion"))
                            CommonItems.removeIf(s -> {
                                if (s instanceof Potion)
                                    return true;
                                else return false;
                            });
                        else if (finalLista.equalsIgnoreCase("Elixir"))
                            CommonItems.removeIf(s -> {
                                if (s instanceof Elixir)
                                    return true;
                                else return false;
                            });
                        else if (finalLista.equalsIgnoreCase("Ammo"))
                            CommonItems.removeIf(s -> {
                                if (s instanceof Ammo)
                                    return true;
                                else return false;
                            });
                        else if (finalLista.equalsIgnoreCase("Weapon"))
                            CommonItems.removeIf(s -> {
                                if (s instanceof Weapon)
                                    return true;
                                else return false;
                            });
                        break;


            }}


        }while (opcion != 7) ;
        }





    static String  MenuPrincipal(){
        return "1. Agregar ítem\n" + "2. Compartir ítem\n" + "3. Buscar ítem por ID \n" +
               "4. Buscar ítem por tipo\n" + "5. Borrar ítem por ID\n" +"6. Borrar ítem por tipo\n" + "7. Salir";
    }

    static Potion AgregarPotion(String Auxlevel,String Auxtype,String Auxdescription,String Auxname, int Auxweight, int AuxreuseTime,int Auxamount ){
        //Strings de potion
        Auxname        = (JOptionPane.showInputDialog(null,"Nombre de la potion"));
        Auxtype        = (JOptionPane.showInputDialog(null,"type de la potion (Mana, Life)"));
        Auxdescription = (JOptionPane.showInputDialog(null,"Descripcion de la potion"));
        Auxlevel       = (JOptionPane.showInputDialog(null,"nivel  de la potion (minor,normal,major)"));
        //Ints de potion
        Auxweight      = Integer.parseInt(JOptionPane.showInputDialog(null,"Peso de la potion"));
        AuxreuseTime   = Integer.parseInt(JOptionPane.showInputDialog(null,"Cooldown de la potion"));
        Auxamount      = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad "));

        return new Potion(Auxname,Auxweight,Auxdescription,AuxreuseTime,Auxlevel,Auxtype,Auxamount);
    }

    static Elixir AgregarElixir(String Auxname,String Auxdescription,String Auxlevel,String Auxtype,int AuxreuseTime,int Auxweight,int Auxamount,int Auxtime){
        Auxname        = (JOptionPane.showInputDialog(null,"Nombre del Elixir"));
        Auxtype        = (JOptionPane.showInputDialog(null,"type del Elixir  (Mana, Life)"));
        Auxdescription = (JOptionPane.showInputDialog(null,"Descricion del Elixir"));
        Auxlevel       = (JOptionPane.showInputDialog(null,"nivel del Elixir (minor,normal,major)"));
        //Ints de Elixir
        Auxweight      = Integer.parseInt(JOptionPane.showInputDialog(null,"Peso del Elixir"));
        AuxreuseTime   = Integer.parseInt(JOptionPane.showInputDialog(null,"Coolown del Elixir"));
        Auxamount      = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad "));
        Auxtime        = Integer.parseInt(JOptionPane.showInputDialog(null,"Tiempo de efecto "));


        return new Elixir(Auxname,Auxdescription,Auxlevel,Auxtype,AuxreuseTime,Auxweight,Auxamount,Auxtime);
    }

    static Ammo AgregarAmmo(String Auxname,  int Auxweight, String Auxdescription,int AuxRemainingUses, boolean Auxequipped){
        String Aux;
        Auxname        = (JOptionPane.showInputDialog(null,"Nombre del ammo"));
        Auxdescription = (JOptionPane.showInputDialog(null,"Descripcion del ammo"));
        Aux            = (JOptionPane.showInputDialog(null,"¿Esta equipada? (Si,No)"));
        if (Aux.equalsIgnoreCase("Si"))
            Auxequipped = true;
        else Auxequipped= false;
        //Ints de Ammo
        Auxweight      = Integer.parseInt(JOptionPane.showInputDialog(null,"Peso del ammo"));
        AuxRemainingUses   = Integer.parseInt(JOptionPane.showInputDialog(null,"Usos restantes"));
        return new Ammo(Auxname,Auxweight,Auxdescription,AuxRemainingUses,Auxequipped);

    }

    static Weapon AgregarWeapon(String Auxname,int Auxweight, String Auxdescription, int AuxRemainingUses,
                                String Auxtype,String AuxwielType,double Auxspeed, double Auxdamage, int AuxLevelWeapon){
        //
        Auxname        = (JOptionPane.showInputDialog(null,"Nombre de la Weapon"));
        Auxdescription = (JOptionPane.showInputDialog(null,"Descricion de la Weapon"));
        Auxtype        = (JOptionPane.showInputDialog(null,"Tipo de la Weapon (Bow,Sword,Staff,Orb,Dagger"));
        AuxwielType    = (JOptionPane.showInputDialog(null,"Wield type (One-Handed,Two-Handed)"));
        //
        Auxspeed           = Double.parseDouble(JOptionPane.showInputDialog(null,"Velocidad de la Weapon"));
        Auxdamage          = Double.parseDouble(JOptionPane.showInputDialog(null,"Daño de la Weapon"));
        AuxLevelWeapon     = Integer.parseInt(JOptionPane.showInputDialog(null,"Nivel de la Weapon"));
        Auxweight          = Integer.parseInt(JOptionPane.showInputDialog(null,"Peso de la Weapon"));
        AuxRemainingUses   = Integer.parseInt(JOptionPane.showInputDialog(null,"Usos restantes"));


        return new Weapon(Auxname,Auxweight,Auxdescription,AuxRemainingUses,Auxtype,AuxwielType,Auxspeed,Auxdamage,AuxLevelWeapon);

    }

}
