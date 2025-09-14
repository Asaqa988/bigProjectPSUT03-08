package Automation;

import java.util.Random;


public class myData {
	
	Random rand = new Random(); 
	
	String [] firstNames = {"shatha","zainab","ayham","abdulrahman","ammar","sana","khaled"};

	String [] lastNames = {"Mohammad","mahmoud","ali","omar","anas","rami"};

	int randomNumberForTheEmail = rand.nextInt(19845);

	String domain = "@gmail.com"; 
	
	int randomFirstNamIndex = rand.nextInt(firstNames.length);
	int randomLastNameIndex = rand.nextInt(lastNames.length);
	
	
	String TheFirstName = firstNames[randomFirstNamIndex];
	
	String TheLastName = lastNames[randomLastNameIndex];
	
	String TheEmail = TheFirstName+TheLastName+randomNumberForTheEmail+domain; 
	
	String TelePhone = "96279770023";
	String TheFaxNumber = "133810"; 
	String TheAddressOne = "Amman- Jordan";

	int theSelectStateIndex = rand.nextInt(1,10); 
	
	String postalCode = "19880";
	
	String LOGINAME = TheFirstName+TheLastName+randomNumberForTheEmail ; 
String Password = "P@$$w0rd";
	
String ExpectedTextForTheSignUp = "YOUR ACCOUNT HAS BEEN CREATED!";

String TheLogoutMessage ="You have been logged off your account. It is now safe to leave the computer.";
String welcomemessage = "Welcome back "+TheFirstName;
}
