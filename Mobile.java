/**
 * Write a description of class Mobile here.
 *
 * Author -Gadaf Malik-Abbas
 * Student ID - 25000098
 */
public class Mobile extends Gadget
{
    // this instance variable is used to store the amount of minutes left for this Mobile object (calling credit)
    private int callingCredits;

    /**
     * Constructor for class mobile 
     * this constructor accepts 5 parameters and uses inheritance to pass 4 of them
     * into the Gadget superclass using super()
     * price - in £ (GBP)
     * Weight - in g (Gram)
     * Size - in mm (milemeter)
     */
    public Mobile(String model, double price, int weight, String size, int callingCredits)
    {
        // this calls the superclass constructor so the shared attributes are initialised for this object
        super(model,price,weight,size);
        this.callingCredits=callingCredits;

    }
    // this is an accessor (getter) method to return the current calling credit of the Mobile object
    public int getCallingCredits()
    {
        return callingCredits;
    }

    //this method enables the user to load calling credit onto the Mobile object
    public void addCallingCredit(int credit)
    // validation check (only allow positive credit values to be added)
    {
        if (credit > 0)
        {
            callingCredits = callingCredits +credit;
        }
        else
        {
            System.out.println("Please load a positive amount of calling credit");   
        }
    }

    public void makeCall(String number, int duration)
    {
        // validation check, duration must be greater than zero before continuing
        if (duration <=0)
        {
            System.out.println("Please enter a calling duration greater than zero");
            return;
        }
        // this condition checks if the Mobile object has enough credit to make the call
        if (callingCredits >= duration)
        {
            //display message showing phone number and duration of the call
            System.out.println("Calling number: " + number + " for " + duration +"minutes.");

            //this reduces the credit from the object after the call is made
            callingCredits = callingCredits-duration;

            // display remaining credit (balance) after each call
            System.out.println("Remaning Calling Credit (mins): " + callingCredits);
        }

        else 
        //display message if the object does not have enough credit
        { 
            System.out.println("Insufficient calling credit to initiate this call. please load more credit.");
            System.out.println("Current Calling Credit (mins): " + callingCredits);
        }
    }
    //method to display all the Mobile object details
    public void display()
    {
        //display the inherited gadget details first using polymorphism (method overriding)
        super.display();
        //display the Mobile specific attribute which is the calling credit
        System.out.println("CallingCredits" + callingCredits);
    }
}