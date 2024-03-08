package com;




interface MediaPlayer {
    void play(String type);
}
class AudioPlayer implements MediaPlayer {

    MediaAdapter adapter;

    public AudioPlayer(MediaAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void play(String type) {
        if(type.equals("mp3")){
            System.out.println("playing mp3 music");
        }
        if(type.equals("mp4")||type.equals("vlc")){
            adapter.play(type);
        }

    }
}

class MediaAdapter implements MediaPlayer {
    private AdvanceMediaPlayer player;

    @Override
    public void play(String type) {
        if(type.equals("mp4")){
            player= new Mp4Player();
            player.playMp4();
        }else if(type.equals("vlc")){
            player= new VlcPlayer();
            player.playVlc();
        }

    }
}


interface AdvanceMediaPlayer {
    void playMp4();
    void playVlc();

}
class VlcPlayer implements AdvanceMediaPlayer {

    @Override
    public void playMp4() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public void playVlc() {
        System.out.println("playing vlc ...");

    }
}
class Mp4Player implements AdvanceMediaPlayer {

    @Override
    public void playMp4() {
        System.out.println("playing mp4...");
    }

    @Override
    public void playVlc() {
        throw new UnsupportedOperationException("not supported");
    }
}

public class App 
{
    public static void main( String[] args )
    {
        MediaAdapter adapter=new MediaAdapter();
        AudioPlayer player = new AudioPlayer(adapter);
        player.play("vl");
    }
}
