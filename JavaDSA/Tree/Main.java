package JavaDSA.Tree;

public class Main {
    public static void main(String[] args) {
        // With Array

        ArrayNode Drinks = new ArrayNode("drinks");
        ArrayNode Hot = new ArrayNode("hot");
        ArrayNode Cold = new ArrayNode("cold");
        Drinks.addNode(Cold);
        Drinks.addNode(Hot);
        ArrayNode Tea = new ArrayNode("tea");
        ArrayNode Coffee = new ArrayNode("coffee");
        ArrayNode Coke = new ArrayNode("Coke");
        Hot.addNode(Tea);
        Hot.addNode(Coffee);
        Cold.addNode(Coke);
       System.out.println( Drinks.print(0));
    }
}
