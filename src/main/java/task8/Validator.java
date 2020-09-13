package task8;

import java.util.ArrayList;
import java.util.List;

public interface Validator {
    static boolean validate(Parcel parcel) {
        List<String> validationMessages = new ArrayList<>();

        if (!(parcel.getxLenght() + parcel.getyLenght() + parcel.getzLenght() <= 300)) {
            validationMessages.add("Przekroczona suma wymiarów");
        }

        if (!(parcel.getxLenght() > 30)) {
            validationMessages.add("Wymiar x mniejszy niż 30");

        }

        System.out.println(validationMessages);

        return validationMessages.isEmpty();


    }
}
