package com.company.Arrays;

public class ArraysEx1Method {

    public static void main(String[] args) {
        String[][] domesticAnimals = {{"kura", "kaczka"}, {"koń", "świnia"}};
        ArraysEx1NewData newAnimals = new ArraysEx1NewData(domesticAnimals);
        newAnimals.showString();

        ArraysEx1NewData secondAnimal =new ArraysEx1NewData(new String[][]{{"kusy", "kary", "zielony", "czarny"}, {"misio", "słoń","koń", "mucha", "komar"}});
secondAnimal.showString();

secondAnimal.configureText();



       /* double[][] myTable = new double[][]{
                {1.1, 1.2, 1.3},
                {2.1, 2.2, 2.3},
                {3.1, 3.2, 3.3},
                {4.1, 4.2, 4.3}};

        //System.out.println(myTable[1][1]);
        //  System.out.println(myTable.length);
//double [][] myTable2 = {{1, 2},{3, 4}};
        //  System.out.println(myTable2[1][1]);
        //  System.out.println(myTable2.length);
//myTable[0][0]=1;
//myTable[3][2]=77;

    /*    double[] doubles = myTable[0];
        double poz = doubles[1];
        System.out.println(poz);


        for (int j = 0; j < myTable.length; j++) {
            for (int i = 0; i < myTable[j].length; i++) {
                System.out.println(myTable[j][i]);
                myTable[j][0]=77;
            }
        }


        for (double[] insideTable : myTable) {
            for (double internlaValue : insideTable
            ) {
                System.out.println(internlaValue);
            }*/


           /* for (int deeperTble=0; deeperTble< myTable.length; deeperTble++){
                for (int particularValue = 0; particularValue<deeperTble; particularValue++);
                System.out.println();
            }
        }
   /* for (double[] innerTab : myTable){
        for (double j:innerTab){
            System.out.println(j);
        }
*/

       /* String[][] addStringTable = {{"kasza", "mysza", "kosza", "mosza"}, {"błazen", "czesio", "kurtka", "wiśniowy"}};
        showString(addStringTable);

    }
         /*   for (String[] mainTable : addStringTable) {
                for (String slaveTable : mainTable
                ) {
                    System.out.println(slaveTable);
                }

            }*/

    }
}

