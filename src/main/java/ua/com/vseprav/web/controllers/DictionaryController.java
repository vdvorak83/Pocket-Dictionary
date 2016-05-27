package ua.com.vseprav.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.vseprav.services.DictionaryService;

@Controller
@RequestMapping(value = "/dictionaries")
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("dictionaries", dictionaryService.findAll());
        return "dictionary/dictionaries";
    }

    @RequestMapping(value = "/{id}")
    public String getDictionary(@PathVariable("id") long id, Model model){
        model.addAttribute("dictionary", dictionaryService.findOne(id));
        return "dictionary/show";
    }

}
