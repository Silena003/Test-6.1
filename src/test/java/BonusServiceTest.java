import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateWhenRegisteredAndBonusUnderLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);


    }
    @Test
    void shouldСalculateWhenRegisteredAndBonusMoreThanLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);


    }
        @Test void limit1NotRegistered() {
            BonusService service = new BonusService();
            // подготавливаем данные:
            long amount = 1000_60;
            boolean notregistered = true;
            long expected = 10;

            // вызываем целевой метод:
            long actual = service.newData(amount, notregistered);
            assertEquals(expected, actual);

    }
    @Test void moreLimitNotRegistered() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean notregistered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.newData(amount, notregistered);
        assertEquals(expected, actual);

    }
    }