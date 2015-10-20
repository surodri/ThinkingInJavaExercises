package initializationAndCleanupChapter6;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class InitializationCleanupOverloadedMethodsTest {

    @Test
    public void exercise3ShouldPrintMessageFromConstructorWithOutParameters(){
        //looked into , but still dont know how to test system.out.println in constructor
        // makes code more readable
        InitializationAndCleanup.InitializationCleanupOverloadedMethods initializationAndCleanup = new InitializationAndCleanup.InitializationCleanupOverloadedMethods();

    }

    @Test
    public void exercise4ShouldPrintMessageWithParamWhenUsingOverloadedConstructor(){

        InitializationAndCleanup.InitializationCleanupOverloadedMethods overloadedMethods = new InitializationAndCleanup.InitializationCleanupOverloadedMethods("parameter");

    }

    @Test
    public void exercise5CallDogOverloadedMethodsWithDifferentPrimatives(){

        Dog dog = mock(Dog.class);
        InitializationAndCleanup.InitializationCleanupOverloadedMethods overloadedMethods = new InitializationAndCleanup.InitializationCleanupOverloadedMethods(dog);

        overloadedMethods.dogOverLoadedMethods();

        String barkString = "Bark string";
        char barkChar = 'B';

        verify(dog).bark(barkString);
        verify(dog).bark(barkChar);
    }

    @Test
    public void exercise6CallDogOverloadMethodsWithReverserOderArguments(){
        Dog dog = mock(Dog.class);
        InitializationAndCleanup.InitializationCleanupOverloadedMethods overloadedMethods = new InitializationAndCleanup.InitializationCleanupOverloadedMethods(dog);

        overloadedMethods.dogOverLoadedMethods();

        String barkString = "Bark string";
        char barkChar = 'B';

        verify(dog).bark(barkString, barkChar);
        verify(dog).bark(barkString, barkChar);

        //Cade Suggentions verify called in expected order
    }

    @Test
    public void exercise8MethodOCallsMethodsTwice(){

        InitializationAndCleanup.InitializationCleanupOverloadedMethods overloadedMethods = new InitializationAndCleanup.InitializationCleanupOverloadedMethods();

        int calls = overloadedMethods.method1CallsMethod2Twice();

        assertThat(calls).isEqualTo(2);
    }

}
