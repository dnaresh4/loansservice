package com.cap.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
public class Account {

	@Id
	@GeneratedValue
	private Long accountId;

	@NotBlank(message = "Please provide 'First Name'")
	private String firstName;
	@NotBlank(message = "Please provide 'Last Name'")
	private String lastName;
//	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dob;
	private String mobileNumber; // (01)123-234
	private String homeAddress;
	@NotBlank(message = "Email Address is mandatory.")
	@Email(message = "Provide a valid email address.")
	private String emailId;
	private Long ssn;
	private String mailingAddress;
	private String minimumBalance;
	private AccountType accountType;

	/*
	 * First Name, Last Name, DOB, SSN, Email ID, Mobile Number, Home Address,
	 * Mailing Address, Account Type [ Savings, Checking, CD ], Minimum Balance [ If
	 * Savings - $200, Checking - $300, CD-$2000 ],
	 */

}
