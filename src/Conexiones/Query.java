package Conexiones;

import Domain.Categoria;
import Domain.Lote;
import Domain.OrdenDistribucion;
import Domain.ProductoMayorista;
import Domain.UnidadTransporte;
import Domain.Usuario;
import Logica.LinkedBinaryTree;
import Logica.TreeExceptions;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Metodos consulta a la base de datos
 *
 * @author Andres
 */
public class Query {

    public ResultSet res;
/**
 * retorna la lista de productosMayorista desde la base de datos en un arbol binario
 * @return LinkedBinaryTree
 */
    public LinkedBinaryTree productoMayorista() {
        LinkedBinaryTree tree = new LinkedBinaryTree();
        try {
            res = Conexion.Consulta("select * from productoMayorista");
            while (res.next()) {
                tree.insert(new ProductoMayorista(res.getInt(1), res.getInt(2), res.getString(3), res.getString(4), res.getInt(5),
                        res.getInt(6), res.getString(7), res.getInt(8), res.getInt(9), res.getDouble(10), res.getString(11)));
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
 * @return HashMap
 */
    public HashMap categoria() {
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
 * @return TreeMap
 */
    public TreeMap lote() {
        res = Conexion.Consulta("select * from lote");
        TreeMap<Integer, Lote> tree = new TreeMap<>();
        try {
            while (res.next()) {
                tree.put(res.getInt(1), new Lote(res.getInt(1), res.getString(2), res.getDate(3), res.getDate(4)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tree;
    }
/**
 * retorna un linkedhashmap de unidades de transporte de la base de datos
 * @return LinkedHashMap
 */
    public LinkedHashMap unidadTransporte() {
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
 * @return LinkedList
 */
    public LinkedList ordenDeDistribucion() {
        res = Conexion.Consulta("select * from ordenDistribucion");
        LinkedList<OrdenDistribucion> list = new LinkedList<>();
        LinkedList<ProductoMayorista> list2 = new LinkedList<>();
        try {
            while (res.next()) {
                ResultSet res2 = Conexion.Consulta("select * from productoMayorista where idOrden = '" + res.getInt(1) + "'");
                while (res2.next()) {
                    list2.add(new ProductoMayorista(res.getInt(1), res.getInt(2), res.getString(3), res.getString(4), res.getInt(5),
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
 * @return LinkedList 
 */
    public LinkedList usuario() {
        LinkedList<Usuario> list = new LinkedList<>();
        res = Conexion.Consulta("select * from usuario");
        try {
            while(res.next()){
                list.add(new Usuario(res.getInt(1),res.getString(2),res.getBoolean(3),res.getString(4),res.getString(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
