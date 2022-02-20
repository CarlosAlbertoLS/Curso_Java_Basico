public class IfStatement {
    public static void main(String[] args) {
    //Se debe verificar si el bluetooth esta avilitado para mandar información
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled){
            //send file
            fileSended++;
            System.out.println("Archivo enviado");
        }else{
            System.out.println("Se debe activar el Bluetooth");
        }
        System.out.println(fileSended);
    }
}
