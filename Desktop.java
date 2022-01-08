package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		String memory = "RAM";
		int value = 99;
		System.out.println(memory +" is " +value+"GB");
	}

	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktopSize();
	}

}
