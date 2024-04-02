package org.example.sylvio.callbacks;

import org.example.sylvio.models.Carro;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class CallBackCarros implements Callback<List<Carro>>
{
    List<Carro> carros = null;
    @Override
    public void onResponse(Call<List<Carro>> call, Response<List<Carro>> response) {
        carros = response.body();
        if (carros != null){
            for (Carro carro : carros){
                System.out.println(carro);
            }
        }
        else {
            System.out.println("Lista vazia");
        }
    }
    @Override
    public void onFailure(Call<List<Carro>> call, Throwable throwable) {
        System.out.println(throwable.getMessage());
    }

}
