package C4050117;

abstract class Calc{
    int a,b;
    void setValue(int a,int b){
        this.a = a;
        this.b = b;
    }
    abstract int calculate();
}
