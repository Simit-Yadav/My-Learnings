
# Exception

<b>java.lang.Exception</b>

An exception is a problem that arises during the execution of a program which disrupts the flow of program. All the exceptions are sub classes of the Exception class. Exception class is sub class of Throwable class. 
  
There are three categories of Exception:
- <b>Checked Exception</b> : ia an exception that is checked(notified) by the compiler at compilation-time. Also called compile-time exception.
- <b>Unchecked Exception</b> : an exception that occurs at the time of execution. Also called as runtime exception.
- <b>Errors</b> - These are not exceptions at all, but problems that arise beyond the control of the user or the programmer. Typically ignored because we can rarely do anything about an error.

## Methods Available in Throwable class: 
- public String getMessage()
- public Throwable getCause()
- public String toString()
- public void printStackTrace()

## Handling exception is done by try/catch block.

## Making our own exception class.
To make our own exception class we must extend it to Exception class.