// Unit 3, Module 3, ex. 3.27

class Person {

    // Fields:
    String firstName;
    String lastName;
    int birthYear;

    // Constructor:
    public Person (String firstName, String lastName, int birthYear)
    {
	this.firstName = firstName;
	this.lastName = lastName;
	this.birthYear = birthYear;
    }

    // Comparison method
    public boolean lessThan (Person p)
    {
	if (birthYear < p.birthYear) {
	    return true;
	}
	else {
	    return false;
	}
    }
} // end-of-Person


public class ObjectSortExample {

    public static void main (String[] argv)
    {
	Person[] someFolks = new Person [8];

	someFolks[0] = new Person ("Luke", "Skywalker", 19);
	someFolks[1] = new Person ("Chewbacca", "", 200);
	someFolks[2] = new Person ("Han", "Solo", 29);
	someFolks[3] = new Person ("Princess", "Leia", 19);
	someFolks[4] = new Person ("Obi-wan", "Kenobi", 57);
	someFolks[5] = new Person ("Qui-Gonn", "Jinn", 92);
	someFolks[6] = new Person ("Yoda", "", 896);
	someFolks[7] = new Person ("Finn", "", 11);

	System.out.println ("Unsorted: ");
	print (someFolks);

	sort (someFolks);

	System.out.println ("\nSorted: ");
	print (someFolks);
    }

    static void print (Person[] people)
    {
	for (int i=0; i < people.length; i++) {
	    System.out.println (people[i].firstName + " " + people[i].lastName + " (b. " + people[i].birthYear + ")");
	}
    }

    static void sort (Person[] people)
    {
	// Selection sort
	
	for (int i=0; i < people.length-1; i++) {
	    Person oldest = people[i];
	    int pos = i;
	    for (int j=i+1; j < people.length; j++) {
		if ( ! people[j].lessThan (oldest) ) {
		    oldest = people[j];
		    pos = j;
		}
	    }

	    // Swap
	    Person temp = people[i];
	    people[i] = people[pos];
	    people[pos] = temp;
	} // end-of-outer-for
    }
} // end-of-ObjectSortExample
