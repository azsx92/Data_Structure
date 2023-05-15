package collection.set;

import collection.arrayList.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이슌신");
        Member memberKie = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKie);
        memberHashSet.addMember(memberKang);
        memberHashSet.showAllMember();
//아이디가 동일한 경우 같은 멤버이므로 중복되지 않도록 Member 클래스의 equals()와 hashCode()메서드를 재정의함
        Member memberHong = new Member(1003, "홍깅동"); // 1003 아이디 중복
        memberHashSet.addMember(memberHong);
        memberHashSet.showAllMember();
    }
}
