package se.antons_skafferi;

import org.springframework.boot.SpringApplication;

public class TestAntonsSkafferiSpringApplication {

	public static void main(String[] args) {
		SpringApplication.from(AntonsSkafferiSpringApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
