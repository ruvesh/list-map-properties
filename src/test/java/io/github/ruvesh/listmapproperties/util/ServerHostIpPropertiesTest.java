package io.github.ruvesh.listmapproperties.util;

import io.github.ruvesh.listmapproperties.map.ServerHost;
import org.apache.catalina.Server;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServerHostIpPropertiesTest {

    @Autowired
    ServerHostIpProperties properties;

    @Test
    void shouldLoadHostMapping() {
        Map<String, ServerHost> serverHostMap = properties.hostMapping();
        assertNotNull(serverHostMap);
    }

    @Test
    void shouldLoadCorrectMappingOfHostIp(){
        Map<String, ServerHost> serverHostMap = properties.hostMapping();
        assertEquals("https://dev1.domain.ext", serverHostMap.get("dev1").hostName());
    }

}