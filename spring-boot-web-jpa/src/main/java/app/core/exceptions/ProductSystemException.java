package app.core.exceptions;

public class ProductSystemException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProductSystemException() {
		super();
	}

	public ProductSystemException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ProductSystemException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProductSystemException(String message) {
		super(message);
	}

	public ProductSystemException(Throwable cause) {
		super(cause);
	}

}
