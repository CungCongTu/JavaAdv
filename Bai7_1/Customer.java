package Bai7_1;

public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        if (member) {
            this.memberType = memberType;
        } else {
            this.memberType = null;
        }
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', member=" + member + ", memberType='" + memberType + "'}";
    }
}
