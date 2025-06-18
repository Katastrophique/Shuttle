package com.simplecity.amp_library.model;

import com.simplecity.amp_library.interfaces.FileType;

public class FolderObject extends BaseFileObject {

    private int fileCount;
    private int folderCount;

    public FolderObject() {
        this.fileType = FileType.FOLDER;
    }

    public int getFileCount() { return fileCount; }
    public void setFileCount(int fileCount) { this.fileCount = fileCount; }
    public int getFolderCount() { return folderCount; }
    public void setFolderCount(int folderCount) { this.folderCount = folderCount; }

    @Override
    public String toString() {
        return "FolderObject{" +
                "fileCount=" + fileCount +
                ", folderCount=" + folderCount +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FolderObject)) return false;
        if (!super.equals(o)) return false;
        FolderObject that = (FolderObject) o;
        return fileCount == that.fileCount && folderCount == that.folderCount;
    }
}
