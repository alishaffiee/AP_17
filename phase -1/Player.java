import java.util.ArrayList;

public class Player {
    private ArrayList<Block> blocks;
    private int money;

    public Player() {
        this.money = 30000;

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void attack (int blockId , Player player) {

    }

    public int addBlock () {
        return 0;
    }


}
