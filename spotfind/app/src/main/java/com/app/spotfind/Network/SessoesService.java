package com.app.spotfind.Network;

import com.app.spotfind.Models.Compras;
import com.app.spotfind.Models.Sessoes;
import com.app.spotfind.Models.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface SessoesService {
  @GET("Sessoes")
  Call<List<Sessoes>> getSessoes();

  @GET("Compras?filter=%7B\"where\"%3A%7B\"usuarioId\"%3A{usuarioId}%7D%7D")
  Call<List<Compras>> getComprasPorUsuarioId(int usuarioId);

  @GET("link-para-filtro-de-filme")
  Call<List<Compras>> getFilmePorImdbId(String imbdId);

  @POST("Usuarios/login")
  Call<List<Usuario>> getUsuario(@Body Usuario usuario);
}
