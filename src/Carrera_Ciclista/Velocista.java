package Carrera_Ciclista;

public class Velocista extends Ciclistas{

    private double Potencia_promedio;
    private double Velocidad_promedio;

    public Velocista(String Nombre_ciclista, int Identificador, double Tiempo_acumulado, double Potencia_promedio, double Velocidad_promedio) {
        super(Nombre_ciclista, Identificador, Tiempo_acumulado);
        this.Potencia_promedio = Potencia_promedio;
        this.Velocidad_promedio = Velocidad_promedio;
    }

    private double Get_Potencia_promedio(double Potencia_promedio)  {
        return Potencia_promedio;
    }

    private void Set_Potencia_promedio(double Potencia_promedio)    {
        this.Potencia_promedio = Potencia_promedio;
    }

    private double Get_velocidad_promedio(double Velocidad_promedio)  {
        return Velocidad_promedio;
    }

    private void Set_Velocidad_promedio(double Velocidad_promedio)    {
        this.Velocidad_promedio = Velocidad_promedio;
    }

    protected void Imprimir() {
        super.Imprimir();
        System.out.println("Potencia promedio: " + Potencia_promedio);
        System.out.println("Velocidad promedio: " + Velocidad_promedio);
    }

    protected String Imprimir_tipo() {
        return "Velocista";
    }
}
