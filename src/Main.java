import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GameProgress gameProgress = new GameProgress(15, 28, 10,28.8);
        GameProgress gameProgress2 = new GameProgress(20, 30, 11,34.0);
        GameProgress gameProgress3 = new GameProgress(25, 40, 12,38.8);

        String path = "/Users/veraknazeva/Desktop/Games/savegames/save1.dat";
        String path2 = "/Users/veraknazeva/Desktop/Games/savegames/save2.dat";
        String path3 = "/Users/veraknazeva/Desktop/Games/savegames/save3.dat";

        GameProgress.saveGame(path,gameProgress);
        GameProgress.saveGame(path2, gameProgress2);
        GameProgress.saveGame(path3, gameProgress3);

        List<String> paths = new ArrayList<>();
        paths.add(path);
        paths.add(path2);
        paths.add(path3);

        GameProgress.zipFiles("/Users/veraknazeva/Desktop/Games/savegames/gameProgress.zip", paths);

    }
}