package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automovil implements Serializable {
    
    // Definimos atributos
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int autoId;
    
    @Basic
    private String modelo;
    private String marca;
    private String color;
    private String patente;
    private int cantidadPuertas;
    
   // Definimos métodos constructores
    
    public Automovil() {
    }

    public Automovil(int autoId, String modelo, String marca, String color, String patente, int cantidadPuertas) {
        this.autoId = autoId;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.patente = patente;
        this.cantidadPuertas = cantidadPuertas;
    }

    // Definimos métodos accesores
    
    public int getAutoId() {
        return autoId;
    }

    public void setAutoId(int autoId) {
        this.autoId = autoId;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
    
   // Definimos método toString()

    @Override
    public String toString() {
        return "Automovil{" + "autoId=" + autoId + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", patente=" + patente + ", cantidadPuertas=" + cantidadPuertas + '}';
    }
    
    
    
    
}
