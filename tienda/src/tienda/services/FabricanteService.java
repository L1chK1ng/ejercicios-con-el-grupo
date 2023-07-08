package tienda.services;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author Ilich Dell
 */
public class FabricanteService {
    
    private FabricanteDAO dao;
    private Collection<Fabricante> fabricantes = new ArrayList();
    
    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }
    
    public void crearFabricante(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe ingresar un nombre");
            }
            
            Fabricante fabricante = new Fabricante(nombre);
            dao.guardarFabricante(fabricante);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Fabricante buscarFabricantePorCodigo(Integer codigo) throws Exception {
        try {
            if (codigo == null) {
                throw new Exception("Debe ingresar el codigo");
            }
            
            Fabricante fabricante = dao.buscarFabricanteCodigo(codigo);
            return fabricante;
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Fabricante crearFabricanteFull(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe ingresar el fabricante");
            }
            dao.guardarFabricante(fabricante);
            return fabricante;
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void mostrarListaFabricante() throws Exception {
        try {
            fabricantes = dao.listaFabricante();
            
            for (Fabricante fabricante : fabricantes) {
                System.out.println("Codigo: " + fabricante.getCodigo() + " , " +
                        "Nombre: " + fabricante.getNombre());
            }
            
        } catch (Exception e) {
            throw e;
        }
    }
    
}
