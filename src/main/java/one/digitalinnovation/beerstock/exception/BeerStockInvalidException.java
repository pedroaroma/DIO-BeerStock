package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockInvalidException extends Exception {

    public BeerStockInvalidException(Long id, int quantityToDecrement) {
        super(String.format("Invalid Beer stock for beer ID: %s number: %s", id, quantityToDecrement));
    }
}
