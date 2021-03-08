package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerNegativeStockException extends Exception {

    public BeerNegativeStockException(Long id, int quantityToDecrement) {
        super(String.format("Invalid Beer stock for beer ID: %s number: %s", id, quantityToDecrement));
    }
}
