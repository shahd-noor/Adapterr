package test;

public abstract class TELNETProtocol implements MyInterface {
    @Override
    public void send(String massage) {
        System.out.println("Sending " + massage + " via TELNET Protocol");
    }
}
