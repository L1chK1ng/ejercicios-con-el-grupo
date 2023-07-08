package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.services.FabricanteService;

/**
 *
 * @author Ilich Dell
 */
public final class ProductoDAO extends DAO {

    private FabricanteService fabriService;
    private Collection productos = new ArrayList();

    public ProductoDAO() {
        this.fabriService = new FabricanteService();
    }

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }

            String query = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante)"
                    + "Values ('" + producto.getCodigo() + "' , '"
                    + producto.getNombre() + "' , '" + producto.getPrecio() + "' , '"
                    + producto.getFabricante().getCodigo() + "')";

            insertModifyDelete(query);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarPorCodigo(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }

            String query = "UPDATE producto SET " + 
                    "nombre= '" + producto.getNombre() + "' , precio= '" +
                    producto.getPrecio() + "' , codigo_fabricante= '" +
                    producto.getFabricante().getCodigo() + "' WHERE codigo= '" + producto.getCodigo() + "';";

            insertModifyDelete(query);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public void modificarPorNombre(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un producto");
            }

            String query = "UPDATE producto SET " + 
                    "codigo= '" + producto.getCodigo() + "' , precio= '" +
                    producto.getPrecio() + "' , codigo_fabricante= '" +
                    producto.getFabricante().getCodigo() + "' WHERE nombre= '" + producto.getNombre() + "';";

            insertModifyDelete(query);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String query = "SELECT * FROM producto ORDER BY codigo";
            consultarBase(query);

            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                Integer codigoFabr = resultado.getInt(4);
                Fabricante fabricante = fabriService.buscarFabricantePorCodigo(codigoFabr);
                producto.setFabricante(fabricante);
                productos.add(producto);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            throw e;
        }
    }

    //Lista solo nombres y precios
    public Collection<Producto> muestraNombrePrecio() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY nombre";
            consultarBase(sql);

            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }

            desconectarBase();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
    
    //Lista por precio
    public Collection<Producto> listarPorPrecio() throws Exception {
        try {
            String query = "SELECT * FROM producto "
                    + "WHERE precio BETWEEN 120 AND 202 ORDER BY precio;";
            
            consultarBase(query);

            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                Integer codigoFabr = resultado.getInt(4);
                Fabricante fabricante = fabriService.buscarFabricantePorCodigo(codigoFabr);
                producto.setFabricante(fabricante);
                productos.add(producto);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            throw e;
        }
    }
    
    //Mostrar todos portatiles
    public Collection<Producto> mostrarProtatil() throws Exception {
        try {
            String query = "SELECT * FROM producto " +
                    "WHERE nombre LIKE '%portatil%';";
            consultarBase(query);
            
            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                Integer codigoFabr = resultado.getInt(4);
                Fabricante fabricante = fabriService.buscarFabricantePorCodigo(codigoFabr);
                producto.setFabricante(fabricante);
                productos.add(producto);
            }
            desconectarBase();
            return productos;
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    //Nombre y precio del producto mas barato
    public Producto masBarato() throws Exception {
        try {
            String query = "SELECT nombre, precio FROM producto " +
                    "ORDER BY precio ASC LIMIT 1;";
            
            consultarBase(query);
            
            Producto producto = new Producto();
            
            while (resultado.next()) {
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
            }
            
            desconectarBase();
            return producto;
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    //Retorna un producto
    public Producto buscarProducto(Integer codigo) throws Exception {
        try {
            if (codigo == null) {
                throw new Exception("Debe ingresar el codigo");
            }
            String query = "SELECT * FROM producto " +
                    "WHERE codigo= '" + codigo + "';";
            
            consultarBase(query);
            
            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                Integer codigoFabr = resultado.getInt(4);
                Fabricante fabricante = fabriService.buscarFabricantePorCodigo(codigoFabr);
                producto.setFabricante(fabricante);
            }
            desconectarBase();
            return producto;
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void mostrarUnProducto(Integer codigo) {
        try {
            if (codigo == null) {
                throw new Exception("Debe ingresar un codigo");
            }
            
            String query = "SELECT * FROM producto " +
                    "WHERE codigo= '" + codigo + "';";
            
            consultarBase(query);
            
            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                Integer codigoFabr = resultado.getInt(4);
                Fabricante fabricante = fabriService.buscarFabricantePorCodigo(codigoFabr);
                producto.setFabricante(fabricante);
            }
            desconectarBase();
            
            System.out.println("Codigo: " + producto.getCodigo() + " , " +
                    "Nombre: " + producto.getNombre() + " , " +
                    "Precio: " + producto.getPrecio() + " , " +
                    "Codigo de fabricante: " + producto.getFabricante().getCodigo());
        } catch (Exception e) {
        }
    }
    
}
