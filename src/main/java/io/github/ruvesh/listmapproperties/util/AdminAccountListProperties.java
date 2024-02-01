package io.github.ruvesh.listmapproperties.util;

import io.github.ruvesh.listmapproperties.list.Admin;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties("accounts")
public record AdminAccountListProperties(List<Admin> admins) {
}
