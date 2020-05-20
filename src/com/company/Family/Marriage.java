package com.company.Family;

public class Marriage {

    private FamilyMember husband;
    private FamilyMember wife;

    private String marriageDate;

    public Marriage(FamilyMember husband, FamilyMember wife, String marriageDate) {
        this.husband = husband;
        this.wife = wife;
        this.marriageDate = marriageDate;
    }

    @Override
    public String toString() {
        return "Marriage{" +
                "husband=" + husband +
                ", wife=" + wife +
                ", marriageDate='" + marriageDate + '\'' +
                '}';
    }

    public void setWife(FamilyMember wife) {
        this.wife = wife;
    }

    public void setHusband(FamilyMember husband) {
        this.husband = husband;
    }

    public FamilyMember getWife() {
        return wife;
    }

    public FamilyMember getHusband() {
        return husband;
    }


    public void setMarriageDate(String marriageDate) {
        this.marriageDate = marriageDate;
    }

    public String getMarriageDate() {
        return marriageDate;
    }



}
