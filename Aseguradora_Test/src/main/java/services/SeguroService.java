package services;

import entidades.Cliente;
import entidades.Vehiculo;
import enums.Coche;
import enums.Moto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ilich
 *
 * private String documento; private String nombre, apellido, mail, domicilio,
 * telefono; private Vehiculo vehiculo; private ArrayList <Vehiculo> vehiculos;
 *
 * private String marca, modelo; private Integer anio; private long serialMotor,
 * chasis; private String color; private String tipo;
 */
public class SeguroService {

    public String separador = "------------------------------------------------";
    public Scanner input = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Cliente> listaCliente = new ArrayList();

    public Vehiculo crearVehiculo() {
        System.out.println(separador);
        Vehiculo vehiculoTemporal = new Vehiculo();
        int op = 0, op2 = 0;
        String serialMotor = " ";
        String serialChasis = " ";
        boolean flag = false;

        do {
            System.out.println("Seleccione el tipo de vehiculo");
            System.out.println("1. Moto");
            System.out.println("2. Coche");
            op = input.nextInt();
            if (op == 1) {  //entra al apartado MOTO
                do {
                    System.out.println("Seleccione el tipo de Moto");
                    System.out.println("1. Bicimoto \n"
                            + " 2. Scooter \n"
                            + " 3. Maxiscooter \n"
                            + " 4. Chopper o custom \n"
                            + " 5. Trail o multiproposito \n"
                            + " 6. Deportiva \n"
                            + " 7. Naked (desnuda) \n"
                            + " 8. Motocross \n"
                            + " 9. Gran Turismo \n");
                    op2 = input.nextInt();
                    op2--;
                    switch (op2) {
                        case 0:
                            vehiculoTemporal.setTipoMoto(Moto.BICIMOTO);
                            break;
                        case 1:
                            vehiculoTemporal.setTipoMoto(Moto.SCOOTER);
                            break;
                        case 2:
                            vehiculoTemporal.setTipoMoto(Moto.MAXISCOOTER);
                            break;
                        case 3:
                            vehiculoTemporal.setTipoMoto(Moto.CHOPPER);
                            break;
                        case 4:
                            vehiculoTemporal.setTipoMoto(Moto.TRAIL);
                            break;
                        case 5:
                            vehiculoTemporal.setTipoMoto(Moto.DEPORTIVA);
                            break;
                        case 6:
                            vehiculoTemporal.setTipoMoto(Moto.NAKED);
                            break;
                        case 7:
                            vehiculoTemporal.setTipoMoto(Moto.MOTOCROSS);
                            break;
                        case 8:
                            vehiculoTemporal.setTipoMoto(Moto.GRAN_TURISMO);
                            break;
                        default:
                            System.out.println("Debe ingresar una de las opciones de la lista");
                    }
                } while (op2 < 0 || op2 > 8);

            } else if (op == 2) {  //Entra en el apartado coche

                do {
                    System.out.println("Seleccione el tipo de Coche");
                    System.out.println("1. Sedan \n"
                            + " 2. Hatchback \n"
                            + " 3. Coupe \n"
                            + " 4. Vehiculo utilitario deportivo (SUV) \n"
                            + " 5. Auto familiar (Station wagon) \n"
                            + " 6. Crossover \n"
                            + " 7. Convertible \n"
                            + " 8. Vehiculo multiproposito (MPV) \n"
                            + " 9. Pick up \n");
                    op2 = input.nextInt();
                    op2--;

                    switch (op2) {
                        case 0:
                            vehiculoTemporal.setTipoCoche(Coche.SEDAN);
                            break;
                        case 1:
                            vehiculoTemporal.setTipoCoche(Coche.HATCHBACK);
                            break;
                        case 2:
                            vehiculoTemporal.setTipoCoche(Coche.COUPE);
                            break;
                        case 3:
                            vehiculoTemporal.setTipoCoche(Coche.SUV);
                            break;
                        case 4:
                            vehiculoTemporal.setTipoCoche(Coche.STATION_WAGON);
                            break;
                        case 5:
                            vehiculoTemporal.setTipoCoche(Coche.CROSSOVER);
                            break;
                        case 6:
                            vehiculoTemporal.setTipoCoche(Coche.CONVERTIBLE);
                            break;
                        case 7:
                            vehiculoTemporal.setTipoCoche(Coche.MPV);
                            break;
                        case 8:
                            vehiculoTemporal.setTipoCoche(Coche.PICK_UP);
                            break;
                        default:
                            System.out.println("Debe ingresar una de las opciones de la lista");
                    }
                } while (op2 < 0 || op2 > 8);
            }
        } while (op < 1 || op > 2);
        /*
        ================================================================================================
         */

        System.out.println("Ingrese la marca del vehiculo");
        String marca = input.next();
        vehiculoTemporal.setMarca(marca);

        System.out.println("Ingrese el modelo del vehiculo");
        String modelo = input.next();
        vehiculoTemporal.setModelo(modelo);

        System.out.println("Ingrese el año del vehiculo");
        int anio = input.nextInt();
        vehiculoTemporal.setAnio(anio);

        System.out.println("Ingrese el color del vehiculo");
        String color = input.next();
        vehiculoTemporal.setColor(color);

        do {
            if (flag) {
                System.out.println("===El serial debe contener 9 digitos===");
            }
            System.out.println("Ingrese el serial del motor (9 digitos)");
            serialMotor = input.next();
            flag = true;
        } while (serialMotor.length() > 9);

        vehiculoTemporal.setSerialMotor(serialMotor);

        flag = false;
        do {
            if (flag) {
                System.out.println("===El serial debe contener 8 digitos===");
            }
            System.out.println("Ingrese el serial del chasis (ultimos 8 digitos)");
            serialChasis = input.next();
            flag = true;
        } while (serialChasis.length() > 8);

        vehiculoTemporal.setChasis(serialChasis);

        return vehiculoTemporal;
    }

