package C5050117;

public  abstract class MyPoint {
    int x;
    int y;
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    protected abstract void move(int x, int y);
    protected  abstract void reverse();
    protected void show(){
        System.out.println(x + "," + y);
    }
}
