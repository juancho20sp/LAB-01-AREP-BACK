package edu.escuelaing.arep.firsttask.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class ConverterServiceTest {
    ConverterService converterService = new ConverterService();

    @Test
    void contextLoads() {
        //this.converterService = new ConverterService();
    }

    @Test
    public void celsiusToFahrenheitOne() {
        double res = this.converterService.celsiusToFahrenheit(10);
        assertEquals(res, 50.0);
    }

    @Test
    public void celsiusToFahrenheitTwo() {
        double res = this.converterService.celsiusToFahrenheit(27.3);
        assertEquals(res, 81.14);
    }

    @Test
    public void celsiusToFahrenheitThree() {
        double res = this.converterService.celsiusToFahrenheit(123456);
        assertEquals(res, 222252.8);
    }

    @Test
    public void celsiusToFahrenheitFour() {
        double res = this.converterService.celsiusToFahrenheit(-67);
        assertEquals(res, -88.6);
    }

    @Test
    public void celsiusToFahrenheitFive() {
        double res = this.converterService.celsiusToFahrenheit(0);
        assertEquals(res, 32);
    }

    @Test
    public void celsiusToFahrenheitSix() {
        double res = this.converterService.celsiusToFahrenheit(96.685);
        assertEquals(res, 206.033);
    }

    @Test
    public void celsiusToFahrenheitSeven() {
        double res = this.converterService.celsiusToFahrenheit(-0);
        assertEquals(res, 32);
    }

    @Test
    public void fahrenheitToCelsiusOne() {
        double res = this.converterService.fahrenheitToCelsius(0);
        assertEquals(res, -17.7778);
    }

    @Test
    public void fahrenheitToCelsiusTwo() {
        double res = this.converterService.fahrenheitToCelsius(-0);
        assertEquals(res, -17.7778);
    }

    @Test
    public void fahrenheitToCelsiusThree() {
        double res = this.converterService.fahrenheitToCelsius(25);
        assertEquals(res, -3.8889);
    }

    @Test
    public void fahrenheitToCelsiusFour() {
        double res = this.converterService.fahrenheitToCelsius(250);
        assertEquals(res, 121.1111);
    }

    @Test
    public void fahrenheitToCelsiusFive() {
        double res = this.converterService.fahrenheitToCelsius(14589);
        assertEquals(res, 8087.2222);
    }

    @Test
    public void fahrenheitToCelsiusSix() {
        double res = this.converterService.fahrenheitToCelsius(-789);
        assertEquals(res, -456.1111);
    }


}
