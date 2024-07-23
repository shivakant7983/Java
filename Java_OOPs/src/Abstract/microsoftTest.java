package Abstract;

public class microsoftTest {
    public static void main(String[] args) {
        microsoft m = new excel();
        m.createFile();
        m.deleteFile();
        System.out.println("===============");
        microsoft n = new ppt();
        n.createFile();
        n.deleteFile();
    }
}
