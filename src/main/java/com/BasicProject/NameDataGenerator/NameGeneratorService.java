package com.BasicProject.NameDataGenerator;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;


@Service
public class NameGeneratorService {
	
	private final Faker faker = new Faker();

    public String generateRandomName() {
        //return faker.name().fullName();
    	
    	String prefix=faker.name().prefix();
    	String firstName = faker.name().firstName();
    	//String middleName = faker.name().nameWithMiddle();
    	//middleName=middleName.substring(0,middleName.indexOf(" "));
//        String lastName = faker.name().lastName(); 
    	
    	String lastName = faker.internet().emailAddress();        
        
        
        
        
        
        
        
//        if (firstName.length() > 10) {
//            firstName = firstName.substring(0, 10);
//        }
//        if (lastName.length() > 10) {
//            lastName = lastName.substring(0, 10);
//        }
//        //System.out.println(middleName.length());
        //System.out.println(middleName);
        //return prefix+" "+firstName + " "+middleName+" "+ lastName;
        return firstName+" "+lastName;
    }
    
    
	
	
	

}
