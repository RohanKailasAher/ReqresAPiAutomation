package validations;

import org.junit.Assert;

public class ApiValidations {
    public void testValidation(int response , int expected) {
       Assert.assertEquals(response, expected);

    }

}
