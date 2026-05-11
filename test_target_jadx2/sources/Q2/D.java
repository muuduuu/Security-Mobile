package Q2;

import android.content.Context;
import com.chuckerteam.chucker.internal.data.entity.HttpHeader;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.C3877e;
import pe.b0;

/* loaded from: classes.dex */
public final class D implements A {

    /* renamed from: a, reason: collision with root package name */
    private final HttpTransaction f8075a;

    public D(HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f8075a = transaction;
    }

    @Override // Q2.A
    public b0 a(Context context) {
        boolean z10;
        Intrinsics.checkNotNullParameter(context, "context");
        C3877e c3877e = new C3877e();
        c3877e.T0(Intrinsics.m("curl -X ", this.f8075a.getMethod()));
        List<HttpHeader> parsedRequestHeaders = this.f8075a.getParsedRequestHeaders();
        if (parsedRequestHeaders == null) {
            z10 = false;
        } else {
            z10 = false;
            for (HttpHeader httpHeader : parsedRequestHeaders) {
                if (StringsKt.r("Accept-Encoding", httpHeader.getName(), true) && StringsKt.r("gzip", httpHeader.getValue(), true)) {
                    z10 = true;
                }
                c3877e.T0(" -H \"" + httpHeader.getName() + ": " + httpHeader.getValue() + '\"');
            }
        }
        String requestBody = this.f8075a.getRequestBody();
        if (requestBody != null && requestBody.length() != 0) {
            c3877e.T0(" --data $'" + StringsKt.z(requestBody, "\n", "\\n", false, 4, null) + '\'');
        }
        c3877e.T0(Intrinsics.m(z10 ? " --compressed " : " ", this.f8075a.getFormattedUrl(false)));
        return c3877e;
    }
}
