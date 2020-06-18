package com.nadl.fiu.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "individual")
public class Individual {

		@Id
		@GeneratedValue(generator = "uuid")
		@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
		@Column(name = "individual_id", nullable = false)
		private String individualId;

		@Column(name = "customer_id", nullable = false)
		private String customerId;

		@Column(name = "first_name")
		private String firstName;

		@Column(name = "middle_name")
		private String middleName;

		@Column(name = "last_name")
		private String lastName;

		@Column(name = "dob")
		private Date dob;

		public String getIndividualId() {
			return individualId;
		}

		public void setIndividualId(String individualId) {
			this.individualId = individualId;
		}

		public String getCustomerId() {
			return customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getMiddleName() {
			return middleName;
		}

		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		@Override
		public String toString() {
			return "Individual [individualId=" + individualId + ", customerId=" + customerId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", dob=" + dob + "]";
		}

}
