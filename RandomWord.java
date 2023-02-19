package firstpackage;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord{
	public static void main(String[] args) {
		//initializing champion to empty string, declaring contestant
	String champion = "", contestant;
	//initializing current word in standard input
	int currentWord = 1;
	//looping while standard input isn't empty
	while(!StdIn.isEmpty()) {
		//assigning word to contestant from standard input
		contestant = StdIn.readString();
		//initializing p as probability 1/currentWord
		double p = (double) 1/currentWord;
		//increasing currentWord to move to next word
		currentWord++;
		//passing p to StdRandom.bernoulli() returns true/false
		if(StdRandom.bernoulli(p)) {
			//if true is returned, champion is assigned value of contestant
			champion = contestant;
		}
	}
	//prints the champoin once all input is read
	System.out.println(champion);
	}
	
}