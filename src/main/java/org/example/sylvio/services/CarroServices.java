package org.example.sylvio.services;
import org.example.sylvio.models.Carro;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface CarroServices
{
    @GET("/carros")
    Call<List<Carro>> listar();
    @GET("/carros")
    Call<List<Carro>> listar(@Query("limit") int limit);
    @GET("/carros")
    Call<List<Carro>> listar(@Query("limit") int limit, @Query("offset") int offset);
    @POST("/carros")
    Call<Carro> inserir(@Body Carro carro);
    @GET("/carros/{id}")
    Call<Carro> ler(@Path("id") int id);
    @PUT("/carros/{id}")
    Call<Carro> modificar(@Path("id") int id, @Body Carro carro);
    @PATCH("/carros/{id}")
    Call<Carro> atualizar(@Path("id") int id, @Body Carro carro);
    @DELETE("/carros/{id}")
    Call<Carro> excluir(@Path("id") int id);
}
