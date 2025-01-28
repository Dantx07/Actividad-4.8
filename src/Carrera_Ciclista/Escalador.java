package Carrera_Ciclista;

public class Escalador extends Ciclistas{

    private double Aceleracion_prom_sub;
    private double Grado_rampa;

    public Escalador(String Nombre_ciclista, int Identificador, double Tiempo_acumulado, double Aceleracion_prom_sub, double Grado_rampa) {
        super(Nombre_ciclista, Identificador, Tiempo_acumulado);
        this.Aceleracion_prom_sub = Aceleracion_prom_sub;
        this.Grado_rampa = Grado_rampa;
    }

    private double Get_Aceleracion_prom_sub(double Aceleracion_prom_sub)  {
        return Aceleracion_prom_sub;
    }

    private void Set_Aceleracion_prom_sub(double Aceleracion_prom_sub)    {
        this.Aceleracion_prom_sub = Aceleracion_prom_sub;
    }

    private double Get_Grado_rampa(double Grado_rampa)  {
        return Grado_rampa;
    }

    private void Set_Grado_rampa(double Grado_rampa) {
        this.Grado_rampa = Grado_rampa;
    }

    protected void Imprimir() {
        super.Imprimir();
        System.out.println("Aceleracion promedio en subida:" + Aceleracion_prom_sub);
        System.out.println("Grado de rampa soportada: " + Grado_rampa);
    }

    protected String Imprimir_tipo() {
        return "Escalador";
    }
}
