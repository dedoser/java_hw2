package org.vmk.dep508.collections.basket;

/**
 * Исключение, возникающее при неправильной работе с корзиной
 */
public class BasketErrorException extends RuntimeException {
    public BasketErrorException() {
        super();
    }

    public BasketErrorException(String message) {
        super(message);
    }

    public BasketErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasketErrorException(Throwable cause) {
        super(cause);
    }

    protected BasketErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
