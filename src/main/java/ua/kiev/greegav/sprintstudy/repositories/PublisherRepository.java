package ua.kiev.greegav.sprintstudy.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.kiev.greegav.sprintstudy.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
