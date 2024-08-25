package InEmpleado;

import java.util.List;

import actividad.Empleado;

public interface EmpleadoService {
	void registrarEmpleado(Empleado empleado);

	List<Empleado> listarEmpleados();

	void bajarEmpleado(String id);

	void calcularIgss(Empleado empleado);

	void calcularIrtra(Empleado empleado);

	void agregarBono(Empleado empleado, double bono);

	void agregarDescuento(Empleado empleado, double descuento);
}
