/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import persistencia.ControladorPersistencia;

/**
 *
 * @author Oscar
 */
public class Controlador {

    ControladorPersistencia controladorPersist = new ControladorPersistencia();

    // Creamos métodos pivote entre la interfaz y el controlador de la lógica
    // LÓGICA - GUARDADO, éste método se lo pasará al Controlador de la Persistencia para guardar
    // a través de métodos relacionados a su JPA correspondiente
    public void guardarAuto(String modelo, String marca, String color, String motor, String patente, int numeroPuertas) {

        // Se construye el objeto automóvil en el CONTROLADOR DE LA LÓGICA, NO en la persistencia
        // A la persistencia se pasan OBJETOS CREADOS, NO SE CREAN DESDE ALLÍ
        // Tenemos que instanciar el objeto de la clase Automóvil y vamos setteando cada atributo recibido
        // por parámetro
        Automovil automovil = new Automovil();

        automovil.setModelo(modelo);
        automovil.setMarca(marca);
        automovil.setColor(color);
        automovil.setMotor(modelo);
        automovil.setPatente(patente);
        automovil.setCantidadPuertas(numeroPuertas);

        // Pasamos el objeto construido hacia el CONTROLADOR DE LA PERSISTENCIA
        controladorPersist.guardarAuto(automovil);

    }

    // Le comunicamos al controlador de la persistencia los datos de los registros a buscar 
    public ArrayList<Automovil> encontrarLosAutomoviles() {
        return controladorPersist.encontrarLosAutomoviles();
    }

    public Automovil buscarAutomovil(int numeroVehiculo) {
        return controladorPersist.buscarAutomovil(numeroVehiculo);
    }

    public void eliminarVehiculoSeleccionado(int numeroVehiculo) {

        // Mandamos al controlador de la persistencia el número del vehículo para eliminar
        controladorPersist.eliminarVehiculoSeleccionado(numeroVehiculo);

    }
    
}
