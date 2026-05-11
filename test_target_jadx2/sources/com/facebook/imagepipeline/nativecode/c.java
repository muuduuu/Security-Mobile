package com.facebook.imagepipeline.nativecode;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import o4.InterfaceC3751d;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f20729a = new c();

    private c() {
    }

    public static final InterfaceC3751d a(int i10, boolean z10, boolean z11) {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Object newInstance = NativeJpegTranscoderFactory.class.getConstructor(cls, cls2, cls2).newInstance(Integer.valueOf(i10), Boolean.valueOf(z10), Boolean.valueOf(z11));
            Intrinsics.e(newInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.transcoder.ImageTranscoderFactory");
            return (InterfaceC3751d) newInstance;
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e11);
        } catch (IllegalArgumentException e12) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e12);
        } catch (InstantiationException e13) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e13);
        } catch (NoSuchMethodException e14) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e14);
        } catch (SecurityException e15) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e15);
        } catch (InvocationTargetException e16) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e16);
        }
    }
}
