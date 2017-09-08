
public class NumNode {
        
        private static NumNode Nodes = null;     // Head of the linked list
        // the rest of these variables are "local" to each instance of the
        // class
        // valued stored in this node
        String type;
        int gear;
        int wheelbase;
        int height;
        String Color;
        String material;
        NumNode Next;
        
        // constructor
        public NumNode(String ty, String ge, String wheel, String hei, String col, String mat)
        {
        	type=ty;
        	gear=Integer.parseInt(ge);
        	wheelbase=Integer.parseInt(wheel);
        	height=Integer.parseInt(hei);
        	Color=col;
        	material=mat;       	  	
        	Next = null;     	
        /*	System.out.printf("Type is "+type);
        	System.out.println("Gear is "+gear);
        	System.out.println("wheelbase is "+wheelbase);
        	System.out.println("Height is "+height);
        	System.out.printf("Color is "+Color);
        	System.out.printf("Material is "+material); */
       /* 	
        	if(sort.equals(type))
            {
            	
            }
        	
        	else if(sort.equals(gear))
            {
            	
            }
        	
        	else if(sort.equals(wheelbase))
            {
            	
            }
        */	
        	
        	
        	
        }
        
        
             
        
        public void Insert(String se)
        {
            if (Nodes == null)		//if this is the first entry in your list
            {
            	Nodes = this;
            	return;
            
            }
            
            if (this.wheelbase < Nodes.wheelbase)
            {
            	Next = Nodes;
            	Nodes = this;
            	return;
            }
            
            	
            else if (Nodes.Next == null)
            {
            	Nodes.Next = this;
            	return;
            }
            
            for (NumNode N = Nodes; N.Next != null; N = N.Next)
            {
            
            	if (this.wheelbase < N.Next.wheelbase) {
            		Next = N.Next;
            		N.Next = this;
            		return;
            }
            	
            else if (N.Next.Next == null)
            {
            	N.Next.Next = this;
            	return;
            }
         }
       }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            public static void PrintList() 
            {
	            if (Nodes == null) return;           
	            for (NumNode N = Nodes; N != null; N = N.Next)
	            {	
		            System.out.print(N.type +", ");
					System.out.print(N.gear +", ");
					System.out.print(N.wheelbase +", ");
					System.out.print(N.height +", ");
					System.out.print(N.Color +", ");
					System.out.print(N.material);
					System.out.println();
		            
	            }				//Blank space
	           
            }

        
            //public stringtostring();
    }