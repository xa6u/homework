package lecture5;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import static org.junit.Assert.*;

import java.io.File;

public class FileUtilityTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void testFileCreation() throws Exception {
        File file = folder.newFile("text.txt");
        assertTrue(file.exists());
        System.out.println(file.getAbsolutePath());
    }
}
