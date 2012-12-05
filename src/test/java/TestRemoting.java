import fi.vm.sade.tarjonta.remotingserver.TestObject;
import fi.vm.sade.tarjonta.remotingserver.TestUIService;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author mlyly
 */
@ContextConfiguration(locations = {"classpath:test-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRemoting {

    private static final Logger LOG = Logger.getAnonymousLogger();

    @Autowired
    private TestUIService testUIService;

    @Test
    public void testFoo() {
        LOG.info("testFoo()...");

        LOG.log(Level.INFO, "  testUIService={0}", testUIService);

        TestObject obj1 = new TestObject();
        obj1.setBar(new Date());
        obj1.setFoo("foo!");
        TestObject obj2 = null;

        LOG.log(Level.INFO, "BEFORE CALL: obj1={0}", obj1);
        LOG.log(Level.INFO, "BEFORE CALL: obj2={0}", obj2);

        obj2 = testUIService.ping(obj1);

        LOG.log(Level.INFO, "AFTER CALL: obj1={0}", obj1);
        LOG.log(Level.INFO, "AFTER CALL: obj2={0}", obj2);

        LOG.info("testFoo()... done.");
    }

}
