package l3;

import b3.o;

/* renamed from: l3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3607d {

    /* renamed from: l3.d$a */
    class a implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f37065a;

        a(Throwable th) {
            this.f37065a = th;
        }

        @Override // b3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC3606c get() {
            return AbstractC3607d.b(this.f37065a);
        }
    }

    public static o a(Throwable th) {
        return new a(th);
    }

    public static InterfaceC3606c b(Throwable th) {
        i x10 = i.x();
        x10.p(th);
        return x10;
    }
}
