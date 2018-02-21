package KPprojects.OrganizerLot.w.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

//    @Temporal(TemporalType.DATE)
//    private Data fligthDate;



}