

public class Neftlix {
public static void main(String[] args) {
Movie movie1= new Movie("SkateBoard",4);
System.out.println(movie1.getTicketPrice());
Movie movie2= new Movie("tired", 2);
Movie movie3= new Movie("boring", 3);
Movie movie4= new Movie("dumb", 2);
Movie movie5= new Movie("cheap", 1);



NetflixQueue netflix= new NetflixQueue();

netflix.addMovie(movie1);
netflix.addMovie(movie2);
netflix.addMovie(movie3);
netflix.addMovie(movie4);
netflix.addMovie(movie5);
System.out.println("The best movie is" + netflix.getBestMovie());
System.out.println("The second best movie is" + netflix.getMovie(1));
netflix.printMovies();












}













































}


























