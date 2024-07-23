package Abstract;

import javax.crypto.spec.PSource;

public class excel extends microsoft{
    @Override
    public void createFile() {
        System.out.println("Create excel file");
    }

    public void deleteFile(){
        System.out.println("Excel file deleted");
    }
}
