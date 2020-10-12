package com.marcomsl.algorithmvisualization;

// class for testing
public class Main {

    // main function for testing
    public static void main(String[] args) throws InterruptedException {
        
        AlgorithmVisualizer algorithmVisualizer = new AlgorithmVisualizer();
        algorithmVisualizer.bubblesort(15);
        algorithmVisualizer.resetArray();
        algorithmVisualizer.bubblesort(15);
    }


}
