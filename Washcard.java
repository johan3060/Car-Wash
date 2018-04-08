public class Washcard{

    //Attributer
    private int id;
    private int credit;

    //Constructor
    public Washcard(int id, int credit){
        this.id = id;
        this.credit = credit;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setCredit(int credit){
        this.credit = credit;
    }

    public int getCredit(){
        return credit;
    }

    public void deduct(int amount){ credit -= amount; }
}