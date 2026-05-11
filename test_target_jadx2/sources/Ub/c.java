package Ub;

import expo.modules.securestore.SecureStoreOptions;
import java.security.KeyStore;

/* loaded from: classes2.dex */
public interface c {
    String a(SecureStoreOptions secureStoreOptions);

    KeyStore.Entry b(KeyStore keyStore, SecureStoreOptions secureStoreOptions);

    String c(SecureStoreOptions secureStoreOptions, boolean z10);
}
