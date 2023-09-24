package hw2;

import org.junit.jupiter.api.Test;
import ru.shopieva.hw2.Car;
import ru.shopieva.hw2.Motorcycle;
import ru.shopieva.hw2.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car = new Car("BMW", "X5", 2020);
    Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Softail", 2022);

    @Test
    public void testCarInstanceOfVehicle(){
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testNumOofCarWheels(){
        assertEquals(4,car.getNumWheels());
    }
    @Test
    public void testNumOfMotorcycleWheels(){
        assertEquals(2, motorcycle.getNumWheels());
    }
    @Test
    public void testCarSpeed(){
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }
    @Test
    public void testMotorcycleSpeed(){
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }
    @Test
    public void testCarPark(){
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
    @Test
    public void testMotorcyclePark(){
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

}