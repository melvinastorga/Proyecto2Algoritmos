/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author fabian
 */
public class Vertex {
    public Object element;
    public boolean isVisited;

    public Vertex(Object element) {
        this.element = element;
        this.isVisited = isVisited;
    }

    @Override
    public String toString() {
        return "Vertice{" + "element=" + element + ", isVisited=" + isVisited + '}';
    }
    
    
    
}
