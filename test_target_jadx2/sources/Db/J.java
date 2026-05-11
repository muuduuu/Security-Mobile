package Db;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.types.folly.FollyDynamicExtensionConverter;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final J f1409a = new J();

    public interface a {
        WritableArray a();

        WritableMap b();
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1410a = new b();

        private b() {
        }

        @Override // Db.J.a
        public WritableArray a() {
            WritableArray createArray = Arguments.createArray();
            Intrinsics.checkNotNullExpressionValue(createArray, "createArray(...)");
            return createArray;
        }

        @Override // Db.J.a
        public WritableMap b() {
            WritableMap createMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(createMap, "createMap(...)");
            return createMap;
        }
    }

    private J() {
    }

    public static /* synthetic */ Object b(J j10, Object obj, a aVar, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            aVar = b.f1410a;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return j10.a(obj, aVar, z10);
    }

    public final Object a(Object obj, a containerProvider, boolean z10) {
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        if (obj == null ? true : obj instanceof Unit) {
            return null;
        }
        if (obj instanceof Bundle) {
            return K.k((Bundle) obj, containerProvider);
        }
        if (obj instanceof Object[]) {
            return K.h((Object[]) obj, containerProvider);
        }
        return obj instanceof int[] ? true : obj instanceof float[] ? true : obj instanceof double[] ? true : obj instanceof boolean[] ? true : obj instanceof long[] ? obj : obj instanceof byte[] ? FollyDynamicExtensionConverter.INSTANCE.put(obj) : obj instanceof Map ? z10 ? K.t((Map) obj) : K.l((Map) obj, containerProvider) : obj instanceof Enum ? K.m((Enum) obj) : obj instanceof Ab.c ? K.j((Ab.c) obj, containerProvider) : obj instanceof URI ? K.p((URI) obj) : obj instanceof URL ? K.q((URL) obj) : obj instanceof Uri ? K.n((Uri) obj) : obj instanceof File ? K.o((File) obj) : obj instanceof Pair ? K.d((Pair) obj, containerProvider) : obj instanceof Long ? Double.valueOf(((Number) obj).longValue()) : obj instanceof kotlin.time.a ? Double.valueOf(kotlin.time.a.F(((kotlin.time.a) obj).J(), Id.b.SECONDS)) : obj instanceof Cb.i ? ((Cb.i) obj).c() : obj instanceof Collection ? z10 ? K.r((Collection) obj) : K.c((Collection) obj, containerProvider) : obj;
    }

    public final Object c(Object obj, a containerProvider) {
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        if (obj == null ? true : obj instanceof Unit) {
            return null;
        }
        return obj instanceof Bundle ? K.k((Bundle) obj, containerProvider) : obj instanceof Object[] ? K.h((Object[]) obj, containerProvider) : obj instanceof int[] ? K.g((int[]) obj, containerProvider) : obj instanceof float[] ? K.f((float[]) obj, containerProvider) : obj instanceof double[] ? K.e((double[]) obj, containerProvider) : obj instanceof boolean[] ? K.i((boolean[]) obj, containerProvider) : obj instanceof byte[] ? FollyDynamicExtensionConverter.INSTANCE.put(obj) : obj instanceof Map ? K.l((Map) obj, containerProvider) : obj instanceof Enum ? K.m((Enum) obj) : obj instanceof Ab.c ? K.j((Ab.c) obj, containerProvider) : obj instanceof URI ? K.p((URI) obj) : obj instanceof URL ? K.q((URL) obj) : obj instanceof Uri ? K.n((Uri) obj) : obj instanceof File ? K.o((File) obj) : obj instanceof Pair ? K.d((Pair) obj, containerProvider) : obj instanceof Long ? Double.valueOf(((Number) obj).longValue()) : obj instanceof kotlin.time.a ? Double.valueOf(kotlin.time.a.F(((kotlin.time.a) obj).J(), Id.b.SECONDS)) : obj instanceof Cb.i ? ((Cb.i) obj).c() : obj instanceof Collection ? K.c((Collection) obj, containerProvider) : obj;
    }
}
