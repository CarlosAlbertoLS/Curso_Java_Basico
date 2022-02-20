public class DataTypes {
    public static void main(String[] args) {
        //enteros
        byte day = 127;
        short data = 32_767;
        int number = 2_147_483_647;
        long user = 9_223_372_036_854_775_807L;
        System.out.println(user);

        //punto flotante
        float inch = 3.123456789123456789F;
        double total = 1.78945612303216548;

        //carateres
        var validate = 'a';
        var name = "Carlos";

        //logicos
        var isLogged = false;

        //ejemplo
        var salary = 1000;
        //pension 3%
        var pension = salary * 0.03;
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Carlos López";
        System.out.println("Employee: "+ employeeName + "\nSalary: " + totalSalary);
    }
}
