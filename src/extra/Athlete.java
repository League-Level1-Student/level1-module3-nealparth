package extra;

public class Athlete {

    static int nextBibNumber;
    static Stri
    ng raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

Athlete (String name, int speed, int bibNumber){
    this.name = name;
    this.speed = speed;
    this.bibNumber= bibNumber;
}

String name() {
	return name;
}

int speed(int i) {
	return speed;
}

int bibNumber() {
	return bibNumber;
}







}






