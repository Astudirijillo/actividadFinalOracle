package com.formacion.actividadFinalOracle;

public class Departamento {

	private String nombreDep;
	private Empleado[] empleados = new Empleado[10];
	private int ultimoEmpAgregado = -1;

	public Departamento(String nombreDep) {
		this.nombreDep = nombreDep;
	}

	public String getNombreDep() {
		return nombreDep;
	}

	public void setNombreDep(String nombreDep) {
		this.nombreDep = nombreDep;
	}

	public void agregarEmp(Empleado nEmp) {
		if (ultimoEmpAgregado < empleados.length) {
			ultimoEmpAgregado++;
			empleados[ultimoEmpAgregado] = nEmp;
		}
	}

	public Empleado[] obtenerEmp() {
		Empleado[] empleadosActuales = new Empleado[ultimoEmpAgregado + 1];
		for (int i = 0; i < empleadosActuales.length; i++) {
			empleadosActuales[i] = empleados[i];
		}
		return empleadosActuales;
	}

	public int ultimoEmpleadoAgregado() {
		return ultimoEmpAgregado + 1;
	}

	public Empleado getEmpleadoPorID(int empID) {
		for (Empleado emp : empleados) {
			if (emp.getID() == empID) {
				return emp;
			} else {
				return null;
			}
		}
		return null;
	}

	public double getSueldoTotal() {
		double sueldoTotal = 0.0;
		for (int i = 0; i <= ultimoEmpAgregado; i++) {
			sueldoTotal += empleados[i].getSalary();
		}
		return sueldoTotal;
	}

	public double getSueldoPromedio() {
		if (ultimoEmpAgregado > -1) {
			return getSueldoTotal() / (ultimoEmpAgregado + 1);
		}
		return 0.0;
	}

	public String toString() {
		return nombreDep;
	}

}
