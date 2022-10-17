package pl.szadowek91.remoteJobs.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class UserE {

    @Id
    @GenericGenerator(name = "id", strategy = "increment")
    @GeneratedValue(generator = "id")
    private Long id;
    private String name;
    private String password;
    private Long phoneNumber;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userE")
    private List<AdvertE> advertE;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "usersE")
    private List<UserEAddress> userEAddresses;

}
