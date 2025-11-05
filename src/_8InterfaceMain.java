public class _8InterfaceMain {
    public static void main(String[] args) {
        _8Rabbit peterRabbit = new _8Rabbit();
        _8Hawk hawk = new _8Hawk();
        _8Fish fish = new _8Fish();
        peterRabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
