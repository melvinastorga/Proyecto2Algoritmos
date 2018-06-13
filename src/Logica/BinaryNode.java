
package Logica;

 /**
     * Clase de un nodo para un arbol binario
     * 
     *
     * @author Melvin
     * @version 1.0
     */

public class BinaryNode {
    
    public Object element;
    public BinaryNode left,right;
    public int counter = 0;

    public BinaryNode(Object element) {
        this.element = element;
        this.left =this.right = null;
       counter++;
    }
    
    
    
    

}
