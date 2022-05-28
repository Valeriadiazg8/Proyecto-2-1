package hotel.proyecto;


public final class App {
    private App() {
    }

    public static void main(String[] args) {        

        Bebida Beb1 = new Bebida("Gaseosa", "Si", 3, 4500);
        Bebida Beb2 = new Bebida("Aromatica", "Si", 1, 2000);
        Bebida Beb3 = new Bebida("café", "Si", 10, 1200);
        Bebida Beb4 = new Bebida("jugo", "Si", 45, 5000);
        Bebida Beb5 = new Bebida("Agua", "No", 0, 2500);

        TipoLicor TL1 = new TipoLicor("Cerveza", "si", 100, 3000);
        TipoLicor TL2 = new TipoLicor("Ron", "si", 25, 50000);
        TipoLicor TL3 = new TipoLicor("Whisky", "si", 15, 85000);
        TipoLicor TL4 = new TipoLicor("Aguardiente", "si", 32, 35000);
        TipoLicor TL5 = new TipoLicor("Vino", "si", 10, 20000);

        Snack Sk1 = new Snack("Papas", "si", 350, 4000);
        Snack Sk2 = new Snack("Maní", "no", 0, 2800);
        Snack Sk3 = new Snack("Galleta", "si", 500, 1200);
        Snack Sk4 = new Snack("Gomas", "si", 2000, 400);
        Snack Sk5 = new Snack("Chocolatina", "si", 200, 2200);

        InventarioBar InB1= new InventarioBar(TL1, Beb1, Sk1);
        InventarioBar InB2= new InventarioBar(TL2, Beb2, Sk2);
        InventarioBar InB3= new InventarioBar(TL3, Beb3, Sk3);
        InventarioBar InB4= new InventarioBar(TL4, Beb4, Sk4);
        InventarioBar InB5= new InventarioBar(TL5, Beb5, Sk5);

        ProductoRestaurante PrR1 = new ProductoRestaurante("Desayuno", "si", 15000);
        ProductoRestaurante PrR2 = new ProductoRestaurante("Almuerzo", "si", 25000);
        ProductoRestaurante PrR3 = new ProductoRestaurante("Cena", "si", 18000);

        Restaurante Res1 = new Restaurante("001", PrR1, 4);
        Restaurante Res2 = new Restaurante("002", PrR2, 4);
        Restaurante Res3 = new Restaurante("003", PrR3, 4);

        Consumido Con1 = new Consumido("202201", InB1, Res1);
        Consumido Con2 = new Consumido("202202", InB4, Res3);
        Consumido Con3 = new Consumido("202203", InB2, Res2);
        Consumido Con4 = new Consumido("202204", InB5, Res3);

        TipoHabitacion TiH1 = new TipoHabitacion("Sencilla", 2, 250000);
        TipoHabitacion TiH2 = new TipoHabitacion("Familiar", 5, 1000000);
        TipoHabitacion TiH3 = new TipoHabitacion("Personal", 1, 100000);

        Habitacion Hab1 = new Habitacion(TiH1, 402, 4);
        Habitacion Hab2 = new Habitacion(TiH2, 205, 2);
        Habitacion Hab3 = new Habitacion(TiH3, 101, 1);


        Hotel H1 = new Hotel("Las Colinas", 7823732, "3014356753", "AV PARALELA, FRENTE HOSPITAL", Res1, InB4);
        Hotel H2 = new Hotel("Las Colinas I", 7823654, "3024547432", "AV 23, FRENTE HOTEL CATEDRAL", Res2, InB3);
        Hotel H3 = new Hotel("Las Colinas II", 7823109, "30378153495", "AV SANTANDER, FRENTE HOSPITALITO", Res3, InB1);
        Hotel H4 = new Hotel("Las Colinas III", 7823453, "3047651234", "AV PANAMERICANA, FRENTE ENTRADA VILLAMARIA", Res2, InB4);
        Hotel H5 = new Hotel("Las Colinas IV", 7823008, "305987523", "AV DEL RIO, FRENTE CRUZ ROJA", Res1, InB5);

        Reserva RV1 = new Reserva("00033", Hab1, "20220527 10:55", "20220523 16:55");
        Reserva RV2 = new Reserva("00034", Hab3, "20220507 13:22", "20220512 17:22");
        Reserva RV3 = new Reserva("00035", Hab2, "20221224 19:30", "20230202 12:30");

        InformacionPago IP1 = new InformacionPago("13:07", "EFECTIVO");
        InformacionPago IP2 = new InformacionPago("22:41", "TRANSACCION");
        InformacionPago IP3 = new InformacionPago("07:26", "CON TARJETA");

        Cliente Cl1 = new Cliente("1003", "JUAN", "PEREZ", "33", "312879763");
        Cliente Cl2 = new Cliente("1134", "MANUELA", "GIL", "27", "3345678933");
        Cliente Cl3 = new Cliente("0987", "NATALIA", "MENDEZ", "30", "3214567654");

        Factura Fact1= new Factura("643483454567654", Cl1, RV1, Con1, H1, IP1);
        Factura Fact2= new Factura("324356578433234", Cl2, RV2, Con2, H2, IP2);
        Factura Fact3= new Factura("009675345567585", Cl3, RV3, Con3, H3, IP3);

        System.out.println(Fact1);
        System.out.println(Fact2);
        System.out.println(Fact3);

        TipoCargo TC1 = new TipoCargo(01, "Administrador");
        TipoCargo TC2 = new TipoCargo(02, "Aseo");
        TipoCargo TC3 = new TipoCargo(03, "Auditor");
        TipoCargo TC4 = new TipoCargo(04, "Gerente");
        TipoCargo TC5 = new TipoCargo(05, "Jefes A y B");
        TipoCargo TC6 = new TipoCargo(06, "Mantenimiento");
        TipoCargo TC7 = new TipoCargo(07, "Recepcionista");

        Empleado Emp1 = new Empleado("1053", "ELIAS", "AGUIRRE", "45", "7697089874", TC1, "Mateli53@gmail.com", "00001");
        Empleado Emp2 = new Empleado("1054", "JUANITA", "SANCHEZ", "23", "32456745454", TC2, "Jsan23@gmail.com", "00002");
        Empleado Emp3 = new Empleado("1055", "VALERIA", "RODAS", "60", "56754365636", TC3, "Vrod60@gmail.com", "00003");
        Empleado Emp4 = new Empleado("1056", "VALENTINO", "POSADA", "19", "3465765858", TC4, "VPos19@gmail.com", "00004");
        Empleado Emp5 = new Empleado("1057", "HAROLD", "VALENCIA", "29", "34534534663", TC5, "HVal@gmail.com", "00005");
        Empleado Emp6 = new Empleado("1058", "NEIDI", "SABOGAL", "38", "3455765878", TC6, "NSab@gmail.com", "00006");
        Empleado Emp7 = new Empleado("1059", "MARIA", "OSPINA", "41", "23423454568", TC7, "MOsp@gmail.com", "00007");

        System.out.println(Emp1);
        System.out.println();
        System.out.println(Emp2);
        System.out.println();
        System.out.println(Emp3);
        System.out.println();
        System.out.println(Emp4);
        System.out.println();
        System.out.println(Emp5);
        System.out.println();
        System.out.println(Emp6);
        System.out.println();
        System.out.println(Emp7);
        System.out.println();



    }
}
