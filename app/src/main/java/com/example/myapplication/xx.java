package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class xx extends SurfaceView implements Runnable {
    private long t;
    long a=System.currentTimeMillis();
    float b=0;
    int z=0;
    int bbx=100;
    Paint ff    =new Paint();
    volatile boolean yes=true;
    SurfaceHolder aa;
    Canvas ss;
    // The size of the screen in pixels
    int mScreenX;
    int mScreenY;
    private Thread thread = null;
    public xx(Context ax, int x, int y){
        super(ax);
        // Set the screen width and height
        mScreenX = x;
        mScreenY = y;
        aa=getHolder();
    }

    private class fuckaa{
        public float a;
        public float b;
        public fuckaa(float a3,float a4){
            a=a3;
            b=a4;
        }
        private float dis(fuckaa a1,fuckaa a2){
            float x1,x2;
            x1=a1.a-a2.a;
            x2=a1.b-a2.b;
            return (float)Math.sqrt(x1*x1+x2*x2);
        }
        private fuckaa mmx(fuckaa a1,fuckaa a2){
            return new fuckaa(a1.a*a2.a-a1.b*a2.b,a1.a*a2.b+a1.b*a2.a);
        }

        private fuckaa addx(fuckaa a1,fuckaa a2){
            return new fuckaa(a1.a+a2.a,a1.b+a2.b);
        }

private fuckaa m2(fuckaa sd,long tt){
            return new fuckaa(sd.a*t,sd.b*t);
}
        private fuckaa m3(fuckaa sd,float tt){
            return new fuckaa(sd.a*tt,sd.b*tt);
        }
        private fuckaa minusx(fuckaa a1,fuckaa a2){
            return new fuckaa(a1.a-a2.a,a1.b-a2.b);
        }
        private fuckaa minusx2(fuckaa a11,fuckaa a22){
            float dx=dis(a11,a22);
            return new fuckaa((a11.a-a22.a)/dx,(a11.b-a22.b)/dx);
        }
        private fuckaa mm1(fuckaa a1,fuckaa a2){
            return new fuckaa(a1.a*a2.a-a1.b*a2.b,a1.a*a2.b+a1.b*a2.a);
        }

        private float dotx(fuckaa a1,fuckaa a2){
            return a1.a*a2.a+a1.b*a2.b;
        }


        private float im(fuckaa xx){
            return xx.b;
        }
        private float re(fuckaa xx){
            return xx.a;
        }

    }
public class ball{
        private fuckaa cc;
        private fuckaa dd;
        private float  r;
        private float massx;
        private int a,b,c;

        public ball(fuckaa qq,fuckaa ww,float r2,float jk,int z,int x, int c2){
            cc=qq;
            dd=ww;
            r=r2;
            massx=jk;
            a=z;
            b=x;
            c=c2;
        }
}

    public void drawball(fuckaa xx,float r,int a, int b,int c){
        ff.setARGB(255,a,b,c);
        ss.drawArc(xx.a-r,xx.b-r,xx.a+r,xx.b+r,0,360,true,ff);
    }

    public void drawball2(ball er){
        drawball(er.cc,er.r,er.a,er.b,er.c);
    }

    public void movx(ball er){
        er.cc=er.cc.addx(er.cc,er.dd.m2(er.dd,t));
        if(er.cc.a>mScreenX-er.r){
            er.dd.a=-Math.abs(er.dd.a);
        }
        if(er.cc.b>mScreenY-er.r){
            er.dd.b=-Math.abs(er.dd.b);
        }
        if(er.cc.a<er.r){
            er.dd.a=Math.abs(er.dd.a);
        }
        if(er.cc.b<er.r){
            er.dd.b=Math.abs(er.dd.b);
        }
    }


    float sf(float xc,float xc2){
        return (float)(Math.random()*(xc2-xc)+xc);
    }

    int sfi(int xc,int xc2){
        return (int)(Math.random()*(xc2-xc)+xc);
    }


    boolean xu(ball df,ball df2){
        return df.cc.dis(df.cc,df2.cc)<df.r+df2.r;
    }

    @Override
    public void run() {
        int n=22;
        float xxx;
fuckaa v1,v2,v3,v4,v11,v22;
v1=new fuckaa(10,10);
v2=new fuckaa(10,10);
v3=new fuckaa(10,10);
v4=new fuckaa(10,10);
        v11=new fuckaa(10,10);
        v22=new fuckaa(10,10);
float radius=50;
float yy1,yy2,yy3,yy4;
        ff.setARGB(255,255,0,0);

int k,j;
ball []et=new ball[n];
for(k=0;k<n;k++){
    xxx=sf(30f,100f);
    et[k]=new ball(new fuckaa(sf(100,1900),sf(100,800)),new fuckaa(sf(-0.5f,0.5f),sf(-0.5f,0.5f)),xxx, xxx*xxx,sfi(0,256),sfi(0,256),sfi(0,256));
}

        while(yes){
            if (aa.getSurface().isValid()) {
                ss=aa.lockCanvas();
                ss.drawColor(Color.argb(255, 226, 128, 182));


t=System.currentTimeMillis()-a;
                a=System.currentTimeMillis();
for(k=0;k<n;k++){
    drawball2(et[k]);
    movx(et[k]);
}

for(k=1;k<n;k++){
    for(j=0;j<k;j++){
        if(xu(et[k],et[j])){
           // v3=et[j].cc.minusx(et[j].cc,et[k].cc);
            v4=et[j].cc.minusx2(et[j].cc,et[k].cc);
            yy1=et[j].cc.dotx(v4,et[j].dd);
            yy2=et[k].cc.dotx(v4,et[k].dd);
            if((yy2-yy1)>0){
            yy3=(et[j].massx*yy1-et[k].massx*yy1+2*et[k].massx*yy2)/(et[j].massx+et[k].massx);
            yy4=(2*et[j].massx*yy1-et[j].massx*yy2+et[k].massx*yy2)/(et[j].massx+et[k].massx);
            v1=et[j].cc.m3(v4,yy1);
            v2=et[k].cc.m3(v4,yy2);
            v11=et[j].dd.minusx(et[j].dd,v1);
            v22=et[k].dd.minusx(et[k].dd,v2);
            et[j].dd=et[j].dd.addx(v11,et[j].dd.m3(v4,yy3));
            et[k].dd=et[k].dd.addx(v22,et[k].dd.m3(v4,yy4));
       /*    et[j].dd=new fuckaa(-et[j].dd.a,-et[j].dd.b);
                et[k].dd=new fuckaa(-et[k].dd.a,-et[k].dd.b);*/
            }
        }
    }
}


                aa.unlockCanvasAndPost(ss);

            }
        }
    }
    public void pause() {
        yes=false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            // Error
        }
    }

    public void resume() {
        thread = new Thread(this);
        thread.start();
    }
}
