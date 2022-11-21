package com.example.mycanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

public class MyView extends View //Viewを継承する新しいクラスを作成
{

    public MyView(Context context) //コンストラクタの実装(3種類)
    {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) //描画用メソッドの実装
    {
        //使用するペンの作成
        Paint pen = new Paint();
        pen.setColor(Color.RED);
        pen.setStyle(Paint.Style.FILL);
        pen.setAntiAlias(true);

        //文字列の描画
        canvas.drawText("画面上をドラッグして下さい", 50 , 50 , pen);

        //直線の描画
        canvas.drawLine(100,200,1000,200,pen);
        canvas.drawLine(100,300,1000,300,pen);

        //円の描画
        canvas.drawCircle(250,700,200,pen);

        //楕円の描画
        RectF ovalRect = new RectF(500, 500, 800, 1200);
        canvas.drawOval(ovalRect, pen);

        //ペンの色を変更
        pen.setColor(Color.BLUE);
        pen.setStyle(Paint.Style.STROKE);

        //四角形の描画
        canvas.drawRect(100, 1300, 1000, 1500, pen);

        //多角形の描画
        Path myPath = new Path();
        myPath.moveTo(100, 1600);
        myPath.lineTo(500, 1700);
        myPath.lineTo(100, 1800);
        myPath.lineTo(1000, 1800);
        canvas.drawPath(myPath,pen);


    }

}
