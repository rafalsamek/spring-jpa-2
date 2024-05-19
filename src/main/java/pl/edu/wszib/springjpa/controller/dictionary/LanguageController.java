package pl.edu.wszib.springjpa.controller.dictionary;

import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.springjpa.model.dictionary.Language;
import pl.edu.wszib.springjpa.service.dictionary.LanguageService;

import java.util.List;

@RestController
@RequestMapping("/api/dictionary/language")
public class LanguageController {
    private final LanguageService service;

    public LanguageController(LanguageService service) {
        this.service = service;
    }

    @GetMapping
    public List<Language> list() {
        return service.list();
    }

    @GetMapping("/property/count")
    public Long count() {
        return service.count();
    }

    @GetMapping("/{id}")
    public Language get(@PathVariable Integer id) {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PostMapping
    public Language create(@RequestBody Language language) {
        return service.create(language);
    }

    @PutMapping
    public Language update(@RequestBody Language language) {
        return service.update(language);
    }
}
