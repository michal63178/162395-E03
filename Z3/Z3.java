package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Z3 {
    static String listFilesWithoutGivenExtension(String path,
                                                 String extension) {
        File[] entities = new File(path).listFiles();
        List<String> files = new ArrayList<>();

        if (entities != null)
            Arrays.stream(entities)
                    .forEach(file -> {
                        if (!(file.isDirectory() || file
                                .getName()
                                .endsWith("." + extension)))
                            files.add(file.getName());

                    });

        return String.join("\n", files);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ścieżkę:");
        String path = input.nextLine();
        System.out.println();
        System.out.println("Podaj rozszerzenie:");
        String extension = input.nextLine();

        System.out.print(listFilesWithoutGivenExtension(
                path, extension));

    }
}
