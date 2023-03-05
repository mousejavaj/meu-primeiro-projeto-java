package modelo;

import java.math.BigDecimal;

public class Carro {
    
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private Double valor;

    private Integer velocidade = 0;

    public Carro (){

    }

    public Carro(String marca, String modelo, String cor, String placa, Double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.valor = valor;
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ",\n modelo=" + modelo + ",\n cor=" + cor + ",\n placa=" + placa + ",\n valor=" + valor
                + "]";
    }

    public void acelerar(){
        velocidade =+ 15;
    }

    public void freiar() {
        velocidade =-15;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }
    
    

}
