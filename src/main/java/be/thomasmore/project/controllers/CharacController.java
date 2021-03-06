package be.thomasmore.project.controllers;

import be.thomasmore.project.model.Charac;
import be.thomasmore.project.repositories.CharacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class CharacController {
    @Autowired
    private CharacRepository characRepository;

    @GetMapping({"characlist"})
    public String characterList(Model model){
        final Iterable<Charac> characs = characRepository.findAll();
        model.addAttribute("characs", characs);
        return "characlist";
    }
    @GetMapping({ "/characdetails/{id}", "/characdetails"})
    public String artistDetails(Model model,
                                @PathVariable(required = false) Integer id) {
        if (id == null) return "characdetails";

        Optional<Charac> optionalCharac = characRepository.findById(id);
        //noinspection OptionalIsPresent
        if (optionalCharac.isPresent()) {
            model.addAttribute("charac", optionalCharac.get());
        }
        return "characdetails";
    }

}
