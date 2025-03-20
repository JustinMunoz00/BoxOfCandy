public class Candy {
    private String flavor;
    /** Returns a String representing the flavor of this piece of candy */
    public String getFlavor() {
        if (flavor == null) return "";
        return flavor+" ";
    }

    public Candy(String f){
        flavor = f;
    }

    public Candy(){
    }
    // There may be instance variables, constructors, and methods that are not
    // shown.
}