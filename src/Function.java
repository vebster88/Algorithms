
import java.util.Date;

import static java.lang.Math.*;

public class Function {
    public static void main(String[] args) {
        Date data = new Date();
        //float x = (float) Math.PI / 2;
        float x = 1;
        float z=0f;

        for (int i=0; i<100000; i++) {
        //for (int o=0; o<11; o++) {

                  //z = (float) (Math.abs(cosX(x)-Math.cos(x)));
                //System.out.println(cosX(x));
                //System.out.println(Math.cos(x));
                //cosX(x);
                //sinX(x);
            arCos(x);
            //Math.sin(x);
                //Math.cos(x);
            }

      //  }
        Date data1 = new Date();
        long raznica = data1.getTime()-data.getTime();
        System.out.println("Время работы цикла:" + raznica + " , cosX:" + cosX(x) + ", sinX:" + sinX(x) + ", arcos:" + arCos(x)+" ,разница аркос:" + (arCos(x)-Math.acos(x)));
    }
        public static float cosX(float x) {
            float cosx;
            float x2 = (float) x*x;
//            float x4 = (float) x2*x2;
//            float x6 = (float) x4*x2;
            cosx = (float) (1 - x2*(0.5-x2*(0.04166667-x2*(0.00138889-x2*0.0000248))));
          // cosx = (float) (1 - x2*0.5+x2*x2*0.04166667-x2*x2*x2*0.00138889+x2*x2*x2*x2*0.0000248);

return cosx;
        }
        public static float sinX(float x) {
            float sinx;
            float x2 = x*x;
            float x3 = x2*x;
//            float x4 = (float) x2*x2;
//            float x6 = (float) x4*x2;
            sinx = (float) (x - x3*(0.16666667-x2*(0.00833333-x2*(0.00019841-x2*0.00000276))));
          // cosx = (float) (1 - x2*0.5+x2*x2*0.04166667-x2*x2*x2*0.00138889+x2*x2*x2*x2*0.0000248);

return sinx;
        }
        public static float arCos(float x) {
            float x2 = x*x;
            float x3 = x2*x;
        float arcos;
        arcos = (float) (1.5707963268 - x - x3*0.16666667 - x3*x2*0.075 - x3*x2*x2*0.044642857 - x3*x2*x2*x2*0.03038194 - x3*x2*x2*x2*x2*0.02237215);


        return arcos;
        }



    }







