package p9;

import android.os.Build;
import java.security.Security;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import n9.C3717a;
import org.conscrypt.Conscrypt;

/* renamed from: p9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3854a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3854a f38488a = new C3854a();

    private C3854a() {
    }

    public final Pair a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        try {
            Security.insertProviderAt(Conscrypt.newProvider(), 1);
            X509TrustManager defaultX509TrustManager = Conscrypt.getDefaultX509TrustManager();
            SSLContext sSLContext = SSLContext.getInstance("TLS", "Conscrypt");
            Intrinsics.d(defaultX509TrustManager);
            sSLContext.init(null, new TrustManager[]{defaultX509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return new Pair(new C3717a(socketFactory), defaultX509TrustManager);
        } catch (Exception unused) {
            return null;
        }
    }

    public final List b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(CollectionsKt.Q0(list));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }
}
