package com.example.tong.jiaowuxitong.view.custom;

import android.content.Context;
import android.widget.TextView;

import com.example.tong.jiaowuxitong.R;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;

import java.text.DecimalFormat;

/**
 * Created by TONG on 2017/1/26.
 */
public class CourseDegreeViewMaker extends MarkerView {
    private TextView tvContent;
    private IAxisValueFormatter xAxisValueFormatter;

    private DecimalFormat format;

    public CourseDegreeViewMaker(Context context, IAxisValueFormatter xAxisValueFormatter) {
        super(context, R.layout.custom_marker_view);

        this.xAxisValueFormatter = xAxisValueFormatter;
        tvContent = (TextView) findViewById(R.id.tvContent);
    }

    // callbacks everytime the MarkerView is redrawn, can be used to update the
    // content (user-interface)
    @Override
    public void refreshContent(Entry e, Highlight highlight) {

        tvContent.setText(StringUtils.formatFloat(e.getY(),0)+" 人");

        super.refreshContent(e, highlight);
    }

    @Override
    public MPPointF getOffset() {
        return new MPPointF(-(getWidth() / 2), -getHeight());
    }
}
