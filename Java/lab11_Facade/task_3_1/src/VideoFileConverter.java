public class VideoFileConverter {
    public VideoFile convert(VideoFile videoFile, Codec destinationCodec) {
        System.out.println("\n======= VideoConversionFacade: conversion started. =======");
        Codec sourceCodec = CodecFactory.extract(videoFile);
        Buffer buffer = BitrateReader.read(videoFile, sourceCodec);
        VideoFile newVideoFile = BitrateReader.convert(buffer, videoFile.getName(), destinationCodec);
        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(newVideoFile, videoFile.getAudioBuffer());
        System.out.println("====== VideoConversionFacade: conversion completed =======\n");
        return newVideoFile;
    }
}
