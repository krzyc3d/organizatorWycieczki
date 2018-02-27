package KPprojects.OrganizerLot.w.controller;


import KPprojects.OrganizerLot.w.entity.Items;
import KPprojects.OrganizerLot.w.repository.IItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private IItemsRepository itemsRepository;

    @GetMapping
    public String getItems(Model model) {
        model.addAttribute("item", itemsRepository.findAll());

        return "trip";
    }

    @GetMapping(path = "/add")
    public String addItem(Model model) {
        Items newItem = new Items();

        model.addAttribute("newItem", newItem);

        return "newItem";
    }

    @PostMapping(path = "/saveItem")
    public String saveNewItem(Items newItem) {
        itemsRepository.save(newItem);

        return "redirect:/items";

    }
}
