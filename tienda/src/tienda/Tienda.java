package tienda;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.services.FabricanteService;
import tienda.services.ProductoService;

public class Tienda {

    public static void main(String[] args) throws Exception {
        
        ProductoService ps = new ProductoService();
        FabricanteService fs = new FabricanteService();
        Collection<Producto> productos = new ArrayList();
        
        try {
            ps.modificarProducto();
            
        } catch (Exception e) {
            throw e;
        }
    }
    
}
