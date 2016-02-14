import java.lang.*;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
public class PointInTriangle extends Frame {
    public Polygon mypolygon = new Polygon();
    public Point mypoint = new Point();
    public static void drawPixel ( Graphics g, int x, int y, int size, Paint color ) {
        Graphics2D ga = ( Graphics2D ) g;
        Shape circle = new Ellipse2D.Float ( x, y, size, size );
        ga.setPaint ( color );
        ga.draw ( circle );
        ga.setPaint ( color );
        ga.fill ( circle );
    }
    public void paint ( Graphics g ) {
        Graphics2D ga = ( Graphics2D ) g;
        ga.setPaint ( Color.red );
        ga.draw ( mypolygon );
        ga.setPaint ( Color.green );
        drawPixel ( g, mypoint.x, mypoint.y, 3, Color.blue );
    }
    public static int IsPointInBoundingBox ( float x1, float y1, float x2, float y2, float px, float py ) {
        float left, top, right, bottom;
        if ( x1 < x2 ) {
            left = x1;
            right = x2;
        } else {
            left = x2;
            right = x1;
        }
        if ( y1 < y2 ) {
            top = y1;
            bottom = y2;
        } else {
            top = y2;
            bottom = y1;
        }
        if ( ( px + 0.01 ) >= left && ( px - 0.01 ) <= right &&
                ( py + 0.01 ) >= top && ( py - 0.01 ) <= bottom ) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int LineSegmentIntersection ( float l1x1, float l1y1, float l1x2, float l1y2,
            float l2x1, float l2y1, float l2x2, float l2y2 ) {
        float dx, dy;
        float intersection_X = 0;
        float intersection_Y = 0;
        dx = l1x2 - l1x1;
        dy = l1y2 - l1y1;
        float m1 = dy / dx;
        float c1 = l1y1 - m1 * l1x1;
        dx = l2x2 - l2x1;
        dy = l2y2 - l2y1;
        float m2 = dy / dx;
        float c2 = l2y1 - m2 * l2x1;
        if ( ( m1 - m2 ) == 0 ) {
            return 0;
        } else {
            intersection_X = ( c2 - c1 ) / ( m1 - m2 );
            intersection_Y = m1 * intersection_X + c1;
        }
        if ( IsPointInBoundingBox ( l1x1, l1y1, l1x2, l1y2, intersection_X, intersection_Y ) == 1 && IsPointInBoundingBox ( l2x1, l2y1, l2x2, l2y2, intersection_X, intersection_Y ) == 1 ) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int ReadInteger() {
        try {
            InputStreamReader input = new InputStreamReader ( System.in );
            BufferedReader reader = new BufferedReader ( input );
            return Integer.parseInt ( reader.readLine() );
        } catch ( Exception e ) {
            e.printStackTrace();
            return 0;
        }
    }
    public static void main ( String args[] ) {
        List< Integer > srcpoints = new ArrayList< Integer >();
        for ( int i = 0; i < 3; i++ ) {
            System.out.format ( "Enter x[%d]: ", i + 1 );
            srcpoints.add ( ReadInteger() );
            System.out.format ( "Enter y[%d]: ", i + 1 );
            srcpoints.add ( ReadInteger() );
        }
        PointInTriangle frame = new PointInTriangle();
        for ( int i = 0; i < srcpoints.size(); i++ ) {
            int x = srcpoints.get ( i++ );
            int y = srcpoints.get ( i );
            frame.mypolygon.addPoint ( x, y );
        }
        System.out.format ( "Enter Point X: " );
        int x = ReadInteger();
        System.out.format ( "Enter Point Y: " );
        int y = ReadInteger();
        int px = x + 1000;
        int py = y;
        frame.mypoint.x = x;
        frame.mypoint.y = y;
        int nCountIntersections = 0;
        nCountIntersections += LineSegmentIntersection ( srcpoints.get ( 0 ), srcpoints.get ( 1 ), srcpoints.get ( 2 ), srcpoints.get ( 3 ), x, y, px, py );
        nCountIntersections += LineSegmentIntersection ( srcpoints.get ( 2 ), srcpoints.get ( 3 ), srcpoints.get ( 4 ), srcpoints.get ( 5 ), x, y, px, py );
        nCountIntersections += LineSegmentIntersection ( srcpoints.get ( 4 ), srcpoints.get ( 5 ), srcpoints.get ( 0 ), srcpoints.get ( 1 ), x, y, px, py );
        if ( ( nCountIntersections % 2 ) == 1 ) {
            System.out.println ( "The Given Point is inside the triangle" );
        } else {
            System.out.println ( "The Given Point is outside the triangle" );
        }
        frame.addWindowListener (
        new WindowAdapter() {
            public void windowClosing ( WindowEvent we ) {
                System.exit ( 0 );
            }
        }
        );
        frame.setSize ( 300, 250 );
        frame.setVisible ( true );
    }
}
