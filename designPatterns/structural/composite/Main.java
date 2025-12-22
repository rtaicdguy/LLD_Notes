package designPatterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        Folder folder1=new Folder("user");
        Folder folder2=new Folder("desktop");
        Folder folder3=new Folder("downloads");

        File file1=new File("selfie.png");
        File file2=new File("game.exe");
        File file3=new File("windows.exe");

        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(file3);
        folder2.add(file1);
        folder3.add(file2);

        folder1.showDetails();



    }
}
