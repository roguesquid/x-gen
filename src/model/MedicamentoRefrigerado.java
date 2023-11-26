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
public class MedicamentoRefrigerado extends Medicamento {
  private float temperaturaMinima; // en celsius
  private float temperaturaMaxima; // en celsius
  private int tiempoMaximo; // (en dias)
  private float humedadMaxima; // porcentaje
  private float humedadMinima; // porcentaje

  public MedicamentoRefrigerado() {
    super();
    // minimo y maximo de temperatura recomendado para medicamentos refrigerados
    // segun Normativa DIN 58345
    // (https://medicallab.coreco.es/din-58345-especificaciones-para-el-almacenamiento-de-medicamentos-que-requieren-refrigeracion/)
    this.temperaturaMinima = 2;
    this.temperaturaMaxima = 8;
    this.tiempoMaximo = 0;
    this.humedadMaxima = 40;
    this.humedadMinima = 75;
  }

  public MedicamentoRefrigerado(String codigoDeMedicamento, String nombreMedicamento, float costo,
      int unidadesExistencia, LocalDate fechaCaducidad, int lote, int vigencia, float porcentaje,
      float temperaturaMinima, float temperaturaMaxima, int tiempoMaximo,
      float humedadMaxima, float humedadMinima) {
    super(codigoDeMedicamento, nombreMedicamento, costo, unidadesExistencia, fechaCaducidad, lote, vigencia,
        porcentaje);

    this.temperaturaMinima = temperaturaMinima;
    this.temperaturaMaxima = temperaturaMaxima;
    this.tiempoMaximo = tiempoMaximo;
    this.humedadMaxima = humedadMaxima;
    this.humedadMinima = humedadMinima;
    this.setPrecioVenta(this.aumentarPrecio(this.getPrecioVenta()));// aumenta el precio de venta en un 25%
  }

  private float aumentarPrecio(float precio) {
    float precioAdicional = this.getPrecioVenta() * (1 / 4);
    return precioAdicional;
  }

  public float getTemperaturaMinima() {
    return temperaturaMinima;
  }

  public void setTemperaturaMinima(float temperaturaMinima) {
    this.temperaturaMinima = temperaturaMinima;
  }

  public float getTemperaturaMaxima() {
    return temperaturaMaxima;
  }

  public void setTemperaturaMaxima(float temperaturaMaxima) {
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public int getTiempoMaximo() {
    return tiempoMaximo;
  }

  public void setTiempoMaximo(int tiempoMaximo) {
    this.tiempoMaximo = tiempoMaximo;
  }

  public float getHumedadMaxima() {
    return humedadMaxima;
  }

  public void setHumedadMaxima(float humedadMaxima) {
    this.humedadMaxima = humedadMaxima;
  }

  public float getHumedadMinima() {
    return humedadMinima;
  }

  public void setHumedadMinima(float humedadMinima) {
    this.humedadMinima = humedadMinima;
  }
}
