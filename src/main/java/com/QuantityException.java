package com;

public class QuantityException extends Exception
{
    public QuantityException(ExceptionType unitNotComparable)
    {
    }
    public enum ExceptionType
    {
        UNIT_NOT_COMPARABLE,UNIT_NOT_ADDABLE;
    }
    public ExceptionType type;

    public QuantityException(String message, ExceptionType exceptionType)
    {
        super(message);
        this.type = exceptionType;
    }
}
