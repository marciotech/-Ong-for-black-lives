package Ong.ongforblacklives;

import Ong.ongforblacklives.model.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OngForBlackLivesApplication<UsuarioRepository> implements CommandLineRunner {

//	@Autowired
//	UsuarioRepository usuarioRepository;


	public static void main(String[] args) {
		SpringApplication.run(OngForBlackLivesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		UsuarioModel usuarioModel = new UsuarioModel();
		usuarioModel.setNome("Vidas Por Vidas");
		usuarioModel.setCidade("Sao Paulo");
		usuarioModel.setBairro("Vila Clara");
		usuarioModel.setCep("04323180");
		usuarioModel.setCnpj("27124636832971");
		usuarioModel.setEmail("vpvidasoficial@uol.com");
		usuarioModel.setArea_de_atuacao("Saude");

		UsuarioModel usuarioModel1 = new UsuarioModel();
		usuarioModel1.setNome("Educar Empodera");
		usuarioModel1.setCidade("Aracaju");
		usuarioModel1.setBairro("Jardins");
		usuarioModel1.setCep("02125265");
		usuarioModel1.setCnpj("758372154329876");
		usuarioModel1.setEmail("educarempodera@gmail.com");
		usuarioModel1.setArea_de_atuacao("Ensino");

		UsuarioModel usuarioModel2 = new UsuarioModel();
		usuarioModel2.setNome("Anjos da Noite");
		usuarioModel2.setCidade("Belo Horizonte");
		usuarioModel2.setBairro("Duque de Caxias");
		usuarioModel2.setCep("04678932");
		usuarioModel2.setCnpj("62145386523861");
		usuarioModel2.setEmail("anjosdanoite@gmail.com");
		usuarioModel2.setArea_de_atuacao("Seguranca");

		UsuarioModel usuarioModel3 = new UsuarioModel();
		usuarioModel3.setNome("Cultura Unida");
		usuarioModel3.setCidade("Rio de Janeiro");
		usuarioModel3.setBairro("Morro do Alemao");
		usuarioModel3.setCep("02132543");
		usuarioModel3.setCnpj("62145386523861");
		usuarioModel3.setEmail("culturaunidadomorro@gmail.com");
		usuarioModel3.setArea_de_atuacao("Lazer");


//		//*
//		usuarioRepository.insert(usuarioModel);
//		usuarioRepository.save(usuarioModel1);
//		usuarioRepository.save(usuarioModel2);
//		usuarioRepository.save(usuarioModel3);
//		//*
	}
}
