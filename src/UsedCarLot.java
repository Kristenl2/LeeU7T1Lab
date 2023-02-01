import java.util.ArrayList;
public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    public ArrayList getInventory(){
        return inventory;
    }

    public void addCar(Car car){
        inventory.add(car);
    }

    public boolean swap(int num, int num2){
        if(num< inventory.size() && num2< inventory.size()){
            Car temp = inventory.get(num);
            inventory.set(num,inventory.get(num2));
            inventory.set(num2,temp);
            return true;
        }else{
            return false;
        }
    }
}
