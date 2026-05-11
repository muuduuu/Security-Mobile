package expo.modules.kotlin.types;

import Db.AbstractC0810t;
import Db.C0803l;
import Db.F;
import Db.g0;
import com.facebook.react.bridge.Dynamic;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import lc.m;
import lc.u;
import org.conscrypt.BuildConfig;
import pb.AbstractC3865d;
import u5.C4870a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u0019\u001a\u00028\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00028\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0007¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lexpo/modules/kotlin/types/Either;", BuildConfig.FLAVOR, "FirstType", "SecondType", "bareValue", BuildConfig.FLAVOR, "LDb/t;", "deferredValue", BuildConfig.FLAVOR, "Lkotlin/reflect/o;", "types", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "d", "(I)Z", C4870a.f43493a, "(I)Ljava/lang/Object;", "Lkotlin/reflect/d;", "type", "e", "(Lkotlin/reflect/d;)Z", "f", "b", "(Lkotlin/reflect/d;)Ljava/lang/Object;", "c", "Ljava/lang/Object;", "Ljava/util/List;", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class Either<FirstType, SecondType> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object bareValue;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List deferredValue;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List types;

    public Either(Object bareValue, List deferredValue, List types) {
        Intrinsics.checkNotNullParameter(bareValue, "bareValue");
        Intrinsics.checkNotNullParameter(deferredValue, "deferredValue");
        Intrinsics.checkNotNullParameter(types, "types");
        this.bareValue = bareValue;
        this.deferredValue = deferredValue;
        this.types = types;
    }

    public final Object a(int index) {
        AbstractC0810t abstractC0810t = (AbstractC0810t) this.deferredValue.get(index);
        if (abstractC0810t instanceof C0803l) {
            return ((C0803l) abstractC0810t).a();
        }
        if (Intrinsics.b(abstractC0810t, F.f1408a)) {
            throw new u("Cannot cast '" + this.bareValue + "' to '" + this.types.get(index) + "'");
        }
        if (!(abstractC0810t instanceof g0)) {
            throw new m();
        }
        try {
            Object a10 = ((g0) abstractC0810t).a();
            this.deferredValue.set(index, new C0803l(a10));
            return a10;
        } catch (Throwable th) {
            this.deferredValue.set(index, F.f1408a);
            if (!(this.bareValue instanceof Dynamic)) {
                throw new u("Cannot cast '" + this.bareValue + "' to '" + this.types.get(index) + "' - " + th.getMessage());
            }
            Object obj = this.bareValue;
            throw new u("Cannot cast '[" + obj + "] " + AbstractC3865d.a((Dynamic) obj) + "' to '" + this.types.get(index) + "' - " + th.getMessage());
        }
    }

    public final Object b(d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Object a10 = a(0);
        Intrinsics.e(a10, "null cannot be cast to non-null type FirstType of expo.modules.kotlin.types.Either");
        return a10;
    }

    public final Object c(d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Object a10 = a(1);
        Intrinsics.e(a10, "null cannot be cast to non-null type SecondType of expo.modules.kotlin.types.Either");
        return a10;
    }

    public final boolean d(int index) {
        AbstractC0810t abstractC0810t = (AbstractC0810t) this.deferredValue.get(index);
        if (abstractC0810t instanceof C0803l) {
            return true;
        }
        if (!Intrinsics.b(abstractC0810t, F.f1408a)) {
            if (!(abstractC0810t instanceof g0)) {
                throw new m();
            }
            try {
                this.deferredValue.set(index, new C0803l(((g0) abstractC0810t).a()));
                return true;
            } catch (Throwable unused) {
                this.deferredValue.set(index, F.f1408a);
            }
        }
        return false;
    }

    public final boolean e(d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return d(0);
    }

    public final boolean f(d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return d(1);
    }
}
