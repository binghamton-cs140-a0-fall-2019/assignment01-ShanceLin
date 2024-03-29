package assignment01;

public class SimpleDate {
    int year;
    int month;
    int day;

    public static SimpleDate of(int yr, int m, int d) {
        var returnValue = new SimpleDate();
        returnValue.year = yr;
        returnValue.month = m;
        returnValue.day = d;

        return returnValue;
    }

    public boolean before(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        } else if (this.year == other.year) {
            if (this.month < other.month) {
                return true;
            } else if (this.month == other.month) {
                if (this.day < other.day) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
