package com.marcomsl.algorithmvisualization;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;

public class AlgorithmVisualizer {

    AlgorithmFrame algorithmFrame;

    private int[] array;
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public AlgorithmVisualizer() {
        array = new int[50];
        fillArray();
        algorithmFrame = new AlgorithmFrame(array);

    }

    public AlgorithmVisualizer(int size) {
        if (size >= 25 && size <= 50) {
            array = new int[size];
        } else {
            array = new int[50];
        }
        fillArray();
        algorithmFrame = new AlgorithmFrame(array);

    }

    private void fillArray() {
        for (int i = 0; i < array.length; i++) {
            arrayList.add((i + 1) * 6);
        }

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomIndex = random.nextInt(arrayList.size());
            array[i] = arrayList.get(randomIndex);
            arrayList.remove(randomIndex);
        }
    }

    public int[] getArray() {
        return array;
    }

    public void resetArray() {
        fillArray();
    }

    public void bubblesort(int animationSpeed) throws InterruptedException {
        int temp;
        for (int x = 1; x < array.length; x++) {
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

    public void insertionSort(int animationSpeed) throws InterruptedException {
        int temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > temp) {
                Thread.sleep(animationSpeed);
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }

    public void selectionSort(int animationSpeed) throws InterruptedException {
        int highestIndex, tempValue;
        for (int i = array.length - 1; i >= 0; i--) {
            highestIndex = i;
            for (int j = 0; j <= i; j++) {
                if (array[j] > array[highestIndex]) {
                    highestIndex = j;
                }
            }

            Thread.sleep(animationSpeed);
            tempValue = array[highestIndex];
            array[highestIndex] = array[i];
            array[i] = tempValue;
        }

    }


}
