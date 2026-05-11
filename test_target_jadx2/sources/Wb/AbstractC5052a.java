package wb;

import Db.C0792a;
import expo.modules.kotlin.exception.C3123a;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.InvalidArgsNumberException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;
import xc.AbstractC5149b;
import xc.C5142C;

/* renamed from: wb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5052a {

    /* renamed from: a, reason: collision with root package name */
    private final String f44401a;

    /* renamed from: b, reason: collision with root package name */
    private final C0792a[] f44402b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f44403c;

    /* renamed from: d, reason: collision with root package name */
    private kotlin.reflect.o f44404d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44405e;

    /* renamed from: f, reason: collision with root package name */
    private final int f44406f;

    public AbstractC5052a(String name, C0792a[] desiredArgsTypes) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desiredArgsTypes, "desiredArgsTypes");
        this.f44401a = name;
        this.f44402b = desiredArgsTypes;
        this.f44405e = true;
        Iterator it = AbstractC3574i.X(desiredArgsTypes).iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (!((C0792a) it.next()).d().p()) {
                break;
            } else {
                i10++;
            }
        }
        this.f44406f = i10 >= 0 ? this.f44402b.length - i10 : 0;
    }

    public abstract void a(C3862a c3862a, JSDecoratorsBridgingObject jSDecoratorsBridgingObject, String str);

    protected final Object[] b(Object[] args, C3862a c3862a) {
        CodedException unexpectedException;
        CodedException codedException;
        Intrinsics.checkNotNullParameter(args, "args");
        if (this.f44406f <= args.length) {
            int length = args.length;
            C0792a[] c0792aArr = this.f44402b;
            if (length <= c0792aArr.length) {
                int length2 = c0792aArr.length;
                Object[] objArr = new Object[length2];
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        break;
                    }
                    objArr[i10] = null;
                    i10++;
                }
                Iterator a10 = AbstractC5149b.a(args);
                int length3 = args.length;
                for (int i11 = 0; i11 < length3; i11++) {
                    Object next = a10.next();
                    C0792a c0792a = this.f44402b[i11];
                    try {
                        objArr[i11] = c0792a.a(next, c3862a);
                        Unit unit = Unit.f36324a;
                    } catch (Throwable th) {
                        if (th instanceof CodedException) {
                            codedException = (CodedException) th;
                        } else {
                            if (th instanceof Da.a) {
                                String a11 = ((Da.a) th).a();
                                Intrinsics.checkNotNullExpressionValue(a11, "getCode(...)");
                                unexpectedException = new CodedException(a11, th.getMessage(), th.getCause());
                            } else {
                                unexpectedException = new UnexpectedException(th);
                            }
                            codedException = unexpectedException;
                        }
                        throw new C3123a(c0792a.d(), i11, String.valueOf(next != null ? next.getClass() : null), codedException);
                    }
                }
                return objArr;
            }
        }
        throw new InvalidArgsNumberException(args.length, this.f44402b.length, this.f44406f);
    }

    public final AbstractC5052a c(boolean z10) {
        this.f44405e = z10;
        return this;
    }

    public final List d() {
        C0792a[] c0792aArr = this.f44402b;
        ArrayList arrayList = new ArrayList(c0792aArr.length);
        for (C0792a c0792a : c0792aArr) {
            arrayList.add(c0792a.c());
        }
        return arrayList;
    }

    protected final C0792a[] e() {
        return this.f44402b;
    }

    protected final String f() {
        return this.f44401a;
    }

    public final kotlin.reflect.o g() {
        return this.f44404d;
    }

    public final boolean h() {
        kotlin.reflect.o d10;
        if (!this.f44403c) {
            return false;
        }
        C0792a c0792a = (C0792a) AbstractC3574i.A(this.f44402b);
        kotlin.reflect.e j10 = (c0792a == null || (d10 = c0792a.d()) == null) ? null : d10.j();
        kotlin.reflect.d dVar = j10 instanceof kotlin.reflect.d ? (kotlin.reflect.d) j10 : null;
        if (dVar == null) {
            return false;
        }
        if (Intrinsics.b(dVar, C5142C.b(JavaScriptObject.class))) {
            return true;
        }
        kotlin.reflect.o oVar = this.f44404d;
        Object j11 = oVar != null ? oVar.j() : null;
        kotlin.reflect.d dVar2 = j11 instanceof kotlin.reflect.d ? (kotlin.reflect.d) j11 : null;
        if (dVar2 == null) {
            return false;
        }
        return Intrinsics.b(dVar, dVar2);
    }

    public final boolean i() {
        return this.f44405e;
    }

    public final void j(boolean z10) {
        this.f44403c = z10;
    }

    public final void k(kotlin.reflect.o oVar) {
        this.f44404d = oVar;
    }
}
