package d18_09_2023;

public class QualityOptimizerControl extends Control {
    private double brzinaInterneta;

    public QualityOptimizerControl() {
    }

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }
    @Override
    public void izvrsiAkciju(VideoPlayer player){
        double kvalitet = this.brzinaInterneta * 10.1;

        if (kvalitet < 144) {
            player.setKvalitet(144);
        } else if (kvalitet < 240) {
            player.setKvalitet(240);
        } else if (kvalitet < 360) {
            player.setKvalitet(360);
        } else if (kvalitet < 480) {
            player.setKvalitet(480);
        }else if (kvalitet < 720) {
            player.setKvalitet(720);
        } else {
            player.setKvalitet(1080);
        }
    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }
}
