package pl.edu.wszib.springjpa.service.dictionary;

import org.springframework.stereotype.Service;
import pl.edu.wszib.springjpa.model.dictionary.DictionaryEntry;
import pl.edu.wszib.springjpa.repository.dictionary.EntryRepository;
import pl.edu.wszib.springjpa.service.CrudService;

import java.util.List;

@Service
public class EntryService implements CrudService<DictionaryEntry, Integer> {
    private final EntryRepository repository;

    public EntryService(EntryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DictionaryEntry> list() {
        return repository.findAll();
    }

    @Override
    public DictionaryEntry get(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public DictionaryEntry create(DictionaryEntry dictionaryEntry) {
        dictionaryEntry.setId(null);

        return repository.save(dictionaryEntry);
    }

    @Override
    public DictionaryEntry update(DictionaryEntry dictionaryEntry) {
        DictionaryEntry existing = repository.getById(dictionaryEntry.getId());
        existing.setWord(dictionaryEntry.getWord());
        existing.setTranslation(dictionaryEntry.getTranslation());
        existing.setDescription(dictionaryEntry.getDescription());
        existing.setLanguage(dictionaryEntry.getLanguage());

        return repository.save(dictionaryEntry);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Long count() {
        return repository.count();
    }

    public Long countByCode(String code) {
        return repository.countByLanguageCode(code);
    }

    public List<DictionaryEntry> search(String text) {
        return repository.search(text);
    }
}
