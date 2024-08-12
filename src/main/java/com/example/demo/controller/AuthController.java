package com.example.demo.controller;


import com.example.demo.dto.SignupDto;
import com.example.demo.model.user.AuthUser;
import com.example.demo.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path= "/auth")
public class AuthController {


    private UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(@RequestParam(value = "error",required = false) String error, Model model){
        model.addAttribute("error",error);
        return "auth/login";
    }

    @GetMapping("/unAuth")
    public String unAuthentication(){
        return "/auth/unAuthentication";
    }
    @GetMapping("/noAccess")
    public String noAccess(){
        return "/auth/NoAccessPage";
    }

    @GetMapping("/logout")
    public String logout( Model model){
//        model.addAttribute("error",error);
        return "auth/logout";
    }
    @GetMapping("/signup")
    public String signup(){
        return "auth/signup";
    }
    @PostMapping("/signup")
    public String signup(SignupDto signupDto){
        AuthUser user = AuthUser.builder()
                .name(signupDto.name())
                .username(signupDto.username())
                .password(signupDto.password()).build();
        userService.save(user);
        return "redirect:auth/login";
    }
}
