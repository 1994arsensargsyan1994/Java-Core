package IO.fileAndDirectory;

import java.io.File;

class EXFile {
    static void prn(String arg) { System.out.println(arg);}

    public static void main(String arg[]) {
        File fileobj = new File("/home/arsen/Desktop/file2");
        prn("Name of file:" + fileobj.getName());
        prn("Size of file:" + fileobj.length() + " Bytes");
        prn("Last modified:" + fileobj. lastModified());
        prn("Parent:" + fileobj.getParent());
        prn("Path:" + fileobj.getPath());
        prn("Abs Path:" + fileobj.getAbsolutePath());
        prn("File " + (fileobj.exists() ? "exists" : " not exist"));
        prn(fileobj.canRead() ? "can read" : "can’t read");
        prn(fileobj.canWrite() ? "can write" : "can’t write");
        prn("This is " + (fileobj.isDirectory() ? " " : "not") + " directory");
        prn("This is "+ (fileobj.isAbsolute() ? "absolute" : " not absolute")  +
                (fileobj.isFile() ? " normal file" : " a named pipe"));

    } }