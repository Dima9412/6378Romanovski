import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stream stream1 = new Stream();
        stream1.addGroup(new StudyGroup("Group 1"));
        stream1.addGroup(new StudyGroup("Group 2"));

        Stream stream2 = new Stream();
        stream2.addGroup(new StudyGroup("Group 3"));

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        Controller controller = new Controller();
        controller.sortStreams(streams);

        for (Stream stream : streams) {
            System.out.println("Number of groups in the stream: " + stream.getGroupCount());
        }
    }
}