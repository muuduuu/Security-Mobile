package Db;

import Db.J;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import vc.AbstractC5011a;
import xc.C5142C;

/* loaded from: classes2.dex */
public abstract class K {
    public static final void a(WritableArray writableArray, Object obj) {
        Intrinsics.checkNotNullParameter(writableArray, "<this>");
        if (obj == null ? true : obj instanceof Unit) {
            writableArray.pushNull();
            return;
        }
        if (obj instanceof ReadableArray) {
            writableArray.pushArray((ReadableArray) obj);
            return;
        }
        if (obj instanceof ReadableMap) {
            writableArray.pushMap((ReadableMap) obj);
            return;
        }
        if (obj instanceof String) {
            writableArray.pushString((String) obj);
            return;
        }
        if (obj instanceof Integer) {
            writableArray.pushInt(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Number) {
            writableArray.pushDouble(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableArray.pushBoolean(((Boolean) obj).booleanValue());
            return;
        }
        throw new IllegalArgumentException("Could not put '" + obj.getClass() + "' to WritableArray");
    }

    public static final void b(WritableMap writableMap, String key, Object obj) {
        Intrinsics.checkNotNullParameter(writableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj == null ? true : obj instanceof Unit) {
            writableMap.putNull(key);
            return;
        }
        if (obj instanceof ReadableArray) {
            writableMap.putArray(key, (ReadableArray) obj);
            return;
        }
        if (obj instanceof ReadableMap) {
            writableMap.putMap(key, (ReadableMap) obj);
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(key, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            writableMap.putInt(key, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Number) {
            writableMap.putDouble(key, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableMap.putBoolean(key, ((Boolean) obj).booleanValue());
            return;
        }
        throw new IllegalArgumentException("Could not put '" + obj.getClass() + "' to WritableMap");
    }

    public static final WritableArray c(Collection collection, J.a containerProvider) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableArray a10 = containerProvider.a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a(a10, J.f1409a.c(it.next(), containerProvider));
        }
        return a10;
    }

    public static final WritableArray d(Pair pair, J.a containerProvider) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableArray a10 = containerProvider.a();
        J j10 = J.f1409a;
        Object c10 = j10.c(pair.c(), containerProvider);
        Object c11 = j10.c(pair.d(), containerProvider);
        a(a10, c10);
        a(a10, c11);
        return a10;
    }

    public static final WritableArray e(double[] dArr, J.a containerProvider) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableArray a10 = containerProvider.a();
        for (double d10 : dArr) {
            a10.pushDouble(d10);
        }
        return a10;
    }

    public static final WritableArray f(float[] fArr, J.a containerProvider) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableArray a10 = containerProvider.a();
        for (float f10 : fArr) {
            a10.pushDouble(f10);
        }
        return a10;
    }

    public static final WritableArray g(int[] iArr, J.a containerProvider) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableArray a10 = containerProvider.a();
        for (int i10 : iArr) {
            a10.pushInt(i10);
        }
        return a10;
    }

    public static final WritableArray h(Object[] objArr, J.a containerProvider) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableArray a10 = containerProvider.a();
        for (Object obj : objArr) {
            a(a10, J.f1409a.c(obj, containerProvider));
        }
        return a10;
    }

    public static final WritableArray i(boolean[] zArr, J.a containerProvider) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableArray a10 = containerProvider.a();
        for (boolean z10 : zArr) {
            a10.pushBoolean(z10);
        }
        return a10;
    }

    public static final WritableMap j(Ab.c cVar, J.a containerProvider) {
        Object obj;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableMap b10 = containerProvider.b();
        Collection<kotlin.reflect.m> d10 = Cc.d.d(AbstractC5011a.e(cVar.getClass()));
        ArrayList arrayList = new ArrayList(CollectionsKt.u(d10, 10));
        for (kotlin.reflect.m mVar : d10) {
            Iterator it = mVar.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Annotation) obj) instanceof Ab.b) {
                    break;
                }
            }
            Ab.b bVar = (Ab.b) obj;
            if (bVar != null) {
                String key = bVar.key();
                String str = Intrinsics.b(key, BuildConfig.FLAVOR) ? null : key;
                if (str == null) {
                    str = mVar.getName();
                }
                Dc.a.b(mVar, true);
                b(b10, str, J.f1409a.c(mVar.get(cVar), containerProvider));
            }
            arrayList.add(Unit.f36324a);
        }
        return b10;
    }

    public static final WritableMap k(Bundle bundle, J.a containerProvider) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableMap b10 = containerProvider.b();
        for (String str : bundle.keySet()) {
            Object c10 = J.f1409a.c(bundle.get(str), containerProvider);
            Intrinsics.d(str);
            b(b10, str, c10);
        }
        return b10;
    }

    public static final WritableMap l(Map map, J.a containerProvider) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableMap b10 = containerProvider.b();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            b(b10, String.valueOf(key), J.f1409a.c(entry.getValue(), containerProvider));
        }
        return b10;
    }

    public static final Object m(Enum r42) {
        Object obj;
        Intrinsics.checkNotNullParameter(r42, "<this>");
        kotlin.reflect.g e10 = Cc.d.e(C5142C.b(r42.getClass()));
        if (e10 == null) {
            throw new IllegalArgumentException("Cannot convert enum without the primary constructor to js value");
        }
        if (e10.c().isEmpty()) {
            return r42.name();
        }
        if (e10.c().size() != 1) {
            throw new IllegalStateException("Enum '" + r42.getClass() + "' cannot be used as return type (incompatible with JS)");
        }
        String name = ((kotlin.reflect.j) CollectionsKt.d0(e10.c())).getName();
        Intrinsics.d(name);
        Iterator it = Cc.d.c(C5142C.b(r42.getClass())).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.b(((kotlin.reflect.m) obj).getName(), name)) {
                break;
            }
        }
        Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Enum<*>, *>");
        return ((kotlin.reflect.m) obj).get(r42);
    }

    public static final String n(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return uri2;
    }

    public static final String o(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    public static final String p(URI uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return uri2;
    }

    public static final String q(URL url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        String url2 = url.toString();
        Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
        return url2;
    }

    public static final Collection r(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(J.b(J.f1409a, it.next(), null, true, 2, null));
        }
        return arrayList;
    }

    public static final Map s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            Object b10 = J.b(J.f1409a, bundle.get(str), null, true, 2, null);
            Intrinsics.d(str);
            linkedHashMap.put(str, b10);
        }
        return linkedHashMap;
    }

    public static final Map t(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(lc.t.a(String.valueOf(entry.getKey()), J.b(J.f1409a, entry.getValue(), null, true, 2, null)));
        }
        return kotlin.collections.G.r(arrayList);
    }
}
