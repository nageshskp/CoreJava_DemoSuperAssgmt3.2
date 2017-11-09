class Light {
    // Fields
    private int     Color;
    private boolean Feature;
    private String  Area;

    // Constructors
    Light() {                             
        this(0, false);
        System.out.println("From default constructor no. 1 in class Light");
    }
    Light(int watt, boolean ind) {        
        this(watt, ind, "X");
        System.out.println("From non-default constructor no. 2 in class Light");
    }
    Light(int Color, boolean Feature, String Area) {  
        super();                                                
        this.Color = Color;
        this.Feature = Feature;
        this.Area  = Area;
        System.out.println("From non-default constructor no. 3 in class Light");
    }
}
class Bulb extends Light {
    // Instance variables
    private int Length;
    private int colorNo;

    Bulb(int Length, int colorNo) {                    // (5) Non-default
        this(Length, colorNo, 100, true, "Unknown");
        System.out.println("From non-default constructor no. 1 in class Bulb");
    }

    Bulb(int Length, int colorNo, int Color,
              boolean Feature, String Area) {             // (6) Non-default
        super(Color, Feature, Area);                  // (7)
        this.Length = Length;
        this.colorNo    = colorNo;
        System.out.println("From non-default constructor no. 2 in class Bulb");
    }
}
public class DemoSuper {
    public static void main(String[] args) {
        System.out.println("Bulb object.");
        Bulb tubeLightRef = new Bulb(20, 5);          // (8)
    }
}