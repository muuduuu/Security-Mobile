package R4;

import Td.B;
import Td.C1228d;
import Td.D;
import Td.v;
import X3.b;
import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.X;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.modules.network.i;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends X3.b {

    /* renamed from: f, reason: collision with root package name */
    private static final a f8453f = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private final B f8454e;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(B okHttpClient) {
        super(okHttpClient);
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f8454e = okHttpClient;
    }

    private final Map n(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            String string = readableMap.getString(nextKey);
            if (string != null) {
                hashMap.put(nextKey, string);
            }
        }
        return hashMap;
    }

    @Override // X3.b, com.facebook.imagepipeline.producers.X
    /* renamed from: i */
    public void d(b.C0218b fetchState, X.a callback) {
        Map map;
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fetchState.f11742f = SystemClock.elapsedRealtime();
        Uri g10 = fetchState.g();
        Intrinsics.checkNotNullExpressionValue(g10, "getUri(...)");
        if (fetchState.b().c() instanceof R4.a) {
            m4.b c10 = fetchState.b().c();
            Intrinsics.e(c10, "null cannot be cast to non-null type com.facebook.react.modules.fresco.ReactNetworkImageRequest");
            map = n(((R4.a) c10).A());
        } else {
            map = null;
        }
        v b10 = i.b(map);
        D.a c11 = new D.a().c(new C1228d.a().m().a());
        String uri = g10.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        D.a x10 = c11.x(uri);
        Intrinsics.d(b10);
        j(fetchState, callback, x10.m(b10).e().b());
    }
}
