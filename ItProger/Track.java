package ItProger;

public class Track extends Car{
    int numbersOfWhiles;
    float maxWeight;

    public void newWheels(int newNumbersOfWhils){
        numbersOfWhiles = newNumbersOfWhils;
        System.out.println(numbersOfWhiles);
    }

    public Track(int weight, String model, char color, int speed, int numbersOfWhiles, float maxWeight){
        super(weight, model,color,speed);
        this.numbersOfWhiles = numbersOfWhiles;
        this.maxWeight = maxWeight;
    }
}
