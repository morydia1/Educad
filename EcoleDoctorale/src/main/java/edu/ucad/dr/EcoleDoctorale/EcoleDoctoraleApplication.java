package edu.ucad.dr.EcoleDoctorale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import edu.ucad.dr.EcoleDoctorale.dao.CandidatRepository;
import edu.ucad.dr.EcoleDoctorale.entities.Candidat;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class EcoleDoctoraleApplication implements CommandLineRunner{

	@Autowired
	CandidatRepository candidatRepository;

	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(EcoleDoctoraleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Candidat.class);
		
		candidatRepository.save(new Candidat(null,"DIA","Mory"));
		candidatRepository.save(new Candidat(null,"DIOP","Fatou"));

		candidatRepository.findAll().forEach((c) -> {
			System.out.println(c.toString());
		});
	}

}
