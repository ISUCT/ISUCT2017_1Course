import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alpacoords = new String[comSize];
        String temp = null;
        int[] coords = new int[comSize];
        int attempts = 0;
        boolean succes = false;
        int location = 0;

        comCount++;
        int incr = 1;
        if ((comCount % 2) == 1) {
            incr = gridLength;
        }

        while (!succes & attempts++ < 200) {
            location = (int) (Math.random() * gridSize);
            //System.out.println("�������" = location);
            int x = 0;
            succes = true;
            while (succes && x < comSize) {
                if (grid[location] == 0) {
                    coords[x++] = location;
                    location += incr;
                    if (location >= gridSize) {
                        succes = false;
                    }
                } else {
                    // System.out.print("������������" + location);
                }
            }
        }
        int x = 0;
        int row = 0;
        int colum = 0;
        // System.out.println("\n");
        while (x < comSize) {
            grid[coords[x]] = 1;
            row = (int) (coords[x] / gridLength);
            colum = coords[x] % gridLength;
            temp = String.valueOf(alphabet.charAt(colum));

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            //System.out.ptintln("\n");
        }
        return alphaCells;

    }
}
