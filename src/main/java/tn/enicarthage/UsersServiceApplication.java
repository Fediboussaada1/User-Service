package tn.enicarthage;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class UsersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(UserRepository userRepository,
							RepositoryRestConfiguration restConfiguration){
		return args->{
			restConfiguration.exposeIdsFor(Utilisateur.class);
			userRepository.save(new Utilisateur(11411925,"fedi","boussaada","25/06/1999",50503035,"H","bizerte","fediboussaada1@gmail.com","50503035"));
		};
	}

}
