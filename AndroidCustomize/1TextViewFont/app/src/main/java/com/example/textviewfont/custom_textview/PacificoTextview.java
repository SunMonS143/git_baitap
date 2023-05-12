package com.example.textviewfont.custom_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class PacificoTextview extends AppCompatTextView {

    public PacificoTextview(@NonNull Context context) {
        super(context);
        setFontsTextview();
    }

    public PacificoTextview(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFontsTextview();
    }

    public PacificoTextview(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextview();
    }
    private void setFontsTextview(){
        Typeface typeface = Utils.getPacifiticoTypeface(getContext());
        setTypeface(typeface);
    }
}
