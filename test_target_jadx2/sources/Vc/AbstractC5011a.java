package vc;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import xc.C5142C;
import xc.InterfaceC5151d;

/* renamed from: vc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5011a {
    public static final d a(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "<this>");
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Intrinsics.checkNotNullExpressionValue(annotationType, "annotationType(...)");
        d e10 = e(annotationType);
        Intrinsics.e(e10, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return e10;
    }

    public static final Class b(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class m10 = ((InterfaceC5151d) dVar).m();
        Intrinsics.e(m10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return m10;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class c(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class m10 = ((InterfaceC5151d) dVar).m();
        if (!m10.isPrimitive()) {
            Intrinsics.e(m10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return m10;
        }
        String name = m10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    m10 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    m10 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    m10 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    m10 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    m10 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    m10 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    m10 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    m10 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    m10 = Short.class;
                    break;
                }
                break;
        }
        Intrinsics.e(m10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return m10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Class d(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class m10 = ((InterfaceC5151d) dVar).m();
        if (m10.isPrimitive()) {
            Intrinsics.e(m10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return m10;
        }
        String name = m10.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final d e(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return C5142C.b(cls);
    }
}
