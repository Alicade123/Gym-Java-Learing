public class _2StaticKeyword {
    public static void main (String[] args){

        _2StaticMembers friend1 = new _2StaticMembers();
        _2StaticMembers friend2 = new _2StaticMembers();
        _2StaticMembers friend3 = new _2StaticMembers();
        friend1.setFriend("Arcade");
        friend1.setFriend("Latifa");
        friend2.setFriend("Zed");
//    System.out.println(StaticMembers.numberOfFriends);
        _2StaticMembers.getNumberOfFriends();
    }
}
