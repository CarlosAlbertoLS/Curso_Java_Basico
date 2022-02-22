public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        //Area de un circulo pi*r2
        double area = circleArea(y);
        System.out.println(area);

        //Area de una esfera 4*pi*r2
        System.out.println(sphereArea(y));

        //Volumen de una esfera (4/3) * pi * r3
        System.out.println(sphereVolumen(y));

        System.out.println("Pesos a dolares: " + converToDolar(200,"MXN"));
        System.out.println("Pesos a dolares: " + converToDolar(200,"COP"));


    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripción: Funcion que especificando su moneda convierte una cantidad de dinero a Dolares
     *
     * @param quantity Cantidad de dinero que se va a convertir
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     * */
    public static double converToDolar(double quantity, String currency){
        //MXN COP
        switch(currency){
            case"MXN":
                quantity *= 0.052;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
        }
        return quantity;
    }
}
