import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import vier.Money;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class MoneyTest {


    private Money money = mock(Money.class);

   /* @BeforeEach //vor jedem Testblock nicht vor jedem einzelnen test vor allem wo @test vorsteht
    private void setup() {
        money = new Money();
    }*/

    @Test
    void testAdd() {
        var test = List.of(1, 3, 4, 5);
        assertEquals(test, List.of(1, 3, 4, 5));
        assertTrue(test.contains(1));
        assertThrows(RuntimeException.class, money::error);
        assertEquals(10, money.add(15).subtract(5).getAmount());
    }

    @Test
    void testSubtract() {
        assertNotEquals(11, money.add(15).subtract(5).getAmount());
    }

    @Test
    void errorTest() {
        assertThrows(RuntimeException.class, money::error);
    }
}
