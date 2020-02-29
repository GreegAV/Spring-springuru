package ua.kiev.greegav.sprintstudy.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.kiev.greegav.sprintstudy.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
