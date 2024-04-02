package org.example.sylvio;

import org.example.sylvio.RestClient.RestClient;

import org.example.sylvio.callbacks.CallBackCarros;
import org.example.sylvio.models.Carro;
import org.example.sylvio.services.CarroServices;
import retrofit2.Response;

import java.io.IOException;


public class Main {
    public static void main(String[] args)
    {
        //try {
            CarroServices carroServices = RestClient.getInstance().getCarroService();

           // inserir(carroServices);
            //LerPeloId(carroServices);
            //atualizwr(carroServices);
            //LerPeloId(carroServices);
            //modificar(carroServices);
            //LerPeloId(carroServices);
            //excluir(4, carroServices);
            //excluir(5, carroServices);
            //excluir(6, carroServices);
            //excluir(3, carroServices);
        int limit = 5;
        int offset = 3;
        listarCarros(limit, offset, carroServices);
        listarCarros(limit, limit + offset, carroServices);
        }
        //catch (IOException e) {
           // throw new RuntimeException(e);
        //}




    private static void inserir(CarroServices carroServices) throws IOException {
        Carro newCarro = new Carro("gtr", "14/03/2005", "nissan");
        Response<Carro> response = carroServices.inserir(newCarro).execute();
        System.out.println(response.body());
    }
    private static void LerPeloId(CarroServices carroServices) throws IOException {
        Response<Carro> response = carroServices.ler(5).execute();
        System.out.println(response.body());
    }
    private static void modificar(CarroServices carroServices) throws IOException {
        Carro newCarro = new Carro();
        newCarro.setNome("CARRO BRABO");
        Response<Carro> response = carroServices.modificar(5, newCarro).execute();
        System.out.println(response.body());
    }
    private static void excluir(int id, CarroServices carroServices) throws IOException{
        Response<Carro> response = carroServices.excluir(id).execute();
        System.out.println(response.body());
    }
    private static void atualizwr(CarroServices carroServices) throws IOException {
        Carro newCarro = new Carro();
        newCarro.setNome("CARRO BRABO");
        Response<Carro> response = carroServices.atualizar(5, newCarro).execute();
        System.out.println(response.body());
    }
private static void listarCarros(CarroServices carroServices)
{
    carroServices.listar().enqueue(new CallBackCarros());
}
private static void listarCarros(int limit, CarroServices carroServices)
{
    carroServices.listar(limit).enqueue(new CallBackCarros());
}
    private static void listarCarros(int limit, int offset, CarroServices carroServices)
    {
        carroServices.listar(limit,offset).enqueue(new CallBackCarros());
    }


}