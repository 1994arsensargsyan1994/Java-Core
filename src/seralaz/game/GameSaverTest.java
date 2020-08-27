package seralaz.game;

import java.io.*;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter oan = new GameCharacter(30, "Elf", new String[]{"sharp", "arrow", "bow"});
        GameCharacter tow = new GameCharacter(50, "Troll", new String[]{"big ax", "open hands"});
        GameCharacter tree = new GameCharacter(120, "witch", new String[]{"stick"});
        try {
            ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("game.ser"));
            obs.writeObject(oan);
            obs.writeObject(tow);
            obs.writeObject(tree);
            obs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        oan = null;
        tow = null;
        tree = null;
        try {
            ObjectInputStream obs1 = new ObjectInputStream(new FileInputStream("game.ser"));
            GameCharacter oanRestore = (GameCharacter) obs1.readObject();
            GameCharacter towRestore = (GameCharacter) obs1.readObject();
            GameCharacter treeRestore = (GameCharacter) obs1.readObject();
            System.out.println("type oan= " + oanRestore.getType());
            System.out.println("type tow= " + towRestore.getType());
            System.out.println("type tree= " + treeRestore.getType());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
