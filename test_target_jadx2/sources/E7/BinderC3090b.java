package e7;

import V6.AbstractC1287s;
import android.os.IBinder;
import e7.InterfaceC3089a;
import java.lang.reflect.Field;

/* renamed from: e7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3090b extends InterfaceC3089a.AbstractBinderC0469a {

    /* renamed from: f, reason: collision with root package name */
    private final Object f32251f;

    private BinderC3090b(Object obj) {
        this.f32251f = obj;
    }

    public static Object l1(InterfaceC3089a interfaceC3089a) {
        if (interfaceC3089a instanceof BinderC3090b) {
            return ((BinderC3090b) interfaceC3089a).f32251f;
        }
        IBinder asBinder = interfaceC3089a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            int length = declaredFields.length;
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 53);
            sb2.append("Unexpected number of IObjectWrapper declared fields: ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
        AbstractC1287s.m(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }

    public static InterfaceC3089a m1(Object obj) {
        return new BinderC3090b(obj);
    }
}
