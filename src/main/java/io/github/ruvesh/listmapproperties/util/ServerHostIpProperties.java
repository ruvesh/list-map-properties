package io.github.ruvesh.listmapproperties.util;

import io.github.ruvesh.listmapproperties.map.ServerHost;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties("servers")
public record ServerHostIpProperties(Map<String, ServerHost> hostMapping) {
}
