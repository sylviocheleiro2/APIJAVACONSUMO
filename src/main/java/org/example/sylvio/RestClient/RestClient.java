package org.example.sylvio.RestClient;

import org.example.sylvio.models.Carro;
import org.example.sylvio.services.CarroServices;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient
{
    private Retrofit retrofit = null;
    private static RestClient instance = null;
    private RestClient(){
         retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:2131")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static RestClient getInstance() {
        if (instance == null)
            instance = new RestClient();
        return instance;
    }

    public CarroServices getCarroService(){
        return this.retrofit.create(CarroServices.class);
    }
}
