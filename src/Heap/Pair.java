package Heap;

public class Pair implements Comparable<Pair>{

    int key ;
    int value;
    public Pair(int v, int weight) {
        this.key= v;
        this.value=weight;
    }

    @Override
    public int compareTo(Pair o) {
        return 0;
    }
}
