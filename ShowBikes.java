import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ShowBikes {

    public static void main(String[] args) 
    {
        int NumElements = args.length;  // Gives us the number of arg
        
        if(args.length>11)
        {
            System.out.println("More than 11 arguments are not permitted");
            return;
        }
        
        String type=null;  //Those are Bike parameters
        int gear=0;
        int wheelbase=0;
        int height=0;
        String color=null;
        String material=null;
        
        boolean type_flag=true;  	//Those are the flags used to compare the Command line Input with Notepad file.
        boolean gear_flag=true;
        boolean wheelbase_flag=true;
        boolean height_flag=true;
        boolean color_flag=true;
        boolean material_flag=true;
        String sorting_param;
        
        //System.out.printf("Arg1 is "+args[1],"%n");
        
        for(int i=0;i<NumElements-1;i++)  //This is where we are parsing the command line arguments.
        {
            
            if(args[i].equals("-type"))
            {
                type=args[i+1];        
                
            }
            
            if(args[i].equals("-gear"))
            {
                gear=Integer.parseInt(args[i+1]);
            }
            
            
            if(args[i].equals("-wheelbase"))
            {
                wheelbase=Integer.parseInt(args[i+1]);
            }
            
            if(args[i].equals("-height"))
            {
                height=Integer.parseInt(args[i+1]);
            }
            
            if(args[i].equals("-color"))
            {
                color=args[i+1];
            }
            
            if(args[i].equals("-construction_material"))
            {
                material=args[i+1];
            }
            
            
        }
        
        sorting_param=args[NumElements-1];  // This is my last parameter which would be the sorting parameter.
        
                     
        try
        {
              FileInputStream fstream = new FileInputStream("bicycle.txt");  //Reading the Input file
              // Get the object of DataInputStream
              DataInputStream in = new DataInputStream(fstream);
              BufferedReader br = new BufferedReader(new InputStreamReader(in));
              String strLine;
              //Read File Line By Line
              while ((strLine = br.readLine()) != null)  
              {
                  
                  String [] line= strLine.split(",");      					// Splitting Comma seperated Input
                  
                  
                  //System.out.printf("Line[0] is %n"+line[0]);
                  
                  if(type!=null && !type.equals(line[0]))
                  {
                      type_flag=false;                      
                  }
                  else
                  {
                	  type_flag=true;
                  }
                  
                  if(gear!=0 && gear!=Integer.parseInt(line[1]))
                  {
                      gear_flag=false;                      
                  }
                  else
                  {
                	  gear_flag=true;
                  }
                  
                  if(wheelbase!=0 && wheelbase!=Integer.parseInt(line[2]))
                  {
                      wheelbase_flag=false;                      
                  }
                  else
                  {
                	  wheelbase_flag=true;               	  
                  }
                  
                  if(height!=0 && height!=Integer.parseInt(line[3]))
                  {
                      height_flag=false;                      
                  }
                  else 
                  {
                	  height_flag=true;
                  }
                  
                  if(color!=null && !color.equals(line[4]))
                  {
                      color_flag=false;                      
                  }
                  else
                  {
                	  color_flag=true;
                  }
                  
                  if(material!=null && !material.equals(line[5]))
                  {
                      material_flag=false;                      
                  }
                  else
                  {
                	  material_flag=true;
                  }
                  
                  
                  if(type_flag==true && gear_flag==true && wheelbase_flag==true && height_flag==true && color_flag==true && material_flag==true)
                  {
                      //System.out.println ("Gear is "+gear);
                      NumNode NN = new NumNode(line[0],line[1],line[2],line[3],line[4],line[5]);
                      NN.Insert(sorting_param);
                      System.out.println(strLine);
                      
                      
                    //  System.out.println("final sorted list:");
                    //  NumNode.PrintList();
                      
                      
                  }
                  
                }
                  
                  
              //Close the input stream
              in.close();
                }
        
        catch (Exception e){//Catch exception if any
              System.err.println("Error: " + e.getMessage());
        }     
        
        
        
        
    }

	
        
        
        
        
        
}    
        
        
        
        
        
        
        
        
    /*    
        try{
              // Open the file that is the first 
              // command line parameter
              FileInputStream fstream = new FileInputStream("bicycle.txt");
              // Get the object of DataInputStream
              DataInputStream in = new DataInputStream(fstream);
              BufferedReader br = new BufferedReader(new InputStreamReader(in));
              String strLine;
              //Read File Line By Line
              while ((strLine = br.readLine()) != null)   {
              // Print the content on the console
              System.out.println (strLine);
              }
              //Close the input stream
              in.close();
                }
        
        catch (Exception e){//Catch exception if any
              System.err.println("Error: " + e.getMessage());
              }
    
        
        
        
        
        
    }
}
        
        
        
        
        
        
        
        
        
        
        
    /*    
        
        for(int i=0;i<NumElements;i=i+2)
        {
            if(args[i]=="type")
            {
                var[i]=0;
            }
            
            if(args[i]=="gears")
            {
                var[i]=1;
            }
            
            if(args[i]=="wheelBase")
            {
                var[i]=2;
            }
            
            if(args[i]=="height")
            {
                var[i]=3;
            }
            
            
            
        }
        
        
        
        
        
        for (int I = 1; I <= NumElements; I++) 
        {
            int Num;
        
            Num = Integer.parseInt(args[I-1]);
            // create a new node
            NumNodes NN = new NumNodes(Num);
            NN.Insert();
        }
        System.out.println("final sorted list:");
        NumNodes.PrintList();
        }
            
        
        
*/
    
