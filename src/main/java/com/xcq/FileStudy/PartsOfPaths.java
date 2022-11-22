package com.xcq.FileStudy;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PartsOfPaths {
    public static void main(String [] args){
        System.out.println(System.getProperty("os.name"));
        Path path = Paths.get("PartsOfPath.java").toAbsolutePath();
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println(path.getName(i));

        }
        System.out.println("end with '.java'" + path.endsWith(".java"));
        path.forEach(p -> {
            System.out.println(p+": ");
            System.out.println(p.startsWith(p) + " : ");
            System.out.println(p.endsWith(p));
        });
        System.out.println("Starts with " + path.getRoot() + " " + path.startsWith(path.getRoot()));
    }
}
