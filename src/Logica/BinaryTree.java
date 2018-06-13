/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.TreeExceptions;

/**
 *
 * @author Melvin
 */
public interface BinaryTree {
    
    public void cancel()throws TreeExceptions;
    public boolean isEmpty();
    public boolean exists(Object element)throws TreeExceptions;
    public void insert(Object element) throws TreeExceptions;
    public void delete(Object element)throws TreeExceptions;
    public int height()throws TreeExceptions;
    public int nodeHeight(Object element)throws TreeExceptions;
    public int getSize()throws TreeExceptions;
    
}
