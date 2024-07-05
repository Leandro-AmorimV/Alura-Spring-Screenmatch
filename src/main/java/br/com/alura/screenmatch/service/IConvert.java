package br.com.alura.screenmatch.service;

public interface IConvert {
    <T> T  obterDados(String json, Class<T> classe);
}
