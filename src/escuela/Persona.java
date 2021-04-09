package escuela;

import java.util.Scanner;

/**
 * 
 * @author Eduardo Orozco 
 */

public class Persona {

    //Declaro lo que seran variables del constructor y metodos
    String nombre;
    int edad;

    String direccion;
    String telefono;


    Persona() {
        nombre = "NULL";
        edad = 0;
        direccion = "NULL";
        telefono = "NULL";
    }

    //metodos SET
    public void setNom(String nombre) {
        this.nombre = nombre;
    }

    public void setDirecc(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //metodos GET
    public String get_Nom() {
        return nombre;
    }

    public String get_Direccion() {
        return direccion;
    }

    public String get_Telefono() {
        return telefono;
    }

    public int get_Edad() {
        return edad;
    }

    Scanner x = new Scanner(System.in);

    //metodo llenado para la recoleccion de datos
    public void llenado() {
        System.out.println("Dame su nombre:  ");
        setNom(x.next());

        System.out.println("Dame su direccion: ");
        setDirecc(x.next());

        System.out.println("Dame su numero de telefono: ");
        setTelefono(x.next());

        System.out.println("Dame su edad: ");
        setEdad(x.nextInt());

    }

    //metodo impresion
    public  void impresion()
    {
        System.out.println("  " + get_Nom() + "  " + get_Direccion() + "   " + get_Telefono() + "  " + get_Edad());
    }
    //NOTA: metodo impresion y llenado aplico polimorfismo

    public void pensar()
    {
        System.out.println("Tengo actividades de la casa(barrer y trapear) " +
                "\nen el trabajo(un reporte a mi jefe). " +
                "\nTengo responsabilidades (Darle de comer a manchas)");
    }

}
