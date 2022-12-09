package com.formacion.actividadFinalOracle;

public class HRApp {

	public static void main(String[] args) {
		System.out.println("HRApp inicio");

		Empleado e1 = new Empleado(230, "Jerry", 333998);
		Empleado e2 = new Empleado(420, "Gracie", 3392823);

		Departamento dept = new Departamento("Educacion");

		dept.agregarEmp(e1);
		dept.agregarEmp(e2);
		dept.agregarEmp(new Empleado(772, "Jack", 2998));

		Empleado[] emps = dept.obtenerEmp();

		for (Empleado emp : emps) {
			System.out.println(emp);
		}

		System.out.println("Total " + dept.getSueldoTotal());
		System.out.println("Promedio " + dept.getSueldoPromedio());
		System.out.println("Emp " + dept.getEmpleadoPorID(25));
	}
}