    public Cliente crearCliente() {
        String documento = " ";
        String telefono = " ";
        boolean tieneLetras = false;
        System.out.println(separador);

        do {
            if (tieneLetras) {
                System.out.println("===El documento debe contener solo numeros===");
            }
            System.out.println("Ingrese el numero de documento");
            documento = input.next();
        } while (tieneLetras = (!documento.matches("[0-9]+")));

        System.out.println("Ingrese el nombre del cliente");
        String nombre = input.next();
        System.out.println("Ingrese apellido del cliente");
        String apellido = input.next();
        System.out.println("Ingrese el mail del cliente");
        String mail = input.next();
        System.out.println("Ingrese la direccion de domicilio del cliente");
        String domicilio = input.next();

        do {
            if (tieneLetras) {
                System.out.println("===El telefono debe contener solo numeros===");
            }
            System.out.println("Ingrese el telefono del cliente");
            telefono = input.next();

        } while (tieneLetras = (!telefono.matches("[0-9]+")));

        Vehiculo vTemp = crearVehiculo();

        ArrayList<Vehiculo> listaV = new ArrayList();
        listaV.add(vTemp);

        Cliente clienTemp = new Cliente(documento, nombre, apellido, mail, domicilio, telefono, listaV);

        return clienTemp;
    }

    //Gestion de clientes //
    public void nuevoCliente() {
        String exit = " ", otroVehiculo = " ";
        Cliente cliente;
        Vehiculo vehiculo;

        do {
            cliente = crearCliente();
            listaCliente.add(cliente);

            System.out.println(separador);
            do {
                System.out.println("El cliente tiene otro vehiculo que desee asegurar? S/N");
                otroVehiculo = input.next();
                if (otroVehiculo.equalsIgnoreCase("s")) {
                    vehiculo = crearVehiculo();
                    cliente.getVehiculos().add(vehiculo);
                }
            } while (otroVehiculo.equalsIgnoreCase("s"));

            System.out.println("Desea cargar otro cliente? S/N");
            exit = input.next();
        } while (exit.equalsIgnoreCase("s"));
    }

