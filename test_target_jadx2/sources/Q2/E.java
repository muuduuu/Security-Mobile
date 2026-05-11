package Q2;

import android.content.Context;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.C3877e;
import pe.b0;

/* loaded from: classes.dex */
public final class E implements A {

    /* renamed from: a, reason: collision with root package name */
    private final HttpTransaction f8076a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8077b;

    public E(HttpTransaction transaction, boolean z10) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f8076a = transaction;
        this.f8077b = z10;
    }

    @Override // Q2.A
    public b0 a(Context context) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(context, "context");
        C3877e c3877e = new C3877e();
        c3877e.T0(context.getString(K2.g.f5220V) + ": " + this.f8076a.getFormattedUrl(this.f8077b) + '\n');
        c3877e.T0(context.getString(K2.g.f5241t) + ": " + ((Object) this.f8076a.getMethod()) + '\n');
        c3877e.T0(context.getString(K2.g.f5245x) + ": " + ((Object) this.f8076a.getProtocol()) + '\n');
        c3877e.T0(context.getString(K2.g.f5215Q) + ": " + this.f8076a.getStatus() + '\n');
        c3877e.T0(context.getString(K2.g.f5202D) + ": " + ((Object) this.f8076a.getResponseSummaryText()) + '\n');
        c3877e.T0(context.getString(K2.g.f5214P) + ": " + context.getString(this.f8076a.isSsl() ? K2.g.f5221W : K2.g.f5243v) + '\n');
        c3877e.T0("\n");
        c3877e.T0(context.getString(K2.g.f5201C) + ": " + ((Object) this.f8076a.getRequestDateString()) + '\n');
        c3877e.T0(context.getString(K2.g.f5205G) + ": " + ((Object) this.f8076a.getResponseDateString()) + '\n');
        c3877e.T0(context.getString(K2.g.f5230i) + ": " + ((Object) this.f8076a.getDurationString()) + '\n');
        c3877e.T0("\n");
        c3877e.T0(context.getString(K2.g.f5200B) + ": " + this.f8076a.getRequestSizeString() + '\n');
        c3877e.T0(context.getString(K2.g.f5204F) + ": " + ((Object) this.f8076a.getResponseSizeString()) + '\n');
        c3877e.T0(context.getString(K2.g.f5219U) + ": " + this.f8076a.getTotalSizeString() + '\n');
        c3877e.T0("\n");
        c3877e.T0("---------- " + context.getString(K2.g.f5246y) + " ----------\n\n");
        j jVar = j.f8092a;
        String b10 = jVar.b(this.f8076a.getParsedRequestHeaders(), false);
        if (!StringsKt.Z(b10)) {
            c3877e.T0(b10);
            c3877e.T0("\n");
        }
        if (this.f8076a.getIsRequestBodyPlainText()) {
            String requestBody = this.f8076a.getRequestBody();
            string = (requestBody == null || StringsKt.Z(requestBody)) ? context.getString(K2.g.f5223b) : this.f8076a.getFormattedRequestBody();
        } else {
            string = context.getString(K2.g.f5224c);
        }
        c3877e.T0(string);
        c3877e.T0("\n\n");
        c3877e.T0("---------- " + context.getString(K2.g.f5202D) + " ----------\n\n");
        String b11 = jVar.b(this.f8076a.getParsedResponseHeaders(), false);
        if (!StringsKt.Z(b11)) {
            c3877e.T0(b11);
            c3877e.T0("\n");
        }
        if (this.f8076a.getIsResponseBodyPlainText()) {
            String responseBody = this.f8076a.getResponseBody();
            string2 = (responseBody == null || StringsKt.Z(responseBody)) ? context.getString(K2.g.f5223b) : this.f8076a.getFormattedResponseBody();
        } else {
            string2 = context.getString(K2.g.f5224c);
        }
        c3877e.T0(string2);
        return c3877e;
    }
}
