package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import walkingcompiler.Dto.UserDto;
import walkingcompiler.Services.UserServices;
import walkingcompiler.data.models.User;
import walkingcompiler.utils.UserMapper;

import java.util.List;
import java.util.Optional;

@RestController("/api")
@RequiredArgsConstructor
public class UserController {

    private final UserServices userServices;

    @PostMapping("/Id")
    public ResponseEntity<User> userId(@RequestBody UserDto user) {
        User id = userServices.findByUserId(user.getUserId());
        return new ResponseEntity<>(UserMapper.mapToUserDto(id), HttpStatus.CREATED);
    }

    @PostMapping("/first")
    public ResponseEntity<User> firstName(@RequestBody UserDto user) {
        User first = userServices.findByFirstName(user.getFirstName());
        return new ResponseEntity<>(UserMapper.mapToUserDto(first), HttpStatus.CREATED);
    }

    @PostMapping("/last")
    public ResponseEntity<User> lastName(@RequestBody UserDto user) {
        User last = userServices.findByLastName(user.getLastName());
        return new ResponseEntity<>(UserMapper.mapToUserDto(last), HttpStatus.CREATED);
    }

    @PostMapping("/email")
    public ResponseEntity<User> email(@RequestBody UserDto user) {
        User email = userServices.findByEmail(user.getEmail());
        return new ResponseEntity<>(UserMapper.mapToUserDto(email), HttpStatus.CREATED);
    }

    @PostMapping("/contact")
    public ResponseEntity<User> contact(@RequestBody UserDto user) {
        User contact = userServices.findByContact(user.getContact());
        return new ResponseEntity<>(UserMapper.mapToUserDto(contact), HttpStatus.CREATED);
    }

    @PostMapping("/address")
    public ResponseEntity<User> address(@RequestBody UserDto user) {
        User address = userServices.findByAddress(user.getAddress());
        return new ResponseEntity<>(UserMapper.mapToUserDto(address), HttpStatus.CREATED);
    }
    
    @PostMapping("/city")
    public ResponseEntity<User> city(@RequestBody UserDto user) {
        User city = userServices.findByCity(user.getCity());
        return new ResponseEntity<>(UserMapper.mapToUserDto(city), HttpStatus.CREATED);
    }
    
    @PostMapping("/state")
    public ResponseEntity<User> state(@RequestBody UserDto user) {
        User state = userServices.findByState(user.getState());
        return new ResponseEntity<>(UserMapper.mapToUserDto(state), HttpStatus.CREATED);
    }
    
    @PostMapping("/country")
    public ResponseEntity<User> country(@RequestBody UserDto user) {
        List<User> country = userServices.findByCountry(user.getCountry());
        return new ResponseEntity<>(UserMapper.mapToUserDto((User) country), HttpStatus.CREATED);
    }
    
    @PostMapping("/zipcode")
    public ResponseEntity<User> zipCode(@RequestBody UserDto user) {
        Optional<User> zip = userServices.findByZipCode(user.getZipCode());
        return new ResponseEntity<>(UserMapper.mapToUserDto((User) zip.get()), HttpStatus.CREATED);
    }
    
    @PostMapping("/bank")
    public ResponseEntity<User> bankName(@RequestBody UserDto user) {
        User bank = userServices.findByBankName(user.getBankName());
        return new ResponseEntity<>(UserMapper.mapToUserDto(bank), HttpStatus.CREATED);
    }
    
    @GetMapping
    public ResponseEntity<UserDto> save(@RequestBody User userDto){
        UserDto found = UserMapper.mapToUser(userDto);
        User info = userServices.findByUserId(String.valueOf(found));
        return new ResponseEntity<>(UserMapper.mapToUser(info), HttpStatus.OK);
    }
}
