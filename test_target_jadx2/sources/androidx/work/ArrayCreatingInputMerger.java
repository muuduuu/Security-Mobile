package androidx.work;

import androidx.work.b;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;
import x1.j;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Lx1/j;", "<init>", "()V", BuildConfig.FLAVOR, "array1", "array2", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "array", "obj", "Ljava/lang/Class;", "valueClass", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Landroidx/work/b;", "inputs", C4870a.f43493a, "(Ljava/util/List;)Landroidx/work/b;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends j {
    private final Object b(Object array, Object obj, Class valueClass) {
        int length = Array.getLength(array);
        Object newArray = Array.newInstance((Class<?>) valueClass, length + 1);
        System.arraycopy(array, 0, newArray, 0, length);
        Array.set(newArray, length, obj);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    private final Object c(Object array1, Object array2) {
        int length = Array.getLength(array1);
        int length2 = Array.getLength(array2);
        Class<?> componentType = array1.getClass().getComponentType();
        Intrinsics.d(componentType);
        Object newArray = Array.newInstance(componentType, length + length2);
        System.arraycopy(array1, 0, newArray, 0, length);
        System.arraycopy(array2, 0, newArray, length, length2);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    private final Object d(Object obj, Class valueClass) {
        Object newArray = Array.newInstance((Class<?>) valueClass, 1);
        Array.set(newArray, 0, obj);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    @Override // x1.j
    public b a(List inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = inputs.iterator();
        while (it.hasNext()) {
            Map i10 = ((b) it.next()).i();
            Intrinsics.checkNotNullExpressionValue(i10, "input.keyValueMap");
            for (Map.Entry entry : i10.entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = hashMap.get(key);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (Intrinsics.b(cls2, cls)) {
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        value = c(obj, value);
                    } else {
                        if (!Intrinsics.b(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        value = b(obj, value, cls);
                    }
                } else if (!cls.isArray()) {
                    value = d(value, cls);
                }
                Intrinsics.checkNotNullExpressionValue(value, "if (existingValue == nul…      }\n                }");
                hashMap.put(key, value);
            }
        }
        aVar.d(hashMap);
        b a10 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a10, "output.build()");
        return a10;
    }
}
