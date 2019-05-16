package br.com.fiap.carService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CarResourceMockTest {

    @Mock
    private CarResource carResource;

    @Test
    public void shouldFindCarByColor() {

        // Stubs
        String color = "preto";
        String model = "up";

        Car car = new Car();

        car.setColor(color);
        car.setModel(model);

        List<Car> cars = Arrays.asList(car);

        // When
        Mockito.when(carResource.findCarByColor(color)).thenReturn(cars);

        // Execute
        List<Car> carsResponse = carResource.findCarByColor(color);

        //Assert
        assertEquals(carsResponse.get(0).getColor(), color);
        assertEquals(carsResponse.get(0).getModel(), model);

    }

}
