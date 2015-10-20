package access.mypackage;

import access.mypackage.AccessClassMembers;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * Created by Thoughtworker on 9/16/15.
 */
public class AccessClassMembersTest {

    AccessClassMembers exercise5;

    @Before
    public void setUp() throws Exception {
        exercise5 = new AccessClassMembers();

    }

    @Test
    public void shouldSeeCompilerMessagesForPublicField() {
        String publicField = exercise5.publicField;

    }

    @Test
    public void shouldSeeCompilerMessageForPrivateField() {
        //String privateField = exercise5.privateField;

    }

    @Test
    public void shouldSeeCompilerMessageForProtectedField() {
        //String protectedField = exercise5.protectedField;

    }

    @Test
    public void shouldSeeCompilerMessagesForPublicMethod() {
        String publicField = exercise5.publicMethod();

    }

    @Test
    public void shouldSeeCompilerMessageForPrivateMethod() {
        String privateField = exercise5.privateMethod();

    }

    @Test
    public void shouldSeeCompilerMessageForProtectedMethod() {
        //String protectedField = exercise5.protectedMethod();

    }
}

class AccessClassProtectedMembersTest {
    @Test
    public void manipulateDataCallsProtectedFieldFromAccessClassMembers(){
        AccessClassMembers accessClassMembersMock = mock(AccessClassMembers.class);
        //You cant do this when classes are in same file, can only have one save class.
        //AccessClassProtectedMembers exercise5 = new AccessClassProtectedMembers(accessClassMembersMock);
//      //exercise5.manipulateData();
//      //verify(accessClassMembersMock).protectedField;
//
    }
}