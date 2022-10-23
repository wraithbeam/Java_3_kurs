package lab1;

import lab1.dbmodel.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Output output = new Output() {};

        Finder condition = (int a) -> a > 2;

        List<OrgRegistration> orgRegistrations = new ArrayList<>();
        orgRegistrations.add(new OrgRegistration(1, "OOO Spring", "Spring"));
        orgRegistrations.add(new OrgRegistration(2, "OOO Android", "Android"));
        orgRegistrations.add(new OrgRegistration(3, "OOO Rest", "RestAPI"));
        orgRegistrations.add(new OrgRegistration(4, "OOO TornadoFX", "TornadoFx"));
        orgRegistrations.add(new OrgRegistration(5, "OOO Swift", "Swift"));

        orgRegistrations.forEach((el) -> {
            if (condition.condition(el.getId()))
                output.print(el);
        });
    }
}