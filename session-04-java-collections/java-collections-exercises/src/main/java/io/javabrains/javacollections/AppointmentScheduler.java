package io.javabrains.javacollections;

import java.time.LocalDateTime;
import java.util.NavigableSet;
import java.util.TreeSet;

// Implement the  AppointmentScheduler using a NavigableSet internally

public class AppointmentScheduler {
    private NavigableSet<LocalDateTime> set;

    public AppointmentScheduler() {
        set = new TreeSet<>();
    }

    public NavigableSet<LocalDateTime> getSet() {
        return set;
    }

    public void addAppointment(LocalDateTime datetime) {
//        throw new RuntimeException("Not implemented");
        this.set.add(datetime);
    }

    public LocalDateTime getNextAvailableSlot(LocalDateTime datetime) {
//        throw new RuntimeException("Not implemented");
        return this.set.ceiling(datetime);
    }

    public LocalDateTime removeFirstAppointment() {
//        throw new RuntimeException("Not implemented");
        return this.set.pollFirst();
    }

    public LocalDateTime removeLastAppointment() {
//        throw new RuntimeException("Not implemented");
        return this.set.pollLast();
    }

    public NavigableSet<LocalDateTime> getAppointmentsAfter(LocalDateTime datetime) {
//        throw new RuntimeException("Not implemented");
        return (NavigableSet<LocalDateTime>) this.set.tailSet(datetime);

    }

    public static void main(String[] args) {
        AppointmentScheduler scheduler = new AppointmentScheduler();

        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 10, 0));
        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 11, 0));
        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 12, 0));
        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 13, 0));

        System.out.println(scheduler.getSet());

        LocalDateTime datetime1 = LocalDateTime.of(2023, 3, 4, 10, 30);
        LocalDateTime nextSlot1 = scheduler.getNextAvailableSlot(datetime1);
        System.out.println("Next available slot after " + datetime1 + ": " + nextSlot1);

        LocalDateTime first = scheduler.removeFirstAppointment();
        System.out.println("Removed first appointment: " + first);

        LocalDateTime last = scheduler.removeLastAppointment();
        System.out.println("Removed last appointment: " + last);

        LocalDateTime datetime3 = LocalDateTime.of(2023, 3, 4, 11, 0);
        NavigableSet<LocalDateTime> appointmentsAfter = scheduler.getAppointmentsAfter(datetime3);
        System.out.println("Appointments after " + datetime3 + ": " + appointmentsAfter);
    }
}
