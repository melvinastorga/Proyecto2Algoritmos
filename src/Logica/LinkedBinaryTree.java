package Logica;

import Domain.ProductoMayorista;
import java.util.LinkedList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import Logica.TreeExceptions;

//Clase para el manejo de objetos mediante arboles binarios enlazados
/**
 * Gestiona todos los metodos para manejar un arbol binario
 *
 *
 * @author Melvin
 * @version 1.0
 */
public class LinkedBinaryTree implements BinaryTree {

    private BinaryNode root;
    String[] levels;
    LinkedList<String> listLeaf;

    public LinkedBinaryTree() {
        this.root = null;
    }

    /**
     * Cancela un arbol binario
     *
     *
     * @author Melvin
     * @version 1.0
     */
    @Override
    public void cancel() throws TreeExceptions {
        root = null;
    }

    /**
     * Ve si un arbol binario esta vacio
     *
     *
     * @author Melvin
     * @version 1.0
     */
    @Override
    public boolean isEmpty() {
        return this.root == null;
    }

    /**
     * Inserta un elemento en un arbol binario
     *
     *
     * @author Melvin
     * @version 1.0
     */
    @Override
    public void insert(Object element) throws TreeExceptions {
        this.root = insert(this.root, element);

    }

    public BinaryNode root() {
        return this.root;
    }

    private BinaryNode insert(BinaryNode node, Object element) {

        if (node == null) {
            node = new BinaryNode(element);
        } else {
            if (node.left == null) {
                node.left = insert(node.left, element);
            } else {
                if (node.right == null) {
                    node.right = insert(node.right, element);
                } else {

                    Random seed = new Random();
                    int randomValue = seed.nextInt(2);

                    if (randomValue == 1) {
                        node.left = insert(node.left, element);
                    } else {
                        node.right = insert(node.right, element);
                    }
                }
            }
        }
        return node;
    }

    /**
     * Cancela un elemento de un arbol binario
     *
     *
     * @author Melvin
     * @version 1.0
     */
    @Override
    public void delete(Object element) throws TreeExceptions {

        if (isEmpty()) {
            throw new TreeExceptions("El arbol no existe");
        } else {
            this.root = delete(this.root, element);
        }

    }

    private BinaryNode delete(BinaryNode node, Object element) {

        if (node != null) {
            if (node.element.equals(element)) {
                if (node.left == null && node.right == null) {
                    return node = null;
                } else {
                    if (node.left != null && node.right == null) {
                        return node = node.left;
                    } else if (node.left == null && node.right != null) {
                        return node = node.right;
                    } else {  //cuando se tiene tanto hijo derecho como izquierdo y se debe reacomodar

                        if (node.left != null && node.right != null) {
                            Object tempElement = minimum(node.right);

                            node.element = tempElement;
                            node.right = delete(node.right, tempElement);
                        }

                    }

                }
            }
            node.left = delete(node.left, element);
            node.right = delete(node.right, element);

        }//Main if

        return node;
    }

    private Object minimum(BinaryNode node) {
        //Cuando no tiene ningún hijo-------------------

        if (node.left != null && node.right != null) {

            if (getType(node) == 1) { //Cuando los valores a comparar son numéricos

                return Math.min(Integer.parseInt(node.element.toString()),
                        Math.min(Integer.parseInt(minimum(node.left).toString()),
                                Integer.parseInt(minimum(node.right).toString())));

            } else if (getType(node) == 2) {

                return minString(node.element.toString(),
                        minString(minimum(node.left).toString(), minimum(node.right).toString()));

            }

        }//---------------------------------------------
        //Cuando hay un hijo izquierdo-------------------

        if (node.left != null && node.right == null) {

            if (getType(node) == 1) {

                return Math.min(Integer.parseInt(node.element.toString()),
                        Integer.parseInt(minimum(node.left).toString()));

            } else if (getType(node.element) == 2) {

                return minString(node.element.toString(), minimum(node.left).toString());

            }

        }//---------------------------------------------
//Cuando hay un hijo izquierdo-------------------

        if (node.left == null && node.right != null) {

            if (getType(node) == 1) {

                return Math.min(Integer.parseInt(node.element.toString()),
                        Integer.parseInt(minimum(node.right).toString()));

            } else if (getType(node.element) == 2) {

                return minString(node.element.toString(), minimum(node.right).toString());

            }

        }//---------------------------------------------
        return node.element; //No alcanzó ninguna de las condiciones

    }

    private int getType(Object element) {
        if (element instanceof Integer) {
            return 1;
        }
        if (element instanceof String) {
            return 2;
        }
        return -1;
    }

    private String minString(String elem1, String elem2) {
        if (elem1.compareTo(elem2) < 0) {
            return elem1;
        } else {
            return elem2;
        }

    }

    /**
     * Obtiene la altura de un arbol binario
     *
     *
     * @author Melvin
     * @version 1.0
     */
    @Override
    public int height() throws TreeExceptions {

        if (isEmpty()) {
            throw new TreeExceptions("El arbol binario no existe");
        } else {
            return height(this.root);
        }

    }

    private int height(BinaryNode node) {
        if (node == null) {
            return 0;
        } else {
            return Math.max(height(node.left), height(node.right) + 1);
        }
    }

