package expo.modules.fetch;

import Na.f;
import Td.B;
import Td.D;
import Td.E;
import Td.InterfaceC1229e;
import Td.o;
import Td.v;
import Td.z;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import pb.C3862a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lexpo/modules/fetch/NativeRequest;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Lpb/a;", "appContext", "Lexpo/modules/fetch/NativeResponse;", Keys.RESPONSE, "<init>", "(Lpb/a;Lexpo/modules/fetch/NativeResponse;)V", "LTd/B;", "client", "Ljava/net/URL;", "url", "Lexpo/modules/fetch/NativeRequestInit;", "requestInit", BuildConfig.FLAVOR, "requestBody", BuildConfig.FLAVOR, "u", "(LTd/B;Ljava/net/URL;Lexpo/modules/fetch/NativeRequestInit;[B)V", "s", "()V", "c", "Lexpo/modules/fetch/NativeResponse;", "t", "()Lexpo/modules/fetch/NativeResponse;", "Lexpo/modules/fetch/b;", "d", "Lexpo/modules/fetch/b;", "requestHolder", "LTd/e;", "e", "LTd/e;", "task", "expo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NativeRequest extends SharedObject {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final NativeResponse response;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b requestHolder;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1229e task;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeRequest(C3862a appContext, NativeResponse response) {
        super(appContext);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(response, "response");
        this.response = response;
        this.requestHolder = new b(null);
    }

    public final void s() {
        InterfaceC1229e interfaceC1229e = this.task;
        if (interfaceC1229e == null) {
            return;
        }
        interfaceC1229e.cancel();
        this.response.C();
    }

    /* renamed from: t, reason: from getter */
    public final NativeResponse getResponse() {
        return this.response;
    }

    public final void u(B client, URL url, NativeRequestInit requestInit, byte[] requestBody) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestInit, "requestInit");
        if (requestInit.getCredentials() != NativeRequestCredentials.INCLUDE) {
            client = client.A().j(o.f10187b).c();
        }
        v a10 = f.a(requestInit.getHeaders());
        String c10 = a10.c("Content-Type");
        D b10 = new D.a().m(a10).n(requestInit.getMethod(), requestBody != null ? E.a.r(E.Companion, requestBody, c10 != null ? z.f10239e.b(c10) : null, 0, 0, 6, null) : null).y(a.f32660b.a(url)).b();
        this.requestHolder.a(b10);
        InterfaceC1229e a11 = client.a(b10);
        this.task = a11;
        if (a11 != null) {
            a11.g1(this.response);
        }
        this.response.i0();
    }
}
