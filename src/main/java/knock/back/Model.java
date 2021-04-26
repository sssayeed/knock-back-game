package knock.back;

import java.util.ArrayList;

public class Model {
    private static int B_WIDTH = 80;
    private static int B_HEIGHT = 45;

    private ArrayList<IView> views = new ArrayList<>();
    private int[][] platformGrid = new int[B_HEIGHT][B_WIDTH];

    public void addView(IView view) {
        views.add(view);
        view.updateView();
    }

    private void notifyObservers() {
        for(IView v : views) {
            v.updateView();
        }
    }
}
