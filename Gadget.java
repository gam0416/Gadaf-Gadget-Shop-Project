/**
 * Write a description of class Gadget here. 
 *
 * Author -Gadaf Malik-Abbas
 * Student ID - 25000098
 */
public class Gadget
{
    // these are the instance variables (attributes) that define a Gadget object
    private String model;
    private double price;
    private int weight;
    private String size;
    
    
    public Gadget(String model, double price, int weight, String size)
    {
      // this constructor is used to initialise the object when it is created
      
      /**
       * Constructor for Class Gadget
       * this is where the object gets its starting values from the user input
       * it basically assigns the parameters into the class variables using encapsulation
       * price - in £ (GBP)
       * Weight - in g (Gram)
       * Size - in mm (milemeter)
       */
      this.model=model; 
      this.price=price;
      this.weight=weight;
      this.size=size;
    }
    //this is an accessor (getter) method to return the model of the Gadget object
    public String getModel()
    {
        return model;
    }
    
    //this is an accessor (getter) method to return the weight of the Gadget object
    public int getWeight()
    {
        return weight;
    }
    
    //this is an accessor (getter) method to return the size of the Gadget object
    public String getSize()
    {
        return size;
    }
    // this is a general method used to display the Gadget details to the user
    public void display()
    {
     // this prints out all the main attributes of the object
     System.out.println("Model " + model);  
     System.out.println("Price £: "+ price);
     System.out.println("Weight "+ weight + "g");
     System.out.println("Size " + size);
    }
}