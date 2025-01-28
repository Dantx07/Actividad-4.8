package Carrera_Ciclista;
import java.util.*;


public class Equipo {

    private String Nombre;
    private String Nombre_equipo;
    private static double Suma_tiempos;
    private String Pais;
    Vector Lista_Equipo;

    Scanner scanner = new Scanner(System.in);

    public Equipo (String Nombre_equipo, String Pais)    {
        this.Nombre_equipo = Nombre_equipo;
        this.Pais = Pais;
        this.Nombre = Nombre;
        Suma_tiempos = 0;
        Lista_Equipo = new Vector();
    }

    private String Get_Nombre_equipo(String Nombre_equipo) {
        return Nombre_equipo;
    }

    private void Set_Nombre_equipo(String Nombre_equipo)    {
        this.Nombre_equipo = Nombre_equipo;
    }

    private String Get_Pais(String Pais)    {
        return Pais;
    }

    private void Set_Pais(String Pais)  {
        this.Pais = Pais;
    }

    void Imprimir() {
        System.out.println("\nNombre del equipo = " + Nombre_equipo);
        System.out.println("Pais = " + Pais);
        System.out.println("Total tiempo del equipo = " + Suma_tiempos);
    }

    void Añadir_ciclista(Ciclistas Ciclista)  {
        Lista_Equipo.add(Ciclista);
    }

    void Tiempo_total() {
        for (int i = 0; i < Lista_Equipo.size(); i++)   {
            Ciclistas c = (Ciclistas) Lista_Equipo.elementAt(i);
            Suma_tiempos = Suma_tiempos + c.Get_Tiempo_acumulado();
        }
    }

    void Imprimir_Ciclistas() {
        System.out.println("\nLos ciclistas son: ");
        for (int i = 0; i < Lista_Equipo.size(); i++) {
            Ciclistas c = (Ciclistas) Lista_Equipo.elementAt(i);
            System.out.println(c.Get_Nombre_ciclista());
       }
    }

    void Imprimir_datos_ciclista(String Nombre) {
        for (int i = 0; i < Lista_Equipo.size(); i++) {
            Ciclistas c = (Ciclistas) Lista_Equipo.elementAt(i);
            if (c.Get_Nombre_ciclista().equals(Nombre)) {
                System.out.println("El ciclista " + c.Get_Nombre_ciclista() + " Si existe");
                break;
            } else {
                if (i == Lista_Equipo.size()-1) {
                    System.out.println("El ciclista ingresado no existe");
                }
            }
        }
    }
}