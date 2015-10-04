package initializationAndCleanupChapter6;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InitializationAndCleanupTest{

    @Test
    public void exersice1ShouldReturnNullWheStringFieldIsNotInitialized(){

        InitializationAndCleanup initializationAndCleanup = new InitializationAndCleanup();

        String expectedValue = initializationAndCleanup.exercise1();

        assertThat(expectedValue).isNull();
    }

    @Test
    public void exersice1ShouldReturnStringValueWhenunitiliazedStringIsInitialized(){

        InitializationAndCleanup initializationAndCleanup = new InitializationAndCleanup();
        String strValue = "initialized";
        initializationAndCleanup.setUnitializedStringField(strValue);

        String expectedValue = initializationAndCleanup.exercise1();

        assertThat(expectedValue).isEqualTo(strValue);
    }

    @Test
    public void exercise2InitializeFieldAtPointOfDefinition(){

        //You cant set a different initial value for the field. call only change if have setter
        InitializationAndCleanup initializationAndCleanup = new InitializationAndCleanup();

        String expectedValue = initializationAndCleanup.exercise2();

        assertThat(expectedValue).isEqualTo( "initializedAtDefinition");
    }

    @Test
    public void exercise2InitializeFieldInConstructor(){

        //This is better when you used objects in the class that require an output for a specific setup
        //Allows mocking the parameters
        // makes code more readable
        InitializationAndCleanup initializationAndCleanup = new InitializationAndCleanup("initializedInConstructor");

        String expectedValue = initializationAndCleanup.exercise2();

        assertThat(expectedValue).isEqualTo("initializedInConstructor");
    }


}