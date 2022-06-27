public class test2 {
    public static void main(String[] args) {
        Transportation t1 = new Transportation(500, "car");
        Transportation t2 = new Transportation(300, "bus");
        Transportation t3 = new Transportation(400, "train");
        Transportation t4 = new Transportation(1000, "plane");
        t1.choose(500,"xiaoming");
        t2.choose(500,"xiaoming");
        t3.choose(500,"xiaoming");
        t4.choose(500,"xiaoming");
    }
}
