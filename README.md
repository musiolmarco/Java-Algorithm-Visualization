# Java-Algorithm-Visualization
![GitHub Logo](/assets/icon.png)

A library to visualize your algorithms in Java.

## Add the library
Just visit the releases tab and download the newest '.jar' file (https://github.com/marcomsl/Java-Algorithm-Visualization/releases).

Now it depends on your IDE how you can import it: 

Eclipse: Project => Properties => Java Build Path => Libraries => Add JAR ...

IntelliJ: https://www.jetbrains.com/help/idea/library.html

## Usage of the library
If you've programmed your algorithm, you just need to create a 'AlgorithmVisualizer' instance in your main class like this:
```
AlgorithmVisualizer algorithmVisualizer = new AlgorithmVisualizer();
```
Now you need to call your method and pass the array as parameter, like this for example:

```
bubblesort(algorithmVisualizer.getArray());
```

#### Other constructors

```
AlgorithmVisualizer algorithmVisualizer = new AlgorithmVisualizer(BarColor barColor);
```
```
AlgorithmVisualizer algorithmVisualizer = new AlgorithmVisualizer(int size); // you can choose an array size between 25-50
```
```
AlgorithmVisualizer algorithmVisualizer = new AlgorithmVisualizer(int size, BarColor barColor); // you can choose an array size between 25-50
```

## BarColor
You can change the bar colors by passing the 'BarColor' to the constructor, like explained above. These are the available colors:
##### BarColor.RED, BarColor.GREEN, BarColor.BLUE

## Animation
Now you actually 'connected' your algorithm with the library, but you actually should add a 'delay' after every operation in your algorithm, because otherwise your algorithm would be sorted instantly.

You can easily just add 
```
Thread.sleep(30);
```
whenever your values are changing. I would recommend a value between 10-25.

## Integrated algorithms
### Bubblesort: 
```
algorithmVisualizer.bubblesort(animationSpeed);
```
### Insertionsort:
```
algorithmVisualizer.insertionSort(animationSpeed);
```
### Selectionsort:
```
algorithmVisualizer.bubblesort(animationSpeed);
```


## Have fun!
Now, this is it. Enjoy your little animaition and maybe some updates in the future!
![gif](https://media1.giphy.com/media/11AoJkCM1rwqilQIKB/giphy.gif)
