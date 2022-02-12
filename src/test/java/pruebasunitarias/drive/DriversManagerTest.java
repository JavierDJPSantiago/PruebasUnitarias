package pruebasunitarias.drive;

import static org.junit.jupiter.api.Assertions.*;
//llamo a todos los metodos no recomendable

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DriversManagerTest {

	DriversManager driversManager = new DriversManager();//objeto que nace de DriversManager
	
	//addPassenger checando a este metodo que proviene de: driversManager
	//ponemos is al inicio: solo para cambiar el nombre
	//el metodo add passenger: pide un passenger de tipo passenger: hace referencia al constructor de la clase Passenger
	@Test
	void isaddPassenger() {
		Passenger passenger1 = new Passenger("Carlos Eduardo", "ABC123");//objeto del constructor de la clase Passenger, pide argumentos por el diseño del constructor
		driversManager.addPassenger(passenger1);//AÑADO A LA COLECCION DE DriversManager
		assertEquals(passenger1, driversManager.getPassenger("ABC123"));//pregunto si esta en esa coleccion con ese metodo
	}
    //DisplayName: para decir que estamos testeando; es un metodo de la libreria y te pide imoprtarlo
	@DisplayName("Pruebas en el emtodoaddDriver")
	@Test
	void isaddDriver() {
		Driver driver1 = new Driver("Joaquin", "Jo1234", 50.00);
		driversManager.addDriver(driver1);
		assertEquals(driver1,driversManager.getDriver("Jo1234"));
	}
	
	//
}
