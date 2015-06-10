package drawing;

import  java.applet.*;
import  java.awt.*;

// Graphicsクラスの描画メソッド
// @date 2015/May/21

@SuppressWarnings("serial")
public class Main extends Applet {

	public void paint(Graphics g) {
		// Graphicsクラスの描画メソッド
		g.setColor( Color.blue );
		g.drawLine( 10, 10, 100, 100 ); // ２つの点の座標
		g.drawRect( 10, 10, 100, 100 );  // 左上の座標と幅と高さ
		g.drawOval( 150, 10, 100, 100 );  // 外接四角形の左上の座標と幅と高さ
		g.drawOval( 300, 10, 300, 100 );  // 外接四角形の左上の座標と幅と高さ
		g.drawArc( 10, 150, 200, 200, 90, 90 );  // 外接四角形の左上の座標と幅と高さと開始角度と角度差
		g.drawArc( -90, 50, 200, 200, 270, 90 );  // 外接四角形の左上の座標と幅と高さと開始角度と角度差
		g.drawRoundRect( 150, 150, 200, 100, 50, 100 );  // 左上の座標と幅と高さと丸みの幅と高さ
		g.setColor( Color.gray );
		g.draw3DRect( 500, 150, 100, 100, true ); // 凸のように見える
		g.draw3DRect( 525, 175, 50, 50, false ); // 凹んで見える

		// Graphicsクラスの塗潰しのメソッド
		g.setColor( Color.magenta );
		g.fillRect( 10, 300, 100, 100 );
		g.fillOval( 150, 300, 100, 100 );
		g.setColor( Color.yellow );
		g.fillArc( 300, 300, 100, 100, 45, 270 );
		g.fillRoundRect(400, 300, 80, 100, 80, 40 );
		g.setColor( Color.gray );
		g.fill3DRect( 500, 300, 100, 100, true );
		g.fill3DRect( 525, 325, 50, 50, false );
		g.copyArea( 500, 300, 100, 100, 120, -20);
	}
}