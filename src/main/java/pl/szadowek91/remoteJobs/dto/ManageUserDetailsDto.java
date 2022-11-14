package pl.szadowek91.remoteJobs.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pl.szadowek91.remoteJobs.entity.AdvertE;
import pl.szadowek91.remoteJobs.entity.UserEAddress;

import java.util.List;

/**
 * @author PG
 */
@ToString
@Getter
@Setter
public class ManageUserDetailsDto {

    private String name;
    private String password;
    private Long phoneNumber;
    private String email;
    private List<AdvertE> advertE;
    private List<UserEAddress> userEAddresses;
}
