package vd;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.g;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.text.StringsKt;
import td.AbstractC4829a;

/* renamed from: vd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5013a extends AbstractC4829a {

    /* renamed from: r, reason: collision with root package name */
    public static final C5013a f44220r = new C5013a();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C5013a() {
        super(r2, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, null, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, null, null, null, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
        g d10 = g.d();
        ed.b.a(d10);
        Intrinsics.checkNotNullExpressionValue(d10, "apply(...)");
        i.f packageFqName = ed.b.f32554a;
        Intrinsics.checkNotNullExpressionValue(packageFqName, "packageFqName");
        i.f constructorAnnotation = ed.b.f32556c;
        Intrinsics.checkNotNullExpressionValue(constructorAnnotation, "constructorAnnotation");
        i.f classAnnotation = ed.b.f32555b;
        Intrinsics.checkNotNullExpressionValue(classAnnotation, "classAnnotation");
        i.f functionAnnotation = ed.b.f32557d;
        Intrinsics.checkNotNullExpressionValue(functionAnnotation, "functionAnnotation");
        i.f propertyAnnotation = ed.b.f32558e;
        Intrinsics.checkNotNullExpressionValue(propertyAnnotation, "propertyAnnotation");
        i.f propertyGetterAnnotation = ed.b.f32559f;
        Intrinsics.checkNotNullExpressionValue(propertyGetterAnnotation, "propertyGetterAnnotation");
        i.f propertySetterAnnotation = ed.b.f32560g;
        Intrinsics.checkNotNullExpressionValue(propertySetterAnnotation, "propertySetterAnnotation");
        i.f enumEntryAnnotation = ed.b.f32562i;
        Intrinsics.checkNotNullExpressionValue(enumEntryAnnotation, "enumEntryAnnotation");
        i.f compileTimeValue = ed.b.f32561h;
        Intrinsics.checkNotNullExpressionValue(compileTimeValue, "compileTimeValue");
        i.f parameterAnnotation = ed.b.f32563j;
        Intrinsics.checkNotNullExpressionValue(parameterAnnotation, "parameterAnnotation");
        i.f typeAnnotation = ed.b.f32564k;
        Intrinsics.checkNotNullExpressionValue(typeAnnotation, "typeAnnotation");
        i.f typeParameterAnnotation = ed.b.f32565l;
        Intrinsics.checkNotNullExpressionValue(typeParameterAnnotation, "typeParameterAnnotation");
    }

    private final String s(id.c cVar) {
        if (cVar.d()) {
            return "default-package";
        }
        String c10 = cVar.g().c();
        Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
        return c10;
    }

    public final String q(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return s(fqName) + ".kotlin_builtins";
    }

    public final String r(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        StringBuilder sb2 = new StringBuilder();
        String b10 = fqName.b();
        Intrinsics.checkNotNullExpressionValue(b10, "asString(...)");
        sb2.append(StringsKt.y(b10, '.', '/', false, 4, null));
        sb2.append('/');
        sb2.append(q(fqName));
        return sb2.toString();
    }
}
