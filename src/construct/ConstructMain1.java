package construct;

import java.lang.reflect.Member;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 11, 50);
        MemberConstruct member3 = new MemberConstruct("user3", 30);

        MemberConstruct[] members = {member1, member2, member3};

        for(MemberConstruct s : members){
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
    }
}