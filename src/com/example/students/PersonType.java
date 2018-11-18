package com.example.students;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import by.bsu.xmlstudents.Student;
import by.bsu.xmlstudents.Student.Address;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = { 
		"name",
		"telephone",
		"address"
})
@XmlSeeAlso({
	Student.class,
	Abiturient.class
}) 
public class PersonType {
	 @XmlElement(required = true)
	 protected String name;
	 @XmlElement(required = true)
	 @XmlSchemaType(name = "positiveInteger")
	 protected BigInteger telephone;
	 @XmlElement(required = true)
	 protected Address address;
	 public String getName() {
		    return name;
	}  
	 public void setName(String value) {
		   this.name = value;
		 
	}   
	 public BigInteger getTelephone() { 
			return telephone; 
	}    
	 public void setTelephone(BigInteger value) { 
			this.telephone = value;
	}   
	 public Address getAddress() { 
		 	return address;
    }   
	 public void setAddress(Address value) {
		    this.address = value; 
	} 
 } 

