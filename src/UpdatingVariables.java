public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono $200
        salary += 200;
        System.out.println(salary);

        //pensión: $50 descuento
        salary -= 50;
        System.out.println(salary);

        //2 horas extra $30 c/u
        //Cupon de comida: $45
        salary += (30*2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Carlos";
        employeeName += " López";
        System.out.println(employeeName);
    }
}
