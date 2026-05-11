package Db;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* renamed from: Db.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0816z {

    /* renamed from: Db.z$a */
    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1494a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(kotlin.reflect.o it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    private static final AbstractC0810t b(Object obj, boolean z10, W w10, ExpectedType expectedType, C3862a c3862a) {
        Object d10;
        for (SingleType singleType : expectedType.getInnerPossibleTypes()) {
            if (z10) {
                return new g0(obj, w10, c3862a);
            }
            if ((singleType.getExpectedCppType().getClazz().y(obj) || (obj instanceof Dynamic)) && (d10 = d(w10, obj, c3862a)) != null) {
                return new C0803l(d10);
            }
        }
        return F.f1408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(Object obj, C3862a c3862a, List list, List list2) {
        List<Pair> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list3, 10));
        boolean z10 = false;
        for (Pair pair : list3) {
            AbstractC0810t b10 = b(obj, z10, (W) pair.getSecond(), (ExpectedType) pair.getFirst(), c3862a);
            if (b10 instanceof C0803l) {
                z10 = true;
            }
            arrayList.add(b10);
        }
        if (z10) {
            return arrayList;
        }
        throw new lc.u("Cannot cast '" + obj + "' to 'Either<" + CollectionsKt.l0(list2, ", ", null, null, 0, null, a.f1494a, 30, null) + ">'");
    }

    private static final Object d(W w10, Object obj, C3862a c3862a) {
        try {
            return (!w10.c() || (obj instanceof Dynamic)) ? w10.a(obj, c3862a) : obj;
        } catch (Throwable unused) {
            return null;
        }
    }
}
