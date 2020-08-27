package api;

public class API {
    public  static  String[] getAuthors(){
        int size = 0;
        String temp [] = new String[Author.getSize()];
        for (int i = 0; i < Author.getAutorsAutor().length; i++) {
            for (int j = 0; j < Author.getAutorsAutor().length; j++) {
                if(!Author.getAutorsAutor()[i].equals(Author.getAutorsAutor()[j])) {
                    temp[size++] = Author.getAutorsAutor()[i];
                }
            }
        }

        String temp1 [] = new String [size];
        for (int i = 0; i < size; i++) {
            temp1[i] = temp[i];
        }
        temp = temp1;
        return temp;
    }
}
