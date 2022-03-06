package springboot.mm.controller.login;

import org.springframework.web.bind.annotation.*;
import springboot.mm.entity.User;

@RestController
public class login {

    @RequestMapping(value = "/mm/login", method = RequestMethod.POST)
    public Boolean LoginMethod(@RequestBody User user) {
      String userId = user.getUserId();
      String password = user.getPassword();
      if(userId.equals("mm") && password.equals("123456")){
          return true;
      }else {
          return false;
      }
    }
}

