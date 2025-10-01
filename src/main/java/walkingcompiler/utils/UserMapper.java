package walkingcompiler.utils;
import org.hibernate.validator.constraints.UUID;
import walkingcompiler.Dto.UserDto;
import walkingcompiler.data.models.User;

@UUID
public class UserMapper {

    public static User mapToUserDto(User userDto) {
        return new User(
                userDto.getUserId(),
                userDto.getPassword(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail(),
                userDto.getContact(),
                userDto.getDOB(),
                userDto.getGender(),
                userDto.getAddress(),
                userDto.getCity(),
                userDto.getState(),
                userDto.getCountry(),
                userDto.getZipCode(),
                userDto.getBankName(),
                userDto.getBankAccountType(),
                userDto.getBankAccountNumber()
        );
    }

    public static UserDto mapToUser(UserDto user) {
        return new UserDto(
                user.getUserId(),
                user.getPassword(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getContact(),
                user.getDOB(),
                user.getGender(),
                user.getAddress(),
                user.getCity(),
                user.getState(),
                user.getCountry(),
                user.getZipCode(),
                user.getBankName(),
                user.getBankAccountType(),
                user.getBankAccountNumber()
        );
    }
}
