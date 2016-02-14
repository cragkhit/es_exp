public class PointInTriangle extends java.awt.Frame {
    private java.awt.Polygon a;
    private java.awt.Point b;
    public PointInTriangle() {
        super();
        this.a = new java.awt.Polygon();
        this.b = new java.awt.Point();
    }
    public void paint ( java.awt.Graphics a0 ) {
        java.awt.Graphics2D a1 = ( java.awt.Graphics2D ) a0;
        java.awt.Graphics a2 = a1;
        a1.setPaint ( ( java.awt.Paint ) ( Object ) java.awt.Color.red );
        a1.draw ( ( java.awt.Shape ) ( Object ) this.a );
        a1.setPaint ( ( java.awt.Paint ) ( Object ) java.awt.Color.green );
        int i = this.b.x;
        int i0 = this.b.y;
        java.awt.Color a3 = java.awt.Color.blue;
        java.awt.Graphics2D a4 = ( java.awt.Graphics2D ) a2;
        java.awt.geom.Ellipse2D$Float a5 = new java.awt.geom.Ellipse2D$Float ( ( float ) i, ( float ) i0, 3f, 3f );
        a4.setPaint ( ( java.awt.Paint ) ( Object ) a3 );
        a4.draw ( ( java.awt.Shape ) ( Object ) a5 );
        a4.setPaint ( ( java.awt.Paint ) ( Object ) a3 );
        a4.fill ( ( java.awt.Shape ) ( Object ) a5 );
    }
    private static int a ( float f, float f0, float f1, float f2, float f3, float f4 ) {
        float f5 = 0.0f;
        float f6 = 0.0f;
        if ( f < f1 ) {
            f5 = f1;
        } else {
            f5 = f;
            f = f1;
        }
        if ( f0 < f2 ) {
            f6 = f0;
            f0 = f2;
        } else {
            f6 = f2;
        }
        if ( ( double ) f3 + 0.01 >= ( double ) f && ( double ) f3 - 0.01 <= ( double ) f5 && ( double ) f4 + 0.01 >= ( double ) f6 && ( double ) f4 - 0.01 <= ( double ) f0 ) {
            return 1;
        }
        return 0;
    }
    private static int a ( float f, float f0, float f1, float f2, float f3, float f4, float f5, float f6 ) {
        float f7 = ( f2 - f0 ) / ( f1 - f );
        float f8 = f0 - f7 * f;
        float f9 = ( f6 - f4 ) / ( f5 - f3 );
        float f10 = f4 - f9 * f3;
        if ( f7 - f9 == 0.0f ) {
            return 0;
        }
        float f11 = ( f10 - f8 ) / ( f7 - f9 );
        float f12 = f7 * f11 + f8;
        if ( PointInTriangle.a ( f, f0, f1, f2, f11, f12 ) == 1 && PointInTriangle.a ( f3, f4, f5, f6, f11, f12 ) == 1 ) {
            return 1;
        }
        return 0;
    }
    private static int a() {
        int i = 0;
        try {
            i = Integer.parseInt ( new java.io.BufferedReader ( ( java.io.Reader ) new java.io.InputStreamReader ( System.in ) ).readLine() );
        } catch ( Exception a0 ) {
            a0.printStackTrace();
            return 0;
        }
        return i;
    }
    public static void main ( String[] a0 ) {
        java.util.ArrayList a1 = new java.util.ArrayList();
        int i = 0;
        while ( i < 3 ) {
            java.io.PrintStream a2 = System.out;
            Object[] a3 = new Object[1];
            a3[0] = Integer.valueOf ( i + 1 );
            a2.format ( "Enter x[%d]: ", a3 );
            ( ( java.util.List ) ( Object ) a1 ).add ( ( Object ) Integer.valueOf ( PointInTriangle.a() ) );
            java.io.PrintStream a4 = System.out;
            Object[] a5 = new Object[1];
            a5[0] = Integer.valueOf ( i + 1 );
            a4.format ( "Enter y[%d]: ", a5 );
            ( ( java.util.List ) ( Object ) a1 ).add ( ( Object ) Integer.valueOf ( PointInTriangle.a() ) );
            i = i + 1;
        }
        PointInTriangle a6 = new PointInTriangle();
        int i0 = 0;
        while ( i0 < ( ( java.util.List ) ( Object ) a1 ).size() ) {
            int i1 = i0 + 1;
            int i2 = ( ( Integer ) ( ( java.util.List ) ( Object ) a1 ).get ( i0 ) ).intValue();
            int i3 = ( ( Integer ) ( ( java.util.List ) ( Object ) a1 ).get ( i1 ) ).intValue();
            a6.a.addPoint ( i2, i3 );
            i0 = i1 + 1;
        }
        System.out.format ( "Enter Point X: ", new Object[0] );
        int i4 = PointInTriangle.a();
        System.out.format ( "Enter Point Y: ", new Object[0] );
        int i5 = PointInTriangle.a();
        int i6 = i4 + 1000;
        a6.b.x = i4;
        a6.b.y = i5;
        if ( ( 0 + PointInTriangle.a ( ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a1 ).get ( 0 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a1 ).get ( 1 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a1 ).get ( 2 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a1 ).get ( 3 ) ).intValue(), ( float ) i4, ( float ) i5, ( float ) i6, ( float ) i5 ) + PointInTriangle.a ( ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a1 ).get ( 2 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a1 ).get ( 3 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a1 ).get ( 4 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a1 ).get ( 5 ) ).intValue(), ( float ) i4, ( float ) i5, ( float ) i6, ( float ) i5 ) + PointInTriangle.a ( ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a1 ).get ( 4 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a1 ).get ( 5 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a1 ).get ( 0 ) ).intValue(), ( float ) ( ( Integer ) ( ( java.util.List ) ( Object ) a1 ).get ( 1 ) ).intValue(), ( float ) i4, ( float ) i5, ( float ) i6, ( float ) i5 ) ) % 2 != 1 ) {
            System.out.println ( "The Given Point is outside the triangle" );
        } else {
            System.out.println ( "The Given Point is inside the triangle" );
        }
        a6.addWindowListener ( ( java.awt.event.WindowListener ) ( Object ) new PointInTriangle$1() );
        a6.setSize ( 300, 250 );
        a6.setVisible ( true );
    }
}