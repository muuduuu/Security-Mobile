package xb;

import expo.modules.kotlin.views.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yb.AbstractC5184b;

/* loaded from: classes2.dex */
public final class b extends AbstractC5184b {

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC5139a f44943i;

    /* renamed from: j, reason: collision with root package name */
    private String f44944j;

    /* renamed from: k, reason: collision with root package name */
    private o f44945k;

    /* renamed from: m, reason: collision with root package name */
    private Function2 f44947m;

    /* renamed from: l, reason: collision with root package name */
    private final Map f44946l = new LinkedHashMap();

    /* renamed from: n, reason: collision with root package name */
    private List f44948n = new ArrayList();

    public b(AbstractC5139a abstractC5139a) {
        this.f44943i = abstractC5139a;
    }

    public final void o(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f44944j = name;
    }

    public final void p(Function2 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f44947m = body;
    }

    public final c q() {
        String str = this.f44944j;
        if (str == null) {
            AbstractC5139a abstractC5139a = this.f44943i;
            str = abstractC5139a != null ? abstractC5139a.getClass().getSimpleName() : null;
        }
        String str2 = str;
        if (str2 != null) {
            return new c(str2, j(), this.f44945k, this.f44946l, this.f44947m, this.f44948n);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final List r() {
        return this.f44948n;
    }

    public final Map s() {
        return this.f44946l;
    }

    public final o t() {
        return this.f44945k;
    }

    public final void u(o oVar) {
        this.f44945k = oVar;
    }
}
