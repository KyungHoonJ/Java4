package c230911.dataStream;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6995169945080773963L;
	int num;
	String name;
	double score;
	
	Student(int num, String name, double score){
		this.num = num;
		this.name = name;
		this.score = score;
	}
}
