public class Arrays {
    public static void main(String[] args) {
        String[] android = new String[17];
        String days[] = new String[7];

        /*
        * Country       city
        * México        CDMX
        * México        Guadalajara
        * Colombia      Bogotá
        * Colombia      Medellín
        * */
        String[][] cities = new String[4][2];//[Renglones][Filas]

        int[][][] numbers = new int[2][2][2];
        int[][][][] numbers4 = new int[2][2][2][2];

        android[0] ="Apple Pie";
        android[1] = "Banana Bread";
        android[2] = "Cupcake";
        android[3] = "Donut";

        /*System.out.println(android[0]);
        System.out.println(android[1]);
        System.out.println(android[2]);
        System.out.println(android[3]);*/

        /*for (int i = 0; i < android.length; i++) {
            System.out.println(android[i]);
        }*/
        for (String androidVersion: android) {
            System.out.println(androidVersion);
        }

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "DCMX";

        /*for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }*/

        for (String[] pair:cities) {
            for (String name:pair) {
                System.out.println(name);
            }
        }

        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/

        String animals[][][][]= new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";

        System.out.println();
        System.out.println();
        System.out.println(animals[1][0][0][1]);
    }
}
