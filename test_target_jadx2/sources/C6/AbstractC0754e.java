package C6;

import C6.C0750a;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* renamed from: C6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0754e {

    /* renamed from: a, reason: collision with root package name */
    static final AbstractC0754e f985a = a().f(10485760).d(200).b(ModuleDescriptor.MODULE_VERSION).c(604800000).e(81920).a();

    /* renamed from: C6.e$a */
    static abstract class a {
        a() {
        }

        abstract AbstractC0754e a();

        abstract a b(int i10);

        abstract a c(long j10);

        abstract a d(int i10);

        abstract a e(int i10);

        abstract a f(long j10);
    }

    AbstractC0754e() {
    }

    static a a() {
        return new C0750a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}
