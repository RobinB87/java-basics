package HungerFighters.models;

import java.util.ArrayList;
import java.util.List;

public class CreateCareerFighter {

    //list to store career fighters TODO moet eigenlijk naar list class
    public List<CareerFighter> careerFighterList = new ArrayList<>();

    //TODO 1 loop maken waarin male en female fighters worden gecreeerd?

    //create male careerfighters through loop
    public void createMaleCareerFighter(){
        for(int i = 1; i <= 4; i++){
            CareerFighter careerFighter = new CareerFighter("Career Fighter" + i, 80, true, "male", true, true);
            careerFighterList.add(careerFighter);
        }
    }

    //create femalecareerfighters through loop
    public void createFemaleCareerFighter(){
        for(int i = 5; i <= 6; i++){
            CareerFighter careerFighter = new CareerFighter("Career Fighter" + i, 80, true, "female", true, true);
            careerFighterList.add(careerFighter);
        }
    }
}
