package KPprojects.OrganizerLot.w.model;

import KPprojects.OrganizerLot.w.entity.Flight;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightFromModel {

    private Long id;


    @NotEmpty
    @Size(min = 2, max = 80)
    private String startFligthPoint;


    @NotEmpty
    @Size(min = 2, max = 80)
    private String endFligthPoint;

    @Temporal(TemporalType.DATE)
    private Calendar fligthDate;


//    public FlightFromModel(Flight flight) {
//        this.id=flight.getId();
//        this.startFligthPoint = flight.getStartFligthPoint();
//        this.endFligthPoint = flight.getEndFligthPoint();
//        this.fligthDate = flight.getFligthDate();
//    }
}
