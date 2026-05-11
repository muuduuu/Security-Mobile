package r3;

import Z2.i;
import android.content.Context;
import b3.o;
import b4.k;
import java.util.Set;
import u3.AbstractC4864a;

/* loaded from: classes.dex */
public class f implements o {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39230a;

    /* renamed from: b, reason: collision with root package name */
    private final k f39231b;

    /* renamed from: c, reason: collision with root package name */
    private final g f39232c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f39233d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f39234e;

    public f(Context context, b bVar) {
        this(context, b4.o.n(), bVar);
    }

    @Override // b3.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e get() {
        return new e(this.f39230a, this.f39232c, this.f39231b, this.f39233d, this.f39234e).K(null);
    }

    public f(Context context, b4.o oVar, b bVar) {
        this(context, oVar, null, null, bVar);
    }

    public f(Context context, b4.o oVar, Set set, Set set2, b bVar) {
        this.f39230a = context;
        k l10 = oVar.l();
        this.f39231b = l10;
        g gVar = new g();
        this.f39232c = gVar;
        gVar.a(context.getResources(), AbstractC4864a.b(), oVar.b(context), i.h(), l10.m(), null, null);
        this.f39233d = set;
        this.f39234e = set2;
    }
}
