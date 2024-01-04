package edu04.homework;

import java.util.Scanner;

enum HTTPError {
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized error"),
    PAYMENT_REQUIRED(402, "Payment Required"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not found");

    private final int code;
    private final String description;

    HTTPError(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an HTTP error code: ");
        int errorCode = scanner.nextInt();

        HTTPError httpError = mapErrorCode(errorCode);
        if (httpError != null) {
            System.out.print("HTTP error " + httpError.getCode() + ": " + httpError.getDescription());
        } else {
            System.out.print("Unknown HTTP error ");
        }
    }

    private static HTTPError mapErrorCode(int code) {
        for (HTTPError error : HTTPError.values()) {
            if (error.getCode() == code) {
                return error;
            }
        }
        return null;
    }
}