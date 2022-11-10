package pl.szadowek91.remoteJobs.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pl.szadowek91.remoteJobs.dto.UserDto;
import pl.szadowek91.remoteJobs.dto.mapper.UserMapper;
import pl.szadowek91.remoteJobs.entity.UserE;
import pl.szadowek91.remoteJobs.service.UserService;

/**
 * @author PG
 */
@Controller
@RequiredArgsConstructor
public class UserCtrl {

    private final UserService userService;

    @GetMapping
    public String homePage(){
        return "home";
    }

    @GetMapping("/register")
    public String registerNewUser(Model model){
        model.addAttribute("dto", new UserDto());
        return "register";
    }


    @PostMapping("/addUser")
    public String addUser(UserDto userDto){
        UserE userE = UserMapper.userMapper(userDto);

        userService.createNewUser(userE);
        System.out.println(userE + " created and saved successfully");
        return "redirect:/";

    }
}
