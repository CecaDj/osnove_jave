package d18_09_2023;

public class AudioControl extends Control{
    private boolean zvuk;

    public AudioControl() {
    }

    public AudioControl(boolean zvuk) {
        this.zvuk = zvuk;
    }
    @Override
    public void izvrsiAkciju(VideoPlayer player){
        if (zvuk){
            player.setJacinaZvuka(player.getJacinaZvuka() + 1);
            if (player.getJacinaZvuka() > 100) {
                player.setJacinaZvuka(100);
            }
        } else {
            player.setJacinaZvuka(player.getJacinaZvuka() - 1);
            if (player.getJacinaZvuka() < 0) {
                player.setJacinaZvuka(0);
            }
        }
    }

    public boolean isZvuk() {
        return zvuk;
    }

    public void setZvuk(boolean zvuk) {
        this.zvuk = zvuk;
    }
}
