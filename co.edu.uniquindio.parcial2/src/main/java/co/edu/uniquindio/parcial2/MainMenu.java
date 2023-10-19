package co.edu.uniquindio.parcial2;

import co.edu.uniquindio.parcial2.model.FincaUq;
import co.edu.uniquindio.parcial2.util.CapturaDatosUtil;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        FincaUq fincaUq = new FincaUq();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            int opcion = CapturaDatosUtil.leerIntConsola("");

            switch (opcion) {
                case 1:
                    String nombre = CapturaDatosUtil.leerStringConsola("Ingresa el nombre del empleado: ");
                    String apellido = CapturaDatosUtil.leerStringConsola("Ingresa el apellido del empleado: ");
                    String cedula = CapturaDatosUtil.leerStringConsola("Ingresa la cedula del empleado: ");
                    int edad = CapturaDatosUtil.leerIntConsola("Ingresa la edad del empleado: ");
                    double salario = CapturaDatosUtil.leerDoubleConsola("Ingresa el salario del empleado: ");
                    int numeroHorasTrabajo = CapturaDatosUtil.leerIntConsola("Ingresa la cantidad de horas que trabaja al dia el empleado: ");
                    fincaUq.crearEmpleado(nombre, apellido, cedula, edad, salario, numeroHorasTrabajo);

                    break;

                case 2:
                    cedula = CapturaDatosUtil.leerStringConsola("Ingresa la cedula para actualizar el empleado: ");
                    nombre = CapturaDatosUtil.leerStringConsola("Ingresa el nuevo nombre del empleado: ");
                    apellido = CapturaDatosUtil.leerStringConsola("Ingresa el nuevo apellido del empleado: ");
                    edad = CapturaDatosUtil.leerIntConsola("Ingresa la nueva edad del empleado: ");
                    salario = CapturaDatosUtil.leerDoubleConsola("Ingresa el nuevo salario del empleado: ");
                    numeroHorasTrabajo = CapturaDatosUtil.leerIntConsola("Ingresa la nueva cantidad de horas que trabaja al dia el empleado: ");
                    fincaUq.actualizarEmpleado(cedula, nombre, apellido, edad, salario, numeroHorasTrabajo);

                    break;

                case 3:
                    fincaUq.mostrarEmpleado();
                    break;

                case 4:
                    cedula = CapturaDatosUtil.leerStringConsola("Ingrese la cedula del empleado para eliminarlo: ");
                    fincaUq.eliminarEmpleado(cedula);
                    break;

                case 5:
                    System.out.println("El usuario ha salido del sistema.");
                    break;

            }
            if (opcion == 5) {
                break;
            }

        }
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de CRUD:");
        System.out.println("1. Crear Empleado");
        System.out.println("2. Actualizar Empleado");
        System.out.println("3. Leer Empleado");
        System.out.println("4. Eliminar Empleado");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }
}
