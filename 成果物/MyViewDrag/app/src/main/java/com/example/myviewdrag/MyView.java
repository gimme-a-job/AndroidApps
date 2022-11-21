package com.example.myviewdrag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

public class MyView extends View //Viewを継承する新しいクラスを作成
{

    private float point_x = 500;
    private float point_y = 500;

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

        //円の描画
        canvas.drawCircle(point_x,point_y,50,pen);

    }

    public void setX(float point_x)
    {
        this.point_x = point_x;
    }

    public void setY(float point_y)
    {
        this.point_y = point_y;
    }

    public void setXY(float point_x,float point_y)
    {
        setX(point_x);
        setY(point_y);
    }

}
