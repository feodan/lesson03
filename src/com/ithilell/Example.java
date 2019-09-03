package ithilell;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

public class Example {
        @Test
        public void testOnDev()
        {
            System.setProperty("ENV", "DEV");
            assumeTrue("DEV".equals(System.getProperty("ENV")));
        }

        @Test
        public void testOnProd()
        {
            System.setProperty("ENV", "PROD");
            assumeFalse("DEV".equals(System.getProperty("ENV")));
        }
}
