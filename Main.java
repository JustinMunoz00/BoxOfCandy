public class Main{
    public static void main(String[] args) {
        Candy one = new Candy("lime");
        Candy two = new Candy("orange");
        Candy three = new Candy("cherry");
        Candy four = new Candy("lemon");
        Candy five = new Candy("grape");
        BoxOfCandy box1 = new BoxOfCandy(new Candy[][]{{null, one, null}, {null, two, null}, {null, null, three}, {null, four, five}});
        System.out.println(box.moveCandyToFirstRow(0));
        System.out.println(box1.candies());
    }
}