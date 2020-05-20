package com.company.Family;


public class Family {
    private Marriage marriage;

    private FamilyMember child;
    private String familyName;


    public Family(Marriage marriage, FamilyMember child, String familyName) {
        this.marriage = marriage;
        this.child = child;
        this.familyName = familyName;
    }

    @Override
    public String toString() {

        return "Family{" +
                "marriage=" + marriage +

                ", child=" + child +
                ", familyName='" + familyName + '\'' +
                '}';
    }

    public FamilyMember getHusband() {
        return marriage.getHusband();
    }

    public FamilyMember getWife() {
        return marriage.getWife();
    }
public int wifeAge(){
        return marriage.getWife().getAge();

}

    public FamilyMember getChild() {
        return child;
    }


    public String getFamilyName() {
        return familyName;

    }


    public void setChild(FamilyMember child) {
        this.child = child;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String familyDescription() {
        return getHusband() + " " + getWife() + " " + child;

    }

    public int sumAge() {
        int husbandAge = getHusband().getAge();
        int wifeAge = getWife().getAge();
        int childAge = child.getAge();
        return husbandAge + wifeAge + childAge;

    }

    public double avrAges() {
        int sum = sumAge();
        double avr = sum / 3;

        return avr;
    }


}
