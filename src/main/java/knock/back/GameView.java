package knock.back;

import javafx.scene.layout.Pane;

public class GameView extends Pane implements IView{
    Model model;
    GameView(Model model) {
        this.model = model;

        model.addView(this);
    }

    @Override
    public void updateView() {
        //update view by changing scenery or animations.
    }
}
