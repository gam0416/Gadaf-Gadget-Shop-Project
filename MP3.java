/**
 * Write a description of class MP3 here.
 *
 * Author -Gadaf Malik-Abbas
 * Student ID - 25000098
 */
public class MP3 extends Gadget
{
    // this instance variable is to store the avialable memory for the MP3 object
    private int availableMemory;

    /**
     * Constructor for objects of class MP3
     * this constructor accepts 5 parameters and uses inheritance to pass the
     * common values into the Gadget superclass constructor
     * price - in £ (GBP)
     * Weight - in g (Gram)
     * Size - in mm (milemeter)
     */
    public MP3(String model, double price, int weight, String size, int availableMemory)
    {
        // this line calls the Gadget constructor so the shared attributes of the object can be initialised properlly
        super(model, price,weight,size);
        this.availableMemory=availableMemory;
    }

    //this is the accessor method (getter) used to return the avaiable memory of this MP3 object
    public int getAvailableMemory()
    {
        return availableMemory;
    }
    //this is the method to enable the user to download music into the MP3 player object
    public void downloadMusic(int downloadSize)
    {
        if (downloadSize <=0)
        {   //this is the validation part to check the download size is greater than zero before the method continues
            System.out.println("Please enter a download size greater than zero");
            return;
        }
        //this condition checks the current available memory left in the MP3 object instance
        else if (availableMemory >= downloadSize)
        {
            //this line reduces the available memory after the download has completed
            availableMemory = availableMemory - downloadSize;
            //this displays a confirmation message and then shows the updated memory left
            System.out.println("Download completed.");
            System.out.println("Availble Memory: " + availableMemory +"MB");
        }
        else
        {
            //this part displays an error style message if there is not enough memory in the object
            System.out.println("Insufficient memory to downlaod this music.");
            System.out.println("Add 3G SD card to increase memory");
            //this line increases the memory by adding a 3G SD card automaticly
            availableMemory = availableMemory +3048;
            System.out.println("SD Card successfully added");
            System.out.println("Availble Memory: " + availableMemory +"MB");
            //this is the logic to try the download again after the extra memory has been added
            if (availableMemory >= downloadSize)
            {
                availableMemory = availableMemory - downloadSize;
                System.out.println("Music successfully downloaded.");
                System.out.println("Availble Memory: " + availableMemory +"MB");
            }
        }
    }
    // This method allows the user to delete music from the MP3 object
    public void deleteMusic(int deleteSize)
    {
        //this validation checks that the delete size entered is greater than zero
        if (deleteSize <=0)
        {
            System.out.println("Enter a delete size greater than zero.");
            return;
        }
        //this line restores memory back to the object once the music has been deleted
        availableMemory=availableMemory+deleteSize;
        //this displays a delete confirmation and then the current available memory
        System.out.println("Music Successfully deleted.");
        System.out.println("Availble Memory: " + availableMemory +"MB");
    }

    //Method to display details of MP3 player by overriding the display method from the superclass
    public void display()
    {
        super.display();
        //this line displays the MP3 specific attribute which is the available memory
        System.out.println("Availble Memory: " + availableMemory +"MB");
    }
}