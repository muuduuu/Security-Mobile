package com.swmansion.reanimated.keyboard;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1512o0;
import androidx.core.view.I;
import androidx.core.view.K0;
import com.facebook.react.bridge.ReactApplicationContext;
import g.AbstractC3175f;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class WindowsInsetsManager {
    private final Keyboard mKeyboard;
    private final NotifyAboutKeyboardChangeFunction mNotifyAboutKeyboardChange;
    private final WeakReference<ReactApplicationContext> mReactContext;
    private boolean mIsStatusBarTranslucent = false;
    private boolean mIsNavigationBarTranslucent = false;
    private final String MissingContextErrorMsg = "Unable to get reference to react activity";

    public WindowsInsetsManager(WeakReference<ReactApplicationContext> weakReference, Keyboard keyboard, NotifyAboutKeyboardChangeFunction notifyAboutKeyboardChangeFunction) {
        this.mReactContext = weakReference;
        this.mKeyboard = keyboard;
        this.mNotifyAboutKeyboardChange = notifyAboutKeyboardChangeFunction;
    }

    private Activity getCurrentActivity() {
        return this.mReactContext.get().getCurrentActivity();
    }

    private FrameLayout.LayoutParams getLayoutParams(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.mIsStatusBarTranslucent) {
            i10 = 0;
        }
        if (this.mIsNavigationBarTranslucent) {
            i11 = 0;
        }
        layoutParams.setMargins(0, i10, 0, i11);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateInsets$1(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = getLayoutParams(i10, i11);
        int i12 = AbstractC3175f.f33179d;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
        } else {
            currentActivity.getWindow().getDecorView().findViewById(i12).setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateWindowDecor$0(boolean z10) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
        } else {
            AbstractC1512o0.b(currentActivity.getWindow(), z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K0 onApplyWindowInsetsListener(View view, K0 k02) {
        K0 c02 = AbstractC1484a0.c0(view, k02);
        if (this.mKeyboard.getState() == KeyboardState.OPEN) {
            this.mKeyboard.updateHeight(k02, this.mIsNavigationBarTranslucent);
            this.mNotifyAboutKeyboardChange.call();
        }
        setWindowInsets(c02);
        return c02;
    }

    private void setWindowInsets(K0 k02) {
        int g10 = K0.m.g();
        updateInsets(k02.f(g10).f15925b, k02.f(g10).f15927d);
    }

    private void updateInsets(final int i10, final int i11) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.swmansion.reanimated.keyboard.d
            @Override // java.lang.Runnable
            public final void run() {
                WindowsInsetsManager.this.lambda$updateInsets$1(i10, i11);
            }
        });
    }

    private void updateWindowDecor(final boolean z10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.swmansion.reanimated.keyboard.c
            @Override // java.lang.Runnable
            public final void run() {
                WindowsInsetsManager.this.lambda$updateWindowDecor$0(z10);
            }
        });
    }

    public void startObservingChanges(KeyboardAnimationCallback keyboardAnimationCallback, boolean z10, boolean z11) {
        this.mIsStatusBarTranslucent = z10;
        this.mIsNavigationBarTranslucent = z11;
        updateWindowDecor(false);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        AbstractC1484a0.F0(decorView, new I() { // from class: com.swmansion.reanimated.keyboard.b
            @Override // androidx.core.view.I
            public final K0 p(View view, K0 k02) {
                K0 onApplyWindowInsetsListener;
                onApplyWindowInsetsListener = WindowsInsetsManager.this.onApplyWindowInsetsListener(view, k02);
                return onApplyWindowInsetsListener;
            }
        });
        AbstractC1484a0.N0(decorView, keyboardAnimationCallback);
    }

    public void stopObservingChanges() {
        updateWindowDecor((this.mIsStatusBarTranslucent || this.mIsNavigationBarTranslucent) ? false : true);
        updateInsets(0, 0);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.e("Reanimated", "Unable to get reference to react activity");
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        AbstractC1484a0.N0(decorView, null);
        AbstractC1484a0.F0(decorView, null);
    }
}
