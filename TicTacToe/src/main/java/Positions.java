/**
 * Created by mfreyre on 8/6/15.
 */
public class Positions {

    private String positionNumber;
    private String appearance = "    ";


    public void placeSymbol(String symbol) {
        appearance = "  " + symbol + "  ";


    }

    @Override
    public String toString() {
        return appearance;
    }
}
