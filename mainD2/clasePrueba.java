/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainD2;

import java.util.Scanner;
import mainD.cantanteFamoso;
import mainD.ListadeCantantesFamosos;
/**
 *
 * @author Usuario
 */
public class clasePrueba {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ListadeCantantesFamosos ob = new ListadeCantantesFamosos();
        
        System.out.println("BIENVENIDO A EL COMPARADOR DE VENTAS DE DISCOS: ");
        
        //ingresar primer artistas
        System.out.println("Ingrese datos del primer artista: ");
        System.out.println("Nombre del artista: ");
        String nom = sc.next();
        System.out.println("Codigo del artista: ");
        int cod = sc.nextInt();
        ob.ingresarCantante(cod, nom);
        System.out.println("Cuantos discos ingresara de este artista: ");
        int it = sc.nextInt();
        for(int i=0; i<it; i++){
        System.out.println("Ingrese disco " + (i+1) + " :");
        System.out.println("Nombre del disco: ");
        String nom3 = sc.next();
        int cod3 = i+1;
        System.out.println("Ventas: ");
        int ven3 = sc.nextInt();
        ob.ingresarDiscos(cod,nom3, ven3);
        }
        //ingresar segundo artista
        System.out.println("Ingrese datos del segundo artista: ");
        System.out.println("Nombre del artista: ");
        String nom1 = sc.next();
        System.out.println("Codigo del artista: ");
        int cod1 = sc.nextInt();
        ob.ingresarCantante(cod1, nom1);
        System.out.println("Cuantos discos ingresara de este artista: ");
        int it1 = sc.nextInt();
        for(int j=0; j<it1; j++){
        System.out.println("Ingrese disco " + (j+1) + " :");
        System.out.println("Nombre del disco: ");
        String nom12 = sc.next();
        int cod12 = j+1;
        System.out.println("Ventas: ");
        int ven12 = sc.nextInt();
        ob.ingresarDiscos(cod1,nom12, ven12);
        }
        
        //inicio del menu
        int opcion;
        

            do {

                System.out.println("\nseleccione que desea hacer: ");

                System.out.println("1. ingresar mas datos");

                System.out.println("2. imprimir lista actual ");

                System.out.println("3. buscar disco mas vendido por artista ");
                
                System.out.println("4. SALIR ");


                System.out.println("Por favor digita una opcion:");

                opcion = sc.nextInt();

                switch (opcion) {

                    case 1 :  {
                        System.out.println("Ingrese datos del artista: ");
                        System.out.println("Nombre del artista: ");
                        String nom2 = sc.next();
                        System.out.println("Codigo del artista: ");
                        int cod2 = sc.nextInt();
                        ob.ingresarCantante(cod2, nom2);
                        System.out.println("Cuantos discos ingresara de este artista: ");
                        int it2 = sc.nextInt();
                        for(int k=0; k<it2; k++){
                        System.out.println("Ingrese disco " + (k+1) + " :");
                        System.out.println("Nombre del disco: ");
                        String nom22 = sc.next();
                        int cod22 = k+1;
                        System.out.println("Ventas: ");
                        int ven22 = sc.nextInt();
                        ob.ingresarDiscos(cod2,nom22, ven22);
                        }
                            ob.imprimir();
                        break;
                    }
                    
                    case 3 :  {
                        ob.discoMasVendido();
                        break;
                    }
                    case 2 :  {
                        ob.imprimir();
                        break;
                    }
                    case 4 :  {
                        break;
                    }

                    default : {

                        System.out.println("Opcion incorrecta (◣_◢). Ingresa una opcion valida  ");

                    }

                }

            } while (opcion != 4);

            System.out.println("El menu ha finalizado correctamente. Vuelve pronto! (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ ");
        }
    }



