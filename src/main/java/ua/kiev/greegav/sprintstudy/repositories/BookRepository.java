package ua.kiev.greegav.sprintstudy.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.kiev.greegav.sprintstudy.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
