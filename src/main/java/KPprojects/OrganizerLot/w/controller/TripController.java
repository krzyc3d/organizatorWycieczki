package KPprojects.OrganizerLot.w.controller;


import KPprojects.OrganizerLot.w.repository.IFlightRepository;
import KPprojects.OrganizerLot.w.repository.ITripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trip")
public class TripController {

    @Autowired
    private ITripRepository tripRepository;

    @GetMapping
    public String getAllFlightList(Model model){
//        model.addAttribute("flightList", flightRepository.findAll());

        return "allFlights";
    }

}
