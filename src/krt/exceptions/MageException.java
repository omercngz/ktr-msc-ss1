package krt.exceptions;

import java.util.concurrent.ExecutionException;

public class MageException  extends ExecutionException
{
    public MageException(String message) {
        super(message);
    }
}
