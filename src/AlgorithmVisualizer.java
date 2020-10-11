public class AlgorithmVisualizer {

    AlgorithmFrame algorithmFrame;

    int[] array;

    public AlgorithmVisualizer(int width, int height){
        array = new int[100];
        fillArray();
        algorithmFrame = new AlgorithmFrame(width, height, array);

        System.out.println(array[59]);
    }

    private void fillArray(){
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
    }

}
