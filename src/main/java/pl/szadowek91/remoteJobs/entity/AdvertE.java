package pl.szadowek91.remoteJobs.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class AdvertE {

    @Id
    @GenericGenerator(name = "id",strategy = "increment")
    @GeneratedValue(generator = "id")
    private Long id;
    private String name;
    private String description;
    private Double price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private UserE userE;

}
