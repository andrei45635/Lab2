import java.util.Arrays;

public abstract class AbstractSorter {
    protected int[] numere;

    public AbstractSorter(int[] numere) {
        this.numere = numere;
    }

    public abstract void sort();

    @Override
    public String toString() {
        return "AbstractSorter{" +
                "numere=" + Arrays.toString(numere) +
                '}';
    }

    public int[] getNumere() {
        return numere;
    }
}
