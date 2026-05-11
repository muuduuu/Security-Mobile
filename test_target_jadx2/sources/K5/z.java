package K5;

import K5.G;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
abstract class z {
    static S5.n a(Method method, D5.j jVar, G g10) {
        D5.j j10;
        TypeVariable b10;
        TypeVariable<Method>[] typeParameters = method.getTypeParameters();
        if (typeParameters.length == 0 || jVar.j().m()) {
            return null;
        }
        Type genericReturnType = method.getGenericReturnType();
        if (!(genericReturnType instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
        if (!Objects.equals(jVar.q(), parameterizedType.getRawType())) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        ArrayList arrayList2 = new ArrayList(typeParameters.length);
        for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
            TypeVariable d10 = d(actualTypeArguments[i10]);
            if (d10 != null) {
                String name = d10.getName();
                if (name == null || (j10 = jVar.j().j(i10)) == null || (b10 = b(typeParameters, name)) == null) {
                    return null;
                }
                if (g(g10, j10, b10.getBounds())) {
                    int indexOf = arrayList.indexOf(name);
                    if (indexOf != -1) {
                        D5.j jVar2 = (D5.j) arrayList2.get(indexOf);
                        if (j10.equals(jVar2)) {
                            continue;
                        } else {
                            boolean J10 = jVar2.J(j10.q());
                            boolean J11 = j10.J(jVar2.q());
                            if (!J10 && !J11) {
                                return null;
                            }
                            if ((J10 ^ J11) && J11) {
                                arrayList2.set(indexOf, j10);
                            }
                        }
                    } else {
                        arrayList.add(name);
                        arrayList2.add(j10);
                    }
                } else {
                    continue;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return S5.n.e(arrayList, arrayList2);
    }

    private static TypeVariable b(TypeVariable[] typeVariableArr, String str) {
        if (typeVariableArr != null && str != null) {
            for (TypeVariable typeVariable : typeVariableArr) {
                if (str.equals(typeVariable.getName())) {
                    return typeVariable;
                }
            }
        }
        return null;
    }

    private static ParameterizedType c(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return c(upperBounds[0]);
            }
        }
        return null;
    }

    private static TypeVariable d(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return d(upperBounds[0]);
            }
        }
        return null;
    }

    public static G e(Method method, D5.j jVar, S5.o oVar, G g10) {
        S5.n a10 = a(method, jVar, g10);
        return a10 == null ? g10 : new G.a(oVar, a10);
    }

    private static boolean f(G g10, D5.j jVar, Type type) {
        if (!jVar.J(g10.a(type).q())) {
            return false;
        }
        ParameterizedType c10 = c(type);
        if (c10 == null || !Objects.equals(jVar.q(), c10.getRawType())) {
            return true;
        }
        Type[] actualTypeArguments = c10.getActualTypeArguments();
        S5.n j10 = jVar.j();
        if (j10.n() != actualTypeArguments.length) {
            return false;
        }
        for (int i10 = 0; i10 < j10.n(); i10++) {
            if (!f(g10, j10.j(i10), actualTypeArguments[i10])) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(G g10, D5.j jVar, Type[] typeArr) {
        for (Type type : typeArr) {
            if (!f(g10, jVar, type)) {
                return false;
            }
        }
        return true;
    }
}
