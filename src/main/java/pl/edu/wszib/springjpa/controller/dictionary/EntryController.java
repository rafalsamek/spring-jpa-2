package pl.edu.wszib.springjpa.controller.dictionary;

import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.springjpa.model.dictionary.DictionaryEntry;
import pl.edu.wszib.springjpa.service.dictionary.EntryService;

import java.util.List;

@RestController
@RequestMapping("/api/dictionary/entry")
public class EntryController {
    private final EntryService service;

    public EntryController(EntryService service) {
        this.service = service;
    }

    @GetMapping
    public List<DictionaryEntry> list() {
        return service.list();
    }

    @GetMapping("/property/count")
    public Long count(@RequestParam(required = false) String code) {
        if (code == null) {
            return service.count();
        } else {
            return service.countByCode(code);
        }
    }

    @GetMapping("/operation/search")
    public List<DictionaryEntry> search(@RequestParam String text) {
        return service.search(text);
    }

    @GetMapping("/{id}")
    public DictionaryEntry get(@PathVariable Integer id) {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PostMapping
    public DictionaryEntry create(@RequestBody DictionaryEntry dictionaryEntry) {
        return service.create(dictionaryEntry);
    }

    @PutMapping
    public DictionaryEntry update(@RequestBody DictionaryEntry dictionaryEntry) {
        return service.update(dictionaryEntry);
    }
}
