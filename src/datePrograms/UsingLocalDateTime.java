package datePrograms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UsingLocalDateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("Date: " + date);
		System.out.println("Time: " + time);
		System.out.println("DateTime: " + datetime);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		String today = datetime.format(formatter);
		System.out.println("Today Date with Format dd/MMM/yyyy : " + today);
	}
}
