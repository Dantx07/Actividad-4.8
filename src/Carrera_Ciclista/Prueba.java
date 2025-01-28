package Carrera_Ciclista;
import java.util.*;

public class Prueba {
    public static void main (String[] Args) {

        ArrayList<ArrayList<Object>> Lista_ciclistas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("A continuacion rellenara algunos datos. \npor favor, rellene con los numeros de la opcion cuando sea posible, gracias.");
        System.out.println("Ingrese el nombre de su equipo");
        String Nombre_equipo = scanner.nextLine();
        System.out.println("Ingrese el pais de su equipo");
        String Pais = scanner.nextLine();
        Equipo Eq = new Equipo(Nombre_equipo, Pais);
        System.out.println("¿Cuantos velocistas tiene su equipo?");
        int Cant_vel = scanner.nextInt();
        System.out.println("¿Cuantos escaladores tiene su equipo?");
        int Cant_esc = scanner.nextInt();
        System.out.println("¿Cuantos contrarrelojistas tiene su equipo?");
        int Cant_con = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < Cant_vel; i ++) {
            System.out.println("\nIngrese el nombre de su velocista # " + (i+1) + " :");
            String Nombre_ciclista = scanner.nextLine();
            System.out.println("Ingrese el identificador de su velocista # " + (i+1) + " :");
            int Identificador = scanner.nextInt();
            System.out.println("Ingrese la potencia promedio de su velocista # " + (i+1) + " :");
            double Potencia = scanner.nextDouble();
            System.out.println("Ingrese la velocidad promedio de su velocista # " + (i+1) + " :");
            double Velocidad = scanner.nextDouble();
            System.out.println("Ingrese el tiempo acumulado del ciclista:");
            double Tiempo = scanner.nextDouble();
            scanner.nextLine();
            Velocista velo = new Velocista(Nombre_ciclista, Identificador, Tiempo, Potencia, Velocidad);
            velo.Set_Tiempo_acumulado(Tiempo);
            Eq.Añadir_ciclista(velo);
            ArrayList<Object> Sublista = new  ArrayList<>();
            Sublista.add(Nombre_ciclista);
            Sublista.add(Identificador);
            Sublista.add(Potencia);
            Sublista.add(Velocidad);
            Sublista.add(Tiempo);
            Lista_ciclistas.add(Sublista);
            }

        for (int i = 0; i < Cant_esc; i ++) {
            System.out.println("\nIngrese el nombre de su escalador # " + (i+1) + " :");
            String Nombre_ciclista = scanner.nextLine();
            System.out.println("Ingrese el identificador de su escalador # " + (i+1) + " :");
            int Identificador = scanner.nextInt();
            System.out.println("Ingrese la aceleracion promedio en subida de su escalador # " + (i+1) + " :");
            double Ac_prom_sub = scanner.nextDouble();
            System.out.println("Ingrese grado en rampa soportada de su escalador # " + (i+1) + " :");
            double Grado = scanner.nextDouble();
            System.out.println("Ingrese el tiempo acumulado del ciclista:");
            double Tiempo = scanner.nextDouble();
            scanner.nextLine();
            Escalador esca = new Escalador(Nombre_ciclista, Identificador, Tiempo, Ac_prom_sub, Grado);
            esca.Set_Tiempo_acumulado(Tiempo);
            Eq.Añadir_ciclista(esca);
            ArrayList<Object> Sublista = new  ArrayList<>();
            Sublista.add(Nombre_ciclista);
            Sublista.add(Identificador);
            Sublista.add(Ac_prom_sub);
            Sublista.add(Grado);
            Sublista.add(Tiempo);
            Lista_ciclistas.add(Sublista);
            }

