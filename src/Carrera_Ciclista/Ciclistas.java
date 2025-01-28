package Carrera_Ciclista;

public abstract class Ciclistas{

    private int Identificador;
    private String Nombre_ciclista;
    private double Tiempo_acumulado;

    public Ciclistas(String Nombre_ciclista, int Identificador, double Tiempo_acumulado) {
        this.Nombre_ciclista = Nombre_ciclista;
        this.Identificador = Identificador;
        this.Tiempo_acumulado = Tiempo_acumulado;
    }

    abstract String Imprimir_tipo();

    protected int Get_identificador()   {
        return Identificador;
    }

    protected void Set_Identificador(int Identificador)  {
        this.Identificador = Identificador;
    }

    protected String Get_Nombre_ciclista()  {
        return Nombre_ciclista;
    }

    protected void Set_Nombre_ciclista(String Nombre_ciclista)  {
        this.Nombre_ciclista = Nombre_ciclista;
    }

    protected double Get_Tiempo_acumulado()  {
        return Tiempo_acumulado;
    }

    protected void Set_Tiempo_acumulado(double Tiempo_acumulado)    {
        this.Tiempo_acumulado = Tiempo_acumulado;
    }

    protected void Imprimir()   {
        System.out.println("Nombre del ciclista: " + Nombre_ciclista);
        System.out.println("Identificador: " + Identificador);
        System.out.println("Tiempo acumulado: " + Tiempo_acumulado);
    }
}
