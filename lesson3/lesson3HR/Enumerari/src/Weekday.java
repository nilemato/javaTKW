public enum Weekday {
    MONDAY(true), TUESDAY(true), WEDNESDAY(true),
    THURSDAY(true), FRIDAY(true), SATURDAY(true), SUNDAY(true);

    private boolean workday;

    private Weekday (boolean workday){
        this.workday = workday;
    }

    public boolean isWeekDay(){
        return workday;
    }

    public boolean isHoliday(){
        return !workday;
    }


};



