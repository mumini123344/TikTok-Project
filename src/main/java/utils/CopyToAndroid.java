package utils;

import java.io.IOException;

public class CopyToAndroid {
    public void copyToAndroid(String sourceFilePath, String destinationDirectory) throws IOException {
        // adb push command to copy file to Android device
        String adbCommand = "adb push \"" + sourceFilePath + "\" \"" + destinationDirectory + "\"";
        System.out.println(adbCommand);
        // Run the adb command
        Process process = Runtime.getRuntime().exec(adbCommand);
        System.out.println(process);

    }


}

