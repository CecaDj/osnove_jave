package d18_09_2023;

public class TimeControl extends Control{
    private boolean vremeVidea;

    public TimeControl() {
    }

    public TimeControl(boolean vremeVidea) {
        this.vremeVidea = vremeVidea;
    }
    @Override
    public void izvrsiAkciju(VideoPlayer player){
        if (vremeVidea) {
            player.setTrenutnoVreme(player.getTrenutnoVreme() + 15);
            if (player.getDuzina() < player.getTrenutnoVreme()){
                player.setTrenutnoVreme(player.getDuzina());
            }
        } else {
            player.setTrenutnoVreme(player.getTrenutnoVreme() - 15);
            if (player.getTrenutnoVreme() < 0) {
                player.setTrenutnoVreme(0);
            }
        }
    }


}
