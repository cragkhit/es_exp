import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Frame;
public class PointInTriangle extends Frame {
    public Polygon f03;
    public Point f13;
    public PointInTriangle() {
        this.f03 = new Polygon();
        this.f13 = new Point();
    }
    public static void m03 ( final Graphics graphics, final int n, final int n2, final int n3, final Paint paint ) {
        final Graphics2D graphics2D = ( Graphics2D ) graphics;
        final Ellipse2D.Float float1 = new Ellipse2D.Float ( n, n2, n3, n3 );
        graphics2D.setPaint ( paint );
        graphics2D.draw ( float1 );
        graphics2D.setPaint ( paint );
        graphics2D.fill ( float1 );
    }
    @Override
    public void paint ( final Graphics graphics ) {
        final Graphics2D graphics2D = ( Graphics2D ) graphics;
        graphics2D.setPaint ( Color.red );
        graphics2D.draw ( this.f03 );
        graphics2D.setPaint ( Color.green );
        m03 ( graphics, this.f13.x, this.f13.y, 3, Color.blue );
    }
    public static int m23 ( final float n, final float n2, final float n3, final float n4, final float n5, final float n6 ) {
        float n7;
        float n8;
        if ( n < n3 ) {
            n7 = n;
            n8 = n3;
        } else {
            n7 = n3;
            n8 = n;
        }
        float n9;
        float n10;
        if ( n2 < n4 ) {
            n9 = n2;
            n10 = n4;
        } else {
            n9 = n4;
            n10 = n2;
        }
        if ( n5 + 0.01 >= n7 && n5 - 0.01 <= n8 && n6 + 0.01 >= n9 && n6 - 0.01 <= n10 ) {
            return 1;
        }
        return 0;
    }
    public static int m33 ( final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8 ) {
        final float n9 = ( n4 - n2 ) / ( n3 - n );
        final float n10 = n2 - n9 * n;
        final float n11 = ( n8 - n6 ) / ( n7 - n5 );
        final float n12 = n6 - n11 * n5;
        if ( n9 - n11 == 0.0f ) {
            return 0;
        }
        final float n13 = ( n12 - n10 ) / ( n9 - n11 );
        final float n14 = n9 * n13 + n10;
        if ( m23 ( n, n2, n3, n4, n13, n14 ) == 1 && m23 ( n5, n6, n7, n8, n13, n14 ) == 1 ) {
            return 1;
        }
        return 0;
    }
    public static int m43() {
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
            list.add ( m43() );
            System.out.format ( "Enter y[%d]: ", i + 1 );
            list.add ( m43() );
        }
        final PointInTriangle pointInTriangle = new PointInTriangle();
        int n;
        for ( int j = 0; j < list.size(); j = n + 1 ) {
            final int intValue = list.get ( j );
            n = j + 1;
            pointInTriangle.f03.addPoint ( intValue, ( int ) list.get ( n ) );
        }
        System.out.format ( "Enter Point X: ", new Object[0] );
        final int m43 = m43();
        System.out.format ( "Enter Point Y: ", new Object[0] );
        final int m2 = m43();
        final int n2 = m43 + 1000;
        final int n3 = m2;
        pointInTriangle.f13.x = m43;
        pointInTriangle.f13.y = m2;
        if ( ( 0 + m33 ( list.get ( 0 ), list.get ( 1 ), list.get ( 2 ), list.get ( 3 ), m43, m2, n2, n3 ) + m33 ( list.get ( 2 ), list.get ( 3 ), list.get ( 4 ), list.get ( 5 ), m43, m2, n2, n3 ) + m33 ( list.get ( 4 ), list.get ( 5 ), list.get ( 0 ), list.get ( 1 ), m43, m2, n2, n3 ) ) % 2 == 1 ) {
            System.out.println ( "The Given Point is inside the triangle" );
        } else {
            System.out.println ( "The Given Point is outside the triangle" );
        }
        pointInTriangle.addWindowListener ( new WindowAdapter() {
            @Override
            public void windowClosing ( final WindowEvent windowEvent ) {
                System.exit ( 0 );
            }
        } );
        pointInTriangle.setSize ( 300, 250 );
        pointInTriangle.setVisible ( true );
    }
}
