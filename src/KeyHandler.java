import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    private int[] sortAlgorithm;
    private int[] array;

    public KeyHandler(int[] sortAlgorithm, int[] array){
        this.sortAlgorithm = sortAlgorithm;
        this.array = array;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
