package com.example.textviewfont.custom_textview;

import android.content.Context;
import android.graphics.Typeface;

public class Utils {
    private static Typeface AmaticBoldTypeface;
    private static Typeface GrandHotelRegularTypeface;
    private static Typeface MontserratLightTypeface;
    private static Typeface MonsterratThinTypeface;
    private static Typeface PacifiticoTypeface;

    public static Typeface getAmaticBoldTypeface(Context context) {
        if (AmaticBoldTypeface == null) {
            AmaticBoldTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Amatic-Bold.ttf");
        }
        return AmaticBoldTypeface;
    }

    public static Typeface getGrandHotelRegularTypeface(Context context) {
        if (GrandHotelRegularTypeface == null) {
            GrandHotelRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/GrandHotel-Regular.otf");
        }
        return GrandHotelRegularTypeface;
    }

    public static Typeface getMontserratLightTypeface(Context context) {
        if (MontserratLightTypeface == null) {
            MontserratLightTypeface= Typeface.createFromAsset(context.getAssets(), "fonts/Montserrat-Light.otf");
        }
        return MontserratLightTypeface;
    }

    public static Typeface getMonsterratThinTypeface(Context context) {
        if (MonsterratThinTypeface == null) {
            MonsterratThinTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Montserrat-Thin.otf");
        }
        return MonsterratThinTypeface;
    }

    public static Typeface getPacifiticoTypeface(Context context) {
        if (PacifiticoTypeface == null) {
            PacifiticoTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Pacifico.ttf");
        }
        return PacifiticoTypeface;
    }
}
