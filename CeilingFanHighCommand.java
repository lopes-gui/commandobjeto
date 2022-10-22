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
public class CeilingFanHighCommand implements Command {
    
    CeilingFan ceilingFan;
    int prevSpeed; 

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    public void execute(){
        prevSpeed= ceilingFan.getSpeed();
        ceilingFan.high();
    }
    public void undo(){
        if(prevSpeed==CeilingFan.HIGH){
            ceilingFan.high();
        }
        else  if(prevSpeed==CeilingFan.MEDIUM){
            ceilingFan.medium();
        }
        
          else  if(prevSpeed==CeilingFan.LOW){
            ceilingFan.low();
        }
          else  if(prevSpeed==CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
