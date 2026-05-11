package com.webengage.sdk.android;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/* renamed from: com.webengage.sdk.android.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2963k {
    public static Animation a(String str, Animation.AnimationListener animationListener, long j10) {
        Animation alphaAnimation;
        if ("TOP_IN".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, -1.0f, 2, 0.0f);
        } else if ("TOP_OUT".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, -1.0f);
        } else if ("BOTTOM_IN".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
        } else if ("BOTTOM_OUT".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 1.0f);
        } else if ("LEFT_IN".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, -1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        } else if ("LEFT_OUT".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, 0.0f, 2, -1.0f, 2, 0.0f, 2, 0.0f);
        } else if ("RIGHT_IN".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        } else if ("RIGHT_OUT".equals(str)) {
            alphaAnimation = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        } else if ("FADE_IN".equals(str)) {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        } else {
            if (!"FADE_OUT".equals(str)) {
                return null;
            }
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        alphaAnimation.setDuration(j10);
        alphaAnimation.setAnimationListener(animationListener);
        return alphaAnimation;
    }
}
