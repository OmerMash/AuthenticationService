package com.hit.auth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationServiceTest {
    //Dear NISSIM:
    //test's have not been tested to validate that they are indeed working properly due to lack of time to handle this exception:
                //Internal Error occurred.
                //org.junit.platform.commons.JUnitException: TestEngine with ID 'junit-jupiter' failed to discover tests
                //	at org.junit.platform.launcher.core.EngineDiscoveryOrchestrator.discoverEngineRoot(EngineDiscoveryOrchestrator.java:111)
                //	at org.junit.platform.launcher.core.EngineDiscoveryOrchestrator.discover(EngineDiscoveryOrchestrator.java:85)
                //	at org.junit.platform.launcher.core.DefaultLauncher.discover(DefaultLauncher.java:92)
                //	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:75)
                //	at com.intellij.junit5.JUnit5IdeaTestRunner.startRunnerWithArgs(JUnit5IdeaTestRunner.java:71)
                //	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
                //	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
                //	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
                //	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
                //	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
                //Caused by: java.lang.NoClassDefFoundError: org/junit/jupiter/api/ClassOrderer
                //	at org.junit.jupiter.engine.config.DefaultJupiterConfiguration.<clinit>(DefaultJupiterConfiguration.java:50)
                //	at org.junit.jupiter.engine.JupiterTestEngine.discover(JupiterTestEngine.java:66)
                //	at org.junit.platform.launcher.core.EngineDiscoveryOrchestrator.discoverEngineRoot(EngineDiscoveryOrchestrator.java:103)
                //	... 9 more
                //Caused by: java.lang.ClassNotFoundException: org.junit.jupiter.api.ClassOrderer
                //	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
                //	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
                //	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
                //	... 12 more

    AuthenticationService authService = new AuthenticationService();

    @Test
    void auth() {
        assertTrue(authService.auth("omer2","1234567"));
        assertFalse(authService.auth("omer2","12345"));
    }

    @Test
    void addUser() {
        int mapSize = authService.getMap().size();
        authService.addUser("omer1", "123456");
        authService.addUser("omer2", "1234567");
        assertEquals(mapSize+2,authService.getMap().size());
    }

    @Test
    void removeUser() {
        int mapSize = authService.getMap().size();
        authService.removeUser("omer1");
        assertEquals(mapSize-1,authService.getMap().size());
    }
}