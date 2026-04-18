/**
 * Write a description of class GadgetShop here.
 *
 * Author -Gadaf Malik-Abbas
 * Student ID - 25000098
 */
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class GadgetShop extends Application {
    // text field used to capture the Mobile model name
    private final TextField mobileModelField = new TextField();
    // text field used to capture the Mobile price
    private final TextField mobilePriceField = new TextField();
    // text field used to capture the Mobile weight
    private final TextField mobileWeightField = new TextField();
    // text field used to capture the Mobile size
    private final TextField mobileSizeField = new TextField();

    // text field used to capture the MP3 model name
    private final TextField mp3ModelField = new TextField();
    // text field used to capture the MP3 price
    private final TextField mp3PriceField = new TextField();
    // text field used to capture the MP3 weight
    private final TextField mp3WeightField = new TextField();
    // text field used to capture the MP3 size
    private final TextField mp3SizeField = new TextField();

    // text field used to capture MP3 available memory
    private final TextField availableMemoryField = new TextField();
    // text area used to show system output and user feed back in real time
    private final TextArea logArea = new TextArea();
    // text field used to capture initial mobile credit
    private final TextField creditField = new TextField();
    // text field used to capture phone number for a call
    private final TextField phoneNumberField = new TextField();
    // text field used to capture call duration
    private final TextField durationField = new TextField();
    // text field used to capture MP3 download size
    private final TextField downloadSizeField = new TextField();
    // text field used to capture MP3 delete size
    private final TextField deleteSizeField = new TextField();
    // text field used to capture display number for selecting an object instance
    private final TextField displayNumberField = new TextField();
    private final ArrayList<Gadget> gadgets = new ArrayList<>();

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();

        Label mp3SectionLabel = new Label("MP3 SECTION");
        mp3SectionLabel.setLayoutX(150);
        mp3SectionLabel.setLayoutY(20);
        mp3SectionLabel.setStyle("-fx-font-weight: bold;");

        Label mobileSectionLabel = new Label("MOBILE SECTION");
        mobileSectionLabel.setLayoutX(610);
        mobileSectionLabel.setLayoutY(20);
        mobileSectionLabel.setStyle("-fx-font-weight: bold;");

        Label sharedSectionLabel = new Label("SHARED ACTIONS");
        sharedSectionLabel.setLayoutX(375);
        sharedSectionLabel.setLayoutY(300);
        sharedSectionLabel.setStyle("-fx-font-weight: bold;");

        // label and text field for MP3 model input
        Label mp3ModelLabel = new Label("Model:");
        mp3ModelLabel.setLayoutX(40);
        mp3ModelLabel.setLayoutY(60);

        mp3ModelField.setLayoutX(180);
        mp3ModelField.setLayoutY(60);
        mp3ModelField.setPrefWidth(170);

        // label and text field for MP3 price input
        Label mp3PriceLabel = new Label("Price (GBP):");
        mp3PriceLabel.setLayoutX(40);
        mp3PriceLabel.setLayoutY(90);

        mp3PriceField.setLayoutX(180);
        mp3PriceField.setLayoutY(90);
        mp3PriceField.setPrefWidth(170);

        // label and text field for MP3 weight input
        Label mp3WeightLabel = new Label("Weight (g):");
        mp3WeightLabel.setLayoutX(40);
        mp3WeightLabel.setLayoutY(120);

        mp3WeightField.setLayoutX(180);
        mp3WeightField.setLayoutY(120);
        mp3WeightField.setPrefWidth(170);

        // label and text field for MP3 size input
        Label mp3SizeLabel = new Label("Size (mm):");
        mp3SizeLabel.setLayoutX(40);
        mp3SizeLabel.setLayoutY(150);

        mp3SizeField.setLayoutX(180);
        mp3SizeField.setLayoutY(150);
        mp3SizeField.setPrefWidth(170);

        // label and text field for MP3 available memory input
        Label availableMemoryLabel = new Label("Available Memory (MB):");
        availableMemoryLabel.setLayoutX(40);
        availableMemoryLabel.setLayoutY(180);

        availableMemoryField.setLayoutX(180);
        availableMemoryField.setLayoutY(180);
        availableMemoryField.setPrefWidth(170);

        // label and text field for music download size entry
        Label downloadLabel = new Label("Download Size (MB):");
        downloadLabel.setLayoutX(40);
        downloadLabel.setLayoutY(210);

        downloadSizeField.setLayoutX(180);
        downloadSizeField.setLayoutY(210);
        downloadSizeField.setPrefWidth(170);

        // label and text field for music delete size entry
        Label deleteLabel = new Label("Delete Size (MB):");
        deleteLabel.setLayoutX(40);
        deleteLabel.setLayoutY(240);

        deleteSizeField.setLayoutX(180);
        deleteSizeField.setLayoutY(240);
        deleteSizeField.setPrefWidth(170);

        // button used to create and add a new MP3 object
        Button addMP3Button = new Button("Add MP3");
        addMP3Button.setLayoutX(110);
        addMP3Button.setLayoutY(270);
        addMP3Button.setPrefWidth(170);

        // button used to run the downloadMusic behaviour on an MP3 object
        Button downloadMusicButton = new Button("Download Music");
        downloadMusicButton.setLayoutX(110);
        downloadMusicButton.setLayoutY(300);
        downloadMusicButton.setPrefWidth(170);

        // button used to run the deleteMusic behaviour on an MP3 object
        Button deleteMusicButton = new Button("Delete Music");
        deleteMusicButton.setLayoutX(110);
        deleteMusicButton.setLayoutY(330);
        deleteMusicButton.setPrefWidth(170);

        // label and text field for Mobile model input
        Label mobileModelLabel = new Label("Model:");
        mobileModelLabel.setLayoutX(520);
        mobileModelLabel.setLayoutY(60);

        mobileModelField.setLayoutX(660);
        mobileModelField.setLayoutY(60);
        mobileModelField.setPrefWidth(170);

        // label and text field for Mobile price input
        Label mobilePriceLabel = new Label("Price (GBP):");
        mobilePriceLabel.setLayoutX(520);
        mobilePriceLabel.setLayoutY(90);

        mobilePriceField.setLayoutX(660);
        mobilePriceField.setLayoutY(90);
        mobilePriceField.setPrefWidth(170);

        // label and text field for Mobile weight input
        Label mobileWeightLabel = new Label("Weight (g):");
        mobileWeightLabel.setLayoutX(520);
        mobileWeightLabel.setLayoutY(120);

        mobileWeightField.setLayoutX(660);
        mobileWeightField.setLayoutY(120);
        mobileWeightField.setPrefWidth(170);

        // label and text field for Mobile size input
        Label mobileSizeLabel = new Label("Size (mm):");
        mobileSizeLabel.setLayoutX(520);
        mobileSizeLabel.setLayoutY(150);

        mobileSizeField.setLayoutX(660);
        mobileSizeField.setLayoutY(150);
        mobileSizeField.setPrefWidth(170);

        // label and text field for initial calling credit entry
        Label creditLabel = new Label("Initial Credit (mins):");
        creditLabel.setLayoutX(520);
        creditLabel.setLayoutY(180);

        creditField.setLayoutX(660);
        creditField.setLayoutY(180);
        creditField.setPrefWidth(170);

        // label and text field for phone number entry, stored as String to fit UK format
        Label phoneLabel = new Label("Phone Number:");
        phoneLabel.setLayoutX(520);
        phoneLabel.setLayoutY(210);

        phoneNumberField.setLayoutX(660);
        phoneNumberField.setLayoutY(210);
        phoneNumberField.setPrefWidth(170);

        // label and text field for call duration entry
        Label durationLabel = new Label("Call Duration (mins):");
        durationLabel.setLayoutX(520);
        durationLabel.setLayoutY(240);

        durationField.setLayoutX(660);
        durationField.setLayoutY(240);
        durationField.setPrefWidth(170);

        // button used to create and add a new Mobile object
        Button addMobileButton = new Button("Add Mobile");
        addMobileButton.setLayoutX(590);
        addMobileButton.setLayoutY(270);
        addMobileButton.setPrefWidth(170);

        // button used to run the makeCall behaviour on a Mobile object
        Button makeCallButton = new Button("Make A Call");
        makeCallButton.setLayoutX(590);
        makeCallButton.setLayoutY(300);
        makeCallButton.setPrefWidth(170);

        // label and text field for display number, this is used to select the right object instance
        Label displayNumberLabel = new Label("Display Number (index):");
        displayNumberLabel.setLayoutX(305);
        displayNumberLabel.setLayoutY(335);

        displayNumberField.setLayoutX(455);
        displayNumberField.setLayoutY(335);
        displayNumberField.setPrefWidth(120);

        // button used to clear all current user entries
        Button clearButton = new Button("Clear");
        clearButton.setLayoutX(330);
        clearButton.setLayoutY(370);
        clearButton.setPrefWidth(100);

        // button used to display all object instances stored in the ArrayList
        Button displayAllButton = new Button("Display All");
        displayAllButton.setLayoutX(460);
        displayAllButton.setLayoutY(370);
        displayAllButton.setPrefWidth(100);

        // log area setup, this is where system responses and display output will show
        logArea.setLayoutX(40);
        logArea.setLayoutY(420);
        logArea.setPrefWidth(800);
        logArea.setPrefHeight(130);
        logArea.setEditable(false);

        // this method redirects System.out.println to both the logArea and command prompt
        PrintStream consoleOutput = System.out;

        System.setOut(new PrintStream(new OutputStream()
        {
            @Override
            public void write(int b)
            {
                // method to send output to command prompt as normal
                consoleOutput.write(b);

                // method send output to the text area so the user can see feed back live
                Platform.runLater(() ->
                        logArea.appendText(String.valueOf((char) b))
                );
            }
        }));

        // this is to add the Add Mobile button
        addMobileButton.setOnAction(e ->
        {
            String model = getMobileModel();
            String size = getMobileSize();
            double price = getMobilePrice();
            int weight = getMobileWeight();
            int credit = getCredit();

            // this validation is to make sure the basic text input is not empty before creating the object
            if (model.isEmpty() || size.isEmpty())
            {
                showError("Please enter a valid model and size.");
                return;
            }

            Mobile m = new Mobile(model, price, weight, size, credit);
            gadgets.add(m);
            log("Mobile added successfully.");
            log("Index: " + (gadgets.size() - 1));
            logDivider();
        });

        // this is to add the Add MP3 button
        addMP3Button.setOnAction(e ->
        {
            String model = getMP3Model();
            String size = getMP3Size();
            double price = getMP3Price();
            int weight = getMP3Weight();
            int memory = getAvailableMemory();

            // simple validation to stop empty values before creating the object
            if (model.isEmpty() || size.isEmpty())
            {
                showError("Please insert a valid model and size.");
                return;
            }

            MP3 mp3 = new MP3(model, price, weight, size, memory);
            gadgets.add(mp3);
            log("MP3 added successfully.");
            log("Index: " + (gadgets.size() - 1));
            logDivider();
        });

        // this is to Clear all 10 text fields/button
        clearButton.setOnAction(e ->
        {
            mobileModelField.clear();
            mobilePriceField.clear();
            mobileWeightField.clear();
            mobileSizeField.clear();
            mp3ModelField.clear();
            mp3PriceField.clear();
            mp3WeightField.clear();
            mp3SizeField.clear();
            creditField.clear();
            availableMemoryField.clear();
            phoneNumberField.clear();
            durationField.clear();
            downloadSizeField.clear();
            deleteSizeField.clear();
            displayNumberField.clear();

            log("All fields cleared.");
            logDivider();
        });

        // this is to Display All button on the GUI interface
        displayAllButton.setOnAction(e ->
        {
            if (gadgets.isEmpty())
            {
                log("No gadgets are available to display.");
                return;
            }

            for (int i = 0; i < gadgets.size(); i++)
            {
                log("Display Number: " + i);
                gadgets.get(i).display();
                logDivider();
            }

            log("Displayed all gadgets in console output.");
        });

        // this method for Make A Call button to esure index number and displayed number is validated before proceeding
        makeCallButton.setOnAction(e ->
        {
            int displayNumber = getDisplayNumber();
            if (displayNumber == -1)
            {
                return;
            }

            Gadget g = gadgets.get(displayNumber);
            // this method is to check and ensure the selected object is really a Mobile instance before makeCall is used
            if (g instanceof Mobile)
            {
                // phone number in string (to match UK phone numbers format 07400 or +44)
                String phoneNumber = getPhoneNumber();
                int duration = getDuration();
                ((Mobile) g).makeCall(phoneNumber, duration);
                log("Call attempted on Mobile at index " + displayNumber + ".");
                logDivider();
            }
            else
            {
                showError("The gadget at index " + displayNumber + " is not a Mobile phone.");
            }
        });
        // this method is to show action performed when Download Music button is clicked and also avoid crashing
        downloadMusicButton.setOnAction(e ->
        {
            int displayNumber = getDisplayNumber();
            if (displayNumber == -1)
            {
                return;
            }
            Gadget g = gadgets.get(displayNumber);
            // this method is to ensure safe casting by checking the selected object is an MP3 instance first
            if (g instanceof MP3)
            {
                int downloadSize = getDownloadSize();
                ((MP3) g).downloadMusic(downloadSize);
                log("Download attempted on MP3 at index " + displayNumber + ".");
                logDivider();
            }
            else
            {
                showError("The gadget at index " + displayNumber + " is not an MP3 player.");
            }
        });

        // this method is to show action performed when Delete Music button is clicked and also avoid crashing
        deleteMusicButton.setOnAction(e ->
        {
            int displayNumber = getDisplayNumber();
            if (displayNumber == -1)
            {
                return;
            }
            Gadget g = gadgets.get(displayNumber);
            // this method is to ensure safe casting by checking the selected object is an MP3 instance first
            if (g instanceof MP3)
            {
                int deleteSize = getDeleteSize();
                ((MP3) g).deleteMusic(deleteSize);
                log("Delete attempted on MP3 at index " + displayNumber + ".");
                logDivider();
            }
            else
            {
                showError("The gadget at index " + displayNumber + " is not an MP3 player.");
            }
        });

        // All the GUI panes
        root.getChildren().addAll(
            mp3SectionLabel, mobileSectionLabel, sharedSectionLabel,
            mp3ModelLabel, mp3ModelField,
            mp3PriceLabel, mp3PriceField,
            mp3WeightLabel, mp3WeightField,
            mp3SizeLabel, mp3SizeField,
            availableMemoryLabel, availableMemoryField,
            downloadLabel, downloadSizeField,
            deleteLabel, deleteSizeField,
            mobileModelLabel, mobileModelField,
            mobilePriceLabel, mobilePriceField,
            mobileWeightLabel, mobileWeightField,
            mobileSizeLabel, mobileSizeField,
            creditLabel, creditField,
            phoneLabel, phoneNumberField,
            durationLabel, durationField,
            displayNumberLabel, displayNumberField,
            addMobileButton, addMP3Button, clearButton, displayAllButton, makeCallButton, downloadMusicButton, deleteMusicButton,
            logArea
        );

        stage.setScene(new Scene(root, 900, 590));
        stage.setTitle("Gadget Shop");
        stage.show();
    }

    // Text Field Input Methods

    // accessor style method to return Mobile model as a string
    private String getMobileModel()
    {
        return mobileModelField.getText().trim();
    }

    // accessor style method to return Mobile size as a string
    private String getMobileSize()
    {
        return mobileSizeField.getText().trim();
    }

    // accessor style method to return Mobile price as a double
    private double getMobilePrice()
    {
        try
        {
            return Double.parseDouble(mobilePriceField.getText().trim());
        }
        catch (Exception e)
        {
            showError("Price must be a valid number.");
            return 0.0;
        }
    }

    // accessor style method to return the Mobile weight as an int (Also show error message)
    private int getMobileWeight()
    {
        try
        {
            return Integer.parseInt(mobileWeightField.getText().trim());
        }
        catch (Exception e)
        {
            showError("Weight must be a whole number.");
            return 0;
        }
    }

    // accessor style method to return MP3 model as a string
    private String getMP3Model()
    {
        return mp3ModelField.getText().trim();
    }

    // accessor style method to return MP3 size as a string
    private String getMP3Size()
    {
        return mp3SizeField.getText().trim();
    }

    // accessor style method to return MP3 price as a double
    private double getMP3Price()
    {
        try
        {
            return Double.parseDouble(mp3PriceField.getText().trim());
        }
        catch (Exception e)
        {
            showError("Price must be a valid number.");
            return 0.0;
        }
    }

    // accessor style method to return the MP3 weight as an int (Also show error message)
    private int getMP3Weight()
    {
        try
        {
            return Integer.parseInt(mp3WeightField.getText().trim());
        }
        catch (Exception e)
        {
            showError("Weight must be a whole number.");
            return 0;
        }
    }

    // accessor style method to return initial credit as an int
    private int getCredit()
    {
        try
        {
            return Integer.parseInt(creditField.getText().trim());
        }
        catch (Exception e)
        {
            showError("Initial credit must be a whole number (min).");
            return 0;
        }
    }

    // accessor style method to return initial memory as an int
    private int getAvailableMemory()
    {
        try
        {
            return Integer.parseInt(availableMemoryField.getText().trim());
        }
        catch (Exception e)
        {
            showError("Initial memory must be a whole number (MB).");
            return 0;
        }
    }

    // accessor style method to return phone number as a string (UK phone number format)
    private String getPhoneNumber()
    {
        return phoneNumberField.getText().trim();
    }

    // accessor style method to return duration as an int
    private int getDuration()
    {
        try
        {
            return Integer.parseInt(durationField.getText().trim());
        }
        catch (Exception e)
        {
            showError("Call duration must be a whole number (min).");
            return 0;
        }
    }

    // accessor style method to return download size as an int
    private int getDownloadSize()
    {
        try
        {
            return Integer.parseInt(downloadSizeField.getText().trim());
        }
        catch (Exception e)
        {
            showError("Download size must be a whole number (MB).");
            return 0;
        }
    }

    // accessor style method to return delete size as an int
    private int getDeleteSize()
    {
        try
        {
            return Integer.parseInt(deleteSizeField.getText().trim());
        }
        catch (Exception e)
        {
            showError("Delete size must be a whole number (MB).");
            return 0;
        }
    }

    // this method is to display special number
    private int getDisplayNumber()
    {
        // initialise to -1 so invalid input can safely return a fail value
        int displayNumber = -1;

        try
        {
            displayNumber = Integer.parseInt(displayNumberField.getText().trim());

            // method to check that display number is in the correct range of the ArrayList
            if (displayNumber < 0 || displayNumber >= gadgets.size())
            {
                showError("Display number must be between 0 and " + (gadgets.size() - 1) + ".");
                return -1;
            }

            return displayNumber;
        }
        catch (Exception e)
        {
            showError("Display number must be a whole number (integer).");
            return -1;
        }
    }

    // helper method to append messages to both the log area and PowerShell
    private void log(String message)
    {
        System.out.println(message);
    }

    // helper method to add divider and spacing in the log area
    private void logDivider()
    {
        log("_______________________ ");
        log("");
    }

    // helper method to show errors using message dialog box
    private void showError(String message)
    {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Input Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}