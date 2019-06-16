package towerofhanoinonrecursive;
public class Hanoi {
    int n;
    int source;
    int destination;
    int aux;
    Hanoi(int n,int source,int aux,int destination){
        this.n=n;
        this.source=source;
        this.destination=destination;
        this.aux=aux;
    }
}
