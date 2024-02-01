package io.github.ruvesh.listmapproperties.util;

import io.github.ruvesh.listmapproperties.list.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdminAccountListPropertiesTest {

    @Autowired
    AdminAccountListProperties properties;

    @Test
    void shouldLoadAdminAccountsFromProperties() {
        List<Admin> admins = properties.admins();
        assertEquals(4, admins.size());
    }

    @Test
    void shouldLoadCorrectAdminAccountFromProperties() {
        List<Admin> admins = properties.admins();
        assertEquals("abc123", admins.get(0).uName());
        assertEquals("network admin", admins.get(0).subRole());
    }
}