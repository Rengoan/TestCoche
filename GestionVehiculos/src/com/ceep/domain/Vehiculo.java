package com.ceep.domain;

public class Vehiculo {
    
    private int idVehiculo;
    private String matricula, marca, modelo, color;
    private Double tarifa;
    private Boolean disponible;
    private static int contadorVehiculos;

    //Getters and Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }
    
    
    
    //Constructores

    public Vehiculo(String matricula, String marca, String modelo, String color, Double tarifa, Boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
        
             
    }

    public Vehiculo() {
        this.idVehiculo = ++Vehiculo.contadorVehiculos;
    }
    
    //Metodos
    
    public void mostrar() {
        System.out.println("idVehiculo: " + idVehiculo);
        System.out.println("Matricula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Tarifa: " + tarifa);
        System.out.println("Disponible: " + disponible);
        System.out.println("");

    }
    
    

}
