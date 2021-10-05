package test;
import java.util.ArrayList;

public class PluginAdapter extends protocol implements MyInterface {
    TFTPProtocol tftp = TFTPProtocol.getTFTPInstance();
    public PluginAdapter(){
        TFTPProtocol.getTFTPInstance();
    }
    
    
    
    
    @Override
    public MyInterface getInstance(String protocol){
        if(MyInterface.size() >= 3) {
            System.out.println("# connections>3 ");
            return null;
        }
            if (protocol ==("TFTP")) {
                MyInterface.add("TFTP");
                return new PluginAdapter();
            }
        return null;
    }
    
    
    
    public boolean release(){
        if(tftp.releaseTFTP() && MyInterface.contains("TFTP")){
            tftp = null;
            MyInterface.remove("TFTP");
            return true;
        }
        return false;
    }
    
    
    
    
    
    @Override
    public void send(String massage){
        tftp.sendMessage(massage);
    }
}
//
