public class App {
    public static void main(String[] args) throws Exception {

        //declarar variables

        String nombreProducto = "";
        int cantidad = 0;
        double precio = 0;
        double totalCompra = 0;
        String continuar;
        Scanner entrada = new Scanner(System.in);

         do {
        System.out.println("\nBienvenidos a nuestra Tienda de Moda"+"\nAcontinuacion se desplegara el menu :");
        System.out.println("\n(1) CAMISETA"+"\nVALOR: 40.000");
        System.out.println("\n(2) PANTALON"+"\nVALOR: 70.000");
        System.out.println("\n(3) CHAQUETA"+"\nVALOR: 120.000");
        System.out.println("\n(4) ZAPATOS"+"\nVALOR: 90.000");
        System.out.println("\nSELECCIONE EL PRODUCTO");

         int opcion = entrada.nextInt();

        switch (opcion) {
            case 1: nombreProducto = "CAMISETA";
                    precio = 40000;
                break;

            case 2: nombreProducto = "PANTALON";
                    precio = 70000;
                break;
            
            case 3: nombreProducto = "CHAQUETA";
                    precio = 120000;
                break;
            
            case 4: nombreProducto = "ZAPATOS";
                    precio = 90000;
                break;


            default:
                System.out.println("\nOpcion invalida"+"\nEscoja una opcion");
                precio=0;
                break;
        }

        if (precio >=0) {
            System.out.println("Digite la cantidad a comprar");
            cantidad = entrada.nextInt();

            while (cantidad <=0) {
                System.out.println("\nOpcion invalida, Ingrese un numero mayor a 0");
                cantidad = entrada.nextInt();
            }

            double subtotal = precio * cantidad;
            totalCompra += subtotal;

            System.out.println("Producto comprado :"+ nombreProducto);
            System.out.println("Cantidad :"+cantidad);
            System.out.println("subtotal"+subtotal);

            System.out.println("Imprimiendo productos de factura");
            for(int i = 1; i<=cantidad; i++) {

                System.out.println("UNIDAD #"+i);
            }
        }
    


        System.out.println("Desea continuar comprando, (si/no)");
        entrada.nextLine();
        continuar = entrada.nextLine();

    }   while (continuar.equalsIgnoreCase("si"));
  
        System.out.println("\nFACTURA FINAL");
        System.out.println("\nTOTAL A PAGAR"+totalCompra);

        entrada.close();

        

    }
}
