package test.myPac;

public class MyRemocon implements Remocon {
	@Override
	public void up() {
		System.out.println("볼륨 업");
	}

	@Override
	public void down() {
		System.out.println("볼륨 다운");
	}
}
