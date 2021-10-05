package test;

public abstract class FTPProtocol implements MyInterface {
    @Override
    public void send(String massage) {
        System.out.println("Sending " + massage + " via FTP Protocol");
    }
}
