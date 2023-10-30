package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyToAndroid {

    public void copyToAndroid(String sourceFilePath, String destinationDirectory) throws IOException, InterruptedException {
        // Construct the ADB command
        String[] adbCommand = {"C:\\Users\\toros\\AppData\\Local\\Android\\Sdk\\platform-tools\\adb.exe", "push", sourceFilePath, destinationDirectory};
        //String[] adbCommandCheck = {"C:\\Users\\toros\\AppData\\Local\\Android\\Sdk\\platform-tools\\adb.exe","am broadcast -a android.intent.action.MEDIA_SCANNER_SCAN_FILE -d file:/" + destinationDirectory + "Roll.mp4"};

        try {
            ProcessBuilder processBuilder = new ProcessBuilder(adbCommand);
           // ProcessBuilder processBuilder1 = new ProcessBuilder(adbCommandCheck);
            Process process = processBuilder.start();
            //Process process1 = processBuilder1.start();

            // You can optionally read the output and error streams for more information
            BufferedReader outputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String line;

            // Uncomment this part if you want to see the output
            while ((line = outputReader.readLine()) != null) {
                System.out.println("Output: " + line);
            }

            // Uncomment this part if you want to see the error
            while ((line = errorReader.readLine()) != null) {
                System.out.println("Error: " + line);
            }

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("File copied successfully");
            } else {
                System.out.println("Error: ADB command failed with exit code " + exitCode);
            }
        } catch (IOException e) {
            System.err.println("Error executing ADB command: " + e.getMessage());
        }
    }


}


