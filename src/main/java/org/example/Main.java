package org.example;

public class Main {

    /**
     * Method name: circleArea
     * Method return type: double
     * Method parameter: the radius of a circle
     * Method signature: circleArea(int)
     * Returns the area of a circle.
     */
    public static double circleArea(int radius) {
        return (double) Math.round(Math.PI * radius * radius * 100) / 100;
    }

    /**
     * Method name: circleCircum
     * Method return type: double
     * Method parameter: the radius of a circle
     * Method signature: circleCircum(int)
     * Returns the circumference of a circle.
     */
    public static double circleCircum(int radius) {
        return (double) Math.round(Math.PI * 2 * radius * 100) / 100;
    }

    /**
     * Method name: circleInfo
     * Method return type: String
     * Method parameter: the radius of a circle
     * Method signature: circleInfo(int)
     * Returns a String detailing the radius, circumference, and area of a circle.
     * Format of returned String: e.g.
     * Radius: 3
     * Circumference: 18.85
     * Area: 28.27
     */
    public static String circleInfo(int radius) {
        double circum = circleCircum(radius);
        double area = circleArea(radius);
        return String.format("Radius: %d\nCircumference: %.2f\nArea: %.2f", radius, circum, area);
    }

    /**
     * Method name: minutesToHoursMinutes
     * Method return type: String
     * Method parameter: total minutes (e.g. 226)
     * Method signature: minutesToHoursMinutes(int)
     * Returns a String detailing the number of hours and minutes.
     * Format of returned String: e.g. 3 hours and 46 minutes
     */
    public static String minutesToHoursMinutes(int minutes) {
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return String.format("%d hours and %d minutes", hours, remainingMinutes);
    }

    /**
     * Method name: twentyFourToTwelve
     * Method return type: String
     * Method parameter: time in 24-hour format (e.g. 15:56). time >= 13:00 (always pm)
     * Method signature: twentyFourToTwelve(String)
     * Returns a String detailing the time in 12-hour format (e.g. 3:56 pm).
     * Format of returned String: e.g. 3:56 pm
     */
    public static String twentyFourToTwelve(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        return String.format("%d:%d pm", hour - 12, minute);
    }

    /**
     * Method name: distanceBetweenTwoPoints
     * Method return type: double
     * Method parameter: x1, y1, x2, y2 (the two coordinates on a 2D plane)
     * Method signature: distanceBetweenTwoPoints(int, int, int, int)
     * Returns the distance between two points
     */
    public static double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        return (double) Math.round(Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) * 100) / 100;
    }

    /**
     * Method name: fahrenheitToCelsius
     * Method return type: double
     * Method parameter: degrees fahrenheit
     * Method signature: fahrenheitToCelsius(int)
     * Returns the degrees celsius equivalent of the degrees in fahrenheit
     */
    public static double fahrenheitToCelsius(int fahrenheit) {
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return Math.round(celsius * 100.0) / 100.0;
    }

    /**
     * Method name: celsiusToFahrenheit
     * Method return type: double
     * Method parameter: degrees celsius
     * Method signature: celsiusToFahrenheit(int)
     * Returns the degrees fahrenheit equivalent of the degrees in celsius
     */
    public static double celsiusToFahrenheit(int celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}
