package tienda.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Ilich Dell
 */
public class ProductoService {

    private ProductoDAO dao;
    private FabricanteService fabriServ;
    private Collection<Producto> productos = new ArrayList();
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public ProductoService() {
        this.dao = new ProductoDAO();
        this.fabriServ = new FabricanteService();
    }

    //Cargar producto a la base
    public void crearProducto(String nombre, double precio, Fabricante fabricante) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe cargar el nombre");
            }
            if (fabricante == null) {
                throw new Exception("Debe cargar el fabricante del producto");
            }

            Producto producto = new Producto(nombre, precio, fabricante);
            dao.guardarProducto(producto);

        } catch (Exception e) {
            throw e;
        }
    }

    //Listar productos de la base
    public void listaProductos() throws Exception {
        try {
            productos = dao.listarProductos();

            for (Producto producto : productos) {
                System.out.println("Codigo " + producto.getCodigo() + " , "
                        + "Nombre: " + producto.getNombre() + " , "
                        + "Precio: " + producto.getPrecio() + " , "
                        + "Codigo Fabricante: " + producto.getFabricante().getCodigo());
            }

        } catch (Exception e) {
            throw e;
        }
    }

    //Lista nombre y precio de producto
    public void muestraPrecioNombre() throws Exception {
        try {
            productos = dao.muestraNombrePrecio();

            int i = 1;
            for (Producto producto : productos) {
                System.out.println(i + " Nombre: " + producto.getNombre() + " , "
                        + "Precio: " + producto.getPrecio());
                i++;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //Lista productos cuyo precio estan entre 120 y 202
    public void mostrarPorPrecio() throws Exception {
        try {
            productos = dao.listarPorPrecio();

            int i = 1;
            for (Producto producto : productos) {
                System.out.println(i + " Codigo: " + producto.getCodigo() + " , "
                        + " Nombre: " + producto.getNombre() + " , "
                        + "Precio: " + producto.getPrecio() + " , "
                        + "Codigo de Fabricante: " + producto.getFabricante().getCodigo());
                i++;
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarPortatil() {
        try {
            productos = dao.mostrarProtatil();

            int i = 1;
            for (Producto producto : productos) {
                System.out.println(i + " Codigo: " + producto.getCodigo() + " , "
                        + " Nombre: " + producto.getNombre() + " , "
                        + "Precio: " + producto.getPrecio() + " , "
                        + "Codigo de Fabricante: " + producto.getFabricante().getCodigo());
                i++;
            }
        } catch (Exception e) {
        }
    }

    public void masBarato() throws Exception {
        try {
            Producto producto = dao.masBarato();

            System.out.println("Nombre: " + producto.getNombre() + " , "
                    + "Precio: " + producto.getPrecio());
        } catch (Exception e) {
            throw e;
        }
    }

    public void insertarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe ingresar un usuario");
            }
            dao.guardarProducto(producto);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto() throws Exception {
        try {
            listaProductos();

            System.out.println("\n Ingrese el CODIGO del producto a modificar:");
            Integer codigo = input.nextInt();
            Producto producto = dao.buscarProducto(codigo);

            System.out.println("Producto:");
            System.out.println("Codigo: " + producto.getCodigo() + " , "
                    + "Nombre: " + producto.getNombre() + " , "
                    + "Precio: " + producto.getPrecio() + " , "
                    + "Codigo de fabricante: " + producto.getFabricante().getCodigo());
            System.out.println("\n Modificar: "
                    + "\n 1. Codigo"
                    + "\n 2. Nombre"
                    + "\n 3. Precio"
                    + "\n 4. Codigo de fabricante \n");
            
            int op = input.nextInt();
            
            switch (op) {
                case 1:
                    modificarCodigoProducto(producto);
                    break;
                case 2:
                    modificarNombreProducto(producto);
                    break;
                case 3:
                    modificarPrecioProducto(producto);
                break;  
                case 4:
                    modificarFabricanteProducto(producto);
                break;    
            }

        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void modificarCodigoProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe ingresar un producto");
            }
            
            System.out.println("Modificar codigo");
            System.out.println("Ingrese el codigo del producto, NO puede ser uno ya existente");
            Integer codigo = input.nextInt();
            producto.setCodigo(codigo);
            dao.modificarPorNombre(producto);
            System.out.println("Se muestra el producto");
            dao.mostrarUnProducto(producto.getCodigo());
            System.out.println("Cambio aplicado con exito");
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarNombreProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe ingresar un producto");
            }

            System.out.println("Modificar nombre");
            System.out.println("Ingrese el nuevo nombre del producto:");
            String nombreProd = input.next();
            producto.setNombre(nombreProd);
            dao.modificarPorCodigo(producto);
            System.out.println("Se muestra producto");
            dao.mostrarUnProducto(producto.getCodigo());
            System.out.println("Cambio aplicado con exito.");

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarPrecioProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe ingresar un producto");
            }

            System.out.println("Modificar precio");
            System.out.println("Ingrese el nuevo precio del producto");
            Double precio = input.nextDouble();
            producto.setPrecio(precio);
            dao.modificarPorCodigo(producto);
            System.out.println("Se muestra el producto");
            dao.mostrarUnProducto(producto.getCodigo());
            System.out.println("Cambio aplicado con exito");

        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarFabricanteProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe ingresar un producto");
            }

            System.out.println("Modificar codigo de fabricante");
            System.out.println("Lista de fabricantes");
            fabriServ.mostrarListaFabricante();
            
            System.out.println("Ingrese el codigo de fabricante al producto");
            Integer codigoFab = input.nextInt();
            producto.getFabricante().setCodigo(codigoFab);
            dao.modificarPorCodigo(producto);
            System.out.println("Se muestra el producto");
            dao.mostrarUnProducto(producto.getCodigo());
            System.out.println("Cambio aplicado con exito");

        } catch (Exception e) {
            throw e;
        }
    }

}
