package designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private final String name;
    private final List<FileSystemComponent> fileSystemComponents;
    Folder(String name){
        this.name=name;
        fileSystemComponents=new ArrayList<>();
    }
    public void add(FileSystemComponent component){
        fileSystemComponents.add(component);
    }

    public void remove(FileSystemComponent component){
        fileSystemComponents.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("I am a folder with name: "+name);
        System.out.println("I have following components:");
        for (FileSystemComponent component: fileSystemComponents){
            component.showDetails();
        }
    }
}
