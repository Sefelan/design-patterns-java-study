public class Main {

    public static void main(String[] args) {

        String fileName = "youtubevideo.ogg";
        String format = "mp4";
        Codec codec = new MPEG4CompressionCodec();

        VideoFile videoFile = new VideoFile(fileName,
            new Buffer("Byte buffer of video"),
            new Buffer("Byte buffer of audio"));

        videoFile.play(new MPEG4CompressionCodec());

        VideoFileConverter videoFileConverter = new VideoFileConverter();
        VideoFile videoFileConverted = videoFileConverter.convert(videoFile,codec);
        videoFileConverted.play(new MPEG4CompressionCodec());
    }
}
