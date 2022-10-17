package pl.szadowek91.remoteJobs.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class UserEAddress {

    @Id
    @GenericGenerator(name = "id", strategy = "increment")
    @GeneratedValue(generator = "id")
    private Long id;
    private String city;
    private String state;
    private String country;
    private Long zipcode;
    @OneToOne
    @JoinColumn(name = "USER_ID")
    private UserE userE;
    @OneToOne
    @JoinColumn(name = "ADVERT_ID")
    private AdvertE advertE;

}
