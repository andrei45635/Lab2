public class BubbleSorter extends AbstractSorter{

    public BubbleSorter(int[] numere) {
        super(numere);
    }

    @Override
    public void sort() {
        for(int i = 0; i < numere.length - 1; i++){
            for(int j = i; j <= numere.length; j++)
                if(numere[i] > numere[j]){
                    int aux = numere[i];
                    numere[i] = numere[j];
                    numere[j] = aux;
                }
        }
        for (int i : numere) {
            System.out.println(i);
        }
    }
}
