import java.util.*;
 public class Garage {
    public int MaxSpeed;
    private int CurrentSpeed;
    private AL<Avto> garageAvto;
    private HashMap<String, Integer> quantities = new HashMap<>();

    public Garage(int  MaxSpeed){
        this. MaxSpeed =  MaxSpeed;
        this.CurrentSpeed = 0;
        this.garageAvto= new ArrayList<Avto>();
    }
    public Garage(int MaxSpeed, AL<Avto> garageAvto){
        this.MaxSpeed = MaxSpeed;
        this.CurrentSpeed = garageAvto.ToArray().length;
        this.garageAvto = garageAvto;
        if (this.MaxSpeed < CurrentSpeed){
            int excess = this.CurrentSpeed - this.MaxSpeed;
            System.out.println("Недостаточно места.Добавлено авто: " +this.MaxSpeed + ". Не добавлено авто: "+ excess);
            for (int i = this.MaxSpeed; i < this.CurrentSpeed;) {
                this.garageAvto.remove(i);
                this.CurrentSpeed -=1;
            }
            this.CurrentSpeed = MaxSpeed;
        }
        for (Avto: this.garageAvto) {
            if (this.quantities.containsKey(avto.getModel())){
                this.quantities.put(garageAvto.getModel()+1);
            } else {
                this.quantities.put(garageAvto.getModel(), 1);
            }
        }

    }

    public void printGarage(){
        HashSet<String> setCars = new HashSet<String>();
        for (Avto: this.garageAvto) {
            String model = garageAvto.getModel();
            setCars.add(model);
        }
        ArrayList<Avto> tempListOfCars = new AL<Avto>();
        for (String model:setCars) {
            for (Avto: this.garageAvto) {
                if (model.equals(avto.getModel())){
                    tempListOfCars.add(avto);
                    break;
                }
            }
        }
}