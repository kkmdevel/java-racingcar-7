package racingcar.model;

public class Car {
    private final String name;
    private int position;

    public Car(String name){
        this.name = name;
        this.position = 0;
    }

    public void move(){
        position++;
    }

    public Integer currentPosition(){
        return position;
    }

    public String getName(){
        return name;
    }
}
