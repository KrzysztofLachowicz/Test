package com.company.Family;

public class FamilyTest {

    public static void main(String[] arg) {
        FamilyMember husband = new FamilyMember("Stefan", "Wierzcholski", 37, "mężczyzna");
        FamilyMember wife = new FamilyMember("Łucja", "Wierzcholska", 21, "kobieta");
        FamilyMember son = new FamilyMember("Zbigniew", "Wierzcholski", 1, "mężczyzna");

        Marriage marriage = new Marriage(husband, wife, "20.09.2017");
        Family family = new Family(marriage, son, "Rodzina Wierzcholskich");
       System.out.println(family);
      //  System.out.println(husband);
      /*  System.out.println(husband.shortDescription());
        System.out.println(son.shortDescription());

        System.out.println(family.sumAge());
        System.out.println(family.avrAges());
        System.out.println(family.familyDescription());

        husband.setName("Michał");
        husband.setSurname("Slusrz");
        husband.setAge(58);
        wife.setName("Krystyna");
        wife.setSurname("Slusarz");


        // System.out.println(gfamily);
        System.out.println(husband);
        System.out.println(husband.shortDescription());
        System.out.println(son.shortDescription());

        System.out.println(family.sumAge());
        System.out.println(family.avrAges());
        System.out.println(family.familyDescription());

*/
    }

}
