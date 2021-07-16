package company;

public class TeamLead implements TimeSheets, FirePower{


    @Override
    public void fillOut() {
        System.out.println("TeamLeade is filling out timesheets");
    }

    @Override
    public void fired() {
        System.out.println("You're fired!");
    }
}
