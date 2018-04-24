package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

import clases.Alumno;
import clases.Carrera;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

/*
 * 	Modelo: Logica del negocio y el acceso a datos (Clases POJO)
 *  Vista: GUI (fxml)
 *  Controlador: Gestiona las acciones e inicializa componentes.
 * 
 * */

public class ControladorRegistroAlumnos implements Initializable{
	@FXML private TextField txtCuenta;
	@FXML private TextField txtNombre;
	@FXML private TextField txtApellido;
	@FXML private TextField txtEdad;
	@FXML private TextField txtIdentidad;
	@FXML private TextField txtPromedio;
	@FXML private RadioButton rbtFemenino;
	@FXML private RadioButton rbtMasculino;
	@FXML private CheckBox chkClase1;
	@FXML private CheckBox chkClase2;
	@FXML private CheckBox chkClase3;
	@FXML private ComboBox<Carrera> cmbCarreras;
	@FXML private TextArea txtAResultado;
	//Botones
	@FXML private Button btnGuardar;
	@FXML private Button btnActualizar;
	@FXML private Button btnEliminar;
	
	
	
	private ArrayList<Alumno> alumnos;
	private ObservableList<Carrera> carreras;
	
	private int indiceSeleccionado=-1;
	
	public ControladorRegistroAlumnos() {
		alumnos = new ArrayList<Alumno>();
	}
		
	@FXML
	public void guardar() {
		String genero = "";
		if (rbtFemenino.isSelected())
			genero = "Femenino";
		else
			genero = "Masculino";
		
		ArrayList<String> clasesSeleccionadas = new ArrayList<String>();
		if(chkClase1.isSelected())
			clasesSeleccionadas.add("Clase1");
		
		if(chkClase2.isSelected())
			clasesSeleccionadas.add("Clase2");
		
		if(chkClase3.isSelected())
			clasesSeleccionadas.add("Clase3");
		
		Alumno a = new Alumno(txtNombre.getText(), txtApellido.getText(),
				Integer.parseInt(txtEdad.getText()),
				genero,
				txtIdentidad.getText(),
				cmbCarreras.getSelectionModel().getSelectedItem(),
				clasesSeleccionadas,
				txtCuenta.getText(),
				Float.parseFloat(txtPromedio.getText())
		);
		
		alumnos.add(a);
		txtAResultado.appendText(a.toString() + "\n");
	}
	
	@FXML
	public void actualizar() {
		String genero = "";
		if (rbtFemenino.isSelected())
			genero = "Femenino";
		else
			genero = "Masculino";
		
		ArrayList<String> clasesSeleccionadas = new ArrayList<String>();
		if(chkClase1.isSelected())
			clasesSeleccionadas.add("Clase1");
		
		if(chkClase2.isSelected())
			clasesSeleccionadas.add("Clase2");
		
		if(chkClase3.isSelected())
			clasesSeleccionadas.add("Clase3");
		
		Alumno a = new Alumno(txtNombre.getText(), txtApellido.getText(),
				Integer.parseInt(txtEdad.getText()),
				genero,
				txtIdentidad.getText(),
				cmbCarreras.getSelectionModel().getSelectedItem(),
				clasesSeleccionadas,
				txtCuenta.getText(),
				Float.parseFloat(txtPromedio.getText())
		);
		alumnos.set(indiceSeleccionado, a);
		llenarInformacion();
		nuevo();
	}

	@FXML
	public void nuevo() {
		txtCuenta.setText(null);
		txtNombre.setText(null);
		txtApellido.setText(null);
		txtEdad.setText(null);
		txtIdentidad.setText(null);
		txtPromedio.setText(null);
		rbtFemenino.setSelected(false);
		rbtMasculino.setSelected(false);
		chkClase1.setSelected(false);
		chkClase2.setSelected(false);
		chkClase3.setSelected(false);
		cmbCarreras.getSelectionModel().clearSelection();
		btnGuardar.setDisable(false);
	    btnActualizar.setDisable(true);
	    btnEliminar.setDisable(true);
	}
	
	@FXML
	public void eliminar() {
		alumnos.remove(indiceSeleccionado);
		llenarInformacion();
		nuevo();
	}
	
	public void llenarInformacion() {
		txtAResultado.setText(null);
		for (int i = 0; i<alumnos.size();i++) {
			txtAResultado.appendText(alumnos.get(i).toString()+"\n");
		}
	}
	@FXML
	public void salir() {
		System.exit(0);
	}
	
	@FXML
	public void seleccionar() {
		nuevo();
		TextInputDialog dialog = new TextInputDialog("");
		dialog.setTitle("Editar");
		dialog.setHeaderText("Se editara un registro");
		dialog.setContentText("Ingrese el indice del registro a editar:");

		// Traditional way to get the response value.
		Optional<String> resultado = dialog.showAndWait();
		if (resultado.isPresent()){
			indiceSeleccionado = Integer.parseInt(resultado.get());
		    Alumno a = alumnos.get(indiceSeleccionado);
		    txtCuenta.setText(a.getCuenta());
			txtNombre.setText(a.getNombre());
			txtApellido.setText(a.getApellido());
			txtEdad.setText(String.valueOf(a.getEdad()));
			txtIdentidad.setText(a.getIdentidad());
			txtPromedio.setText(String.valueOf(a.getPromedio()));
			if (a.getGenero() == "Femenino")
				rbtFemenino.setSelected(true);
			if (a.getGenero() == "Masculino")
				rbtMasculino.setSelected(true);

			cmbCarreras.getSelectionModel().select(a.getCarrera());
			
			btnGuardar.setDisable(true);
		    btnActualizar.setDisable(false);
		    btnEliminar.setDisable(false);
		}
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//Este metodo se ejecuta cuando todos los componentes del GUI estan instanciados
		//Inicializar un ObservableList
		carreras = FXCollections.observableArrayList(); 
		carreras.add(new Carrera(1,"Ingenieria en Sistemas",56));
		carreras.add(new Carrera(2,"Ingenieria Quimica",56));
		carreras.add(new Carrera(3,"Ingenieria Electrica",56));
		carreras.add(new Carrera(4,"Ingenieria Industrial",56));
		//Enlazar la lista de carreras al comboBox
		cmbCarreras.setItems(carreras);
	}
}
