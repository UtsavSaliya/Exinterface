package Exfuninterface;

public class Msgprint implements Exfunctionalinterface {
	@Override
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }
}