package Db;

import android.net.Uri;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import xc.C5142C;

/* renamed from: Db.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0794c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0794c f1454a = new C0794c();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f1455b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1456c;

    static {
        Map c10 = kotlin.collections.G.c();
        for (kotlin.reflect.d dVar : CollectionsKt.m(C5142C.b(Integer.TYPE), C5142C.b(Float.TYPE), C5142C.b(Double.TYPE), C5142C.b(Long.TYPE), C5142C.b(Boolean.TYPE), C5142C.b(String.class), C5142C.b(byte[].class), C5142C.b(long[].class), C5142C.b(int[].class), C5142C.b(boolean[].class), C5142C.b(float[].class), C5142C.b(double[].class), C5142C.b(JavaScriptValue.class), C5142C.b(JavaScriptObject.class), C5142C.b(Cb.j.class), C5142C.b(Cb.h.class), C5142C.b(Cb.f.class), C5142C.b(Cb.g.class), C5142C.b(Cb.n.class), C5142C.b(Cb.o.class), C5142C.b(Cb.l.class), C5142C.b(Cb.m.class), C5142C.b(Cb.c.class), C5142C.b(Cb.d.class), C5142C.b(Cb.a.class), C5142C.b(Cb.b.class), C5142C.b(ReadableArray.class), C5142C.b(ReadableMap.class), C5142C.b(URL.class), C5142C.b(Uri.class), C5142C.b(URI.class), C5142C.b(File.class), C5142C.b(Object.class), C5142C.b(Unit.class), C5142C.b(Ca.b.class))) {
            c10.put(lc.t.a(dVar, Boolean.FALSE), new C0792a(new A(dVar, false)));
            c10.put(lc.t.a(dVar, Boolean.TRUE), new C0792a(new A(dVar, true)));
        }
        f1455b = kotlin.collections.G.b(c10);
        f1456c = 8;
    }

    private C0794c() {
    }

    public final Map a() {
        return f1455b;
    }
}
