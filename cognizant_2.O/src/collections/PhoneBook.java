package collections;

import java.util.*;

public class PhoneBook {
	private List<Contact> phoneBook = new ArrayList<Contact>();

	public List<Contact> getList() {
		return phoneBook;
	}

	public void setList(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}

	public void addContact(Contact contactObj) {
		this.phoneBook.add(contactObj);
	}

	public List<Contact> viewAllContacts() {
		return this.phoneBook;
	}

	public Contact viewContactGivenPhone(long phoneNumber) {
		for (Contact c : phoneBook) {
			long pno = c.getPhoneNumber();
			if (pno == phoneNumber) {
				return c;
			}
		}
		return null;
	}

	public boolean removeContact(long phoneNumber) {
		for (Contact c : phoneBook) {
			long pno = c.getPhoneNumber();
			if (pno == phoneNumber) {
				phoneBook.remove(c);
				return true;
			}
		}
		return false;
	}
}