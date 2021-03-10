import java.nio.channels.*;
import java.io.FileOutputStream;
import java.net.*;

public class Downloader {
    public static void main(String[] args) {
        ReadableByteChannel readChannel = Channels.newChannel(new URL("https://youtu.be/i82528KGDdo").openStream());

        FileOutputStream fileOS = new FileOutputStream("C:\\Users\\danie\\Documents\\KFC\\Graphics and Multimedia\\YouTubeDownloader");
        FileChannel writeChannel = fileOS.getChannel();

        writeChannel
        .transferFrom(readChannel, 0, Long.MAX_VALUE);
    }
}

// <iframe width="900" height="506" 
//     src="https://www.youtube.com/embed/N0S4YsM6y3s" 
//     frameborder="0" 
//     allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen>
// </iframe>