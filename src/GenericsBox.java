public class GenericsBox {
    public static void main(String[] arg){
        GenBox <String> boxA = new GenBox<String>();
        GenBox <Integer> boxB = new GenBox<>();
        GenBox <Boolean> boxC = new GenBox<>();
        GenBox<Double> boxD = new GenBox<>();
        GenBox<Number> boxE = new GenBox<>();
        //...

        //Setting the string generic the generic values for strings
        boxA.setItems("A");
        System.out.println(boxA.getItems());

        //Setting and Getting the generic values for integers
        boxB.setItems(100);
        System.out.println(boxB.getItems());

        //Setting and Getting the generic values for booleans
        boxC.setItems(false);
        System.out.println(boxC.getItems());

        //Setting and Getting the generic values for doubles
        boxD.setItems(990.76);
        System.out.println(boxD.getItems());

        //...

        GenProduct<String, Integer> product1 = new GenProduct<>();
        GenProduct<String, Double> product2 = new GenProduct<>();
        product1.setItems("iPhone 17");product2.setItems("Chopper");
        product1.setPrice(1500);product2.setPrice(170.99);
        System.out.println(product1.getItems()+" : "+ product1.getPrice());
        System.out.println(product2.getItems()+" : "+ product2.getPrice());
    }
}
