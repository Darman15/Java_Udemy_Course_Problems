public class NumberOfDaysInMonth {


public static boolean isLeapYear(int year) {
    if (year < 1 || year > 9999) {
        return false;
    }
    else if (year % 4 == 0 && year % 100 != 0) {
        return true;
    }

    else if (year % 400 == 0) {
        return true;
    }

    else {
        return false;
    }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        else if (year < 1 || year > 9999 ) {
            return -1;
        }

        else {
            int num = 0;
            switch (month) {
                case 1:
                    num = 31;
                break;

                case 2:
                    if (isLeapYear(year)) {
                        num = 29;
                    } else {
                        num = 28;
                    }
                    break;

                case 3:
                    num = 31;
                    break;

                case 4:
                    num = 30;
                    break;

                case 5:
                    num = 31;
                    break;

                case 6:
                   num = 30;
                    break;

                case 7:
                    num =  31;
                    break;

                case 8:
                    num = 31;
                    break;

                case 9:
                    num = 30;
                    break;

                case 10:
                    num = 31;
                    break;

                case 11:
                   num = 30;
                    break;

                case 12:
                    num = 31;
                    break;

                default:
                   return -1;
            }
            return num;
        }

    }

}
