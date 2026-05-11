package O4;

import com.facebook.react.bridge.WritableArray;

/* loaded from: classes.dex */
public interface d {
    void callIdleCallbacks(double d10);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}
