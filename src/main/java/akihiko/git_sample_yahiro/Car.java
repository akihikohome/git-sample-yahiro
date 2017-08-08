package akihiko.git_sample_yahiro;

/**
 * Git練習用のCarClassの作成
 * 
 * @author yahiro
 *
 */
public class Car {
	private Integer speed;

	public Integer getSpeed() {
		return speed;
	}

	public void run() {
		this.speed = speed + 5;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
}