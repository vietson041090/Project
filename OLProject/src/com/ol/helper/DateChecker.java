package com.ol.helper;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateChecker extends Date {

	/**
	 * Author: 			LTToan
	 * Created date: 	05/12/2014
	 * Description: 	Check if a String is a valid date
	 */
	
	private static final long serialVersionUID = 1L;
	
	private static final String DATE_PATTERN = 
	          "((19|20)\\d\\d)/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])";
	
	private Matcher matcher;
    private Pattern pattern;
    
	
	/**
     * Checks if the date format is a valid.
     * Uses the regex pattern to match the date first. 
     * Than additionally checks are performed on the boundaries of the days taken the month into account (leap years are covered).
     * 
     * @param date the date that needs to be checked.
     * @return if the date is of an valid format or not.
     */
    public boolean check(final String date) {
    	pattern = Pattern.compile(DATE_PATTERN);
        matcher = pattern.matcher(date);
        if (matcher.matches()) {
            	
        	String[] splitDate = date.split("/");
            int day = Integer.parseInt(splitDate[2]);
            int month = Integer.parseInt(splitDate[1]);
            int year = Integer.parseInt(splitDate[0]);
            System.out.println("DATTTTTT "+year+"/"+month+"/"+day);

            switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: return day < 32;
            case 4:
            case 6:
            case 9:
            case 11: return day < 31;
            case 2: 
                int modulo100 = year % 100;
                //http://science.howstuffworks.com/science-vs-myth/everyday-myths/question50.htm
                if ((modulo100 == 0 && year % 400 == 0) || (modulo100 != 0 && year % 4 == 0)) {
                    //its a leap year
                    return day < 30;
                } else {
                    return day < 29;
                }
            default:
                break;
            }
            
        }
        return false;
    }

    public String getRegex() {
        return pattern.pattern();
    }
}

