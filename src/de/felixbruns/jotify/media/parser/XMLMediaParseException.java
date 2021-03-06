package de.felixbruns.jotify.media.parser;

import javax.xml.stream.Location;

/**
 * An exception that is thrown if XML parsing failed.
 * 
 * @author Felix Bruns <felixbruns@web.de>
 *
 * @category Exceptions
 */
public class XMLMediaParseException extends Exception {
	/**
	 * Default serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Construct a new {@link XMLMediaParseException} using a message string
	 * and a {@link Location}.
	 * 
	 * @param message  The message.
	 * @param location The location.
	 */
	public XMLMediaParseException(String message, Location location){
		super(
			message +
			" @ line: " + location.getLineNumber() +
			" column: " + location.getColumnNumber()
		);
	}
	
	/**
	 * Construct a new {@link XMLMediaParseException} using a cause.
	 * 
	 * @param cause The cause.
	 */
	public XMLMediaParseException(Throwable cause){
		super(cause);
	}
	
	/**
	 * Construct a new {@link XMLMediaParseException} using a message string,
	 * a location and a cause.
	 * 
	 * @param message  The message.
	 * @param location The location.
	 * @param cause    The cause.
	 */
	public XMLMediaParseException(String message, Location location, Throwable cause){
		super(
			message +
			" @ line: " + location.getLineNumber() +
			" column: " + location.getColumnNumber(),
			cause
		);
	}
}