        for (int i = 0; i < Cant_con; i ++) {
            System.out.println("\nIngrese el nombre de su contrarrelojista # " + (i+1) + " :");
            String Nombre_ciclista = scanner.nextLine();
            System.out.println("Ingrese el identificador de su contrarrelojista # " + (i+1) + " :");
            int Identificador = scanner.nextInt();
            System.out.println("Ingrese la velocidad maxima de su contrarrelojista # " + (i+1) + " :");
            double Velocidad = scanner.nextDouble();
            System.out.println("Ingrese el tiempo acumulado del ciclista:");
            double Tiempo = scanner.nextDouble();
            scanner.nextLine();
            Contrarrelojista contr = new Contrarrelojista(Nombre_ciclista, Identificador, Tiempo, Velocidad);
            contr.Set_Tiempo_acumulado(Tiempo);
            Eq.Añadir_ciclista(contr);
            ArrayList<Object> Sublista = new  ArrayList<>();
            Sublista.add(Nombre_ciclista);
            Sublista.add(Identificador);
            Sublista.add(Velocidad);
            Sublista.add(Tiempo);
            Lista_ciclistas.add(Sublista);
        }

        for (;;) {
            System.out.println("\n¿Que desea hacer? \n1. Verificar si un ciclista existe \n2. Obtener lista de ciclistas \n3. Verificar datos del equipo \n4. Salir");
            int Opcion = scanner.nextInt();
            scanner.nextLine();
            if (Opcion == 1) {
                System.out.println("Ingrese el nombre del ciclista: ");
                String Nombre = scanner.nextLine();
                Eq.Imprimir_datos_ciclista(Nombre);
                String Tipo = "";
                System.out.println("Quiere obtener los datos de este ciclista? \n1. Si \n2. No");
                if (scanner.nextInt() == 1) {
                    for (int i = 0; i < Eq.Lista_Equipo.size(); i++) {
                        Ciclistas c = (Ciclistas) Eq.Lista_Equipo.elementAt(i);
                        if (c.Get_Nombre_ciclista().equals(Nombre)) {
                            Tipo = c.Imprimir_tipo();
                        }
                    }
                    if (Tipo == "Velocista") {
                        for (ArrayList<Object> sublista : Lista_ciclistas) {
                            if (sublista.getFirst().equals(Nombre)) {
                                String nombre = (String) sublista.get(0);
                                int iden = (int) sublista.get(1);
                                double valor1 = (double) sublista.get(2);
                                double valor2 = (double) sublista.get(3);
                                double valor3 = (double) sublista.get(4);
                                Velocista velo = new Velocista(nombre, iden, valor3, valor1, valor2);
                                velo.Imprimir();
                            }
                        }
                    }   else if (Tipo == "Escalador") {
                        for (ArrayList<Object> sublista : Lista_ciclistas) {
                            if (sublista.getFirst().equals(Nombre)) {
                                String nombre = (String) sublista.get(0);
                                int iden = (int) sublista.get(1);
                                double valor1 = (double) sublista.get(2);
                                double valor2 = (double) sublista.get(3);
                                double valor3 = (double) sublista.get(4);
                                Escalador esca = new Escalador(nombre, iden, valor3, valor1, valor2);
                                esca.Imprimir();
                            }
                        }
                    }   else if (Tipo == "Contrarrelojista") {
                        for (ArrayList<Object> sublista : Lista_ciclistas) {
                            if (sublista.getFirst().equals(Nombre)) {
                                String nombre = (String) sublista.get(0);
                                int iden = (int) sublista.get(1);
                                double valor1 = (double) sublista.get(2);
                                double valor2 = (double) sublista.get(3);
                                Contrarrelojista contr = new Contrarrelojista(nombre, iden, valor2, valor1);
                                contr.Imprimir();
                            }
                        }
                    }
                }
            }   else if (Opcion == 2) {
                Eq.Imprimir_Ciclistas();
            }   else if (Opcion == 3) {
                Eq.Tiempo_total();
                Eq.Imprimir();
            }   else if (Opcion == 4) {
                break;
            }
        }
    }
}

//        Equipo Eq = new Equipo(Nombre_equipo, Pais);
//        System.out.println("Los datos de su equipo son: ");
//        Eq.Imprimir();