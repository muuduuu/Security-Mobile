package V7;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f11047a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0203a f11048b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11049c;

    /* renamed from: V7.a$a, reason: collision with other inner class name */
    public interface InterfaceC0203a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0203a interfaceC0203a, Typeface typeface) {
        this.f11047a = typeface;
        this.f11048b = interfaceC0203a;
    }

    private void d(Typeface typeface) {
        if (this.f11049c) {
            return;
        }
        this.f11048b.a(typeface);
    }

    @Override // V7.f
    public void a(int i10) {
        d(this.f11047a);
    }

    @Override // V7.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f11049c = true;
    }
}
