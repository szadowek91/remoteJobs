package pl.szadowek91.remoteJobs.dto.mapper;

import pl.szadowek91.remoteJobs.dto.ManageUserDetailsDto;
import pl.szadowek91.remoteJobs.entity.UserE;

/**
 * @author PG
 */
public class UserEntityToManageDtoMapper {

    public static ManageUserDetailsDto map (UserE user){
        ManageUserDetailsDto manageUserDetailsDto = new ManageUserDetailsDto();
        manageUserDetailsDto.setUserEAddresses(UserEAddressMapper.mapList(user.getUserEAddresses()));
        manageUserDetailsDto.setEmail(user.getEmail());
        manageUserDetailsDto.setPassword(user.getPassword());
        manageUserDetailsDto.setPhoneNumber(user.getPhoneNumber());
        manageUserDetailsDto.setAdvertE(user.getAdvertE());
        return manageUserDetailsDto;
    }
}
