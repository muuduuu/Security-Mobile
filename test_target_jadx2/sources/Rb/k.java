package rb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f40591a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f40592b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f40593c;

    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            return k.this.j();
        }
    }

    public k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("expo.modules.kotlin.PersistentDataManager", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f40591a = sharedPreferences;
        this.f40592b = new Bundle();
        this.f40593c = lc.i.a(new a());
    }

    private final Bundle g() {
        return (Bundle) this.f40593c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        r1 = rb.l.d(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle j() {
        Bundle d10;
        Bundle bundle = new Bundle();
        if (this.f40591a.getLong("expire", 0L) > new Date().getTime() && (r1 = this.f40591a.getString("bundle", null)) != null && d10 != null) {
            bundle = d10;
        }
        this.f40591a.edit().clear().apply();
        return bundle;
    }

    public final k b(String key, Bundle value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f40592b.putBundle(key, value);
        return this;
    }

    public final k c(String key, Serializable value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f40592b.putSerializable(key, value);
        return this;
    }

    public final k d(String key, ArrayList value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f40592b.putStringArrayList(key, value);
        return this;
    }

    public final k e(String key, Map value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Bundle bundle = this.f40592b;
        Pair[] pairArr = (Pair[]) G.x(value).toArray(new Pair[0]);
        bundle.putBundle(key, androidx.core.os.c.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return this;
    }

    public final k f(String key, Map value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Bundle bundle = this.f40592b;
        Pair[] pairArr = (Pair[]) G.x(value).toArray(new Pair[0]);
        bundle.putBundle(key, androidx.core.os.c.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return this;
    }

    public final void h() {
        String c10;
        SharedPreferences.Editor edit = this.f40591a.edit();
        c10 = l.c(this.f40592b);
        edit.putString("bundle", c10);
        edit.putLong("expire", new Date().getTime() + 300000);
        edit.commit();
    }

    public final Bundle i(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return g().getBundle(key);
    }

    public final Serializable k(String key) {
        Serializable serializable;
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle g10 = g();
        if (Build.VERSION.SDK_INT < 33) {
            return g10.getSerializable(key);
        }
        serializable = g10.getSerializable(key, Serializable.class);
        return serializable;
    }

    public final ArrayList l(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return g().getStringArrayList(key);
    }

    public final Map m(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle = g().getBundle(key);
        if (bundle == null) {
            return null;
        }
        Set<String> keySet = bundle.keySet();
        Intrinsics.d(keySet);
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(G.d(CollectionsKt.u(keySet, 10)), 16));
        for (Object obj : keySet) {
            linkedHashMap.put(obj, Integer.valueOf(bundle.getInt((String) obj)));
        }
        return linkedHashMap;
    }

    public final Map n(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle = g().getBundle(key);
        if (bundle == null) {
            return null;
        }
        Set<String> keySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "keySet(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(G.d(CollectionsKt.u(keySet, 10)), 16));
        for (Object obj : keySet) {
            String str = (String) obj;
            Serializable serializable = Build.VERSION.SDK_INT >= 33 ? bundle.getSerializable(str, Serializable.class) : bundle.getSerializable(str);
            if (serializable == null) {
                throw new IllegalStateException("For a key '" + str + "' there should be a serializable class available");
            }
            linkedHashMap.put(obj, serializable);
        }
        return linkedHashMap;
    }
}
