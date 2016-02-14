import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.awt.geom.Ellipse2D;
import java.awt.Shape;
import java.awt.Paint;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Frame;
public class PointInTriangle extends Frame {
    private Polygon a;
    private Point b;
    public PointInTriangle() {
        this.a = new Polygon();
        this.b = new Point();
    }
    @Override
    public void paint ( Graphics graphics ) {
        final Graphics2D graphics2D;
        ( graphics2D = ( Graphics2D ) graphics ).setPaint ( Color.red );
        graphics2D.draw ( this.a );
        graphics2D.setPaint ( Color.green );
        final Graphics graphics2 = graphics;
        final int x = this.b.x;
        final int y = this.b.y;
        final Color blue = Color.blue;
        final int n = y;
        final int n2 = x;
        graphics = graphics2;
        final Graphics2D graphics2D2 = ( Graphics2D ) graphics2;
        final Ellipse2D.Float float1 = new Ellipse2D.Float ( n2, n, 3.0f, 3.0f );
        graphics2D2.setPaint ( blue );
        graphics2D2.draw ( float1 );
        graphics2D2.setPaint ( blue );
        graphics2D2.fill ( float1 );
    }
    private static int a ( float n, float n2, float n3, final float n4, final float n5, final float n6 ) {
        float n7;
        if ( n < n3 ) {
            n7 = n;
            n3 = n3;
        } else {
            n7 = n3;
            n3 = n;
        }
        if ( n2 < n4 ) {
            n = n2;
            n2 = n4;
        } else {
            n = n4;
            n2 = n2;
        }
        if ( n5 + 0.01 >= n7 && n5 - 0.01 <= n3 && n6 + 0.01 >= n && n6 - 0.01 <= n2 ) {
            return 1;
        }
        return 0;
    }
    private static int a ( final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8 ) {
        final float n9 = ( n4 - n2 ) / ( n3 - n );
        final float n10 = n2 - n9 * n;
        final float n11 = ( n8 - n6 ) / ( n7 - n5 );
        final float n12 = n6 - n11 * n5;
        if ( n9 - n11 == 0.0f ) {
            return 0;
        }
        final float n13 = ( n12 - n10 ) / ( n9 - n11 );
        final float n14 = n9 * n13 + n10;
        if ( a ( n, n2, n3, n4, n13, n14 ) == 1 && a ( n5, n6, n7, n8, n13, n14 ) == 1 ) {
            return 1;
        }
        return 0;
    }
    private static int a() {
        try {
            return Integer.parseInt ( new BufferedReader ( new InputStreamReader ( System.in ) ).readLine() );
        } catch ( Exception ex ) {
            ex.printStackTrace();
            return 0;
        }
    }
    public static void main ( final String[] array ) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        for ( int i = 0; i < 3; ++i ) {
            System.out.format ( "Enter x[%d]: ", i + 1 );
            list.add ( a() );
            System.out.format ( "Enter y[%d]: ", i + 1 );
            list.add ( a() );
        }
        final PointInTriangle pointInTriangle = new PointInTriangle();
        int n;
        for ( int j = 0; j < list.size(); j = n + 1 ) {
            final int intValue = list.get ( j );
            n = j + 1;
            pointInTriangle.a.addPoint ( intValue, ( int ) list.get ( n ) );
        }
        System.out.format ( "Enter Point X: ", new Object[0] );
        final int a = a();
        System.out.format ( "Enter Point Y: ", new Object[0] );
        final int a2 = a();
        final int n2 = a + 1000;
        final int n3 = a2;
        pointInTriangle.b.x = a;
        pointInTriangle.b.y = a2;
        if ( ( 0 + a ( list.get ( 0 ), list.get ( 1 ), list.get ( 2 ), list.get ( 3 ), a, a2, n2, n3 ) + a ( list.get ( 2 ), list.get ( 3 ), list.get ( 4 ), list.get ( 5 ), a, a2, n2, n3 ) + a ( list.get ( 4 ), list.get ( 5 ), list.get ( 0 ), list.get ( 1 ), a, a2, n2, n3 ) ) % 2 == 1 ) {
            System.out.println ( "The Given Point is inside the triangle" );
        } else {
            System.out.println ( "The Given Point is outside the triangle" );
        }
        pointInTriangle.addWindowListener ( new PointInTriangle$1() );
        pointInTriangle.setSize ( 300, 250 );
        pointInTriangle.setVisible ( true );
    }
}
