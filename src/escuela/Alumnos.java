package escuela;

import java.util.Scanner;

/**
 *
 * @author Eduardo Orozco
 */

public class Alumnos extends Persona {

    String matricula;
    Alumnos()
    {
        super();
        matricula="NULL";
    }

    public void set_mate(String matricula)
    {
        this.matricula = matricula;
    }

    public String get_mate()
    {
        return matricula;
    }


    Scanner x = new Scanner(System.in);

    @Override
    public void llenado() {
        System.out.println("Dame la matricula del Alumno:");
        set_mate(x.next());
        super.llenado();
    }


    @Override
    public void impresion(){
        System.out.print( " " + get_mate() );
        super.impresion();
    }

    @Override
    public void pensar(){
        System.out.println("Tengo actividades de la casa(barrer y trapear) " +
                "\nactividades en la escuela (un programa de POO, un ensayo de E y E ). " +
                "\nTengo que tener minimo 8 de promedio si no pierdo la beca"
                +"\nTengo que ir a direccion (tengo que entregar mis papeles de SS)");
    }
}
