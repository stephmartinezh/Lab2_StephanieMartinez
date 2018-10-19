package lab2_stephaniemartinezh;

import java.util.ArrayList;

public class Aviones {

    String modelo;
    String codigo;
    int fabricacion;
    int ingreso;
    int capacidadpas;
    int capacidadpeso;
    int horas;
    int motores;
    String nombre;
    String estado;
    ArrayList lista = new ArrayList();

    //Constructor
    public Aviones(String mod){
        modelo = mod;
    }

    //Mutadores
    public void setModelo(String mod) {
        modelo = mod;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setCapacidadPasajeros(int capacidad) {
        capacidadpas = capacidad;
    }

    public int getCapacidadPasajeros() {
        return capacidadpas;
    }

    public void setCapacidadPeso(int capacidad) {
        capacidadpeso = capacidad;
    }

    public int getCapacidadPeso() {
        return capacidadpeso;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getMotores() {
        return motores;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

    public ArrayList getLista() {
        return lista;
    }

}
