package pl.szadowek91.remoteJobs.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class UserE {

    @Id
    @GenericGenerator(name = "id",strategy = "increment")
    @GeneratedValue(generator = "id")
    private Long id;
    private String name;
    private String password;
    private Long phoneNumber;
    private String email;
//    @OneToMany(mappedBy = "user")
//    @JoinColumn(name = "ADVERT_ID")
//    private AdvertE advert;

}
