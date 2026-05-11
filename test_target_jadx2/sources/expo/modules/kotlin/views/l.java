package expo.modules.kotlin.views;

import com.facebook.react.bridge.ReadableMapKeySetIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l implements ReadableMapKeySetIterator {

    /* renamed from: a, reason: collision with root package name */
    private final ReadableMapKeySetIterator f32741a;

    /* renamed from: b, reason: collision with root package name */
    private final pb.f f32742b;

    /* renamed from: c, reason: collision with root package name */
    private String f32743c;

    public l(ReadableMapKeySetIterator iterator, pb.f filter) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f32741a = iterator;
        this.f32742b = filter;
        a();
    }

    private final void a() {
        while (this.f32741a.hasNextKey()) {
            String nextKey = this.f32741a.nextKey();
            this.f32743c = nextKey;
            if (this.f32742b.apply(nextKey)) {
                return;
            }
        }
        this.f32743c = null;
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    public boolean hasNextKey() {
        return this.f32743c != null;
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    public String nextKey() {
        String str = this.f32743c;
        Intrinsics.d(str);
        a();
        return str;
    }
}
