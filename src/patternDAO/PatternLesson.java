package patternDAO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PatternLesson {
    static Data data = new Db();

    public static void main(String[] args) {
        System.out.println(data.getData());
    }
}

interface Data {
    String getData();
}

class Db implements Data {
    String getFromDatabase() {
        return "get from db";
    }

    @Override
    public String getData() {
        return getFromDatabase();
    }
}

class FileSystem implements Data {
    String getFromFileSystem() {
        return "get from fs";
    }

    @Override
    public String getData() {
        return getFromFileSystem();
    }
}
