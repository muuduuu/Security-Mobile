package Ba;

/* loaded from: classes2.dex */
public interface d {
    default void reject(String str, String str2) {
        reject(str, str2, null);
    }

    void reject(String str, String str2, Throwable th);

    void resolve(Object obj);
}
