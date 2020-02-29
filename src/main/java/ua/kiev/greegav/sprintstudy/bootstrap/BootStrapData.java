package ua.kiev.greegav.sprintstudy.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ua.kiev.greegav.sprintstudy.domain.Author;
import ua.kiev.greegav.sprintstudy.domain.Book;
import ua.kiev.greegav.sprintstudy.domain.Publisher;
import ua.kiev.greegav.sprintstudy.repositories.AuthorRepository;
import ua.kiev.greegav.sprintstudy.repositories.BookRepository;
import ua.kiev.greegav.sprintstudy.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher();
        publisher.setName("BHV");
        publisher.setAddress("Next Line");
        publisher.setCity("Kyiv");
        publisher.setState("Ukraine");
        publisher.setZip("01001");

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("DDD", "123345");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        publisher.getBooks().add(ddd);
        ddd.setPublisher(publisher);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        System.out.println("Books: " + bookRepository.count());
        System.out.println("Authors: " + authorRepository.count());
        System.out.println("Publishers: " + publisherRepository.count());
    }
}
