public class InterfaceSegregation {
    public static void main(String[] args) {
        System.out.println("This Code demostrate the Interface Segregation Principle");
    }
}

// Without applying Interface Segregation Principle
interface MediaPlayer {
    void playAudio();
    void playVideo();
    void pauseAudio();
    void pauseVideo();
    void adjustAudioVolume();
    void adjustVideoBrightness();
}

interface AudioPlayer {
    void playAudio();
    void pauseAudio();
    void adjustAudioVolume();
}

interface VideoPlayer {
    void playVideo();
    void pauseVideo();
    void adjustVideoBrightness();
}

class MP3Player implements AudioPlayer {
    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }
    @Override
    public void pauseAudio() {
        System.out.println("Paused audio.");
    }
    @Override
    public void adjustAudioVolume() {
        System.out.println("Adjusting audio volume...");
    }
}

class MP4VideoPlayer implements VideoPlayer {
    @Override
    public void playVideo() {
        System.out.println("Playing video...");
    }
    @Override
    public void pauseVideo() {
        System.out.println("Paused video.");
    }
    @Override
    public void adjustVideoBrightness() {
        System.out.println("Adjusting video brightness...");
    }
}

// If we need to have a multimedia player that can play both audio and video, we can implement both interfaces
class MultiMediaPlayer implements AudioPlayer, VideoPlayer {
    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }
    @Override
    public void pauseAudio() {
        System.out.println("Paused audio.");
    }
    @Override
    public void adjustAudioVolume() {
        System.out.println("Adjusting audio volume...");
    }
    @Override
    public void playVideo() {
        System.out.println("Playing video...");
    }
    @Override
    public void pauseVideo() {
        System.out.println("Paused video.");
    }
    @Override
    public void adjustVideoBrightness() {
        System.out.println("Adjusting video brightness...");
    }
}