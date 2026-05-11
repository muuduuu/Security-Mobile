package androidx.camera.extensions;

import A.AbstractC0700h0;
import A.InterfaceC0714q;
import androidx.camera.extensions.impl.InitializerImpl;
import androidx.concurrent.futures.c;

/* loaded from: classes.dex */
public final class ExtensionsManager {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f14758c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ExtensionsManager f14759d;

    /* renamed from: a, reason: collision with root package name */
    private final ExtensionsAvailability f14760a;

    /* renamed from: b, reason: collision with root package name */
    private final b f14761b;

    /* renamed from: androidx.camera.extensions.ExtensionsManager$1, reason: invalid class name */
    class AnonymousClass1 implements InitializerImpl.OnExtensionsInitializedCallback {
        final /* synthetic */ InterfaceC0714q val$cameraProvider;
        final /* synthetic */ c.a val$completer;

        AnonymousClass1(c.a aVar, InterfaceC0714q interfaceC0714q) {
            this.val$completer = aVar;
            this.val$cameraProvider = interfaceC0714q;
        }

        public void onFailure(int i10) {
            AbstractC0700h0.c("ExtensionsManager", "Failed to initialize extensions");
            this.val$completer.c(ExtensionsManager.a(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, this.val$cameraProvider));
        }

        public void onSuccess() {
            AbstractC0700h0.a("ExtensionsManager", "Successfully initialized extensions");
            this.val$completer.c(ExtensionsManager.a(ExtensionsAvailability.LIBRARY_AVAILABLE, this.val$cameraProvider));
        }
    }

    /* renamed from: androidx.camera.extensions.ExtensionsManager$2, reason: invalid class name */
    class AnonymousClass2 implements InitializerImpl.OnExtensionsDeinitializedCallback {
        final /* synthetic */ c.a val$completer;

        AnonymousClass2(c.a aVar) {
            this.val$completer = aVar;
        }

        public void onFailure(int i10) {
            this.val$completer.f(new Exception("Failed to deinitialize extensions."));
        }

        public void onSuccess() {
            this.val$completer.c(null);
        }
    }

    enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    private ExtensionsManager(ExtensionsAvailability extensionsAvailability, InterfaceC0714q interfaceC0714q) {
        this.f14760a = extensionsAvailability;
        this.f14761b = new b(interfaceC0714q);
    }

    static ExtensionsManager a(ExtensionsAvailability extensionsAvailability, InterfaceC0714q interfaceC0714q) {
        synchronized (f14758c) {
            try {
                ExtensionsManager extensionsManager = f14759d;
                if (extensionsManager != null) {
                    return extensionsManager;
                }
                ExtensionsManager extensionsManager2 = new ExtensionsManager(extensionsAvailability, interfaceC0714q);
                f14759d = extensionsManager2;
                return extensionsManager2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
