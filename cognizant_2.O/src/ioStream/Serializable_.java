package ioStream;
import java.io.*;
public class Serializable_ implements Serializable {
	int id;
	String name;
	String office;
	transient int sid;

	Serializable_(int id, String name, String office, int sid) {
	this.id = id;
	this.name = name;
	this.office = office;
	this.sid = sid;
	}
}
