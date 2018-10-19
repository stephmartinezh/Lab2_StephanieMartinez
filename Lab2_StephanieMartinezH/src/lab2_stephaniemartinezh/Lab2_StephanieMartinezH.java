package lab2_stephaniemartinezh;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_StephanieMartinezH {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList registro = new ArrayList();
        int opcion = 0;
        boolean condicion = false;
        while (opcion != 4) {
            System.out.println("1.- Registro de aviones \n2.- Manejo de trafico\n3.- Log in\n4.- Salir");
            System.out.print("  Ingrese una opción: ");
            opcion = leer.nextInt();
            if (opcion == 1) {
                if (condicion) {
                    System.out.println("\n1.- Crear aviones\n2.- Leer aviones\n3.- Actualizar aviones\n4.- Borrar aviones");
                    System.out.print("  Ingrese una opcion: ");
                    int opcion2 = leer.nextInt();
                    if (opcion2 == 1) {
                        System.out.print("Ingrese el modelo del avión: ");
                        String modelo = leer.next();
                        registro.add(new Aviones(modelo));
                        System.out.print("Ingrese el código del avión: ");
                        String codigo = leer.next();
                        int validar = validacion(codigo);
                        while (validar != 1) {
                            System.out.println("El código que ha ingresado no es válido");
                            System.out.print("Ingrese el código del avión: ");
                            codigo = leer.next();
                            validar = validacion(codigo);
                        }
                        registro.add(codigo);
                        System.out.print("Ingrese el año de fabricación: ");
                        int fabricacion = leer.nextInt();
                        System.out.print("Ingrese el año de ingreso al aeropuerto: ");
                        int ingreso = leer.nextInt();
                        System.out.print("Ingrese la capacidad de personas: ");
                        int capacidadper = leer.nextInt();
                        System.out.print("Ingrese la capacidad de peso total: ");
                        int peso = leer.nextInt();
                        System.out.print("Ingrese la canitdad de horas de vuelo: ");
                        int horas = leer.nextInt();
                        System.out.print("Ingrese el número de motores: ");
                        int motores = leer.nextInt();
                        System.out.print("Ingrese el estado del avión: ");
                        String estado = leer.next();
                        registro.add(estado);
                        System.out.print("Ingrese el nombre del ingeniero a cargo: ");
                        leer.nextLine();
                        String nombre = leer.nextLine();
                        registro.add(nombre);
                    }
                } else {
                    System.out.println("Necesita estar ingresado para poder ver o modificar la información.\n");
                }
                if (opcion == 2) {
                    if (condicion) {
                        String salida = "";
                        for (Object temp : registro) {
                            if (temp instanceof Aviones) {
                                salida += registro.indexOf(temp) + " - " + temp + "\n";
                            }
                        }
                        System.out.println(salida);
                    } else {
                        System.out.println("Necesita estar ingresado para poder ver la información.\n");
                    }
                }
                if (opcion == 3) {
                    System.out.print("Ingrese la posición a remover: ");
                    int posicion = leer.nextInt();
                    registro.remove(posicion);
                }
            }
            if (opcion == 2) {
                System.out.println();
            }
            if (opcion == 3) {
                while (condicion == false) {
                    String usuario = "Patito";
                    String contraseña = "contrasena1";
                    System.out.println("\nUsuario: " + usuario + "   Contraseña: " + contraseña);
                    System.out.print("Ingrese el usuario: ");
                    String usuario1 = leer.next();
                    System.out.print("Ingrese la contraseña: ");
                    String contraseña1 = leer.next();
                    if (usuario.equals(usuario1) && contraseña.equals(contraseña1)) {
                        condicion = true;
                        System.out.println("\n--Bienvenido--\n");
                    } else {
                        System.out.println("El usuario o la contraseña es incorrecto\n");
                    }
                }
            }
        }
    }

    public static int validacion(String cad) {//Método que valida que el código sea una cadena alfanúmerica
        int cond = 0;
        for (int i = 0; i < cad.length(); i++) {
            char let = cad.charAt(0);
            if (((int) let >= 48 && (int) let <= 57) || ((int) let >= 65 && (int) let <= 90) || ((int) let >= 97 && (int) let <= 122)) {
                cond = 1;
            }
        }
        return cond;
    }//Fin del método
}
