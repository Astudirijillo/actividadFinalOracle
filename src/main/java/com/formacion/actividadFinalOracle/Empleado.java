package com.formacion.actividadFinalOracle;

public class Empleado {

	private int ID;
	private String name;
	private double salary;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Empleado(int iD, String name, double salary) {
		ID = iD;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Empleado: " + getID() + ", " + getName() + ", " + getSalary();
	}

}
