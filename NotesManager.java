import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class NotesManager {
    private static final Logger logger = Logger.getLogger(NotesManager.class.getName());
    private static final String FILE_NAME = "my_notes.txt";

    public void saveNote(String note) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(note + "\n");
            System.out.println("Note saved successfully to " + FILE_NAME);
            logger.info("Note saved: " + note);
        } catch (IOException e) {
            System.out.println("Error: Could not save the note.");
            logger.severe("File I/O Error: " + e.getMessage());
        }
    }
}