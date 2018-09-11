package test.start;

import com.iday.test.Car;
import com.iday.test.CarDTO;
import com.iday.test.CarMapper;
import com.iday.test.CarType;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author xiaochangwei
 * @Date 2018/8/1 14:25
 * @Version 1.0
 **/
public class Demo {
    public static void main(String[] args) {
        Car car = new Car("Morrie", 5, CarType.SEDAN);
        System.out.println("========");
        CarDTO dto = CarMapper.INSTANCE.carToCarDto(car);
        System.out.println(dto);
    }
}
