/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remoteloader;

/**
 *
 * @author guilh
 */
public class RemoteLoader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Light light = new Light ("Living Room");
    TV tv = new TV ("Living Room");
    Stereo stereo = new Stereo ("Living Room");
    Hottub hottub = new Hotttub ("bedroom");
        // TODO code application logic here
        
        LightOnCommand lightOn= new LightOnCommand(light);
                StereoOnCommand stereoOn= new StereoOnCommand(stereo);
                TVOnCommand tvOn= new TVOnCommand(tv);
                                HottubOnCommand hottubOn= new HottubOnCommand(hottub);
Command[] partyOn={lightOn,stereoOn,tvOn,hottubOn};

Command[] partyOff={lightOff,stereoOff,tvOff,hottubOff};

MacroCommand partyOnMacro= new MacroCommand (partyOn);
MacroCommand partyffMacro= new MacroCommand (partyOff);
RemoteControl.setCommand(0,partyOnMacro,partyffMacro);
    }
    
}
