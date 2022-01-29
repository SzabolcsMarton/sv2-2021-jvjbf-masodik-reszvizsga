package filemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HumanFileManager {

    private List<Human> humans = new ArrayList<>();

    public void readHumansFromFile(Path path) {
        try {
            humans.clear();

            List<String> lines = Files.readAllLines(path);
            for (String actual : lines) {
                String[] humanDatas = actual.split(";");
                Human human = new Human(humanDatas[0], humanDatas[1]);
                humans.add(human);
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }

    }

    public List<Human> getHumans() {
        return humans;
    }

    public void writeMaleHumansToFile(Path path) {
        try {
            StringBuilder manLinesBuilder = new StringBuilder();
            for (Human human : humans) {
                if (human.getIdentityNumber().startsWith("1") || human.getIdentityNumber().startsWith("3")) {
                    manLinesBuilder.append(human.getName()).append(";").append(human.getIdentityNumber()).append("\n");
                }
            }
            Files.writeString(path, manLinesBuilder.toString());

        } catch (IOException ioe) {
            throw new IllegalStateException("Can't write file!", ioe);
        }
    }
}
