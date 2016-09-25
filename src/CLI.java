import model.Field;
import model.Game;
import view.ConsoleView;

public class CLI {
    public static void main(final String[] args) {

        final Game game = new Game(new Field());

        final ConsoleView consoleView = new ConsoleView();

        consoleView.show(game);
        while (consoleView.move(game)) {
            consoleView.show(game);
        }

    }
}
