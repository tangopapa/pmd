package test.net.sourceforge.pmd.cpd;

import net.sourceforge.pmd.cpd.Locator;
import junit.framework.TestCase;

public class LocatorTest extends TestCase {

    public void testSimple() {
        Locator l = new Locator("/var/foo.java", 100);
        assertEquals(l.getFile(), "/var/foo.java");
        assertEquals(l.getTokenIndex(), 100);
    }
}