    /**
     * Devuelve el nodo mas alto
     *
     *
     * @author Melvin
     * @version 1.0
     */
    @Override
    public int nodeHeight(Object element) throws TreeExceptions {

        if (isEmpty()) {
            throw new TreeExceptions("El arbol binario no existe");
        } else {
            return nodeHeight(this.root, element, 0);
        }

    }

    private int nodeHeight(BinaryNode node, Object element, int counter) {

        if (node == null) {
            return 0;
        } else {
            if (node.element.equals(element)) {
                return counter;
            } else {
                return Math.max(nodeHeight(node.left, element, ++counter), nodeHeight(node.right, element, counter));
            }
        }

    }

    /**
     * Devuelve el tamano de un arbol binario
     *
     *
     * @author Melvin
     * @version 1.0
     */
    @Override
    public int getSize() throws TreeExceptions {

        if (isEmpty()) {
            throw new TreeExceptions("El arbol binario no existe");
        } else {
            return getSize(root);
        }

    }

    private int getSize(BinaryNode node) {
        if (node == null) {
            return 0;
        } else {
            return getSize(node.left) + 1 + getSize(node.right);
        }
    }

    /**
     * Ve si existe o no un elemento en un arbol binario
     *
     *
     * @author Melvin
     * @version 1.0
     */
    @Override
    public boolean exists(Object element) throws TreeExceptions {

        if (isEmpty()) {
            throw new TreeExceptions("El arbol binario no existe");
        } else {
            return exist(root, element);
        }

    }

    private boolean exist(BinaryNode root, Object element) {

        if (root == null) {
            return false;
        } else if (root.element.equals(element)) {
            return true;
        } else {
            return exist(root.left, element) || exist(root.right, element);
        }

    }

    /**
     * Devuelve un String con todas las busquedas de un arbol binario
     *
     *
     * @author Melvin
     * @version 1.0
     */
    @Override
    public String toString() {

        String output = "RECORRIDOS DISPONIBLES:\n";

        output += "PREORDEN\n" + preOrder(this.root);
        output += "INORDEN\n" + inOrder(this.root);
        output += "POSTORDEN\n" + postOrder(this.root);

        return output;

    }

    public LinkedList<ProductoMayorista> preOrder(BinaryNode node) {
        LinkedList<ProductoMayorista> list = new LinkedList<>();
        if (node != null) {
            list.add((ProductoMayorista) node.element);
            list.addAll(preOrder(node.left));
            list.addAll(preOrder(node.right));

        }
        return list;
    }

    private String inOrder(BinaryNode node) {
        String temp = "";

        if (node != null) {
            temp += inOrder(node.left);
            temp += node.element + "\n";
            temp += inOrder(node.right);
        }
        return temp;

    }

    private String postOrder(BinaryNode node) {

        String temp = "";

        if (node != null) {

            temp += postOrder(node.left);
            temp += postOrder(node.right);
            temp += node.element + "\n";
        }
        return temp;
    }
//    private String postOrderDelete(BinaryNode node, int id) {
//        
//        if (node != null) {
//            if(id == node.element)
//        }
//        
//LinkedList<ProductoMayorista> list = new LinkedList<>();
//        if (node != null) {
//            list.add((ProductoMayorista) node.element);
//            list.addAll(preOrder(node.left));
//            list.addAll(preOrder(node.right));
//
//        }
//        return list;
//        
//        
//        
//        String temp = "";
//
//        if (node != null) {
//
//            temp += postOrderDelete(node.left);
//            temp += postOrderDelete(node.right);
//            temp += node.element + "\n";
//        }
//        return temp;
//    }

    /**
     * Devuelve un nivel de un arbol binario
     *
     *
     * @author Melvin
     * @version 1.0
     */
    public String printLevels(int level) {

        String node = "";

        try {
            levels = new String[height() + 1];
        } catch (TreeExceptions ex) {
            Logger.getLogger(LinkedBinaryTree.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (levels.length != 0) {
            printLevel(root, level);
            for (int i = 0; i < levels.length; i++) {
                node += (levels[i] + " En nivel: " + i);
            }
        }
        return node;
    }

    private void printLevel(BinaryNode pivote, int level) {
        if (pivote != null && levels.length <= level) {
            levels[level] = pivote.element + ", " + ((levels[level] != null) ? levels[level] : "");
            printLevel(pivote.right, level + 1);
            printLevel(pivote.left, level + 1);
        }
    }

    /**
     * Devuelve la frontera de un arbol binario
     *
     *
     * @author Melvin
     * @version 1.0
     */
    public LinkedList frontTree(BinaryNode node) {

        listLeaf = new LinkedList<>();

        if (node == null) {
            listLeaf.add("Lista Vacia");
        } else {
            if (node.right == null) {
                listLeaf.add(node.right.element + "");
            } else if (node.left == null) {
                listLeaf.add(node.left.element + "");
            }
        }

        return listLeaf;
    }

    public LinkedList fronttreee() {
        LinkedList<String> front = frontTree(root);

        return front;
    }

}

//LABORATORIO, HACER UN  getNode(Object element )  ....... y hacer un  swapElement(Object element, Object element2 ) = los cambia de posicion, o busca un elemento del arbol y se le pone un nuevo elemento no se men

