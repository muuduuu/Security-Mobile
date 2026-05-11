package com.swmansion.reanimated.keyboard;

import androidx.core.view.K0;
import com.facebook.react.uimanager.C1944g0;

/* loaded from: classes2.dex */
public class Keyboard {
    private static final int CONTENT_TYPE_MASK = K0.m.b();
    private static final int SYSTEM_BAR_TYPE_MASK = K0.m.g();
    private KeyboardState mState = KeyboardState.UNKNOWN;
    private int mHeight = 0;
    private int mActiveTransitionCounter = 0;

    public int getHeight() {
        return this.mHeight;
    }

    public KeyboardState getState() {
        return this.mState;
    }

    public void onAnimationEnd() {
        int i10 = this.mActiveTransitionCounter - 1;
        this.mActiveTransitionCounter = i10;
        if (i10 == 0) {
            this.mState = this.mHeight <= 0 ? KeyboardState.CLOSED : KeyboardState.OPEN;
        }
    }

    public void onAnimationStart() {
        int i10 = this.mActiveTransitionCounter;
        if (i10 > 0) {
            KeyboardState keyboardState = this.mState;
            KeyboardState keyboardState2 = KeyboardState.OPENING;
            if (keyboardState == keyboardState2) {
                keyboardState2 = KeyboardState.CLOSING;
            }
            this.mState = keyboardState2;
        } else {
            this.mState = this.mHeight <= 0 ? KeyboardState.OPENING : KeyboardState.CLOSING;
        }
        this.mActiveTransitionCounter = i10 + 1;
    }

    public void updateHeight(K0 k02, boolean z10) {
        int e10 = (int) C1944g0.e(Math.max(0, k02.f(CONTENT_TYPE_MASK).f15927d - (z10 ? 0 : k02.f(SYSTEM_BAR_TYPE_MASK).f15927d)));
        if (e10 > 0 || this.mState != KeyboardState.OPEN) {
            this.mHeight = e10;
        }
    }
}
