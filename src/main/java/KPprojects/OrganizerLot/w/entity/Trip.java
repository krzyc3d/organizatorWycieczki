package KPprojects.OrganizerLot.w.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    private Long id;

    private List itemsToTake;

//    @ForeignKey(endFligthPoint)
//    private ConstraintMode endFligthPoint;


}
