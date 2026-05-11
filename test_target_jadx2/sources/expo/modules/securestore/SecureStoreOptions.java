package expo.modules.securestore;

import Ab.b;
import Ab.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\n\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\n\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR(\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u0014\u0012\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lexpo/modules/securestore/SecureStoreOptions;", "LAb/c;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, "authenticationPrompt", "keychainService", BuildConfig.FLAVOR, "requireAuthentication", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Ljava/lang/String;", "getAuthenticationPrompt", "()Ljava/lang/String;", "setAuthenticationPrompt", "(Ljava/lang/String;)V", "getAuthenticationPrompt$annotations", "()V", "getKeychainService", "setKeychainService", "getKeychainService$annotations", "Z", "getRequireAuthentication", "()Z", "setRequireAuthentication", "(Z)V", "getRequireAuthentication$annotations", "expo-secure-store_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SecureStoreOptions implements c, Serializable {
    private String authenticationPrompt;
    private String keychainService;
    private boolean requireAuthentication;

    public SecureStoreOptions() {
        this(null, null, false, 7, null);
    }

    @b
    public static /* synthetic */ void getAuthenticationPrompt$annotations() {
    }

    @b
    public static /* synthetic */ void getKeychainService$annotations() {
    }

    @b
    public static /* synthetic */ void getRequireAuthentication$annotations() {
    }

    public final String getAuthenticationPrompt() {
        return this.authenticationPrompt;
    }

    public final String getKeychainService() {
        return this.keychainService;
    }

    public final boolean getRequireAuthentication() {
        return this.requireAuthentication;
    }

    public final void setAuthenticationPrompt(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.authenticationPrompt = str;
    }

    public final void setKeychainService(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.keychainService = str;
    }

    public final void setRequireAuthentication(boolean z10) {
        this.requireAuthentication = z10;
    }

    public SecureStoreOptions(String authenticationPrompt, String keychainService, boolean z10) {
        Intrinsics.checkNotNullParameter(authenticationPrompt, "authenticationPrompt");
        Intrinsics.checkNotNullParameter(keychainService, "keychainService");
        this.authenticationPrompt = authenticationPrompt;
        this.keychainService = keychainService;
        this.requireAuthentication = z10;
    }

    public /* synthetic */ SecureStoreOptions(String str, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? " " : str, (i10 & 2) != 0 ? "key_v1" : str2, (i10 & 4) != 0 ? false : z10);
    }
}
