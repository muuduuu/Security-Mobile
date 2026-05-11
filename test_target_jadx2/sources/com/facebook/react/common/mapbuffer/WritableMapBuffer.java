package com.facebook.react.common.mapbuffer;

import android.util.SparseArray;
import com.facebook.react.common.mapbuffer.a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import y4.C5173a;
import yc.InterfaceC5191a;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002#)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/facebook/react/common/mapbuffer/WritableMapBuffer;", "Lcom/facebook/react/common/mapbuffer/a;", "<init>", "()V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "key", "Lcom/facebook/react/common/mapbuffer/a$b;", "h", "(Ljava/lang/Object;I)Lcom/facebook/react/common/mapbuffer/a$b;", BuildConfig.FLAVOR, "getKeys", "()[I", BuildConfig.FLAVOR, "getValues", "()[Ljava/lang/Object;", BuildConfig.FLAVOR, "C", "(I)Z", "getBoolean", "getInt", "(I)I", BuildConfig.FLAVOR, "getDouble", "(I)D", BuildConfig.FLAVOR, "getString", "(I)Ljava/lang/String;", "x1", "(I)Lcom/facebook/react/common/mapbuffer/a;", BuildConfig.FLAVOR, "Lcom/facebook/react/common/mapbuffer/a$c;", "iterator", "()Ljava/util/Iterator;", "Landroid/util/SparseArray;", C4870a.f43493a, "Landroid/util/SparseArray;", "values", "getCount", "()I", "count", "b", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WritableMapBuffer implements com.facebook.react.common.mapbuffer.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f21414b = new a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SparseArray values = new SparseArray();

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b implements a.c {

        /* renamed from: a, reason: collision with root package name */
        private final int f21416a;

        /* renamed from: b, reason: collision with root package name */
        private final int f21417b;

        /* renamed from: c, reason: collision with root package name */
        private final a.b f21418c;

        public b(int i10) {
            this.f21416a = i10;
            this.f21417b = WritableMapBuffer.this.values.keyAt(i10);
            Object valueAt = WritableMapBuffer.this.values.valueAt(i10);
            Intrinsics.checkNotNullExpressionValue(valueAt, "valueAt(...)");
            this.f21418c = WritableMapBuffer.this.h(valueAt, getKey());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public long a() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.values.valueAt(this.f21416a);
            if (valueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (valueAt instanceof Long) {
                return ((Number) valueAt).longValue();
            }
            throw new IllegalStateException(("Expected " + Long.class + " for key: " + key + ", found " + valueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public double b() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.values.valueAt(this.f21416a);
            if (valueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (valueAt instanceof Double) {
                return ((Number) valueAt).doubleValue();
            }
            throw new IllegalStateException(("Expected " + Double.class + " for key: " + key + ", found " + valueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public String c() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.values.valueAt(this.f21416a);
            if (valueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (valueAt instanceof String) {
                return (String) valueAt;
            }
            throw new IllegalStateException(("Expected " + String.class + " for key: " + key + ", found " + valueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int d() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.values.valueAt(this.f21416a);
            if (valueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (valueAt instanceof Integer) {
                return ((Number) valueAt).intValue();
            }
            throw new IllegalStateException(("Expected " + Integer.class + " for key: " + key + ", found " + valueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public com.facebook.react.common.mapbuffer.a e() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.values.valueAt(this.f21416a);
            if (valueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (valueAt instanceof com.facebook.react.common.mapbuffer.a) {
                return (com.facebook.react.common.mapbuffer.a) valueAt;
            }
            throw new IllegalStateException(("Expected " + com.facebook.react.common.mapbuffer.a.class + " for key: " + key + ", found " + valueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public boolean f() {
            int key = getKey();
            Object valueAt = WritableMapBuffer.this.values.valueAt(this.f21416a);
            if (valueAt == null) {
                throw new IllegalArgumentException(("Key not found: " + key).toString());
            }
            if (valueAt instanceof Boolean) {
                return ((Boolean) valueAt).booleanValue();
            }
            throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + key + ", found " + valueAt.getClass() + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public int getKey() {
            return this.f21417b;
        }

        @Override // com.facebook.react.common.mapbuffer.a.c
        public a.b getType() {
            return this.f21418c;
        }
    }

    public static final class c implements Iterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private int f21420a;

        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a.c next() {
            WritableMapBuffer writableMapBuffer = WritableMapBuffer.this;
            int i10 = this.f21420a;
            this.f21420a = i10 + 1;
            return writableMapBuffer.new b(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21420a < WritableMapBuffer.this.values.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    static {
        C5173a.a();
    }

    private final int[] getKeys() {
        int size = this.values.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.values.keyAt(i10);
        }
        return iArr;
    }

    private final Object[] getValues() {
        int size = this.values.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            Object valueAt = this.values.valueAt(i10);
            Intrinsics.checkNotNullExpressionValue(valueAt, "valueAt(...)");
            objArr[i10] = valueAt;
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.b h(Object obj, int i10) {
        if (obj instanceof Boolean) {
            return a.b.BOOL;
        }
        if (obj instanceof Integer) {
            return a.b.INT;
        }
        if (obj instanceof Long) {
            return a.b.LONG;
        }
        if (obj instanceof Double) {
            return a.b.DOUBLE;
        }
        if (obj instanceof String) {
            return a.b.STRING;
        }
        if (obj instanceof com.facebook.react.common.mapbuffer.a) {
            return a.b.MAP;
        }
        throw new IllegalStateException("Key " + i10 + " has value of unknown type: " + obj.getClass());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean C(int key) {
        return this.values.get(key) != null;
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public boolean getBoolean(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new IllegalStateException(("Expected " + Boolean.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getCount() {
        return this.values.size();
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public double getDouble(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof Double) {
            return ((Number) obj).doubleValue();
        }
        throw new IllegalStateException(("Expected " + Double.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public int getInt(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        throw new IllegalStateException(("Expected " + Integer.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public String getString(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalStateException(("Expected " + String.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new c();
    }

    @Override // com.facebook.react.common.mapbuffer.a
    public com.facebook.react.common.mapbuffer.a x1(int key) {
        Object obj = this.values.get(key);
        if (obj == null) {
            throw new IllegalArgumentException(("Key not found: " + key).toString());
        }
        if (obj instanceof com.facebook.react.common.mapbuffer.a) {
            return (com.facebook.react.common.mapbuffer.a) obj;
        }
        throw new IllegalStateException(("Expected " + com.facebook.react.common.mapbuffer.a.class + " for key: " + key + ", found " + obj.getClass() + " instead.").toString());
    }
}
