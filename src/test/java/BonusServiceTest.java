import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void calculatregistered() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);


    }
    @org.junit.jupiter.api.Test
    void calculatnotregistered() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 1060;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);


    }
}