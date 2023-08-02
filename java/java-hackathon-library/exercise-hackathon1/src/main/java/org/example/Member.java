package org.example;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private int memberId;
    private  String name;
    private Address address;
    private MemberAccount memberAcc;

    private List <Member> memberList=new ArrayList<>();

    void openAnAccount(int memberId,String name,Address address,MemberAccount memberAcc){
        if (memberList.stream().anyMatch(m->m.memberId==memberId)){
            System.out.println("Account already exits");
        }
        else {
            Member member=new Member();
        }

    }


    public Member(int memberId, String name, Address address, MemberAccount memberAcc) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.memberAcc = memberAcc;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public MemberAccount getMemberAcc() {
        return memberAcc;
    }

    public void setMemberAcc(MemberAccount memberAcc) {
        this.memberAcc = memberAcc;
    }
}
