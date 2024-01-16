package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Automovil;
import persistencia.exceptions.NonexistentEntityException;

public class ControladorPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    // Creamos los métodos de persistencia de autoJpa
    
    public void crearAuto(Automovil auto) {
        autoJpa.create(auto);
    }
    
    public void editarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Automovil encontrarAutomovil(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }
    
    public ArrayList<Automovil> encontrarTodosAutomociles() {
        List<Automovil> automoviles = autoJpa.findAutomovilEntities();
        ArrayList<Automovil> listaAutomoviles = new ArrayList<>(automoviles);
        return listaAutomoviles;
    }
   
    
    
    // Creamos métodos pivote entre el controlador de la lógica y la persistencia
    
    
    
    
}