    public void mostrarListaCliente() {
        System.out.println(separador);
        System.out.println("Clientes cargados hasta ahora");
        int i = 1;
        for (Cliente aux : listaCliente) {
            System.out.println(separador);
            System.out.println("Cliente " + i);
            System.out.println("Documento: " + aux.getDocumento());
            System.out.println("Nombre completo: " + aux.getNombre() + " " + aux.getApellido());
            System.out.println("Email: " + aux.getMail());
            System.out.println("Domicilio: " + aux.getDomicilio());
            System.out.println("Telefono: " + aux.getTelefono() + "\n");
            System.out.println("===Vehiculos de cliente " + i + "===");

            int j = 1, k = 0;
            for (Vehiculo vehiculo : aux.getVehiculos()) {
                System.out.println("===Vehiculo N" + j + "===");
                if (aux.getVehiculos().get(k).getTipoCoche() == null) {  //si no hay coche quiere decir que es moto
                    System.out.println("Moto tipo: " + aux.getVehiculos().get(k).getTipoMoto());
                } else if (aux.getVehiculos().get(k).getTipoMoto() == null) {
                    System.out.println("Coche tipo: " + aux.getVehiculos().get(k).getTipoCoche());
                }
                System.out.println("Marca: " + aux.getVehiculos().get(k).getMarca());
                System.out.println("Modelo: " + aux.getVehiculos().get(k).getModelo());
                System.out.println("Año: " + aux.getVehiculos().get(k).getAnio());
                System.out.println("Serial de motor: " + aux.getVehiculos().get(k).getSerialMotor());
                System.out.println("Serial del chasis: " + aux.getVehiculos().get(k).getSerialMotor());
                System.out.println("Color: " + aux.getVehiculos().get(k).getColor() + "\n");
                j++;
                k++;
            }
            i++;
        }

    }

