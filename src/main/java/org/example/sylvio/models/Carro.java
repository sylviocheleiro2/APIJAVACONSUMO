package org.example.sylvio.models;

public class Carro
{
   public int Id;
   public String nome;
   public String data;
   public String fabricante;
    public Carro(){}
    public Carro(String nome, String data, String fabricante) {
        this.nome = nome;
        this.data = data;
        this.fabricante = fabricante;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setData(String data) {
        this.data = data;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Id:" + Id +
                ", nome:'" + nome + '\'' +
                ", data:'" + data + '\'' +
                ", fabricante:'" + fabricante ;
    }
}
