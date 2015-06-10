package t_function;

// 三角関数の値を表示してみる
// @date 2015/May/28

public class Main {

	public static void main(String[] arg) {
		// 360度体系で30度ずつ変えながら、0度から360度まで
		for ( int t = 0; t <= 360; t += 30 ) {
			System.out.print(  t + ":  ");
			double theta = Math.toRadians( t );  // ラジアン角度
			System.out.print( "Sin: " + Math.sin( theta ) );
			System.out.print( "  Cos: " + Math.cos( theta ) );
			System.out.print( "  Tan: " + Math.tan( theta ) );
			System.out.println();
		}
	}
}