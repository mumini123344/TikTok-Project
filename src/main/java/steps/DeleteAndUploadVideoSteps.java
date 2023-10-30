package steps;


import data.LocalPaths;
import utils.CopyToAndroid;
import utils.DeleteOnAndroid;

import java.io.IOException;

public class DeleteAndUploadVideoSteps {
    LocalPaths localPaths = new LocalPaths();
    CopyToAndroid copyToAndroid = new CopyToAndroid();
    DeleteOnAndroid deleteOnAndroid = new DeleteOnAndroid();

    public DeleteAndUploadVideoSteps delete() throws IOException, InterruptedException {
        deleteOnAndroid.deleteOnAndroid(localPaths.getDestinationPath(), ".mp4");
        return this;
        //miawere videos saxeli an daaaindexe yvela video da wamoighe satitaod data provideri ro geqneba
    }

    public DeleteAndUploadVideoSteps copy() throws IOException, InterruptedException {
        copyToAndroid.copyToAndroid(localPaths.getSourcePath(), localPaths.getDestinationPath());
        return this;

    }

}
