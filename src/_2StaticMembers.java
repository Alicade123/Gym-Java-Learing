public class _2StaticMembers {
    static int numberOfFriends;
    String name;
    public void setFriend(String name){
        this.name = name;
        numberOfFriends++;
    }
    public static void  getNumberOfFriends(){
    System.out.println("Number of friends: " + numberOfFriends);

    }

}
