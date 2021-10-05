package test;

public abstract class SSHProtocol implements MyInterface{
    @Override
    public void send(String massage) {
        System.out.println("Sending " + massage + " via SSH Protocol");
    }
}