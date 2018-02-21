package KPprojects.OrganizerLot.w.controller;


import KPprojects.OrganizerLot.w.repository.IFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/flights")
public class FlightListController {

    @Autowired
    private IFlightRepository flightRepository;

    @GetMapping
    public String getAllFlightList(Model model){
        model.addAttribute("flightList", flightRepository.findAll());

        return "allFlights";
    }

}
