package expo.modules.kotlin.views;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k implements ReadableMap {

    /* renamed from: a, reason: collision with root package name */
    private final ReadableMap f32738a;

    /* renamed from: b, reason: collision with root package name */
    private final List f32739b;

    /* renamed from: c, reason: collision with root package name */
    private final pb.g f32740c;

    public k(ReadableMap backingMap, List filteredKeys) {
        Intrinsics.checkNotNullParameter(backingMap, "backingMap");
        Intrinsics.checkNotNullParameter(filteredKeys, "filteredKeys");
        this.f32738a = backingMap;
        this.f32739b = filteredKeys;
        this.f32740c = new pb.g(backingMap.getEntryIterator(), new pb.f() { // from class: expo.modules.kotlin.views.j
            @Override // pb.f
            public final boolean apply(Object obj) {
                boolean c10;
                c10 = k.c(k.this, (Map.Entry) obj);
                return c10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(k this$0, Map.Entry it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return !this$0.f32739b.contains(it.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(k this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return !this$0.f32739b.contains(it);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public pb.g getEntryIterator() {
        return this.f32740c;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableArray getArray(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f32738a.getArray(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f32738a.getBoolean(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f32738a.getDouble(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Dynamic getDynamic(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f32738a.getDynamic(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f32738a.getInt(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public long getLong(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f32738a.getLong(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMap getMap(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f32738a.getMap(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public String getString(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f32738a.getString(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableType getType(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f32738a.getType(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f32738a.hasKey(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f32738a.isNull(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        return new l(this.f32738a.keySetIterator(), new pb.f() { // from class: expo.modules.kotlin.views.i
            @Override // pb.f
            public final boolean apply(Object obj) {
                boolean e10;
                e10 = k.e(k.this, (String) obj);
                return e10;
            }
        });
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public HashMap toHashMap() {
        return this.f32738a.toHashMap();
    }
}
