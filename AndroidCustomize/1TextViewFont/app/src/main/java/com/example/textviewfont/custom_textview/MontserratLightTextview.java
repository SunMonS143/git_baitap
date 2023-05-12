package com.example.textviewfont.custom_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class MontserratLightTextview extends AppCompatTextView {
    public MontserratLightTextview(@NonNull Context context) {
        super(context);
        setFontsTextview();
    }

    public MontserratLightTextview(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFontsTextview();
    }

    public MontserratLightTextview(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextview();
    }
    private void setFontsTextview(){
        Typeface typeface = Utils.getMontserratLightTypeface(getContext());
        setTypeface(typeface);
    }
}
