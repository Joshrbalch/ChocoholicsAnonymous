package chocaholicsAnonymous;
/**
* The Date class builds the date to record in reports
*
* @author 
* @version 1.0
*/
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;

class Date {
    int month;
    int day;
    int year;

    public Date() {
        month = 0;
        day = 0;
        year = 0;
    }

    public void setDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public void setMonth(int month) {
    	this.month = month;
    }
    public int getMonth() {
    	return month;
    }
    public void setDay(int day) {
    	this.day =day;
    }
    public int getDay() {
    	return day;
    }
    public void setYear(int year) {
    	this.year=year;
    }
    public int getYear() {
    	return year;
    }

    //Prints the system date in the format mm/dd/yyyy
    public void printDateNow() {
        System.out.println(java.time.LocalDate.now());
    }
}
