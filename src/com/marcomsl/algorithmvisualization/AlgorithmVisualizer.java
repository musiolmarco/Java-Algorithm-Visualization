package com.marcomsl.algorithmvisualization;

import java.util.ArrayList;
import java.util.Random;

public class AlgorithmVisualizer {

    AlgorithmFrame algorithmFrame;

    private int[] array;
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public AlgorithmVisualizer(){
        array = new int[50];
        fillArray();
        algorithmFrame = new AlgorithmFrame(array);

    }

    public AlgorithmVisualizer(int size){
        if(size >= 25 && size <= 50) {
            array = new int[size];
        }else{
            array = new int[50];
        }
        fillArray();
        algorithmFrame = new AlgorithmFrame(array);

    }

    private void fillArray(){
        for(int i = 0; i < array.length; i++){
            arrayList.add ((i + 1) * 6);
        }

        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            int randomIndex = random.nextInt(arrayList.size());
            array[i] = arrayList.get(randomIndex);
            arrayList.remove(randomIndex);
        }
    }

    public int[] getArray() {
        return array;
    }

    public void resetArray(){
        fillArray();
    }

    public void bubblesort(int animationSpeed) throws InterruptedException {
        int temp;
        for(int x = 1; x < array.length; x++){
            for (int b = 0; b < array.length - x; b++) {
                if (array[b] > array[b + 1]) {
                    Thread.sleep(animationSpeed);
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }
    }


}
