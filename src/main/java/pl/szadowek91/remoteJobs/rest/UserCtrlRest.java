package pl.szadowek91.remoteJobs.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.szadowek91.remoteJobs.dto.UserDto;
import pl.szadowek91.remoteJobs.dto.mapper.UserMapper;
import pl.szadowek91.remoteJobs.entity.UserE;
import pl.szadowek91.remoteJobs.service.UserService;

/**
 * @author PG
 */
@RestController
@RequiredArgsConstructor
public class UserCtrlRest {

    private final UserService userService;

    @PostMapping("/addUserRest")
    public void addUser(@RequestBody UserDto userDto){
        UserE userE = UserMapper.userMapper(userDto);
        userService.createNewUser(userE);
        System.out.println(userE + " created and saved successfully");

    }


}
