package Carrera_Ciclista;

public class Contrarrelojista extends Ciclistas{

    private double Velocidad_maxima;

    public Contrarrelojista(String Nombre_ciclista, int Identificador, double Tiempo_acumulado, double Velocidad_maxima) {
        super(Nombre_ciclista, Identificador, Tiempo_acumulado);
        this.Velocidad_maxima = Velocidad_maxima;
    }

    private double Get_Velocidad_maxima(double Velocidad_maxima)  {
        return Velocidad_maxima;
    }

    private void Set_Velocidad_maxima(double Velocidad_maxima)    {
        this.Velocidad_maxima = Velocidad_maxima;
    }

    protected void Imprimir() {
        super.Imprimir();
        System.out.println("Velocidad maxima: " + Velocidad_maxima);
    }

    protected String Imprimir_tipo() {
        return "Contrarrelojista";
    }
}
