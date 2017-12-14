package lt.it.akademija.Useriai;


import io.swagger.annotations.ApiOperation;

import lt.it.akademija.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produktai")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
//    private final UserServices userServices;
//    private String prisijungesVartotojas;
//    @Autowired
//    public UserController(UserServices userServices ) {
//        this.userServices=userServices;
//    }
//
//
//    @RequestMapping(path = "/user/{nickname}", method= RequestMethod.POST)
//    @ApiOperation(value="Add Product for user" )
//    public void createUser( @PathVariable String nickname) {
//        prisijungesVartotojas=nickname;
//        if (userServices.userExists(nickname)){
//
//        }else {
//            userServices.createUser(nickname);
//        }
//
//    }













}
