package test;


	
	public abstract class HTTPProtocol implements MyInterface {
	    @Override
	    public void send(String massage) {
	        System.out.println("Sending " + massage + " via HTTP Protocol");
	    }
	}


