package pl.szadowek91.remoteJobs.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author PG
 */
@ToString
@Getter
@Setter
public class UserDto {
    private String name;
    private Long phoneNumber;
    private String password;
    private String email;
}


