package ENUMS;

public enum Day {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7),
    PIZZADAY(8);
    private final int numberDay;
    Day(int numberDay) {
        this.numberDay = numberDay;
    }

    public int getNumberDay() {
        return numberDay;
    }


}
