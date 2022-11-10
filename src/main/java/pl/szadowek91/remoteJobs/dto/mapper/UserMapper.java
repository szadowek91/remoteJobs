package pl.szadowek91.remoteJobs.dto.mapper;

import pl.szadowek91.remoteJobs.dto.UserDto;
import pl.szadowek91.remoteJobs.entity.UserE;

/**
 * @author PG
 */
public class UserMapper {


    public static UserE userMapper(UserDto userDto) {
        UserE newUser = new UserE();
        newUser.setName(userDto.getName());
        newUser.setPassword(userDto.getPassword());
        newUser.setPhoneNumber(userDto.getPhoneNumber());
        newUser.setEmail(userDto.getEmail());
        return newUser;
    }
}
