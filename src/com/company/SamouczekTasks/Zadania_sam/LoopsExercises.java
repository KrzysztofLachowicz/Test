package com.company.SamouczekTasks.Zadania_sam;

public class LoopsExercises {
    public static void main(String[] args) {
        /*int i = 10;
        while (i>0){
            System.out.println(i);
            i--;
        }


    }

     /*   int arr[] = {2, 11, 45, 9};

        int i = 0;
        while (i < 4) {
            System.out.println(arr[i]);
            i++;

        }*/

      /*  int i=10;
        do{
            System.out.println(i);
            i--;
        }while(i>0);
    }
*/
/*
    int arr[]={2,11,45,9};
      for (int num : arr) {
        System.out.println(num);
    }
}*/
       /* String arr[] = {"hi", "hello", "bye"};
        for (String str : arr) {
            System.out.println(str);
        }*/


        //triangle(5, 0);
        //tree(3);
        //nested();
        //endlessLoop(10);
        //sumNumbersFromUser(4);



         /*   int n = 6;
            for (int i = 1; i <= (n * 2); i++) {
                if (i % 2 != 0) {
                    continue;

                } else {
                    System.out.println(i);

                }
            }*/

     /*   int n = 4, a = 3, c = 1;
      int i;
        for (i = 1; i <= n; i++) {
            c *= a;
            //System.out.println(a + "^" + n + " = " + c);
        }
       System.out.println(a + "^" + n + " = " + c);
    }*/
/*  for (char i = 'A'; i <= 'Z'; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }*/
     /*   String a = "kod";
        String b = "kot";
        int i = 1;
        int j1 = a.charAt(i);
        int j2 = b.charAt(i);
        int c1 = a.length();
        int c2 = b.length();

        for (i = 1; i <= c1; i++) {
            if (a != b) {
                System.out.println("to są inne zdania");
                break;
            }
            System.out.println("Zadnie pierwsze równe zdanie drugie- " + true);

        }*/
        //  String inputTex = "Niewiarygodnie cierpliwy niecierpek";

        // System.out.println("W podanym tekście są minimum 3 wystapienia słowa 'nie'- " + a);
        //  String phraseToSearch = "nie";

        // System.out.println(index);
        //  }

        //public static int checkNie(String textToCheck, String phraseToSearch) {
        String newText = "Niewiarygodnie cierpliwy niecierpek";
        String searchedPhrase = "nie";

        System.out.println(phraseCounter(newText, searchedPhrase));

    }

    public static int phraseCounter(String inputText, String phraseToSearch) {

        int i = 0;
        int sum = 0;
        inputText = inputText.toLowerCase();
        phraseToSearch = phraseToSearch.toLowerCase();
        do {
            i = inputText.indexOf(phraseToSearch, i);
            if (i >= 0) {
                i++;
                sum++;
            }
        }
        while (i>=0);

        return sum;
    }
}






