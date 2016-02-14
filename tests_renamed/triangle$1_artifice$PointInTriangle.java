import java.lang.*;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
public class PointInTriangle extends Frame {
    public Polygon f03 = new Polygon();
    public Point f13 = new Point();
    public static void m03 ( Graphics v0, int v1, int v2, int v3, Paint v4 ) {
        Graphics2D v5;
        v5 = ( Graphics2D ) v0;
        Shape v6;
        v6 = new Ellipse2D.Float ( v1, v2, v3, v3 );
        v5.setPaint ( v4 );
        v5.draw ( v6 );
        v5.setPaint ( v4 );
        v5.fill ( v6 );
    }
    public void paint ( Graphics v7 ) {
        Graphics2D v8;
        v8 = ( Graphics2D ) v7;
        v8.setPaint ( Color.red );
        v8.draw ( f03 );
        v8.setPaint ( Color.green );
        m03 ( v7, f13.x, f13.y, 3, Color.blue );
    }
    public static int m23 ( float v9, float v10, float v11, float v12, float v13, float v14 ) {
        float v15, v16, v17, v18;
        if ( v9 < v11 ) {
            v15 = v9;
            v17 = v11;
        } else {
            v15 = v11;
            v17 = v9;
        }
        if ( v10 < v12 ) {
            v16 = v10;
            v18 = v12;
        } else {
            v16 = v12;
            v18 = v10;
        }
        if ( ( v13 + 0.01 ) >= v15 && ( v13 - 0.01 ) <= v17 &&
                ( v14 + 0.01 ) >= v16 && ( v14 - 0.01 ) <= v18 ) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int m33 ( float v19, float v20, float v21, float v22,
                            float v23, float v24, float v25, float v26 ) {
        float v27, v28;
        float v29;
        v29 = 0;
        float v30;
        v30 = 0;
        v27 = v21 - v19;
        v28 = v22 - v20;
        float v31;
        v31 = v28 / v27;
        float v32;
        v32 = v20 - v31 * v19;
        v27 = v25 - v23;
        v28 = v26 - v24;
        float v33;
        v33 = v28 / v27;
        float v34;
        v34 = v24 - v33 * v23;
        if ( ( v31 - v33 ) == 0 ) {
            return 0;
        } else {
            v29 = ( v34 - v32 ) / ( v31 - v33 );
            v30 = v31 * v29 + v32;
        }
        if ( m23 ( v19, v20, v21, v22, v29, v30 ) == 1 && m23 ( v23, v24, v25, v26, v29, v30 ) == 1 ) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int m43() {
        try {
            InputStreamReader v35;
            v35 = new InputStreamReader ( System.in );
            BufferedReader v36;
            v36 = new BufferedReader ( v35 );
            return Integer.parseInt ( v36.readLine() );
        } catch ( Exception v37 ) {
            v37.printStackTrace();
            return 0;
        }
    }
    public static void main ( String v38[] ) {
        List<Integer> v39;
        v39 = new ArrayList<Integer>();
        int v40;
        v40 = 0;
        while ( v40 < 3 ) {
            System.out.format ( "Enter x[%d]: ", v40 + 1 );
            v39.add ( m43() );
            System.out.format ( "Enter y[%d]: ", v40 + 1 );
            v39.add ( m43() );
            v40 = v40 + 1;
        }
        PointInTriangle v41;
        v41 = new PointInTriangle();
        int v42;
        v42 = 0;
        while ( v42 < v39.size() ) {
            int v43;
            v43 = v39.get ( +v42 );
            v42 = v42 + 1;
            int v44;
            v44 = v39.get ( v42 );
            v41.f03.addPoint ( v43, v44 );
            v42 = v42 + 1;
        }
        System.out.format ( "Enter Point X: " );
        int v45;
        v45 = m43();
        System.out.format ( "Enter Point Y: " );
        int v46;
        v46 = m43();
        int v47;
        v47 = v45 + 1000;
        int v48;
        v48 = v46;
        v41.f13.x = v45;
        v41.f13.y = v46;
        int v49;
        v49 = 0;
        v49 = v49
              + ( m33 ( v39.get ( 0 ), v39.get ( 1 ), v39.get ( 2 ), v39.get ( 3 ), v45,
                        v46, v47, v48 ) );
        v49 = v49
              + ( m33 ( v39.get ( 2 ), v39.get ( 3 ), v39.get ( 4 ), v39.get ( 5 ), v45,
                        v46, v47, v48 ) );
        v49 = v49
              + ( m33 ( v39.get ( 4 ), v39.get ( 5 ), v39.get ( 0 ), v39.get ( 1 ), v45,
                        v46, v47, v48 ) );
        if ( ( v49 % 2 ) == 1 ) {
            System.out.println ( "The Given Point is inside the triangle" );
        } else {
            System.out.println ( "The Given Point is outside the triangle" );
        }
        v41.addWindowListener (
        new WindowAdapter() {
            public void windowClosing ( WindowEvent v50 ) {
                System.exit ( 0 );
            }
        }
        );
        v41.setSize ( 300, 250 );
        v41.setVisible ( true );
    }
}
