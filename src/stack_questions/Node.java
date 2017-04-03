/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_questions;

/**
 *
 * @author root
 */
public class Node {
    
    int data;
    Node next;
    
    public Node(){
        
    }
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    
    /*
    int data;
    int prev;
    
    public Node(int data, int prev){
        this.data = data;
        this.prev = prev;
    }
    */
}
