package collection.arrayList;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이슌신");
        Member memberKie = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKie);
        memberArrayList.addMember(memberKang);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMember();;

        memberArrayList.removeMember(memberHong.getMemberId());
        memberArrayList.showAllMember();
    }
}
