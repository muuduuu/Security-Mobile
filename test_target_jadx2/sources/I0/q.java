package I0;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;

/* loaded from: classes.dex */
public final class q extends n implements K {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4236a;

        /* renamed from: b, reason: collision with root package name */
        Object f4237b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4238c;

        /* renamed from: e, reason: collision with root package name */
        int f4240e;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4238c = obj;
            this.f4240e |= Integer.MIN_VALUE;
            return q.this.a(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(File file, A serializer) {
        super(file, serializer);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // I0.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Object obj, kotlin.coroutines.d dVar) {
        a aVar;
        int i10;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.f4240e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f4240e = i11 - Integer.MIN_VALUE;
                Object obj2 = aVar.f4238c;
                Object e10 = AbstractC3868b.e();
                i10 = aVar.f4240e;
                if (i10 != 0) {
                    lc.p.b(obj2);
                    f();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(g());
                    try {
                        A h10 = h();
                        I i12 = new I(fileOutputStream2);
                        aVar.f4236a = fileOutputStream2;
                        aVar.f4237b = fileOutputStream2;
                        aVar.f4240e = 1;
                        if (h10.b(obj, i12, aVar) == e10) {
                            return e10;
                        }
                        fileOutputStream = fileOutputStream2;
                        closeable = fileOutputStream;
                    } catch (Throwable th) {
                        th = th;
                        closeable = fileOutputStream2;
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream = (FileOutputStream) aVar.f4237b;
                    closeable = (Closeable) aVar.f4236a;
                    try {
                        lc.p.b(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            kotlin.io.c.a(closeable, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream.getFD().sync();
                Unit unit = Unit.f36324a;
                kotlin.io.c.a(closeable, null);
                return Unit.f36324a;
            }
        }
        aVar = new a(dVar);
        Object obj22 = aVar.f4238c;
        Object e102 = AbstractC3868b.e();
        i10 = aVar.f4240e;
        if (i10 != 0) {
        }
        fileOutputStream.getFD().sync();
        Unit unit2 = Unit.f36324a;
        kotlin.io.c.a(closeable, null);
        return Unit.f36324a;
    }
}
