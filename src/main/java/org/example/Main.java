package org.example;
import java.time.LocalDateTime;
import java.time.LocalDate;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AppointmentScheduler scheduler = new AppointmentScheduler();

        // 1. Test schedule() method
        String appointmentString = "7/25/2019 13:45:00";
        LocalDateTime scheduledDate = scheduler.schedule(appointmentString);
        System.out.println("Scheduled Date: " + scheduledDate);

        // 2. Test hasPassed() method
        boolean isPast = scheduler.hasPassed(scheduledDate);
        System.out.println("Has the appointment passed? " + isPast);

        // 3. Test isAfternoonAppointment() method
        boolean isAfternoon = scheduler.isAfternoonAppointment(scheduledDate);
        System.out.println("Is the appointment in the afternoon? " + isAfternoon);

        // 4. Test getDescription() method
        String description = scheduler.getDescription(scheduledDate);
        System.out.println(description);

        // 5. Test getAnniversaryDate() method
        LocalDate anniversary = scheduler.getAnniversaryDate();
        System.out.println("Anniversary Date: " + anniversary);
        }
    }
