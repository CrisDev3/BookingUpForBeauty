package org.example;

import com.sun.source.tree.BreakTree;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class AppointmentScheduler {

    //Parse appointment date
    public LocalDateTime schedule(String appointmentDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDate, formatter);
    }

    //Check if an appointment has already passed
    public boolean hasPassed(LocalDateTime date){
        LocalDateTime actualDate = LocalDateTime.of(2025, 3, 9, 06, 43, 25);
        return date.isBefore(actualDate);
    }

    // Check if the appointment is in the afternoon
    public boolean isAfternoonAppointment(LocalDateTime date){
        if (date.getHour() >= 12 && date.getHour() < 18)
            return true;
        else
            return false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        // Define the format: "EEEE, MMMM d, yyyy, 'at' h:mm a"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");

        // Format the date and return the description
        return "You have an appointment on " + appointmentDate.format(formatter) + ".";
    }

    // Get anniversary date
    public LocalDate getAnniversaryDate(){
        int currentYear = LocalDate.now().getYear();
        return LocalDate.of(currentYear, 9, 15);
    }
}
