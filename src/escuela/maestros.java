package escuela;

import java.util.Scanner;

/**
 *
 * @author Eduardo Orozco 
 */

public class maestros extends Persona
{
    int pagofinal;
    String no_plaza;
    maestros()
    {
        super();
        no_plaza="NULL";
    }


    public void set_no_plaza(String no_plaza)
    {
        this.no_plaza = no_plaza;
    }

    public String get_noPlaza()
    {
        return no_plaza;
    }

    Scanner x = new Scanner(System.in);

    @Override
    public void llenado()
    {
        System.out.println("Dame el num de plaza del maestro:");
        set_no_plaza(x.next());
        super.llenado();
    }

    @Override
    public  void impresion()
    {
        System.out.print( " " + get_noPlaza() );
        super.impresion();
    }

    public void Pago(int h)
    {
      pagofinal= (h*5)*100;
        System.out.println(" Su sueldo es de: "+pagofinal);
    }

    public void Pago(int h, int nq)
    {
        pagofinal= (h*nq)*100;
        System.out.println(" Su sueldo es de: "+pagofinal);
    }

    public void Pago(int h, int nm, float d)
    {
        pagofinal= (int) (((h*nm)*100)-d);
        System.out.println(" Su sueldo es de: "+pagofinal);
    }


}
