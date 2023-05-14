package collection.arrayList;

public class Member {
    private int memberId;       // 회원 아이디
    private String memberName; // 회원 이름

    public  Member(int memberId , String memberName) { //생성자
        this.memberId   = memberId;
        this.memberName = memberName;
    }
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberName() {
        return memberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "회원님의 아이디는 " + memberId +
                "이며 , 회원님 성함은='" + memberName + "입니다." +'\'' +
                '}' ;
    }
}
