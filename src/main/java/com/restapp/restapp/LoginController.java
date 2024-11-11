package com.restapp.restapp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    UserRepo userRepo;

 LoginController(UserRepo userRepo){
     this.userRepo = userRepo;
 }

    /*
    @RequestMapping(path="/auth")
  public ModelAndView loginModel(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Login.html");
        return modelAndView;
    }
    */


    @GetMapping(path = "/auth")
    public String log(){
        return "Login.html";
    }


   @PostMapping(path = "/User.html")
    public  ResponseEntity<User>saveUser(@RequestBody User user){
        userRepo.save(user);
        return ResponseEntity.ok().build();
    }


  

 @PostMapping(path = "/user")
 public String saveUser(@RequestBody User user){

     userRepo.save(user);
     return "User.html";
 }

 /*
    //REST approach
  public ResponseEntity<User> save(@RequestBody User user){
        userRepo.save(user);
        logger.info("error");
        return  ResponseEntity.noContent().build();
  }

  */
    @GetMapping(path = "/view")
   public List<User> find(){
        return userRepo.findAll();
  }




}
