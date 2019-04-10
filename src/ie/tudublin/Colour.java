package ie.tudublin;

public class Colour {

    private String colour;
    public int r;
    public int g;
    public int b;
    public int value;
    public int TableRow;

    // table for colours
    public Colour(TableRow row) {
        colour = row.getString("Colour");
        r = row.getInt("r");
        g = row.getFloat("g");
        b = row.getFloat("b");
        value = row.getFloat("value");
    }


    // constructor
    public Colour(String colour, int r, int g , int b, int value){
        this.colour = colour;
        this.r = r;
        this.g = g;
        this.b = b;
        this.value = value;
    }

    // Getters

    public String getColour() {
        return colour;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public int getValue() {
        return value;
    }

    //toStrong method
    public String toString()
    {
        return colour + "\t" + r + "\t" + g + "\t" + b + "\t" + value;
    }
}
