package task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    @Test
    void shoudBeNotValidIfParcelDimensionsExceed300 () {
        //Given
        Parcel parcel = new Parcel(50, 200, 70, 25.4f, true);

        //When

        boolean result=Validator.validate(parcel);

        //Then
        Assertions.assertFalse(result);

    }

    @Test
    void shouldBeValidIfParcelDimensionsSumEqual300() {
        //Given
        Parcel parcel = new Parcel(50, 200, 50, 25.4f, true);

        //When

        boolean result=Validator.validate(parcel);

        //Then
        Assertions.assertTrue(result);

    }







}
