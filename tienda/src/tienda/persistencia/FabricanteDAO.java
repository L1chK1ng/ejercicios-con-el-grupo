package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO {

    public FabricanteDAO() {
    }

    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }

            String query = "INSERT INTO fabricante (nombre) "
                    + "Values ('" + fabricante.getNombre() + "');";

            insertModifyDelete(query);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }

            String query = "UPDATE fabricante SET " + "nombre = '"
                    + fabricante.getNombre() + "' WHERE codigo = '" + fabricante.getCodigo() + "'";

            insertModifyDelete(query);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }

            String query = "DELETE FROM fabricante WHERE codigo = '"
                    + fabricante.getCodigo() + "'";

            insertModifyDelete(query);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Fabricante BuscaPorNombre(String nombre) throws Exception {
        try {
            String query = "SELECT * FROM fabricante"
                    + "WHERE nombre = '" + nombre + "'";

            consultarBase(query);

            Fabricante fabricante = null;
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            
            desconectarBase();
            return fabricante;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Fabricante buscarFabricanteCodigo(Integer codigo) throws Exception {
        try {
            String sql = "SELECT * FROM fabricante " + "WHERE codigo= '" + codigo + "';";

            consultarBase(sql);

            Fabricante fabricante = null;
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabricante;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Fabricante> listaFabricante() throws Exception {
        try {
            String sql = "SELECT * FROM fabricante ";

            consultarBase(sql);

            Fabricante fabricante = null;
            Collection<Fabricante> listaFabricantes = new ArrayList();
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                listaFabricantes.add(fabricante);
            }
            desconectarBase();
            return listaFabricantes;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
}
