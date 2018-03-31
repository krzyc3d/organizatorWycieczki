package KPprojects.OrganizerLot.w.controller;


import KPprojects.OrganizerLot.w.entity.Flight;
import KPprojects.OrganizerLot.w.entity.Items;
import KPprojects.OrganizerLot.w.model.UserModel;
import KPprojects.OrganizerLot.w.repository.*;
import KPprojects.OrganizerLot.w.repository.IItemsRepository;
import KPprojects.OrganizerLot.w.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

@Controller
@RequestMapping("/flights")
public class FlightListController {

    private Flight flight;

    @Autowired
    private IFlightRepository flightRepository;

    @Autowired
    private ITripRepository tripRepository;

    @Autowired
    private IItemsRepository itemsRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private IUserRepository userRepository;

    @GetMapping
    public String getAllFlightList() throws ParseException {

    if(flightRepository.findOne(Long.valueOf (1))==null) {

        Flight entity = new Flight ( );
        entity.setStartFligthPoint ("Gdansk");
        entity.setEndFligthPoint ("Roma");
       SimpleDateFormat dateFormat = new SimpleDateFormat ("dd-MM-yyyy HH:mm:ss");
        entity.setFligthDate (dateFormat.parse ("22-02-2019 22:30:00"));

        flightRepository.save (entity);
    }

        return "allFlights";
    }

    @GetMapping("/signIn")
    public  String addUser(){
        userService.intializeSession ();

        return "redirect:/flights/newUser";
    }

    @PostMapping(path="/saveNew")
    public String saveNewUser(@Validated @ModelAttribute("newUser") UserModel newUser,
                                   BindingResult bindingResult) {

        userService.setUserDataForTheSession(newUser);

        Optional.ofNullable(newUser.getEmail())
                .flatMap(email -> userRepository.findFirstByEmail(newUser.getEmail()))
                .ifPresent(existingUser -> bindingResult.addError(new FieldError("newUser", "email",newUser.getEmail(),
                        false, new String[] {"emailExists"}, new Object[] {}, "User with this email already exists")));


        if (bindingResult.hasErrors()) {
            return "redirect:/flights";
        }
return "/flights";
}
}







