/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_questions;

import static stack_questions.Stack_Questions.sort;

/**
 *
 * @author root
 */
public class MainClass {
    public static void main(String args[]){
        /*
        Stack_Questions s1 = new Stack_Questions(2);
        s1.push(4);
        s1.push(2);
        s1.push(8);
        
        int len = s1.length;
        
        for(int i=0; i<len; i++){
            Node curr = s1.pop();
            System.out.println(curr.data);
        }
        
        System.out.println(s1.min());
        */
        // Implement 3 stacks with one array
        /*
        Stack_Questions s2 = new Stack_Questions();
        s2.push(0, 1);
        s2.push(0, 2);
        s2.push(0, 9);
        s2.push(1, 3);
        s2.push(2, 4);
        
        int val = s2.pop(2);
        System.out.println(val);
        
    
        
        Stack_Questions s2 = new Stack_Questions();
        s2.push(0, 1);
        s2.push(0, 2);
        s2.push(0, 9);
        s2.push(1, 3);
        s2.push(2, 4);
        
        int val = s2.pop(0);
        System.out.println(val);       
    */
    /*    
        SetOfStacks s4 = new SetOfStacks(2);
        s4.push(2);
        s4.push(8);
        s4.push(9);
        s4.push(10);
        
        System.out.println(s4.pop());
    

        MyQueue q1 = new MyQueue();
        q1.add(2);
        q1.add(4);
        q1.add(8);
    */    
    
        Stack_Questions s1 = new Stack_Questions(2);
        s1.push(4);
        s1.push(2);
        s1.push(8);
    
        Stack_Questions s = sort(s1);
        System.out.println(s.pop().data);
        System.out.println(s.pop().data);
        System.out.println(s.pop().data);
        
    
    }
}
