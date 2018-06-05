package packbalaji;

class Card {

String value;

public Card(String value) {
	super();
	this.value = value;
}

public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}
public int getCardValue()

{

    switch (this.value)

    {
    case "A":
    	return 1;

    case "J":

        return 11;



    case "Q":

        return 12;



    case "K":

        return 13;



    default:

        return Integer.valueOf(this.value);

    }

}
	
}

