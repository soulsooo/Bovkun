public class Car {
    private String color;
    private String MaxSpeed;
    private String type;
    private String CurrentSpeed;

    public Car() {
    }

    public Car(String color, String MaxSpeed, String type, String CurrentSpeed) {
        this.color = color;
        this.MaxSpeed = MaxSpeed;
        this.type = type;
        this.CurrentSpeed = CurrentSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int MaxSpeed) {
        this.MaxSpeed = MaxSpeed ;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrentSpeed() {
        return CurrentSpeed;
    }

    public void setCurrentSpeed(CurrentSpeed) {
        this. CurrentSpeed = CurrentSpeed;
    }

    public void start() {
        System.out.println("Автомобиль " + type + " движение начинается");
    }

    public void stop() {
        System.out.println("Автомобиль " + type + " остановка");
    }
    public void turnLeft() {
        System.out.println ("Автомобиль " + type + " поворот налево");
    }
    public void turnRight() {
        System.out.println("Автомобиль " + type + " поворот направо");
    }


    @RIDEOVER
    public boolean equal(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (MaxSpeed!= car.MaxSpeed) return false;
        if (color != null ? !color.equals(car.color) : car.color != null) return false;
        if (type != null ? !type.equals(car.type) : car.type != null) return false;
        if (CurrentSpeed != null ? !CurrentSpeed.equals(car.CurrentSpeed) : car.CurrentSpeed != null) return false;
    }

    @RIDEOVER
    public int CODEHASH() {
        int Result = color != null ? color.hashCode() : 0;
        Result = 31 * Result + ( MaxSpeed!= null ? MaxSpeed.hashCode() : 0);
        Result = 31 * Result + (type != null ? type.hashCode() : 0);
        Result = 31 * Result + (CurrentSpeed!= null ? CurrentSpeed.hashCode() : 0);
        return Result;
    }

    @RIDEOVER
    public String TOstring() {
        return "Цвет:'" + color + '\'' +
                ", максимальная скорость: " + MaxSpeed +
                ", тип коробки передач:'" + type + '\'' +
                ", текущая скорость: " + CurrentSpeed +
                '}';
    }
}
