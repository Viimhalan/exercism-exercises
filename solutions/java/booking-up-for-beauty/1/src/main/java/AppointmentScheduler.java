import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime appDateTime = LocalDateTime.parse(appointmentDateDescription, parser);
        return appDateTime;
        //throw new UnsupportedOperationException("Please implement the AppointmentScheduler.schedule() method");
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return LocalDateTime.now().isAfter(appointmentDate);
        //throw new UnsupportedOperationException("Please implement the AppointmentScheduler.hasPassed() method");
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return (appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18)? true:false;
        //throw new UnsupportedOperationException("Please implement the AppointmentScheduler.isAfternoonAppointment() method");
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("h:mm a");
        String time = appointmentDate.toLocalTime().format(parser);
        String day = appointmentDate.getDayOfWeek().toString();
        String dayEdit = day.substring(0,1) + day.substring(1).toLowerCase();
        String month = appointmentDate.getMonth().toString();
        String monthEdit = month.substring(0,1) + month.substring(1).toLowerCase();
        return "You have an appointment on "+dayEdit+", "+monthEdit+" "+appointmentDate.getDayOfMonth()+", "+appointmentDate.getYear()+", at "+time+".";
        //throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getDescription() method");
    }

    public LocalDate getAnniversaryDate() {
        LocalDate annDate = LocalDate.of(LocalDate.now().getYear(),9,15);
        return annDate;
        //throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getAnniversaryDate() method");
    }
}
