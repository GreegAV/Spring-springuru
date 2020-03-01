package ua.kiev.greegav.sprintstudy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.kiev.greegav.sprintstudy.repositories.AuthorRepository;
import ua.kiev.greegav.sprintstudy.repositories.BookRepository;

@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("authors", authorRepository.findAll());
        return "authors/list";
    }
}
