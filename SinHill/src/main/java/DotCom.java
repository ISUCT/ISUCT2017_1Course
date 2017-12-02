import java.util.*;

public class DotCom {
    private ArrayList<String> locationCelles;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCelles = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationCelles.indexOf(userInput);
        if (index >= 0) {
            locationCelles.remove(index);

            if (locationCelles.isEmpty()) ;
            result = "Потопил";
            System.out.println("Ой! Вы потопили" + name + " : (");
        } else {
            result = "Попал";
        }
        return result;
    }
}