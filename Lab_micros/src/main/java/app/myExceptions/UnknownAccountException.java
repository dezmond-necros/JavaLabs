package app.myExceptions;

public class UnknownAccountException extends Exception
{
    public UnknownAccountException(String message)
    {
        super(message);
    }
}
