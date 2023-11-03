/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_alejandrosussman;

import java.util.Scanner;

public class Lab4P1_AlejandroSussman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner og = new Scanner(System.in);
        char resp_m = 's';
        while (resp_m == 's' || resp_m == 's') {
            System.out.println("1. Inversion Especial");
            System.out.println("2. Balanza de Cadenas");
            System.out.println("3. Cifrado de Mensajes");
            System.out.println("Ingrese una opcion: ");
            int opcion_menu = og.nextInt();
            switch (opcion_menu) {
                case 1:
                    System.out.println(" Bienvenido a Inversion Espacial");
                    System.out.println("Ingrese la cadena que desea invertir: ");
                    og.nextLine();
                    String cad = og.nextLine();

                    if (cad.length() >= 5) {
                        String palabra = "";
                        for (int i = 0; i < cad.length(); i++) {
                            if (cad.charAt(i) == ' ') {
                                for (int j = palabra.length() - 1; j >= 0; j--) {
                                    System.out.print(palabra.charAt(j));
                                }
                                System.out.print(" ");
                                palabra = "";
                            } else {
                                palabra += cad.charAt(i);
                            }
                        }
                        if (palabra.length() > 0) {
                            for (int j = palabra.length() - 1; j >= 0; j--) {
                                System.out.print(palabra.charAt(j));
                            }
                        }

                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Bienvenido a Balanza de Cadenas");
                    System.out.println("Ingrese la cadena No.1");
                    og.nextLine();
                    String cadena1 = og.nextLine();
                    int acm = 0;
                    for (int i = 0; i < cadena1.length(); i++) {
                        char c = cadena1.charAt(i);
                        int num = c;
                        acm += num;
                    }
                    System.out.println("Ingrese la cadena No.2");
                    cadena1 = og.nextLine();
                    int acm1 = 0;
                    for (int i = 0; i < cadena1.length(); i++) {
                        char c = cadena1.charAt(i);
                        int num1 = c;
                        acm1 += num1;
                    }
                    System.out.println("Ingrese la cadena No.3");
                    cadena1 = og.nextLine();
                    int acm2 = 0;
                    for (int i = 0; i < cadena1.length(); i++) {
                        char c = cadena1.charAt(i);
                        int num2 = c;
                        acm2 += num2;
                    }

                    System.out.println("Peso de Cadena 1: " + acm);
                    System.out.println("Peso de Cadena 2: " + acm1);
                    System.out.println("Peso de Cadena 3: " + acm2);

                    if (acm > acm1 && acm > acm2) {
                        System.out.println("La cadena 1 es la mas pesada");
                    } else if (acm1 > acm && acm1 > acm2) {
                        System.out.println("La cadena 2 es la mas pesada");
                    } else if (acm2 > acm && acm2 > acm1) {
                        System.out.println("La cadena 3 es la mas pesada");
                    }

                    break;

                case 3:
                    System.out.println("Bienvenido a Cifrado de Mensajes");
                    System.out.println("Ingrese el mensaje a cifrar: ");
                    og.nextLine();
                    String cif = og.nextLine();

                    String encrypt = "";
                    for (int i = 0; i < cif.length(); i++) {
                        int let = 0;
                        char asci = cif.charAt(i);
                        let += asci + 2;
                        encrypt += (char) let;

                    }
                    System.out.println("El mensaje cifrado es: " + encrypt);
                    break;
                default:
                    System.out.println("Opcion no valida, seleccione otra opcion del 1-3");
                    break;

            }
            System.out.println("Desea ingresa otra opcion del menu[s/n]: ");
            resp_m = og.next().charAt(0);
        }
    }
}
