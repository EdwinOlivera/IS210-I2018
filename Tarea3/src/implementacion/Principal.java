package implementacion;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Curso;
import clases.Usuario;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		Scanner entrada = new Scanner(System.in);
		Curso c = new Curso();
		c.setNombreCurso("Programacion II");
		c.setDescripcion("Una clase que se pasa sola.");
		c.setCupos("35");
		
		//Datos del instructor
		Usuario instructor = new Usuario();
		instructor.setNombre("Juan");
		instructor.setApellido("Perez");
		instructor.setEdad(15);
		
		c.setInstructor(instructor);
		
		cursos.add(c);
		
		System.out.println("¿En que curso desea agregar el estudiante?");
		int indice = entrada.nextInt();
		Curso cursoSeleccionado = cursos.get(indice);
		System.out.println("Curso seleccionado: " + cursoSeleccionado.getNombreCurso());
		
		
		//Datos del estudiante a agregar
		Usuario estudiante1 = new Usuario();
		estudiante1.setNombre("Pedro");
		estudiante1.setApellido("Martinez");
		estudiante1.setEdad(20);
		
		//Datos del estudiante a agregar
		Usuario estudiante2 = new Usuario();
		estudiante2.setNombre("Luis");
		estudiante2.setApellido("Dominguez");
		estudiante2.setEdad(20);
		
		//Datos del estudiante a agregar
		Usuario estudiante3 = new Usuario();
		estudiante3.setNombre("LaBritany");
		estudiante3.setApellido("Medina");
		estudiante3.setEdad(20);
		
		
		cursoSeleccionado.agregarEstudiante(estudiante1);
		cursoSeleccionado.agregarEstudiante(estudiante2);
		cursoSeleccionado.agregarEstudiante(estudiante3);
		System.out.println("Curso: " + cursoSeleccionado.toString());
	} 

}
