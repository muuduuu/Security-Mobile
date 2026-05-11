package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import k1.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: f, reason: collision with root package name */
    public static final a f17039f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Class[] f17040g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    private final Map f17041a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f17042b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f17043c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f17044d;

    /* renamed from: e, reason: collision with root package name */
    private final d.c f17045e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final G a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new G();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new G(hashMap);
            }
            ClassLoader classLoader = G.class.getClassLoader();
            Intrinsics.d(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new G(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : G.f17040g) {
                Intrinsics.d(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public G(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f17041a = linkedHashMap;
        this.f17042b = new LinkedHashMap();
        this.f17043c = new LinkedHashMap();
        this.f17044d = new LinkedHashMap();
        this.f17045e = new d.c() { // from class: androidx.lifecycle.F
            @Override // k1.d.c
            public final Bundle a() {
                Bundle d10;
                d10 = G.d(G.this);
                return d10;
            }
        };
        linkedHashMap.putAll(initialState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(G this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (Map.Entry entry : kotlin.collections.G.t(this$0.f17042b).entrySet()) {
            this$0.e((String) entry.getKey(), ((d.c) entry.getValue()).a());
        }
        Set<String> keySet = this$0.f17041a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f17041a.get(str));
        }
        return androidx.core.os.c.b(lc.t.a("keys", arrayList), lc.t.a("values", arrayList2));
    }

    public final d.c c() {
        return this.f17045e;
    }

    public final void e(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!f17039f.b(obj)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't put value with type ");
            Intrinsics.d(obj);
            sb2.append(obj.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        Object obj2 = this.f17043c.get(key);
        C1607y c1607y = obj2 instanceof C1607y ? (C1607y) obj2 : null;
        if (c1607y != null) {
            c1607y.o(obj);
        } else {
            this.f17041a.put(key, obj);
        }
        Md.s sVar = (Md.s) this.f17044d.get(key);
        if (sVar == null) {
            return;
        }
        sVar.setValue(obj);
    }

    public G() {
        this.f17041a = new LinkedHashMap();
        this.f17042b = new LinkedHashMap();
        this.f17043c = new LinkedHashMap();
        this.f17044d = new LinkedHashMap();
        this.f17045e = new d.c() { // from class: androidx.lifecycle.F
            @Override // k1.d.c
            public final Bundle a() {
                Bundle d10;
                d10 = G.d(G.this);
                return d10;
            }
        };
    }
}
