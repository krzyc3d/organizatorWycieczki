package KPprojects.OrganizerLot.w.controller;


import KPprojects.OrganizerLot.w.entity.Items;
import KPprojects.OrganizerLot.w.repository.IFlightRepository;
import KPprojects.OrganizerLot.w.repository.IItemsRepository;
import KPprojects.OrganizerLot.w.repository.ITripRepository;
import KPprojects.OrganizerLot.w.repository.IItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.file.Path;

@Controller
@RequestMapping("/flights")
public class FlightListController {

    @Autowired
    private IFlightRepository flightRepository;

    @Autowired
    private ITripRepository tripRepository;

    @Autowired
    private  IItemsRepository itemsRepository;


    @GetMapping
    public String getAllFlightList(Model model){

        return "allFlights";
    }
//    @PostMapping
//    public String getUsers(Model model) {
////        model.addAttribute("itemsList",  IItemsRepository.findAll());
//
//        return "itemsToTake";
//    }
}
