package circle_polygonal;

import  java.applet.*;
import  java.awt.*;

// 正円を折れ線で表示するアプレット
// @date 2015/May/28

@SuppressWarnings("serial")
public class Main extends Applet {

	public void paint(Graphics g) {
		int  centerx = getWidth() / 2;  // 中心のx座標
		int  centery = getHeight() / 2;  // 中心のy座標
		int  n = 100;  // 何本の折れ線で曲線を近似するか
		double  t = 0;  // 媒介変数
		double  delta = 2 * Math.PI / n;  // 媒介変数の１回の差分
		// 半径はウィンドウの幅と高さのうち、小さい方の半分の８割にする
		double  radius = (centerx < centery) ? centerx *0.8 : centery *0.8;
		int  lastx = centerx + (int)( radius * Math.cos( t ) );
		int  lasty = centery - (int)( radius * Math.sin( t ) );
		for ( int i=1; i <= n; i++ ) {
			t += delta;  // 差分を足す
			int  x = centerx + (int)( radius * Math.cos( t ) );
			int  y = centery - (int)( radius * Math.sin( t ) );
			g.drawLine( lastx, lasty, x, y );
			lastx = x;
			lasty = y;
		}
	}
}