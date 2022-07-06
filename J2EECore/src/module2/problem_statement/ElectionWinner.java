package module2.problem_statement;

public class ElectionWinner {

    public void winnerInEachStateInfoAndFinalWinner(String[] stateNames, int[][] votes4DemoRepubInEachState){
        int demoCount = 0;
        int repubCount = 0;
        for(int i=0;i<stateNames.length;i++){
            if(votes4DemoRepubInEachState[i][0]>votes4DemoRepubInEachState[i][1]){
                System.out.println("The Election winner in "+stateNames[i]+" is Democratic Party");
                demoCount++;
            }else if(votes4DemoRepubInEachState[i][0]==votes4DemoRepubInEachState[i][1]){
                System.out.println("It's a Draw between both Parties");
            }else{
                System.out.println("The Election winner in "+stateNames[i]+" is Republican Party");
                repubCount++;
            }
        }
        if(demoCount>repubCount){
            System.out.println("Democratic Party is clear winner of Elections");
        }else if(demoCount==repubCount){
            System.out.println("Both Parties are at Draw in current Elections");
        }else{
            System.out.println("Republican Party is clear winner of Elections");
        }
    }
}
