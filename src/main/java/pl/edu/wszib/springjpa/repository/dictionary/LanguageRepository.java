package pl.edu.wszib.springjpa.repository.dictionary;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.wszib.springjpa.model.dictionary.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
}
