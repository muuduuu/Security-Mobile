package Db;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.Enumerable;
import java.lang.reflect.Field;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pb.AbstractC3864c;
import pb.C3862a;
import vc.AbstractC5011a;
import xc.C5142C;

/* loaded from: classes2.dex */
public final class B extends AbstractC0812v {

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.d f1405b;

    /* renamed from: c, reason: collision with root package name */
    private final Enum[] f1406c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.g f1407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(kotlin.reflect.d enumClass, boolean z10) {
        super(z10);
        Intrinsics.checkNotNullParameter(enumClass, "enumClass");
        this.f1405b = enumClass;
        Object[] enumConstants = AbstractC5011a.b(enumClass).getEnumConstants();
        if (enumConstants == null) {
            throw new IllegalArgumentException("Passed type is not an enum type");
        }
        Enum[] enumArr = (Enum[]) enumConstants;
        if (enumArr.length == 0) {
            throw new IllegalArgumentException("Passed enum type is empty");
        }
        this.f1406c = enumArr;
        kotlin.reflect.g e10 = Cc.d.e(enumClass);
        if (e10 == null) {
            throw new IllegalArgumentException("Cannot convert js value to enum without the primary constructor");
        }
        this.f1407d = e10;
        if (Enumerable.class.isAssignableFrom(AbstractC5011a.b(enumClass))) {
            return;
        }
        Ga.d.b(AbstractC3864c.a(), "Enum '" + enumClass + "' should inherit from " + C5142C.b(Enumerable.class) + ".", null, 2, null);
    }

    private final Enum g(Object obj, Enum[] enumArr, String str) {
        int intValue;
        Object valueOf;
        Enum r42;
        Field declaredField = AbstractC5011a.b(this.f1405b).getDeclaredField(str);
        if (declaredField == null) {
            throw new IllegalArgumentException(("Cannot find a property for " + str + " parameter").toString());
        }
        declaredField.setAccessible(true);
        Class<?> type = declaredField.getType();
        if (obj instanceof Dynamic) {
            valueOf = Intrinsics.b(type, String.class) ? ((Dynamic) obj).asString() : Integer.valueOf(((Dynamic) obj).asInt());
        } else if (Intrinsics.b(type, String.class)) {
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.String");
            valueOf = (String) obj;
        } else {
            if (obj instanceof Double) {
                intValue = (int) ((Number) obj).doubleValue();
            } else {
                Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.Int");
                intValue = ((Integer) obj).intValue();
            }
            valueOf = Integer.valueOf(intValue);
        }
        int length = enumArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                r42 = null;
                break;
            }
            r42 = enumArr[i10];
            if (Intrinsics.b(declaredField.get(r42), valueOf)) {
                break;
            }
            i10++;
        }
        if (r42 != null) {
            return r42;
        }
        throw new IllegalArgumentException(("Couldn't convert '" + obj + "' to " + this.f1405b.q() + " where " + str + " is the enum parameter").toString());
    }

    private final Enum h(String str, Enum[] enumArr) {
        Enum r22;
        int length = enumArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                r22 = null;
                break;
            }
            r22 = enumArr[i10];
            if (Intrinsics.b(r22.name(), str)) {
                break;
            }
            i10++;
        }
        if (r22 != null) {
            return r22;
        }
        throw new expo.modules.kotlin.exception.d(this.f1405b, enumArr, str);
    }

    @Override // Db.W
    public ExpectedType b() {
        return ExpectedType.INSTANCE.a();
    }

    @Override // Db.W
    public boolean c() {
        return false;
    }

    @Override // Db.AbstractC0812v
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Enum e(Object value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f1407d.c().isEmpty()) {
            return h((String) value, this.f1406c);
        }
        if (this.f1407d.c().size() != 1) {
            throw new expo.modules.kotlin.exception.q(Cc.e.c(C5142C.b(value.getClass()), null, false, null, 7, null), Cc.e.c(this.f1405b, null, false, null, 7, null), null, 4, null);
        }
        Enum[] enumArr = this.f1406c;
        String name = ((kotlin.reflect.j) CollectionsKt.d0(this.f1407d.c())).getName();
        Intrinsics.d(name);
        return g(value, enumArr, name);
    }

    @Override // Db.AbstractC0812v
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Enum f(Dynamic value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f1407d.c().isEmpty()) {
            return h(value.asString(), this.f1406c);
        }
        if (this.f1407d.c().size() != 1) {
            throw new expo.modules.kotlin.exception.q(pb.q.a(value.getType()), Cc.e.c(this.f1405b, null, false, null, 7, null), null, 4, null);
        }
        Enum[] enumArr = this.f1406c;
        String name = ((kotlin.reflect.j) CollectionsKt.d0(this.f1407d.c())).getName();
        Intrinsics.d(name);
        return g(value, enumArr, name);
    }
}
