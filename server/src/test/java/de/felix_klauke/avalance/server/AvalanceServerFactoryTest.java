package de.felix_klauke.avalance.server;

import de.felix_klauke.avalance.server.config.AvalanceServerConfig;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class AvalanceServerFactoryTest {

    @Test
    public void createAvalanceServer() {
        AvalanceServer avalanceServer = AvalanceServerFactory.createAvalanceServer(new AvalanceServerConfig(""));

        assertNotNull(avalanceServer);
    }

    @Test(expected = AssertionError.class)
    public void testInit() {
        new AvalanceServerFactory();
    }
}
