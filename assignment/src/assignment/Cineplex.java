package assignment;

public class Cineplex{
	/**
	 * Name of a Cineplex
	 */
	private String cineplexName;
	/**
	 * List of cinemas in this Cineplex
	 */
	private Cinema[] cinemas;
	/**
	 * Creates a Cineplex with given name,
	 * a list of cinemas and number of cinemas in this Cineplex
	 * @param cineplexName Name of this Cineplex
	 * @param cinemas List of cinema in this Cineplex
	 * @param numOfCinema Number of cinema in this Cineplex
	 */
	public Cineplex(String cineplexName, Cinema[] cinemas, int numOfCinema) {
		cinemas = new Cinema[numOfCinema];
		this.cineplexName = cineplexName;
		for (int i=0;i<numOfCinema;i++){
			this.cinemas[i]=cinemas[i];
		}
	}
	/**
	 * Gets the name of this Cineplex
	 * @return the name of this Cineplex
	 */
	public String getCineplexName() {
		return cineplexName;
	}
	/**
	 * Gets cinemas in this cineplex
	 * @return All cinemas in this cineplex
	 */
	public Cinema[] getCinemas() {
		return cinemas;
	}
	/**
     * Gets the string representation
     * for the name of this cineplex
     * @return string representation of cineplex name
     */
	public String toString() {
		return cineplexName;
	}
}