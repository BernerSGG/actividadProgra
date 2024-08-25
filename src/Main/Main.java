package Main;

import Implementaciones.EmpleadoServiceImpl;
import InEmpleado.EmpleadoService;
import actividad.Empleado;

public class Main {
	public static void main(String[] args) {
		EmpleadoService empleadoService = new EmpleadoServiceImpl();

		Empleado emp1 = new Empleado("1", "Berner Garcia", "Ingeniero En Siatemas", 15000, "2023-01-10", "IT");
		Empleado emp2 = new Empleado("2", "Karina Ambrocio", "Analista", 10000, "2022-03-15", "Marketing");

		empleadoService.registrarEmpleado(emp1);
		empleadoService.registrarEmpleado(emp2);

		System.out.println("Lista de empleados:");
		for (Empleado emp : empleadoService.listarEmpleados()) {
			System.out.println(emp.getNombre() + " - " + emp.getPuesto());
		}

		empleadoService.calcularIgss(emp1);
		empleadoService.calcularIrtra(emp1);

		System.out.println("IGSS de Berner Garcia: " + emp1.getIgss());
		System.out.println("IRTRA de Berner Garcia: " + emp1.getIrtra());

		empleadoService.agregarBono(emp1, 500);
		empleadoService.agregarDescuento(emp1, 100);

		System.out.println("Salario de Berner Garcia después de bono y descuento: " + emp1.getSalarioBase());
		System.out.println("Deducciones de Berner Garcia: " + emp1.getDeducciones());

		empleadoService.bajarEmpleado("1");
		System.out.println("Empleado 1 removido.");

		System.out.println("Lista de empleados después de la baja:");
		for (Empleado emp : empleadoService.listarEmpleados()) {
			System.out.println(emp.getNombre() + " - " + emp.getPuesto());
		}
	}
}
