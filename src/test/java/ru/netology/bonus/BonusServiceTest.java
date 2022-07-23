package ru.netology.bonus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "30,1000,true"
//    })
    @CsvFileSource(files = "src/test/resources/data.csv")
    void shouldCalcBonusForUser(int expected, int amount, boolean isRegistered) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, isRegistered);
        Assertions.assertEquals(expected, actual);
    }
}
