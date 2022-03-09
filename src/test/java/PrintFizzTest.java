import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class PrintFizzTest {
    private PrintFizz printFizz;

    @BeforeEach
    void setUp() {
        printFizz = new PrintFizz();
    }

    @Test
    void checkPrintFizz() {
        Assertions.assertEquals("Fizz",printFizz.printFizz(9));
    }
    @Test
    void checkPrintFizznumbernotmultipleof3() {
        Assertions.assertEquals("",printFizz.printFizz(14));
    }


}





