package in.stackroute.ust.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Publication {

    @Id
    @GeneratedValue
    private int id;

    private String title;

    private LocalDate publishedDate;

    public Publication() {
    }
}
