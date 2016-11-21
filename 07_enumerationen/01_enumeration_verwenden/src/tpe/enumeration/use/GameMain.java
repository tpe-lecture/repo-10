package tpe.enumeration.use;

import java.awt.EventQueue;

import de.smits_net.games.framework.board.MainWindow;
import de.smits_net.games.framework.sprite.Sprite.BoundaryPolicy;

/**
 * Hauptklasse des Spiels.
 */
public class GameMain extends MainWindow {

    /**
     * Neues Spiel anlegen.
     */
    public GameMain() {
        super("Watch me walk...", new GameBoard());
    }

    /**
     * Startpunkt.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // Spiel starten
        EventQueue.invokeLater(GameMain::new);
        String name= BoundaryPolicy.NONE.name();
        BoundaryPolicy test = BoundaryPolicy.valueOf(name);
        for (BoundaryPolicy NONE: BoundaryPolicy.values()){
            System.out.println(NONE.name());
            
        }
    }
}

