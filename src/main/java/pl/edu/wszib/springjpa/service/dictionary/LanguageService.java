package pl.edu.wszib.springjpa.service.dictionary;

import org.springframework.stereotype.Service;
import pl.edu.wszib.springjpa.model.dictionary.Language;
import pl.edu.wszib.springjpa.repository.dictionary.LanguageRepository;
import pl.edu.wszib.springjpa.service.CrudService;

import java.util.List;

@Service
public class LanguageService implements CrudService<Language, Integer> {
    private final LanguageRepository repository;

    public LanguageService(LanguageRepository repository) {
        this.repository = repository;
    }

    public List<Language> list() {
        return repository.findAll();
    }

    @Override
    public Language get(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public Language create(Language language) {
        language.setId(null);

        return repository.save(language);
    }

    @Override
    public Language update(Language language) {
        Language existing = repository.getById(language.getId());
        existing.setCode(language.getCode());
        existing.setName(language.getName());

        return repository.save(existing);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public long count() {
        return repository.count();
    }
}
