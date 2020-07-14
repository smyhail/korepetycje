package com.sub.korepetycje;

import com.sub.korepetycje.enities.Person;
import com.sub.korepetycje.repositories.KorepetycjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KorepetycjeApplication implements CommandLineRunner {

	@Autowired
	private KorepetycjeRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(KorepetycjeApplication.class, args);
	}

	@Override
	public void run(String[] args) throws Exception {

		repo.save(new Person("Tymoteusz ", "Majchrzak", "Gliwice", true));
		repo.save(new Person("Jakub ", "Bielecki", "Wrocław", false));
		;
		repo.save(new Person("Liliana ", "Sobczak", "Czestachowa", true));
		repo.save(new Person("Franciszek ", "Kacprzak", "Łodz", false));
		repo.save(new Person("Julia ", "Piotrowska", "Warszawa", true));
		repo.save(new Person("Szymon ", "Jankowski", "Poznań", false));
		repo.save(new Person("Martyna ", "Przybylska", "Sieradz", true));
		repo.save(new Person("Urszula ", "Smolińska", "Gdynia", false));
		repo.save(new Person("Jagkub ", "Bielecki", "Wrocław", false));
		;
		repo.save(new Person("Liliana ", "Sobczak", "Czestachowa", true));
		repo.save(new Person("Franciszek ", "Kacprzak", "Łodz", false));
		repo.save(new Person("Julia ", "Piotrowska", "Warszawa", true));
		repo.save(new Person("Szymon ", "Jankowski", "Poznań", false));
		repo.save(new Person("Martyna ", "Przybylska", "Sieradz", true));
		repo.save(new Person("Urszula ", "Smolińska", "Gdynia", false));
	}

}
