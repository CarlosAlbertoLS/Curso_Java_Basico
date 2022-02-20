public class Casting {
    public static void main(String[] args) {
        //En un año se ubican en hogares a 30 perritos ¿Cuantos fueron hubicados por mes?
        double monthlyDogs = 30.0 / 12.0 ;
        System.out.println(monthlyDogs);

        //Estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exactitud
        int dogs = 30;
        int month = 12;
        System.out.println((double) dogs/month);

        double c = dogs/month;
        System.out.println(c);

        char num = '1';
        int num1 = num;
        System.out.println(num1);

        short ns = (short) num;
        System.out.println(ns);
    }
}
