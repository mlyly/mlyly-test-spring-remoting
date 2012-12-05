package fi.zcode.remoting;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mlyly
 */
public class TestObject implements Serializable {

    String foo;
    Date bar;

    @Override
    public String toString() {
        return "TestObject[bar=" + bar + ", foo=" + foo + "]";
    }

    public Date getBar() {
        return bar;
    }

    public String getFoo() {
        return foo;
    }

    public void setBar(Date bar) {
        this.bar = bar;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

}
