package pl.pkrawiec.library.io.file;

import pl.pkrawiec.library.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}
