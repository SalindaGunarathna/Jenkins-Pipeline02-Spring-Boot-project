package com.example.demo.model;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testUserConstructorAndGetters() {
        // Arrange
        String username = "testuser";
        String password = "testpass";
        String role = "USER";

        // Act
        User user = new User(username, password, role);

        // Assert
        assertEquals(username, user.getUsername());
        assertEquals(password, user.getPassword());
        assertEquals(role, user.getRole());
    }

    @Test
    public void testSetUsername() {
        // Arrange
        User user = new User("olduser", "testpass", "USER");
        String newUsername = "newuser";

        // Act
        user.setUsername(newUsername);

        // Assert
        assertEquals(newUsername, user.getUsername());
    }

    @Test
    public void testSetPassword() {
        // Arrange
        User user = new User("testuser", "oldpass", "USER");
        String newPassword = "newpass";

        // Act
        user.setPassword(newPassword);

        // Assert
        assertEquals(newPassword, user.getPassword());
    }

    @Test
    public void testSetRole() {
        // Arrange
        User user = new User("testuser", "testpass", "USER");
        String newRole = "ADMIN";

        // Act
        user.setRole(newRole);

        // Assert
        assertEquals(newRole, user.getRole());
    }
}
