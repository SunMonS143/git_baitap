package com.example.textviewfont.custom_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class MonsterratThinTextview extends AppCompatTextView {
    public MonsterratThinTextview(@NonNull Context context) {
        super(context);
        setFontsTextview();
    }

    public MonsterratThinTextview(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFontsTextview();
    }

    public MonsterratThinTextview(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextview();
    }
    private void setFontsTextview(){
        Typeface typeface = Utils.getMonsterratThinTypeface(getContext());
        setTypeface(typeface);
    }
}
