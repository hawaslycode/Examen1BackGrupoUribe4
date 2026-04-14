package com.example.demoexamen.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "tabla_sucursales")
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreSede;
    private String direccion;

    public Sucursal() {}
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNombreSede() { return nombreSede; }
    public void setNombreSede(String nombreSede) { this.nombreSede = nombreSede; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}