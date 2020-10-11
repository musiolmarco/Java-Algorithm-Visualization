public class AlgorithmVisualizer {

    AlgorithmFrame algorithmFrame;

    int[] array;

    public AlgorithmVisualizer(){
        array = new int[50];
        fillArray();
        algorithmFrame = new AlgorithmFrame(array);

    }

    private void fillArray(){
        for(int i = 0; i < array.length; i++){
            array[i] = (i + 10) * 7;
        }
    }

}
