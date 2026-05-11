package y4;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import s5.C4313a;

/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5173a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5173a f45307a = new C5173a();

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f45308b;

    private C5173a() {
    }

    public static final void a() {
        if (f45308b) {
            return;
        }
        f45308b = true;
        C4313a.c(0L, "ReadableMapBufferSoLoader.staticInit::load:mapbufferjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_START);
        SoLoader.t("mapbufferjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_END);
        C4313a.i(0L);
    }
}
