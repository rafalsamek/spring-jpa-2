package pl.edu.wszib.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.wszib.springjpa.model.Organizacja;

public interface OrganizacjaRepository extends JpaRepository<Organizacja, Long> {
}
