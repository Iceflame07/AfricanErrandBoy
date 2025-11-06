package walkingcompiler.utils;
import org.springframework.stereotype.Component;
import walkingcompiler.Dto.UserDto;
import walkingcompiler.data.models.User;

@Component
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
                userDto.getBankAccountNumber(),
                userDto.getUserVisaCard(),
                userDto.getUserMasterCard1(),
                userDto.getUserMasterCard2(),
                userDto.getUserVerveCard()
        );
    }

    public static UserDto mapToUser(User user) {
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
                user.getBankAccountNumber(),
                user.getUserVisaCard(),
                user.getUserMasterCard1(),
                user.getUserMasterCard2(),
                user.getUserVerveCard()
        );
    }
}
