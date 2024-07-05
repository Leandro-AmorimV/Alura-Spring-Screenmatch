package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.dataSeries;
import br.com.alura.screenmatch.service.API;
import br.com.alura.screenmatch.service.Convert;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new API();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=How+I+met+your+mother&apikey=4ac85451");
		System.out.println(json);
		Convert conversor = new Convert();
		dataSeries dados = conversor.obterDados(json, dataSeries.class);
		System.out.println(dados);
	}
}
