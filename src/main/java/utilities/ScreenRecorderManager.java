//package utilities;
//
//import org.monte.media.Format;
//import org.monte.media.Registry;
//import org.monte.screenrecorder.ScreenRecorder;
//
//import javax.imageio.ImageIO;
//import javax.sound.sampled.AudioFormat;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class ScreenRecorderManager extends ScreenRecorder {
//    private String name;
//    private File movieFolder;
//
//    public ScreenRecorderManager(GraphicsConfiguration cfg, Rectangle captureArea, Format fileFormat,
//                                 Format screenFormat, Format mouseFormat, Format audioFormat, File movieFolder, String name)
//            throws IOException, AWTException {
//        super(cfg, captureArea, fileFormat, screenFormat, mouseFormat, audioFormat, movieFolder);
//        this.name = name;
//        this.movieFolder = movieFolder;
//    }
//
//    @Override
//    protected File createMovieFile(Format fileFormat) throws IOException {
//        if (!movieFolder.exists()) {
//            movieFolder.mkdirs();
//        } else if (!movieFolder.isDirectory()) {
//            throw new IOException("\"" + movieFolder + "\" is not a directory.");
//        }
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
//        return new File(movieFolder,
//                name + "-" + dateFormat.format(new Date()) + "." + Registry.getInstance().getExtension(fileFormat));
//    }
//
//    public static void startRecording(String methodName) throws Exception {
//        File file = new File("./recordings/");
//
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        int width = screenSize.width;
//        int height = screenSize.height;
//
//        Rectangle captureSize = new Rectangle(0, 0, width, height);
//
//        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment()
//                .getDefaultScreenDevice()
//                .getDefaultConfiguration();
//
//        ScreenRecorderManager.screenRecorder = new ScreenRecorderManager(gc, captureSize,
//                new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
//                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
//                        CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, 24, FrameRateKey,
//                        Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, 15 * 60),
//                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30)),
//                null, file, methodName);
//
//        ScreenRecorderManager.screenRecorder.start();
//    }
//
//    public static void stopRecording() throws Exception {
//        ScreenRecorderManager.screenRecorder.stop();
//    }
//}
