package edu.towson.cis.cosc455.fsaint1.project1.implementation;

/**
*
* @author Firmin Saint-Amour
* 
* 
*/

public class Queue {
	private Link node;
    private Link current;
    public int count = 0;
    
    
    /**
     *@param text to be added
     *@return void
     * 
     */	
    public void add(String text) {
       //System.out.println(count);
       if(count == 0) {
           node = new Link(text, null);
           current = node;
       }
       
       else {
           current.setNext(new Link(text, null));
           current = current.getNext();
       }
       
       count++;
       
    }
    /**
     *@param void
     *@return An array version of the queue
     * 
     */	
    public String[] toArray() {
       int count = 1;
       
       Link n = node;
       
       Link z = node;
       
       while(n.getNext() != null) {
           n = n.getNext();
           count++;
       }
       
       String[] text = new String[count];
       
       
       //n = sPath;
       
       int x = 0;
       
       while(x < count) {
    	   text[x] = z.getText();
           z = z.getNext();
           
           x++;
           
       }
       
       return text;
   }
	    
	    
}
