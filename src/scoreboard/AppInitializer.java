/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scoreboard;

import scoreboard.view.MainForm;
import scoreboard.view.RunrateForm;
import scoreboard.view.ScoreBoardForm;

/**
 *
 * @author shan
 */
public class AppInitializer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
        
        
        ScoreBoardForm scoreBoardForm = new ScoreBoardForm();
        scoreBoardForm.setVisible(true);
        
        RunrateForm runrateForm = new RunrateForm();
        runrateForm.setVisible(true);
    }
    
}
