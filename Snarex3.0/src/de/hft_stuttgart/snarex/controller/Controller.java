package de.hft_stuttgart.snarex.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class Controller {
	
	@FXML
	private Label sensorSelectionLbl;

	@FXML
	private Label dataBaseLbl;

	@FXML
	private Label alertsLbl;

	@FXML
	private Label measuringLbl;

	@FXML
	private Label recordLbl;

	@FXML
	private Label tempColorLbl;

	@FXML
	private Label pressColorLbl;

	@FXML
	private Label rotColorLbl;

	@FXML
	private ComboBox<?> databaseComboBox;

	@FXML
	private ComboBox<?> sensorComboBox;

	@FXML
	private ComboBox<?> alertComboBox;

	@FXML
	private ComboBox<?> inputTypeComboBox;

	@FXML
	private ComboBox<?> barTypeComboBox;

	@FXML
	private ComboBox<?> inputInComboBox;

	@FXML
	private Button startMeasuringBtn;

	@FXML
	private Button stopMeasuringBtn;

	@FXML
	private Button startRecordBtn;

	@FXML
	private Button stopRecordBtn;

	@FXML
	private Button showRecordedBtn;

	@FXML
	private Button compareBtn;

	@FXML
	private ColorPicker tempColorPicker;

	@FXML
	private ColorPicker pressColorPicker;

	@FXML
	private ColorPicker rotColorPicker;

	@FXML
	private MenuBar menuBar;

	@FXML
	private ContextMenu contextMenu;

	@FXML
	private Menu menuSensor;

	@FXML
	private Menu menuDatabase;

	@FXML
	private Menu menuAlert;

	@FXML
	private MenuItem sensorAdd;

	@FXML
	private MenuItem sensorDelete;

	@FXML
	private MenuItem databaseAdd;

	@FXML
	private MenuItem databaseDelete;

	@FXML
	private MenuItem alertAdd;

	@FXML
	private MenuItem alertDelete;

	@FXML
	private TreeView<?> treeTree;

	@FXML
	private TreeItem<?> rootTree;

	@FXML
	private TreeItem<?> sensorTree;

	@FXML
	private TreeItem<?> sensor_01;

	@FXML
	private TreeItem<?> sensor_02;

	@FXML
	private TreeItem<?> dataTree;

	@FXML
	private TreeItem<?> databaseTree;

	@FXML
	private TreeItem<?> alertTree;

	@FXML
	private TreeItem<?> pressureAlTree;

	@FXML
	private TreeItem<?> pressurexAlTree;

	@FXML
	private TreeItem<?> pressureyAlTree;

	@FXML
	private TreeItem<?> tempAlTree;

	@FXML
	private TreeItem<?> tempxAlTree;

	@FXML
	private TreeItem<?> tempyAlTree;

	@FXML
	private TreeItem<?> revAlTree;

	@FXML
	private TreeItem<?> revxAlTree;

	@FXML
	private TreeItem<?> revyAlTree;

	@FXML
	private LineChart<?, ?> pressureChart;

	@FXML
	private LineChart<?, ?> temperatureChart;

	@FXML
	private LineChart<?, ?> rotationsChart;

	@FXML
	void compareClick(ActionEvent event) {

	}

	@FXML
	void selectAlertsSelect(ActionEvent event) {

	}

	@FXML
	void selectBarTypeSelect(ActionEvent event) {

	}

	@FXML
	void selectDatabaseSelect(ActionEvent event) {

	}

	@FXML
	void selectInputTypeSelect(ActionEvent event) {

	}

	@FXML
	void selectSensorSelect(ActionEvent event) {

	}

	@FXML
	void showInputInSelect(ActionEvent event) {

	}

	@FXML
	void showRecordedClick(ActionEvent event) {

	}

	@FXML
	void startMeasureClick(ActionEvent event) {

	}

	@FXML
	void startRecordClick(ActionEvent event) {

	}

	@FXML
	void stopMeasureClick(ActionEvent event) {

	}

	@FXML
	void stopRecordClick(ActionEvent event) {

	}

	@FXML
	void alertAddClick(ActionEvent event) {

	}

	@FXML
	void alertDeleteClick(ActionEvent event) {

	}

	@FXML
	void databaseAddClick(ActionEvent event) {

	}

	@FXML
	void databaseDeleteClick(ActionEvent event) {

	}

	@FXML
	void sensorAddClick(ActionEvent event) {

	}

	@FXML
	void sensorDeleteClick(ActionEvent event) {

	}

}
