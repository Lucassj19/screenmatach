package br.com.alura.Screenmatch.service;

public interface IConverDados {
    <T> T obterDados(String json, Class<T> classe);
}
