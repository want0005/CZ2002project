import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;



public class Cinema {
	public enum ClassOfCinema { Standard, Premium, Platinum }
    /**
     * The class of the cinema
     */
	private ClassOfCinema classOfCinema;
	/**
	 * The cinema code of the cinema
	 */
    private String cinemaCode;
    /**
     * All the seats in the cinema
     */
	private Seat[][] seats;
	/**
	 * The cinema index of the cinema
	 */
	private int cinemaIndex;
	/**
	 * The number of empty seats in the cinema
	 */
	private int numberOfEmptySeat;
	/**
	 * The number of rows of seats in this cinema
	 */
	private int row;
	/**
	 * The number of columes of seats in this cinema
	 */
	private int col;
	
//	 * Creates a new Cinema with given cinema class,
//	 * cinemaCode, number of rows, number of columes,
//	 * seats, cinema index and
//	 * number of empty seats of this cinema
//
//	public Cinema(ClassOfCinema cinemaClass, String cinemaCode, int row, int col, Seat[] seats, int cinemaID, int numOfEmptySeat){
//		this.classOfCinema = cinemaClass;
//        this.cinemaCode = cinemaCode;
//		this.row = row;
//		this.col = col;
//		for (int i=0; i<row; i++){
//			for (int j=0; j<col; j++){
//				this.seats[i][j]=seats[i*col+j];
//                this.seats[i][j].setID('A'+i, j+1);
//			}
//		}
//		this.cinemaIndex = cinemaID;
//		this.numberOfEmptySeat = numOfEmptySeat;
//	}
	/**
	 * Gets the class of this cinema
	 * @return the class of this cinema
	 */
	public ClassOfCinema getClassOfCinema(){
		return classOfCinema;
	}
	/**
	 * Gets a certain seat with given row and colume number in this cinema
	 * @param row The row number of this seat
	 * @param col The col number of this seat
	 * @return The seat requested
	 */
//	public Seat getSeat(int row, int col){
//		return seats[row][col];
//	}
	/**
	 * Gets the index of this cinema
	 * @return Index of this cinema
	 */
	public int getCinemaIndex(){
		return cinemaIndex;
	}
	/**
	 * Gets the cinema code of this cinema
	 * @return the cinema code of this cinema
	 */
    public String getCinemaCode() {
        return cinemaCode;
    }
    /**
     * Gets the number of empty seats in this cinema
     * @return the number of empty seats in this cinema
     */
?
    public String toString() {
        return cinemaCode;
    }

}