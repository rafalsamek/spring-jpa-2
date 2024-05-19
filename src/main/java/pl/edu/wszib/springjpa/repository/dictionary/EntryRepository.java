package pl.edu.wszib.springjpa.repository.dictionary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.springjpa.model.dictionary.DictionaryEntry;

import java.util.List;

@Repository
public interface EntryRepository extends JpaRepository<DictionaryEntry, Integer> {
    long countByLanguageCode(String code);

    @Query(value = "select e from DictionaryEntry e where e.word = :text or e.translation = :text or e.description = :text")
    List<DictionaryEntry> search(String text);
}
