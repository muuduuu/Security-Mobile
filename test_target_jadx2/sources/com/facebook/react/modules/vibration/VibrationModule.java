package com.facebook.react.modules.vibration;

import K4.a;
import U4.d;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.facebook.fbreact.specs.NativeVibrationSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@a(name = NativeVibrationSpec.NAME)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/modules/vibration/VibrationModule;", "Lcom/facebook/fbreact/specs/NativeVibrationSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "cancel", BuildConfig.FLAVOR, "getVibrator", "Landroid/os/Vibrator;", "vibrate", "durationDouble", BuildConfig.FLAVOR, "vibrateByPattern", "pattern", "Lcom/facebook/react/bridge/ReadableArray;", "repeatDouble", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VibrationModule extends NativeVibrationSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibrationModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    private final Vibrator getVibrator() {
        Vibrator defaultVibrator;
        if (Build.VERSION.SDK_INT < 31) {
            return (Vibrator) getReactApplicationContext().getSystemService("vibrator");
        }
        VibratorManager a10 = d.a(getReactApplicationContext().getSystemService("vibrator_manager"));
        if (a10 == null) {
            return null;
        }
        defaultVibrator = a10.getDefaultVibrator();
        return defaultVibrator;
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void cancel() {
        Vibrator vibrator = getVibrator();
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void vibrate(double durationDouble) {
        VibrationEffect createOneShot;
        int i10 = (int) durationDouble;
        Vibrator vibrator = getVibrator();
        if (vibrator == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            vibrator.vibrate(i10);
        } else {
            createOneShot = VibrationEffect.createOneShot(i10, -1);
            vibrator.vibrate(createOneShot);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void vibrateByPattern(ReadableArray pattern, double repeatDouble) {
        VibrationEffect createWaveform;
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        int i10 = (int) repeatDouble;
        Vibrator vibrator = getVibrator();
        if (vibrator == null) {
            return;
        }
        long[] jArr = new long[pattern.size()];
        int size = pattern.size();
        for (int i11 = 0; i11 < size; i11++) {
            jArr[i11] = pattern.getInt(i11);
        }
        if (Build.VERSION.SDK_INT < 26) {
            vibrator.vibrate(jArr, i10);
        } else {
            createWaveform = VibrationEffect.createWaveform(jArr, i10);
            vibrator.vibrate(createWaveform);
        }
    }
}