    public void modificarDatosCliente() {
        System.out.println(separador);
        boolean flag = false;
        System.out.println("Ingrese el documento del cliente a modificar los datos");
        String doc = input.next();
        for (Cliente cliente : listaCliente) {
            if (doc.equals(cliente.getDocumento())) {
                System.out.println("Cliente");
                System.out.println("1. Nombre: " + cliente.getNombre());
                System.out.println("2. Apellido: " + cliente.getApellido());
                System.out.println("3. Email: " + cliente.getMail());
                System.out.println("4. Domicilio: " + cliente.getDomicilio());
                System.out.println("5. Telefono: " + cliente.getTelefono());
                System.out.println("6. No modificar");
                System.out.println(separador);

                System.out.println("Seleccione el campo a modificar");
                int op = input.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Modificar nombre");
                        System.out.println("Ingrese el nuevo nombre");
                        cliente.setNombre(input.next());
                        System.out.println("El cambio se efectuo con exito");
                        flag = true;
                        break;
                    case 2:
                        System.out.println("Modificar apellido");
                        System.out.println("Ingrese el nuevo apellido");
                        cliente.setApellido(input.next());
                        System.out.println("El cambio se efectuo con exito");
                        flag = true;
                        break;
                    case 3:
                        System.out.println("Modificar Email");
                        System.out.println("Ingrese la nueva direccion de Email");
                        cliente.setMail(input.next());
                        System.out.println("El cambio se efectuo con exito");
                        flag = true;
                        break;
                    case 4:
                        System.out.println("Modificar domicilio");
                        System.out.println("Ingrese la nueva direccion de domicilio");
                        cliente.setDomicilio(input.next());
                        System.out.println("El cambio se efectuo con exito");
                        flag = true;
                        break;
                    case 5:
                        System.out.println("Modificar telefono");
                        System.out.println("Ingrese el nuevo numero de telefono");
                        cliente.setTelefono(input.next());
                        System.out.println("El cambio se efectuo con exito");
                        flag = true;
                        break;
                    default:
                        System.out.println("No se modificaran datos");
                        break;
                }
            } else if (!flag) {
                System.out.println("El documento ingresado no esta en la lista de clientes");
            }
        }

    }

    public void eliminarCliente() {
        System.out.println(separador);
        System.out.println("Ingrese el numero de documento de cliente que se dara de baja");
        String doc = input.next();

        for (Cliente cliente : listaCliente) {
            if (doc.equals(cliente.getDocumento())) {
                System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
                System.out.println("Esta seguro de dar de baja? S/N");
                String seguro = input.next();
                if (seguro.equalsIgnoreCase("s")) {
                    listaCliente.remove(cliente);
                    System.out.println("Se ha dado de baja al cliente");
                    break;
                } else {
                    System.out.println("No se dio de baja al cliente");
                    break;
                }

            } else {
                System.out.println("El documento ingresado no se encuentra en la lista de clientes");
            }
        }
    }

    // Gestion Vehiculos //
    public void nuevoVehiculo() {
        System.out.println(separador);
        Vehiculo vTemp;
        System.out.println("Adicionar otro vehciulo a la poliza cliente");
        System.out.println("Ingrese el numero de documento del cliente");
        String doc = input.next();

        for (Cliente cliente : listaCliente) {
            if (doc.equals(cliente.getDocumento())) {
                System.out.println("Cargue el nuevo vehiculo");
                vTemp = crearVehiculo();
                cliente.getVehiculos().add(vTemp);
                break;
            } else {
                System.out.println("El documento ingresado no esta en la lista de clientes");
            }
        }
    }

    public void modificarVehiculo() {
        System.out.println(separador);
        boolean flag = false;
        System.out.println("Modificar datos de vehiculo de un cliente");
        System.out.println("Ingrese el documento del cliente");
        String doc = input.next();

        for (Cliente cliente : listaCliente) {
            if (doc.equals(cliente.getDocumento())) {
                System.out.println("Autos de " + cliente.getNombre());

                int j = 0, i = 1;
                for (Vehiculo aux : cliente.getVehiculos()) {
                    System.out.println(separador);
                    System.out.println("===Vehiculo " + i + "===");
                    if (cliente.getVehiculos().get(j).getTipoCoche() == null) {  //si no hay coche quiere decir que es moto
                        System.out.println("Moto tipo: " + aux.getTipoMoto());
                    } else if (cliente.getVehiculos().get(j).getTipoMoto() == null) {
                        System.out.println("Coche tipo: " + aux.getTipoCoche());
                    }
                    System.out.println("Marca: " + cliente.getVehiculos().get(j).getMarca());
                    System.out.println("Modelo: " + cliente.getVehiculos().get(j).getModelo());
                    System.out.println("Año: " + cliente.getVehiculos().get(j).getAnio());
                    System.out.println("Serial de motor: " + cliente.getVehiculos().get(j).getSerialMotor());
                    System.out.println("Serial del chasis: " + cliente.getVehiculos().get(j).getChasis());
                    System.out.println("Color: " + cliente.getVehiculos().get(j).getColor());
                    j++;
                    i++;
                }

                System.out.println("Indique el numero de vehiculo que desea modificar");
                int pos = input.nextInt();

                flag = false;

                System.out.println("\n 1. Tipo \n"
                        + "2. Marca \n"
                        + "3. Modelo \n"
                        + "4. Año \n"
                        + "5. Serial de motor \n"
                        + "6. Serial del chasis \n"
                        + "7. Color \n");
                System.out.println("Seleccione el campo a modificar");
                int op = input.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Modificar tipo");
                        flag = false;
                        if (cliente.getVehiculos().get(pos - 1).getTipoCoche() == null) {  //si no hay coche quiere decir que es moto

                            System.out.println("1. Bicimoto \n"
                                    + " 2. Scooter \n"
                                    + " 3. Maxiscooter \n"
                                    + " 4. Chopper o custom \n"
                                    + " 5. Trail o multiproposito \n"
                                    + " 6. Deportiva \n"
                                    + " 7. Naked (desnuda) \n"
                                    + " 8. Motocross \n"
                                    + " 9. Gran Turismo \n");
                            System.out.println("Ingrese el nuevo tipo de moto");
                            int op2 = input.nextInt();

                            switch (op2) {
                                case 1:
                                    cliente.getVehiculos().get(pos - 1).setTipoMoto(Moto.BICIMOTO);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 2:
                                    cliente.getVehiculos().get(pos - 1).setTipoMoto(Moto.SCOOTER);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 3:
                                    cliente.getVehiculos().get(pos - 1).setTipoMoto(Moto.MAXISCOOTER);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 4:
                                    cliente.getVehiculos().get(pos - 1).setTipoMoto(Moto.CHOPPER);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 5:
                                    cliente.getVehiculos().get(pos - 1).setTipoMoto(Moto.TRAIL);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 6:
                                    cliente.getVehiculos().get(pos - 1).setTipoMoto(Moto.DEPORTIVA);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 7:
                                    cliente.getVehiculos().get(pos - 1).setTipoMoto(Moto.NAKED);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 8:
                                    cliente.getVehiculos().get(pos - 1).setTipoMoto(Moto.MOTOCROSS);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 9:
                                    cliente.getVehiculos().get(pos - 1).setTipoMoto(Moto.GRAN_TURISMO);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                default:
                                    System.out.println("No se modifico ningun dato");
                                    break;
                            }
                            break;
                        } else if (cliente.getVehiculos().get(pos - 1).getTipoMoto() == null) {
                            flag = false;
                            System.out.println("1. Sedan \n"
                                    + " 2. Hatchback \n"
                                    + " 3. Coupe \n"
                                    + " 4. Vehiculo utilitario deportivo (SUV) \n"
                                    + " 5. Auto familiar (Station wagon) \n"
                                    + " 6. Crossover \n"
                                    + " 7. Convertible \n"
                                    + " 8. Vehiculo multiproposito (MPV) \n"
                                    + " 9. Pick up \n");
                            System.out.println("Seleccione el nuevo tipo de coche");
                            int op3 = input.nextInt();

                            switch (op3) {
                                case 1:
                                    cliente.getVehiculos().get(pos - 1).setTipoCoche(Coche.SEDAN);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 2:
                                    cliente.getVehiculos().get(pos - 1).setTipoCoche(Coche.HATCHBACK);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 3:
                                    cliente.getVehiculos().get(pos - 1).setTipoCoche(Coche.COUPE);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 4:
                                    cliente.getVehiculos().get(pos - 1).setTipoCoche(Coche.SUV);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 5:
                                    cliente.getVehiculos().get(pos - 1).setTipoCoche(Coche.STATION_WAGON);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 6:
                                    cliente.getVehiculos().get(pos - 1).setTipoCoche(Coche.CROSSOVER);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 7:
                                    cliente.getVehiculos().get(pos - 1).setTipoCoche(Coche.CONVERTIBLE);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 8:
                                    cliente.getVehiculos().get(pos - 1).setTipoCoche(Coche.MPV);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                case 9:
                                    cliente.getVehiculos().get(pos - 1).setTipoCoche(Coche.PICK_UP);
                                    System.out.println("Se modifico con exito");
                                    flag = true;
                                    break;
                                default:
                                    System.out.println("No se modifico ningun dato");
                                    break;
                            }
                            break;
                        }
                    case 2:
                        System.out.println("Modificar marca");
                        System.out.println("Ingrese la nueva marca");
                        cliente.getVehiculos().get(pos - 1).setMarca(input.next());
                        System.out.println("Se modifico con exito");
                        flag = true;
                        break;
                    case 3:
                        System.out.println("Modificar modelo");
                        System.out.println("Ingrese el nuevo modelo");
                        cliente.getVehiculos().get(pos - 1).setModelo(input.next());
                        flag = true;
                        break;
                    case 4:
                        System.out.println("Modificar año");
                        System.out.println("Ingrese el nuevo valor de año");
                        cliente.getVehiculos().get(pos - 1).setAnio(input.nextInt());
                        flag = true;
                        break;
                    case 5:
                        boolean flag2 = false;
                        String serial = " ";
                        System.out.println("Modificar serial del motor");
                        do {
                            if (flag2) {
                                System.out.println("El serial debe contener 9 digitos");
                            }
                            System.out.println("Ingrese el nuevo serial de motor (9 digitos)");
                            serial = input.next();
                            flag2 = true;
                        } while (serial.length() > 9 || serial.length() < 1);

                        cliente.getVehiculos().get(pos - 1).setSerialMotor(serial);
                        flag = true;
                        break;
                    case 6:
                        flag2 = false;
                        serial = " ";
                        System.out.println("Modificar serial del chasis");
                        do {
                            if (flag2) {
                                System.out.println("El serial debe contener 8 digitos");
                            }
                            System.out.println("Ingrese el nuevo serial de motor (8 digitos)");
                            serial = input.next();
                            flag2 = true;
                        } while (serial.length() > 8 || serial.length() < 1);

                        cliente.getVehiculos().get(pos - 1).setChasis(serial);
                        flag = true;
                        break;
                    case 7:
                        System.out.println("Modificar color");
                        System.out.println("Ingrese el nuevo color");
                        cliente.getVehiculos().get(pos - 1).setColor(input.next());
                        flag = true;
                        break;
                }
                break;
            } else if ((!doc.equals(cliente.getDocumento())) || (cliente.getDocumento() == null)) {
                System.out.println("El decumento ingresado no esta en la lista de clientes");
            }
        }
    }

    public void eliminarVehiculo() {
        System.out.println(separador);
        boolean flag = false;
        System.out.println("Dar de baja un vehiculo de un cliente");
        System.out.println("Ingrese el documento del cliente");
        String doc = input.next();

        for (Cliente cliente : listaCliente) {
            if (doc.equals(cliente.getDocumento())) {
                System.out.println("Autos de " + cliente.getNombre());

                int j = 0, i = 1;
                for (Vehiculo aux : cliente.getVehiculos()) {
                    System.out.println(separador);
                    System.out.println("===Vehiculo " + i + "===");
                    if (cliente.getVehiculos().get(j).getTipoCoche() == null) {  //si no hay coche quiere decir que es moto
                        System.out.println("Moto tipo: " + aux.getTipoMoto());
                    } else if (cliente.getVehiculos().get(j).getTipoMoto() == null) {
                        System.out.println("Coche tipo: " + aux.getTipoCoche());
                    }
                    System.out.println("Marca: " + cliente.getVehiculos().get(j).getMarca());
                    System.out.println("Modelo: " + cliente.getVehiculos().get(j).getModelo());
                    System.out.println("Año: " + cliente.getVehiculos().get(j).getAnio());
                    System.out.println("Serial de motor: " + cliente.getVehiculos().get(j).getSerialMotor());
                    System.out.println("Serial del chasis: " + cliente.getVehiculos().get(j).getChasis());
                    System.out.println("Color: " + cliente.getVehiculos().get(j).getColor());
                    j++;
                    i++;
                }

                System.out.println("Indique el numero del vehiculo que desea dar de baja");
                int pos = input.nextInt();
                int indice = pos-1;
                System.out.println("Esta seguro? S/N");
                String seguro = input.next();
                
                if (seguro.equalsIgnoreCase("s")) {
                    cliente.getVehiculos().remove(indice);
                    System.out.println("Vehiculo dado de baja");
                    break;
                } else {
                    System.out.println("No se dio de baja el vehicluo");
                }
            } else {
                System.out.println("No se encuentra el documento ingresado");
            }
        }
    }

    public void menuCliente() {
        int op = 0;
        do {
            System.out.println(separador);
            System.out.println("1. Nuevo cliente \n"
                    + "2. Mostrar lista de clientes y sus vehiculos \n"
                    + "3. Modificar datos de cliente \n"
                    + "4. Dar de baja a un cliente \n"
                    + "5. Volver");
            System.out.println("Su opcion");
            op = input.nextInt();
            switch (op) {
                case 1:
                    nuevoCliente();
                    break;
                case 2:
                    mostrarListaCliente();
                    break;
                case 3:
                    modificarDatosCliente();
                    break;
                case 4:
                    eliminarCliente();
                    break;
                case 5:
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;

            }
        } while (op != 5);

    }

    public void menuVehiculo() {
        System.out.println(separador);
        int op = 0;

        do {
            System.out.println(separador);
            System.out.println("1. Cargar nuevo vehiculo de un cliente \n"
                    + "2. Modificar datos de un vehiculo \n"
                    + "3. Mostrar lista cliente \n "
                    + "4. Dar de baja un vehiculo a cliente \n"
                    + "5. Volver \n");
            System.out.println("Seleccione su opcion");
            op = input.nextInt();

            switch (op) {
                case 1:
                    nuevoVehiculo();
                    break;
                case 2:
                    modificarVehiculo();
                    break;
                case 3:
                    mostrarListaCliente();
                    break;
                case 4:
                    eliminarVehiculo();
                    break;
                case 5:
                    System.out.println("Hasta pronto");
                default:
                    System.out.println("Opcion no encontrada");
                    break;
            }
        } while (op != 5);

    }

    public void menuPpal() {
        System.out.println(separador);
        int op = 0;

        do {
            System.out.println(separador);
            System.out.println("1. Gestionar cliente \n"
                    + "2. Gestionar vehiculo \n"
                    + "3. Salir \n");
            System.out.println("Seleccione su opcion");
            op = input.nextInt();

            switch (op) {
                case 1:
                    menuCliente();
                    break;
                case 2:
                    menuVehiculo();
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Disculpe, opcion no encontrada");
                    break;
            }
        } while (op != 3);

    }

    public void mostar(Cliente c) {
        System.out.println(separador);
        System.out.println(c);
    }

}
