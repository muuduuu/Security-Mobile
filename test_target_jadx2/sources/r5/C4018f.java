package r5;

import android.content.Context;

/* renamed from: r5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4018f implements InterfaceC4021i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39249a;

    /* renamed from: b, reason: collision with root package name */
    private final C4013a f39250b;

    /* renamed from: c, reason: collision with root package name */
    private final int f39251c;

    public C4018f(Context context, int i10) {
        this.f39249a = context;
        this.f39251c = i10;
        C4013a c4013a = new C4013a(5);
        this.f39250b = c4013a;
        c4013a.a(context.getApplicationInfo().sourceDir);
    }

    @Override // r5.InterfaceC4021i
    public InterfaceC4020h get() {
        return new C4017e(new C4019g(this.f39249a, this.f39250b), new C4014b(this.f39249a, this.f39250b), new C4024l(), new C4015c(this.f39249a), new C4022j(this.f39251c), new C4016d(), new C4023k(), new C4024l());
    }
}
