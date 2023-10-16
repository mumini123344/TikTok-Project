package utils;

import java.io.IOException;

public class DeleteOnAndroid {
    public void deleteOnAndroid(String Path, String format) throws InterruptedException, IOException {
        String deletePath = Path + format;
        String[] cmdArray = new String[5];
        cmdArray[0] = "adb";
        cmdArray[1] = "shell";
        cmdArray[2] = "rm";
        cmdArray[3] = "-rf";
        cmdArray[4] = deletePath;
        Process process = Runtime.getRuntime().exec(cmdArray, null);
        int exitCode = process.waitFor();
        if (exitCode == 0) {
            System.out.println("File Removed successfully.");
        } else {
            System.err.println("Error copying file. Exit code: " + exitCode);
        }
        System.out.println("deletePictureOnAndroid executed");
    }
}
