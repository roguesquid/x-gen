/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author luisr
 */
public abstract class Medicamento {

  private String codigoDeMedicamento;
  private String nombreMedicamento;
  private float costo;
  private float precioVenta;
  private int unidadesVendidas = 0;
  private int unidadesExistencia;
  private LocalDate fechaCaducidad;
  private int lote;
  private int vigencia;

  public Medicamento() {

  }

  /**
   * Constructor de la clase Medicamento
   * 
   * @param codigoDeMedicamento
   * @param nombreMedicamento
   * @param costo
   * @param unidadesVendidas
   * @param unidadesExistencia
   * @param fechaCaducidad
   * @param lote
   * @param vigencia
   * @param porcentaje
   */
  public Medicamento(String codigoDeMedicamento, String nombreMedicamento, float costo,
      int unidadesExistencia, LocalDate fechaCaducidad, int lote, int vigencia, float porcentaje) {
    this.codigoDeMedicamento = codigoDeMedicamento;
    this.nombreMedicamento = nombreMedicamento;
    this.costo = costo;
    this.precioAPagar(porcentaje);
    this.colocarOferta();
    this.unidadesExistencia = unidadesExistencia;
    this.fechaCaducidad = fechaCaducidad;
    this.lote = lote;
    this.vigencia = vigencia;
  }

  public String getCodigoDeMedicamento() {
    return codigoDeMedicamento;
  }

  public void setCodigoDeMedicamento(String codigoDeMedicamento) {
    this.codigoDeMedicamento = codigoDeMedicamento;
  }

  public String getNombreMedicamento() {
    return nombreMedicamento;
  }

  public void setNombreMedicamento(String nombreMedicamento) {
    this.nombreMedicamento = nombreMedicamento;
  }

  public float getCosto() {
    return costo;
  }

  public void setCosto(float costo) {
    this.costo = costo;
  }

  public float getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(float precio) {
    this.precioVenta = precio;
  }

  public void precioAPagar(float porcentaje) {
    this.precioVenta = this.costo + this.costo * (porcentaje / 100);
  }

  public int getUnidadesVendidas() {
    return unidadesVendidas;
  }

  public void setUnidadesVendidas(int unidadesVendidas) {
    this.unidadesVendidas = unidadesVendidas;
  }

  public int getUnidadesExistencia() {
    return unidadesExistencia;
  }

  public void setUnidadesExistencia(int unidadesExistencia) {
    this.unidadesExistencia = unidadesExistencia;
  }

  public LocalDate getFechaCaducidad() {
    return fechaCaducidad;
  }

  public void setFechaCaducidad(LocalDate fechaCaducidad) {
    this.fechaCaducidad = fechaCaducidad;
  }

  public int getLote() {
    return lote;
  }

  public void setLote(int lote) {
    this.lote = lote;
  }

  public int getVigencia() {
    return vigencia;
  }

  public void setVigencia(int vigencia) {
    this.vigencia = vigencia;
  }

  public float getPorcentaje() {
    return this.precioVenta - this.costo;
  }

  public void setPorcentaje(float porcentaje) {
    this.precioVenta = this.costo + this.costo * (porcentaje / 100);
  }

  /*
   * Metodo que determina si el medicamento esta vencido
   * 
   * @return true si esta vencido, false si no lo esta
   */
  public boolean determinarVencido() {
    LocalDate fechaActual = LocalDate.now();
    if (fechaCaducidad.isBefore(fechaActual)) {
      System.out.println("Medicamento vencido, se vencio el: " + this.fechaCaducidad);
      System.out.println("Nombre: " + this.nombreMedicamento);
      System.out.println("Codigo: " + this.codigoDeMedicamento);
      return true;
    } else {
      return false;
    }
  }

  /*
   * Verifica si un medicamento esta a tres meses de vencerse, si es asi le coloca
   * una oferta
   */
  public void colocarOferta() {
    // fecha actual (con el dia fijado al primer dia del mes)
    LocalDate fechaActual = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), 1);

    // Añadir 3 meses a la fecha actual
    LocalDate fechaTresMesesDespues = fechaActual.plusMonths(3);

    if (fechaTresMesesDespues.equals(fechaCaducidad)) {
      this.setPrecioVenta(this.getPrecioVenta() * (7 / 10));
    }
  }
}
