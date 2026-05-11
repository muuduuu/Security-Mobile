package com.swmansion.reanimated.keyboard;

import androidx.core.view.C1514p0;
import androidx.core.view.K0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class KeyboardAnimationCallback extends C1514p0.b {
    private static final int CONTENT_TYPE_MASK = K0.m.b();
    private final boolean mIsNavigationBarTranslucent;
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;

    public KeyboardAnimationCallback(Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction, boolean z10) {
        super(1);
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
        this.mIsNavigationBarTranslucent = z10;
        this.mKeyboard = keyboard;
    }

    private static boolean isKeyboardAnimation(C1514p0 c1514p0) {
        return (c1514p0.c() & CONTENT_TYPE_MASK) != 0;
    }

    @Override // androidx.core.view.C1514p0.b
    public void onEnd(C1514p0 c1514p0) {
        if (isKeyboardAnimation(c1514p0)) {
            this.mKeyboard.onAnimationEnd();
            this.mNotifyAboutKeyboardChange.call();
        }
    }

    @Override // androidx.core.view.C1514p0.b
    public K0 onProgress(K0 k02, List<C1514p0> list) {
        Iterator<C1514p0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (isKeyboardAnimation(it.next())) {
                this.mKeyboard.updateHeight(k02, this.mIsNavigationBarTranslucent);
                this.mNotifyAboutKeyboardChange.call();
                break;
            }
        }
        return k02;
    }

    @Override // androidx.core.view.C1514p0.b
    public C1514p0.a onStart(C1514p0 c1514p0, C1514p0.a aVar) {
        if (!isKeyboardAnimation(c1514p0)) {
            return aVar;
        }
        this.mKeyboard.onAnimationStart();
        this.mNotifyAboutKeyboardChange.call();
        return super.onStart(c1514p0, aVar);
    }
}
