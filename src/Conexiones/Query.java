package Conexiones;

import Domain.Bodega;
import Domain.Categoria;
import Domain.Lote;
import Domain.OrdenDistribucion;
import Domain.ProductoMayorista;
import Domain.ProductoMayoristaPorOrden;
import Domain.UnidadTransporte;
import Domain.Usuario;
import Logica.LinkedBinaryTree;
import Logica.TreeExceptions;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import Logica.GraphAdyacency;
import Logica.GraphException;

/**
 * Metodos consulta a la base de datos
 *
 * @author Andres
 */
public class Query {

    public static ResultSet res;

    /**
     * devuelve la lista de bodegas en un grafo
     *
     * @return GraphAdyacency
     */
    public static GraphAdyacency bodega() {

        int numBodegas = 0;
        GraphAdyacency graph = new GraphAdyacency(100);
        res = Conexion.Consulta("select * from bodega");
        try {
            while (res.next()) {
                graph.insertVertex(new Bodega(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getFloat(5), res.getString(6)));

            }
        } catch (SQLException | GraphException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return graph;
    }

    /**
     * retorna la lista de productosMayorista desde la base de datos en un arbol
     * binario
     *
     * @return LinkedBinaryTree
     */
    public static LinkedBinaryTree productoMayorista() {
        LinkedBinaryTree tree = new LinkedBinaryTree();
        try {
            res = Conexion.Consulta("select * from productoMayorista");
            while (res.next()) {
                tree.insert(new ProductoMayorista(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4),
                        res.getInt(5), res.getString(6), res.getInt(7), res.getInt(8), res.getDouble(9), res.getString(10)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TreeExceptions ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tree;
    }

    /**
     * retorna la lista de categorias desde la base de datos
     *
     * @return HashMap
     */
    public static HashMap categoria() {
        res = Conexion.Consulta("select * from categoria");
        HashMap<Integer, Categoria> hash = new HashMap<>();
        try {
            while (res.next()) {
                hash.put(res.getInt(1), new Categoria(res.getInt(1), res.getString(2), res.getString(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hash;
    }

    /**
     * retorna todos los lotes desde la base de datos
     *
     * @return TreeMap
     */
    public static TreeMap lote() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        res = Conexion.Consulta("select * from lote");
        TreeMap<Integer, Lote> tree = new TreeMap<>();
        try {
            while (res.next()) {
                tree.put(res.getInt(1), new Lote(res.getInt(1), res.getString(2), format.parse(res.getString(3)), format.parse(res.getString(4))));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tree;
    }

    /**
     * retorna un linkedhashmap de unidades de transporte de la base de datos
     *
     * @return LinkedHashMap
     */
    public static LinkedHashMap unidadTransporte() {
        res = Conexion.Consulta("select * from unidadTransporte");
        LinkedHashMap<Integer, UnidadTransporte> hash = new LinkedHashMap<>();

        try {
            while (res.next()) {
                hash.put(res.getInt(1), new UnidadTransporte(res.getInt(1), res.getString(2), res.getString(3), res.getString(4)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hash;
    }

    /**
     * retorna la lista de ordenes desde la base de datos
     *
     * @return LinkedList
     */
    public static LinkedList ordenDeDistribucion() {
        res = Conexion.Consulta("select * from ordenDistribucion");
        LinkedList<OrdenDistribucion> list = new LinkedList<>();
        LinkedList<ProductoMayoristaPorOrden> list2 = new LinkedList<>();
        try {
            while (res.next()) {
                ResultSet res2 = Conexion.Consulta("select * from productoMayoristaPorOrden where idOrden = '" + res.getInt(1) + "'");
                while (res2.next()) {
                    list2.add(new ProductoMayoristaPorOrden(res.getInt(1), res.getInt(2), res.getString(3), res.getString(4), res.getInt(5),
                            res.getInt(6), res.getString(7), res.getInt(8), res.getInt(9), res.getDouble(10), res.getString(11)));
                }
                list.add(new OrdenDistribucion(res.getInt(1), res.getInt(2), res.getInt(3), res.getDouble(4), res.getFloat(5), list2, res.getInt(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    /**
     * returna la lista de usuarios desde la base de datos
     *
     * @return LinkedList
     */
    public static LinkedList usuario() {
        LinkedList<Usuario> list = new LinkedList<>();
        res = Conexion.Consulta("select * from usuario");
        try {
            while (res.next()) {
                list.add(new Usuario(res.getInt(1), res.getString(2), res.getBoolean(3), res.getString(4), res.getString(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
