package random_walk;

import  java.applet.*;
import  java.awt.*;

// ランダムウォーク（random walk）を表示するアプレット
// @date 2015/May/28

@SuppressWarnings("serial")
public class Main extends Applet {

	public void paint(Graphics g) {
		int  centerx = getWidth() / 2;  // ウィンドウの中心のx座標
		int  centery = getHeight() / 2;  // ウィンドウの中心のy座標
		int  lastx = centerx, lasty = centery; // 最初の座標は中心
		int  length = 201; // １回に歩く最大距離の２倍+1
		g.setColor( Color.red );
		// 50回の試行
		for ( int n=1; n <= 50; n++ ) {
			int  x = lastx +  (int)(Math.random() * length ) - length / 2;
			int  y = lasty +  (int)(Math.random() * length ) - length / 2;
			g.drawLine( lastx, lasty, x, y);
			// 線を引いたら、次の描画のために、現在の座標を前の座標として残す
			lastx = x;
			lasty = y;
		}
	}
}