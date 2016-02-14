public class PointInTriangle extends java.awt.Frame {
    public java.awt.Polygon mypolygon;
    public java.awt.Point mypoint;
    public PointInTriangle() {
        super();
        this.mypolygon = new java.awt.Polygon();
        this.mypoint = new java.awt.Point();
    }
    public static void drawPixel ( java.awt.Graphics a, int i, int i0, int i1, java.awt.Paint a0 ) {
        java.awt.Graphics2D a1 = ( java.awt.Graphics2D ) a;
        java.awt.geom.Ellipse2D$Float a2 = new java.awt.geom.Ellipse2D$Float ( ( float ) i, ( float ) i0, ( float ) i1, ( float ) i1 );
        a1.setPaint ( a0 );
        a1.draw ( ( java.awt.Shape ) ( Object ) a2 );
        a1.setPaint ( a0 );
        a1.fill ( ( java.awt.Shape ) ( Object ) a2 );
    }
    public void paint ( java.awt.Graphics a ) {
        java.awt.Graphics2D a0 = ( java.awt.Graphics2D ) a;
        java.awt.Graphics a1 = a0;
        a0.setPaint ( ( java.awt.Paint ) ( Object ) java.awt.Color.red );
        a0.draw ( ( java.awt.Shape ) ( Object ) this.mypolygon );
        a0.setPaint ( ( java.awt.Paint ) ( Object ) java.awt.Color.green );
        PointInTriangle.drawPixel ( a1, this.mypoint.x, this.mypoint.y, 3, ( java.awt.Paint ) ( Object ) java.awt.Color.blue );
    }
    public static int IsPointInBoundingBox ( float f, float f0, float f1, float f2, float f3, float f4 ) {
        float f5 = 0.0f;
        float f6 = 0.0f;
        if ( f < f1 ) {
            f5 = f;
            f = f1;
        } else {
            f5 = f1;
        }
        if ( f0 < f2 ) {
            f6 = f0;
            f0 = f2;
        } else {
            f6 = f2;
        }
        if ( ( double ) f3 + 0.01 >= ( double ) f5 && ( double ) f3 - 0.01 <= ( double ) f && ( double ) f4 + 0.01 >= ( double ) f6 && ( double ) f4 - 0.01 <= ( double ) f0 ) {
            return 1;
        }
        return 0;
    }
    public static int LineSegmentIntersection ( float f, float f0, float f1, float f2, float f3, float f4, float f5, float f6 ) {
        float f7 = ( f2 - f0 ) / ( f1 - f );
        float f8 = f0 - f7 * f;
        float f9 = ( f6 - f4 ) / ( f5 - f3 );
        float f10 = f4 - f9 * f3;
        if ( f7 - f9 == 0.0f ) {
            return 0;
        }
        float f11 = ( f10 - f8 ) / ( f7 - f9 );
        float f12 = f7 * f11 + f8;
        if ( PointInTriangle.IsPointInBoundingBox ( f, f0, f1, f2, f11, f12 ) == 1 && PointInTriangle.IsPointInBoundingBox ( f3, f4, f5, f6, f11, f12 ) == 1 ) {
            return 1;
        }
        return 0;
    }
    public static int ReadInteger() {
        int i = 0;
        try {
            i = Integer.parseInt ( new java.io.BufferedReader ( ( java.io.Reader ) new java.io.InputStreamReader ( System.in ) ).readLine() );
        } catch ( Exception a ) {
            a.printStackTrace();
            return 0;
        }
        return i;
    }
    public static void main ( String[] a ) {
        java.util.ArrayList a0 = new java.util.ArrayList();
        int i = 0;
        while ( i < 3 ) {
            java.io.PrintStream a1 = System.out;
            Object[] a2 = new Object[1];
            a2[0] = Integer.valueOf ( i + 1 );
            a1.format ( "Enter x[%d]: ", a2 );
            ( ( java.util.List ) ( Object ) a0 ).add ( ( Object ) Integer.valueOf ( PointInTriangle.ReadInteger() ) );
            java.io.PrintStream a3 = System.out;
            Object[] a4 = new Object[1];
            a4[0] = Integer.valueOf ( i + 1 );
            a3.format ( "Enter y[%d]: ", a4 );
            ( ( java.util.List ) ( Object ) a0 ).add ( ( Object ) Integer.valueOf ( PointInTriangle.ReadInteger() ) );
            i = i + 1;
        }
        PointInTriangle a5 = new PointInTriangle();
        int i0 = 0;
        while ( i0 < ( ( java.util.List ) ( Object ) a0 ).size() ) {
            int i1 = i0 + 1;
            int i2 = ( ( Integer ) ( ( java.util.List ) ( Object ) a0 ).get ( i0 ) ).intValue();
            int i3 = ( ( Integer ) ( ( java.util.List ) ( Object ) a0 ).get ( i1 ) ).intValue();
            a5.mypolygon.addPoint ( i2, i3 );
            i0 = i1 + 1;
        }
        System.out.format ( "Enter Point X: ", new Object[0] );
        int i4 = PointInTriangle.ReadInteger();
        System.out.format ( "Enter Point Y: ", new Object[0] );
        int i5 = PointInTriangle.ReadInteger();
        int i6 = i4 + 1000;
        a5.mypoint.x = i4;
        a5.mypoint.y = i5;
        if ( ( 0 + PointInTriangle.LineSegmentIntersection ( ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a0 ).get ( 0 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a0 ).get ( 1 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a0 ).get ( 2 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a0 ).get ( 3 ) ).intValue(), ( float ) i4, ( float ) i5, ( float ) i6, ( float ) i5 ) + PointInTriangle.LineSegmentIntersection ( ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a0 ).get ( 2 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a0 ).get ( 3 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a0 ).get ( 4 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a0 ).get ( 5 ) ).intValue(), ( float ) i4, ( float ) i5, ( float ) i6, ( float ) i5 ) + PointInTriangle.LineSegmentIntersection ( ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a0 ).get ( 4 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a0 ).get ( 5 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a0 ).get ( 0 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a0 ).get ( 1 ) ).intValue(), ( float ) i4, ( float ) i5, ( float ) i6, ( float ) i5 ) ) % 2 != 1 ) {
            System.out.println ( "The Given Point is outside the triangle" );
        } else {
            System.out.println ( "The Given Point is inside the triangle" );
        }
        a5.addWindowListener ( ( java.awt.event.WindowListener ) ( Object ) new PointInTriangle$1() );
        a5.setSize ( 300, 250 );
        a5.setVisible ( true );
    }
}