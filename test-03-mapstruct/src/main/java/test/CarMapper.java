package test;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author Administrator
 */
@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mappings({
            @Mapping(source = "type", target = "carType"),
            @Mapping(source = "numberOfSeats", target = "seatCount")
    })
    CarDTO carToCarDto(Car car);
}
