package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import walkingcompiler.Dto.UserDto;
import walkingcompiler.Services.UserServices;
import walkingcompiler.data.models.User;
import walkingcompiler.utils.UserMapper;

@RestController("/api")
@RequiredArgsConstructor
public class UserController {

    private final UserServices userServices;

    @PostMapping("/Id")
    public ResponseEntity<User> userId(@RequestBody User userDto) {
        User id = userServices.findByUserId(userDto.getUserId());
        return new ResponseEntity<>(UserMapper.mapToUserDto(id), HttpStatus.CREATED);
    }

    @PostMapping("/first")
    public ResponseEntity<User> firstName(@RequestBody UserDto user) {
        User first = userServices.findByFirstName(user.getFirstName());
        return new ResponseEntity<>(UserMapper.mapToUserDto(first), HttpStatus.CREATED);
    }
}
