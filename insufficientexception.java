/* userdefined exception */

package bnk;
public class InsufficientFundException extends RuntimeException
{
public InsufficientFundsException(){}

public InsufficientFundException(String msg){
super(msg);
}
}