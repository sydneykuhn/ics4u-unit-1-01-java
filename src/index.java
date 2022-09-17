/*
 * The log counter calculates the maximum amount of logs
 * a truck can carry based on the length of the logs.
 *
 * @author  Sydney Kuhn
 * @version 1.0
 * @since   2022-09-14
 */

import java.io.Console;

/**
* This is the standard "Hello, World!" program.
*/
final class logCalculator {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private logCalculator() {
	throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
	final float truckCapacity = 1100;
	final float mapleWeight = 20;

	final Console console = System.console();
        final String logLengthString = console.readLine(
		"How long are the logs in meters : ");

        final float logLength = Float.valueOf(logLengthString);

        final float logAmount = truckCapacity / (mapleWeight * logLength);

	// print out answer
	System.out.println(
		logAmount + " is the maximum amount of " + logLength + "m logs.");
        System.out.println("\nDone.");
    }
}

