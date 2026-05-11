package Pc;

import Pc.z;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r extends t implements Zc.n {

    /* renamed from: a, reason: collision with root package name */
    private final Field f7767a;

    public r(Field member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f7767a = member;
    }

    @Override // Zc.n
    public boolean M() {
        return Y().isEnumConstant();
    }

    @Override // Zc.n
    public boolean V() {
        return false;
    }

    @Override // Pc.t
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Field Y() {
        return this.f7767a;
    }

    @Override // Zc.n
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public z getType() {
        z.a aVar = z.f7775a;
        Type genericType = Y().getGenericType();
        Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
        return aVar.a(genericType);
    }
}
