package practica5;
// Generated 11-dic-2020 1:00:30 by Hibernate Tools 5.2.11.Final

/**
 * Empleados generated by hbm2java
 */
public class Empleados implements java.io.Serializable {

	private Integer id;
	private Departamentos departamentos;
	private String nombre;
	private String apellidos;
	private Double salario;

	public Empleados() {
	}

	public Empleados(Departamentos departamentos, String nombre, String apellidos, Double salario) {
		this.departamentos = departamentos;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Departamentos getDepartamentos() {
		return this.departamentos;
	}

	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Double getSalario() {
		return this.salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}