public class StaticKeyword{
    public static void main (String[] args){

        StaticMembers friend1 = new StaticMembers();
        StaticMembers friend2 = new StaticMembers();
        StaticMembers friend3 = new StaticMembers();
        friend1.setFriend("Arcade");
        friend1.setFriend("Latifa");
        friend2.setFriend("Zed");
//    System.out.println(StaticMembers.numberOfFriends);
        StaticMembers.getNumberOfFriends();
    }
}
