package com.varunbkarmikanda.core.miscellaneous.challenge4;

public class DeepSearcher {
    private static final int MAX_DEPTH = 1000;

    public boolean findFile(Object[] folderStructure, String target, int currentDepth){
        if(currentDepth > MAX_DEPTH) return false;

        for (Object i: folderStructure){
            if(i instanceof String && i.equals(target)) return true;
            else if (i instanceof Object[]){
                boolean isInSubfolder = findFile((Object[]) i, target, currentDepth + 1);
                if(isInSubfolder) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Object[] nestedFolders = { "image.jpg", new Object[]{ "secret.txt", "data.csv" }, "notes.pdf" };

        DeepSearcher searcher = new DeepSearcher();
        System.out.println("Found: " + searcher.findFile(nestedFolders, "secret.txt", 0));
    }
}
