package KPprojects.OrganizerLot.w.service;

import KPprojects.OrganizerLot.w.model.FlightFromModel;
import KPprojects.OrganizerLot.w.repository.IFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class FlightService {

    private FlightFromModel flightFromModel;



    @Autowired
    private IFlightRepository flightRepository;



    @PostConstruct
    public void initSesja() {
        newFlight();
    }

    public void newFlight() {
        flightFromModel = new FlightFromModel();
    }

//    public void setFlightDataToSession(FlightFromModel flightFormModel) {
//        this.flightFromModel.setId(userFormModel.getEmail());
//        this.userFormModel.setFirstName(userFormModel.getFirstName());
//        this.userFormModel.setSurname(userFormModel.getSurname());
//        this.userFormModel.setName(userFormModel.getName());
//        this.userFormModel.setPassword(userFormModel.getPassword());
//        this.userFormModel.setSex(userFormModel.getSex());
//    }




}
