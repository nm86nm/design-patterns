package structural.proxy;

public class CheckProxyPattern {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutorProxy("Chris", "pass1");
        try{
            commandExecutor.runCommand("ls -la");
            //commandExecutor.runCommand(" rm -rf abc.pdf");
        }catch (Exception e){
            System.out.println("Exception Message::" + e.getLocalizedMessage());
        }
    }
}
