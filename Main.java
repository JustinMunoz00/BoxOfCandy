public class Main{
    public static void main(String[] args) {
        Candy one = new Candy("lime");
        Candy two = new Candy("orange");
        Candy three = new Candy("cherry");
        Candy four = new Candy("lemon");
        Candy five = new Candy("grape");
        Candy six = new Candy();
        Candy[][] candies1 = {{six, one, six}, {six, two, six}, {six, six, three}, {six, four, five}};
        BoxOfCandy box1 = new BoxOfCandy(candies1);
        System.out.println(box1.moveCandyToFirstRow(0));
        Candy[][] c = box1.candies();
        for (int i = 0; i < c.length; i++) {
            for (int x = 0; x < c[0].length; x++) System.out.print(c[i][x].getFlavor());
            System.out.println();
        }
    }
}