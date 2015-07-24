import BuchiAutomata.Buchi;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by svozil on 21.07.15.
 */
public class AsciiTest {
    @Test
    public void test1() throws FileNotFoundException {

        ParseAscii pa = new ParseAscii();
        File test1 = new File("tests/test1");
        Buchi b = pa.parseAscii(test1);
        assertThat("Buchi sucked", b.getAdjList().length==5);

    }
}
