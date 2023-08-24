/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreboard.controllRoom;

import scoreboard.view.RunrateForm;
import scoreboard.view.ScoreBoardForm;

/**
 *
 * @author shan
 */
public class Controller {
    RunrateForm runrateForm;
    ScoreBoardForm scoreBoardForm;
    
    Controller(){}
    
    Controller(RunrateForm runrateForm, ScoreBoardForm scoreBoardForm){
        this.runrateForm = runrateForm;
        this.scoreBoardForm = scoreBoardForm;
    }
   
    public void sendValue(int noOfBalls , int score){
        //distributer
        runrateForm.setValue(noOfBalls,score);
        scoreBoardForm.setValue(noOfBalls,score);
    }
    
}
