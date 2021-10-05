package test;

public abstract class SCPProtocol  implements MyInterface {
    @Override
    public void send(String massage) {
        System.out.println("Sending " + massage + " via SCP Protocol");
    }
}