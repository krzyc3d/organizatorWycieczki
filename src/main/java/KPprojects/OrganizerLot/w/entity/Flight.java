package KPprojects.OrganizerLot.w.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private Long id;

    private String startFligthPoint;

    private String endFligthPoint;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fligthDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartFligthPoint() {
        return startFligthPoint;
    }

    public void setStartFligthPoint(String startFligthPoint) {
        this.startFligthPoint = startFligthPoint;
    }

    public String getEndFligthPoint() {
        return endFligthPoint;
    }

    public void setEndFligthPoint(String endFligthPoint) {
        this.endFligthPoint = endFligthPoint;
    }

    public Date getFligthDate() {
        return fligthDate;
    }

    public void setFligthDate(Date fligthDate) {
        this.fligthDate = fligthDate;
    }
}
