package homeworks.homework4;

import java.util.Scanner;

public class HttpErrors {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of http error: ");

        int errorNumber = sc.nextInt();

        HTTPError httpError = HTTPError.getByNumber(errorNumber);

        System.out.println("This number corresponds to " + httpError.description);

    }

}

enum HTTPError {
    BAD_REQUEST("Bad request"),
    UNAUTHORISED("Unauthorised"),
    PAYMENT_REQUIRED("Payment required"),
    FORBIDDEN("Forbidden"),
    NOT_FOUND("Not found");

    public final String description;

    HTTPError(String description) {
        this.description = description;
    }

    public static HTTPError getByNumber(int number) {
        return switch (number) {
            case 400 -> BAD_REQUEST;
            case 401 -> UNAUTHORISED;
            case 402 -> PAYMENT_REQUIRED;
            case 403 -> FORBIDDEN;
            case 404 -> NOT_FOUND;
            default -> throw new IllegalArgumentException("There is no such number of http error: " + number);
        };
    }
}
