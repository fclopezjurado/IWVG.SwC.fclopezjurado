/**
 * 
 */
package es.upm.miw.swc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author franlopez
 *
 */
public class UserTest {
	private User user;
    
    @Before
    public void before() {
        user = new User(25, "Fran", "López");
    }

    @Test
    public void testUser() {
        assertEquals(25, user.getNumber());
        assertEquals("Fran", user.getName());
        assertEquals("López", user.getFamilyName());
    }

    @Test
    public void testGetNumber() {
        assertEquals(25, user.getNumber());
    }

    @Test
    public void testGetName() {
        assertEquals("Fran", user.getName());
    }

    @Test
    public void testGetFamilyName() {
        assertEquals("López", user.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Fran López", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("F.", user.initials());
    }

}
