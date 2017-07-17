package com.ezteam.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Teddy on 17/07/2017.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CreationFailedException extends RuntimeException {
}
