package com.company.SamouczekTasks;

public class StringTest {
    public static void main(String[] args) {
     /*   String aaa = "Coś trzeba napisać i już";
        String kawa = new StringBuilder(aaa).append("Charlie").substring(10).substring(15, 20).concat("gizmo").toString();
        System.out.println(kawa);
        System.out.println(kawa.length());
        System.out.println(kawa.charAt(7));
        System.out.println(kawa.indexOf("a"));
        String kawa1 = new String(aaa);
        String kawa2;
        String kawa3;
        kawa2 = kawa1.toUpperCase();
        System.out.println(kawa2);
        kawa3 = kawa1.toLowerCase();
        System.out.println(kawa2);
        System.out.println(kawa1.equals(kawa2));
        System.out.println(kawa2.equalsIgnoreCase(kawa3));
        System.out.println(kawa2.startsWith("C"));
        System.out.println(kawa2.endsWith("u"));
        System.out.println(kawa2.contains(aaa.toUpperCase()));
        String kawa4 ="\"pocałujcie misia w ogon\"";

        System.out.println(kawa1.replace(aaa,kawa4));
        System.out.println();


    }*/

     /*  String tekst = "Simon says: ";
             System.out.println(tekst.concat("złota rybka"));*/
 /*    int a = 2;
     String kazio = "Kazio Oczo Maniewski cesarza niebieski ";
     String mucha = new StringBuilder(kazio+a).toString();
     System.out.println(mucha
     .trim()
     .toLowerCase()

     );*/

      /*  String gad;
        String nos;
        gad = "plusz";
        nos = "koklusz";
        String oj = new StringBuilder(gad).substring(1);
        String jo = new StringBuilder(nos).substring(1);
        System.out.println(oj.equals(jo));

    }*/
        /*String gad;
        String nos;
        gad = "plusz";
        nos = "koklosz";
        int a = gad.length();
        int b = nos.length();
        int c = a - 3;
        int d = b - 3;

        String oj = new StringBuilder(gad).substring(c, a);
        String jo = new StringBuilder(nos).substring(d, b);
        System.out.println(oj.equals(jo));

    }*/


        String inputTex = "Niewiarygodnie cierpliwy niecierpek";
        boolean a = checkNie(inputTex);
        System.out.println("W podanym tekście są minimum 3 wystapienia słowa 'nie'- " + a);

    }

    public static boolean checkNie(String textToCheck) {
        String phraseToSearch = "nie";
        int index1 = textToCheck.toLowerCase().indexOf(phraseToSearch, 0);
        if (index1 == -1) {
            return false;
        }

        int index2 = textToCheck.toLowerCase().indexOf(phraseToSearch, ++index1);
        if (index2 == -1) {
            return false;
        }

        int index3 = textToCheck.toLowerCase().indexOf(phraseToSearch, ++index2);

        if (index3 == -1) {
            return false;
        } else return true;

    }
}


