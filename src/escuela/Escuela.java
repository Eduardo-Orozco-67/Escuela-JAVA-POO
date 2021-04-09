package escuela;

import java.util.Scanner;

/**
 *
 * @author Eduardo Orozco
 */
public class Escuela {

    private static int n;
    public static void numeroa()
    {
        Scanner j = new Scanner(System.in);
        System.out.print(" Ingrese el numero de Alumnos a registrar: ");
        n= j.nextInt();
    }

    private static int m;
    public static void numerom()
    {
        Scanner j = new Scanner(System.in);
        System.out.print(" Ingrese el numero de maestros a registrar: ");
        m= j.nextInt();
    }

 /**
  * @param args the command line arguments
  */

 public static void main(String[] args) {
  Alumnos [] a = new Alumnos[100];

  maestros [] b =  new maestros[100];

  Persona p = new Persona();

  Alumnos al1 = new Alumnos();

  int  res, nh, nq, nm;
  float des;
  //Scanner
  Scanner j = new Scanner(System.in);
  do {//do while de sub menu 3 para que se repita menu y no se salga en caso de opcion invalida
   System.out.println("\n-----Elige una opcion-----");
   System.out.println(" 1.-Guardar datos de los Alumnos");
   System.out.println(" 2.-Guardar datos de los Maestros");
   System.out.println(" 3.-Calcular el sueldo de los Maestros");
   System.out.println(" 4.-Ver que piensa una Persona y un Alumno ");
   System.out.println(" 5.-Ver datos de Alumnos y/o Maestros");
   System.out.println(" 6.-Salir");
   System.out.println();
   res = j.nextInt();
   System.out.println();

   //switch menu
   switch (res) {

    case 1:
     /*
     System.out.println(" Ud. eligio la opcion 1: ");
     System.out.println(" ");
     System.out.println(" --Guardar datos de los Alumnos--");
     System.out.println(" ");
     System.out.println(" Ingrese datos del Alumno ");
     al1.llenado();
     System.out.println(" ");
     System.out.println(" Ingrese datos del Alumno ");
     al2.llenado();
     System.out.println(" ");
     System.out.println(" Ingrese datos del Alumno ");
     al3.llenado();
     System.out.println(" ");*/
      numeroa();
     System.out.println(" ");
     for (int i = 0; i < n; i++)
     {
       a[i]= new Alumnos();
       System.out.println(" Datos del alumno "+ (i+1)+ ": ");
       System.out.println(" ");
       a[i].llenado();
       System.out.println(" ");
     }
      break;

   case 2:
       numerom();
       System.out.println(" ");
       for (int y = 0; y < m; y++)
       {
           b[y]= new maestros();
           System.out.println(" Datos del Maestro "+ (y+1)+ ": ");
           System.out.println(" ");
           b[y].llenado();
           System.out.println(" ");
       }

     break;

   case 3:

           System.out.println("Vamos a calcular el sueldo de los maestros");
           for (int k = 0; k < m; k++) {
               System.out.println("El maestro " + b[k].get_Nom());
               System.out.println(" Que contrato tiene?");
               System.out.println(" 1.- Semanal");
               System.out.println(" 2.- Quincenal");
               System.out.println(" 3.- Mensual");
               int opc = j.nextInt();
               switch (opc) {
                   case 1:
                       System.out.println("Cuantas horas trabajo?");
                       nh = j.nextInt();
                       b[k].Pago(nh);
                       break;
                   case 2:
                       System.out.println("Cuantas horas trabajo?");
                       nh = j.nextInt();
                       System.out.println("Cuantos dias de la quincena trabajo?");
                       nq = j.nextInt();
                       b[k].Pago(nh, nq);
                       break;
                   case 3:
                       System.out.println("Cuantas horas trabajo?");
                       nh = j.nextInt();
                       System.out.println("Cuantos meses trabajo?");
                       nm = j.nextInt();
                       System.out.println("Cuanto es de la cuota de permanencia?");
                       des = j.nextFloat();
                       b[k].Pago(nh, nm, des);
                       break;
                   default:
                       System.out.println("Error, Opcion Invalida, teclee una opcion correcta");
                       System.out.println(" ");
               }
           }

     break;

   case 4:
       System.out.println("Una persona normal piensa: ");
       p.pensar();
       System.out.println(" ");
       System.out.println("pero...");
       System.out.println("Los alumnos piensan\n");
       al1.pensar();
     break;

   case 5:
       System.out.println("Que registro desea ver");
       System.out.println(" 1.- Alumnos");
       System.out.println(" 2.- Maestros");
       int opc2 = j.nextInt();
       switch (opc2)
       {
           case 1:
               System.out.println(" ");
               for (int i = 0; i < n; i++) {
                   a[i].impresion();
               }
               break;
           case 2:
               System.out.println(" ");
               for (int k = 0; k < m; k++) {
                   b[k].impresion();
               }

               break;
       }
       System.out.println(" ");
      break;

   case 6:
       System.out.println("Adios, tenga buen dia, gracias por usar software de:");
       System.out.println("\t\tOROZOCO´S PROGRAMMING");
     break;

    default:
        System.out.println("Error, Opcion Invalida, teclee una opcion correcta");
        System.out.println(" ");
   }
  }while(res !=6);

}

}