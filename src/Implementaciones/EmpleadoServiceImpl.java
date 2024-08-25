package Implementaciones;

import java.util.ArrayList;
import java.util.List;

import InEmpleado.EmpleadoService;
import actividad.Empleado;

public class EmpleadoServiceImpl implements EmpleadoService {
	private List<Empleado> empleados = new ArrayList<>();

	@Override
	public void registrarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	@Override
	public List<Empleado> listarEmpleados() {
		return empleados;
	}

	@Override
	public void bajarEmpleado(String id) {
		empleados.removeIf(empleado -> empleado.getId().equals(id));
	}

	@Override
	public void calcularIgss(Empleado empleado) {
		double igss = empleado.getSalarioBase() * 0.0483;
		empleado.setIgss(igss);
	}

	@Override
	public void calcularIrtra(Empleado empleado) {
		double irtra = empleado.getSalarioBase() * 0.01;
		empleado.setIrtra(irtra);
	}

	@Override
	public void agregarBono(Empleado empleado, double bono) {
		empleado.setSalarioBase(empleado.getSalarioBase() + bono);
	}

	@Override
	public void agregarDescuento(Empleado empleado, double descuento) {
		empleado.setDeducciones(empleado.getDeducciones() + descuento);
	}
}
