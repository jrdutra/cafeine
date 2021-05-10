package com.cafeine;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Iniciando...");
			Robot robot = new Robot();

			System.out.println("Posicione o mouse no local desejado.");
			Thread.sleep(Integer.valueOf(4000));

			Point point = MouseInfo.getPointerInfo().getLocation();
			int xLugar = (int) point.getX();
			int yLugar = (int) point.getY();
			System.out.println("Posição capturada.");

			Thread.sleep(Integer.valueOf(1000));
			System.out.println("Iniciado...");
			while(true) {
				Point point2 = MouseInfo.getPointerInfo().getLocation();
				int xOrigem = (int) point2.getX();
				int yOrigem = (int) point2.getY();

				robot.mouseMove(xLugar, yLugar);
				Thread.sleep(10);

				robot.mouseMove(xOrigem, yOrigem);
				Thread.sleep(Integer.valueOf(args[0]));
			}
		} catch (AWTException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
