import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // данные:
        long amount = 100060;
        boolean registered = true;
        long expected = 30;

        // вызываем метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual); // сравнивнение ожидаемого и фактического результатов
    }
    @Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // данные:
        long amount = 100000060;
        boolean registered = true;
        long expected = 500;

        // вызываем метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual); // сравнивнение ожидаемого и фактического результатов
    }
    @Test
    void shouldCalculateUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // данные:
        long amount = 100060;
        boolean registered = false;
        long expected = 10;

        // вызываем метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual); // сравнивнение ожидаемого и фактического результатов
    }
    @Test
    void shouldCalculateUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        // данные:
        long amount = 100000060;
        boolean registered = false;
        long expected = 500;

        // вызываем метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual); // сравнивнение ожидаемого и фактического результатов
    }


}