package fi.vm.sade.tarjonta.remotingserver;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author mlyly
 */
public class TestUIServiceImpl implements TestUIService {

    private static final Logger LOG = Logger.getAnonymousLogger();

    private static int _index = 0;

    @Override
    public TestObject ping(TestObject obj) {
        LOG.info("ping()... obj=" + obj);

        if (obj == null) {
            obj = new TestObject();
        }

        obj.setBar(new Date());
        obj.setFoo("from server! index=" + _index++);

        LOG.info("ping()... done. returning obj=" + obj);

        return obj;
    }
}
