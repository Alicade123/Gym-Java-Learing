package NestedClasses;
class VendingMachine{
    public static class ChocolateBar{

        public String getName(){
            return "Cadbury";
        }

        public double getPrice(){
            return 3.95;
        }
    }
    public static class BagOfChips {
        public String getName(){
            return "Grapes";
        }
        public double getPrice(){
            return  878.90;
        }
    }

}

//public class Main{
//    public static void main(String[] args){
//        VendingMachine.ChocolateBar mikesChocolateBar = new VendingMachine.ChocolateBar();
//        VendingMachine.BagOfChips  gabbysBagOfChips  = new VendingMachine.BagOfChips();
//        System.out.println("Mike's "+mikesChocolateBar.getName()+" chocolate bar costs "+mikesChocolateBar.getPrice());
//        System.out.println("Gabby's "+gabbysBagOfChips.getName()+" bag of chips costs "+gabbysBagOfChips.getPrice());
//    }
//}